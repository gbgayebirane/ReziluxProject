import { Component, OnInit } from '@angular/core';
import { Client } from 'src/model/Client.model';
import { ClientService } from '../Services/client.service';
import { Commande } from 'src/model/Commande.model';
import { CommandeService } from '../Services/commande.service';

@Component({
  selector: 'app-commande',
  templateUrl: './commande.component.html',
  styleUrls: ['./commande.component.css']
})
export class CommandeComponent implements OnInit {
  clients:Client;
  commandes:Commande;
  CommandeModel= Object();
  constructor(private clientservice:ClientService,private commandeservice:CommandeService) { }

  ngOnInit(): void {

    this.clientservice.getClient()
    .subscribe(data=>this.clients = data);
    console.log(this.clients);

    this.commandeservice.getCommande()
    .subscribe(data=>this.commandes = data
      );
      //console.log(this.commandes);

}

onClickSubmit(data)
{
  console.log(data)
  this.CommandeModel=data;
  this.CommandeModel.ref=data.ref;
  this.CommandeModel.statut=data.statut;
  // this.CommandeModel.client=data.client;
  this.commandeservice.savecommande(this.CommandeModel)
  .subscribe(data=>{
    console.log("dat"+data)
    
      },err=>{
  
     });
    }
}

