import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from "@angular/forms";

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { ClientComponent } from './client/client.component';
import { ArticleComponent } from './article/article.component';
import { CommandeComponent } from './commande/commande.component';
import { DetailcommandeComponent } from './detailcommande/detailcommande.component';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    ClientComponent,
    ArticleComponent,
    CommandeComponent,
    DetailcommandeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,HttpClientModule,FormsModule
 ,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
