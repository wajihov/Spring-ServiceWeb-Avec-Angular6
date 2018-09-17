import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { ContactComponent } from './contacts/contact.component';
import { AboutComponent } from './about/about.component';
import {RouterModule, Routes} from "@angular/router";


const appRoutes:Routes = [
  {path: 'about' , component: AboutComponent},
  {path: 'contacts', component: ContactComponent},
  {path: '' , redirectTo: '/about', pathMatch:'full'}
]

@NgModule({
  declarations: [
    AppComponent,
    ContactComponent,
    AboutComponent
  ],
  imports: [
    BrowserModule, RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
