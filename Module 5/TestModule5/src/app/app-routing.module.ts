import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponent} from './components/home/home.component';
import {PageNotFoundComponent} from './components/page-not-found/page-not-found.component';
import {CustomerListComponent} from './components/customer/customer-list/customer-list.component';
import {CustomerDeleteComponent} from './components/customer/customer-delete/customer-delete.component';
import {CustomerUpdateComponent} from './components/customer/customer-update/customer-update.component';


const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'home', component: HomeComponent},
  {path: 'customer', component: CustomerListComponent},
  {path: 'customer/list', component: CustomerListComponent},
  {path: 'customer/delete', component: CustomerDeleteComponent},
  {path: 'customer/update', component: CustomerUpdateComponent},
  {path: '**', component: PageNotFoundComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
