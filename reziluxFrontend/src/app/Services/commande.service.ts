import { Injectable } from '@angular/core';
import { Commande } from 'src/model/Commande.model';
import { HttpClient } from '@angular/common/http';
import {Observable} from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class CommandeService {
  selectedcompteur: Commande;
  constructor(private http :HttpClient)
   { 
   
   }
   apiUrl='http://localhost:4500/Commande/';
   
   getCommande() : Observable<Commande>
   {
   return this.http.get<Commande>(this.apiUrl);
   }
   
    savecommande(commande:Commande)
   {
    return this.http.post<any>("http://localhost:4500/saveCommande",commande);
   }
   
   getidcommande(idC:number)
   {
    return this.http.get("http://localhost:4500/Commande/"+idC);
   }
   updatecommande(commande:Commande)
   {
    return this.http.put<any>("http://localhost:4500/Commande/update/"+commande.idC,commande);
   }
   deletecommande(idC:number)
   {
    return this.http.delete("http://localhost:4500/Commande/delete/"+idC);
   }
}
