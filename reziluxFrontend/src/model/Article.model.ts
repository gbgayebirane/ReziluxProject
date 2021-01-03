export interface Article
{
  idA : number;
  name : string;
  price : BigInteger;
  image:string;
}
export class Articlemodel 
{
  constructor(
  public idA : number,
  public name  : string,
  public price : BigInteger,
  public image : string,
  ){}
}