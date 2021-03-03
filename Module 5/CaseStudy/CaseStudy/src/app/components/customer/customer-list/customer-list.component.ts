import { Component, OnInit } from '@angular/core';
import {Customer} from '../../../model/customer/customer';
import {CustomerService} from '../../../services/customer/customer.service';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.scss']
})
export class CustomerListComponent implements OnInit {
  customers: Customer[] = [];
  term: string;
  constructor(private customerService: CustomerService) { }

  ngOnInit(): void {
    this.loadData();
  }
  async loadData(): Promise<void>{
    this.customers = await this.customerService.getAllCustomer();
  }

}
