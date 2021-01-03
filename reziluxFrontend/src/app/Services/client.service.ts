import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Observable} from 'rxjs';
import { Client } from 'src/model/Client.model';
@Injectable({
  providedIn: 'root'
})
export class ClientService {
  selectedcompteur: Client;
  constructor(private http :HttpClient)
   { 
     
   }
   apiUrl='http://localhost:4500/Client/';
   
   getClient() : Observable<Client>
   {
   return this.http.get<Client>(this.apiUrl);
   }
   chercherClient(motcle:string) 
   {
   return this.http.get<Client>("http://localhost:4500/chercherClient?mc="+motcle);
   }
    saveclient(client:Client)
   {
    return this.http.post<any>("http://localhost:4500/saveClient",client);
   }
   getidclient(idC:number)
   {
    return this.http.get("http://localhost:4500/Client/"+idC);
   }
   updateclient(client:Client)
   {
    return this.http.put<any>("http://localhost:4500/Client/update/"+client.idC,client);
   }
   deleteclient(idC:number)
   {
     //console.log("xolal"+idC);
    return this.http.delete("http://localhost:4500/Client/delete/"+idC);
   }
}
