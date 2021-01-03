import { Component, OnInit } from '@angular/core';
import { ArticleService } from '../Services/article.service';
import { Article } from 'src/model/Article.model';

@Component({
  selector: 'app-article',
  templateUrl: './article.component.html',
  styleUrls: ['./article.component.css']
})
export class ArticleComponent implements OnInit {

  constructor(private articleservice:ArticleService) { }
  Articlemodel= Object();
  articles: Article;
  photo :String;
  selectedFile: File;
  ngOnInit(): void 
  {
    this.articleservice.getArticle()
    .subscribe(data=>this.articles = data
      );
     // console.log(this.articles.image);
  //this.photo="/images/"+this.articles.image;
  }
  public onFileChanged(event) {
    //Select File
    this.selectedFile = event.target.files[0];
  }
  onClickSubmit(data) { 
    { 
     console.log(data)
     console.log(this.selectedFile);
     this.Articlemodel=data;
     this.Articlemodel.name=data.name;
     this.Articlemodel.price=data.price;
     this.Articlemodel.image=this.selectedFile.name;
      this.articleservice.saveArticle(this.Articlemodel)
   .subscribe(data=>{
    console.log("dat"+data)
     this.Articlemodel.name=data.name;
     this.Articlemodel.price=data.price;
     this.Articlemodel.image=this.selectedFile.name;
      },err=>{
  
     })
    }
    
 }
}
