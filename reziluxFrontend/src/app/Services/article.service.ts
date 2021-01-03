import { Injectable } from '@angular/core';
import { Article } from 'src/model/Article.model';
import { HttpClient } from '@angular/common/http';
import {Observable} from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class ArticleService {
  selectedcompteur: Article;
  constructor(private http :HttpClient)
   { 
     
   }
   apiUrl='http://localhost:4500/Article/';
   
   getArticle() : Observable<Article>
   {
   return this.http.get<Article>(this.apiUrl);
   }
   
    saveArticle(article:Article)
   {
    return this.http.post<any>("http://localhost:4500/saveArticle",article);
   }
   getidArticle(idA:number)
   {
    return this.http.get("http://localhost:4500/Article/"+idA);
   }
   updateArticle(article:Article)
   {
    return this.http.put<any>("http://localhost:4500/Article/update/"+article.idA,article);
   }
   deleteArticle(idA:number)
   {
    return this.http.delete("http://localhost:4500/Article/delete/"+idA);
   }
}
