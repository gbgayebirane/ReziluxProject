import { Component, OnInit } from '@angular/core';
import { Client } from 'src/model/Client.model';
import { ClientService } from '../Services/client.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-client',
  templateUrl: './client.component.html',
  styleUrls: ['./client.component.css']
})
export class ClientComponent implements OnInit {

  constructor(private clientservice:ClientService,private router:Router) { }
  Clientmodel= Object();
  clients:Client;
  id : number;
  firstname : string=" "
  lastname : string=""
  email:string=""
  phonenumber: string=""
  motcle:string =""
  ngOnInit(): void {
    this.clientservice.getClient()
    .subscribe(data=>this.clients = data);
  }
  onClickSubmit(data) { 
    { 
   console.log(data)
     this.clientservice.saveclient(data)
     .subscribe(data=>{
        this.Clientmodel.firstName=data.firstName;
       //this.router.navigate(['Client']);

      },err=>{
  
     })
    }
 }
 doSearch()
  {
     this.clientservice.chercherClient(this.motcle)
    .subscribe(data=>this.clients = data);
  }
  chercher()
  {
    this.doSearch();
  }
 Ondelete(id :number)
 {
   if(confirm('are you sure to delete ')==true)
   {
    
     this.clientservice.deleteclient(id);
     console.log(id);
   this.clientservice.getClient()
     .subscribe(data=>this.clients = data);
   }
 }
}


