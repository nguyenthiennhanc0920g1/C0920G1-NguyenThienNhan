import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { LayoutComponent } from './layout/layout.component';
import { CustomerListComponent } from './components/customer/customer-list/customer-list.component';
import {HttpClient, HttpClientModule} from '@angular/common/http';
import { CustomerUpdateComponent } from './components/customer/customer-update/customer-update.component';
import { CustomerDelelteComponent } from './components/customer/customer-delelte/customer-delelte.component';
import { CustomerCreateComponent } from './components/customer/customer-create/customer-create.component';
import { CustomerDetailComponent } from './components/customer/customer-detail/customer-detail.component';
import { PageNotFoundComponent } from './components/page-not-found/page-not-found.component';
import {FormsModule} from '@angular/forms';
import {Ng2SearchPipeModule} from 'ng2-search-filter';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LayoutComponent,
    CustomerListComponent,
    CustomerUpdateComponent,
    CustomerDelelteComponent,
    CustomerCreateComponent,
    CustomerDetailComponent,
    PageNotFoundComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    Ng2SearchPipeModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
