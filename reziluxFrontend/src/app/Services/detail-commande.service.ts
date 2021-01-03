import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Observable} from 'rxjs';
import { Detail} from 'src/model/Detail.model';
@Injectable({
  providedIn: 'root'
})
export class DetailCommandeService {

  selectedcompteur: Detail;
  constructor(private http :HttpClient)
   { 
     
   }
   apiUrl='http://localhost:4500/Detail/';
   
   getDetail() : Observable<Detail>
   {
   return this.http.get<Detail>(this.apiUrl);
   }
   
    saveDetail(detail:Detail)
   {
    return this.http.post<any>("http://localhost:4500/saveDetail",detail);
   }
}
