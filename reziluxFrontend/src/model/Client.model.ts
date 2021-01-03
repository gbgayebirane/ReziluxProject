export interface Client
{
  idC : number;
  firstName : string;
  lastName : string;
  email:string;
  phoneNumber: string;
}
export class Clientmodel 
{
  constructor(
  public idC : number,
  public firstName  : string,
  public lastName : string,
  public email  : string,
  public phoneNumber : string,
  ){}
}