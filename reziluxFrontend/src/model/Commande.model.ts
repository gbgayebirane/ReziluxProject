import { Client } from "./Client.model";

export interface Commande
{
  idC : number;
  ref : string;
  date : Date;
  statut:number;
  Client: Client;
}
export class Commandemodel 
{
  constructor(
  public idC : number,
  public ref  : string,
  public date : Date,
  public statut  : number,
  public Client : Client,
  ){}
}