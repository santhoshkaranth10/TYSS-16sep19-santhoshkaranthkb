import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';


//import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { AddproductComponent } from './addproduct/addproduct.component';
import { RouterModule } from '@angular/router';
import { ModifyproductComponent } from './modifyproduct/modifyproduct.component';
import { SearchbynameComponent } from './searchbyname/searchbyname.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AddproductComponent,
    ModifyproductComponent,
    SearchbynameComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
     { path : 'addproduct', component: AddproductComponent},
     { path : 'modifyproduct', component : ModifyproductComponent},
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
