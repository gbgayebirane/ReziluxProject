import { Component, OnInit } from '@angular/core';
import { DetailCommandeService } from '../Services/detail-commande.service';
import { CommandeService } from '../Services/commande.service';
import { ArticleService } from '../Services/article.service';
import { Article } from 'src/model/Article.model';
import { Commande } from 'src/model/Commande.model';

@Component({
  selector: 'app-detailcommande',
  templateUrl: './detailcommande.component.html',
  styleUrls: ['./detailcommande.component.css']
})
export class DetailcommandeComponent implements OnInit {
  articles: Article;
  commandes:Commande;

  constructor(private detailservice:DetailCommandeService,private commandeservice:CommandeService
    ,private articleservice:ArticleService)
   { }

  ngOnInit(): void {
    this.articleservice.getArticle()
    .subscribe(data=>this.articles = data
      );
      this.commandeservice.getCommande()
    .subscribe(data=>this.commandes = data
      );
  }
  onClickSubmit(data)
  {
    console.log(" "+data)
    this.detailservice.saveDetail(data)
  .subscribe(data=>{
    console.log("data :"+data)
    
      },err=>{
  
     });
    }
  }

