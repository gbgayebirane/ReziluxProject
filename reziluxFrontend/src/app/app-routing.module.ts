import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ArticleComponent } from './article/article.component';
import { ClientComponent } from './client/client.component';
import { CommandeComponent } from './commande/commande.component';
import { DetailcommandeComponent } from './detailcommande/detailcommande.component';


const routes: Routes = [
  
  {
    path:'Client',
    component:ClientComponent
  },
  {
    path:'Article',
    component:ArticleComponent
  },
  {
    path:'Commande',
    component:CommandeComponent
  },
  {
    path:'Detail',
    component:DetailcommandeComponent
  }
  ];
  
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
