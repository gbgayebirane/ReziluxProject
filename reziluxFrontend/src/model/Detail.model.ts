import { Article } from "./Article.model";
import { Commande } from "./Commande.model";

export interface Detail
{
  id: number;
  quantity : number;
  price : number;
  statut:number;
  commande: Commande;
  article :Article;
}
export class Detailmodel 
{
  constructor(
  public id: number,
  public quantity : number,
  public price : number,
  public commande  : Commande,
  public article : Article,
  ){}
}