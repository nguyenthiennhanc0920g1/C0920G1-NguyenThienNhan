import {Component, OnInit} from '@angular/core';
import {Customer} from '../../../model/customer/customer';
import {CustomerService} from '../../../services/customer/customer.service';

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.scss']
})
export class CustomerCreateComponent implements OnInit {

  constructor(public customerService: CustomerService) {
  }

  ngOnInit(): void {
  }

  createEmployee(customer: Customer) {
    this.customerService.createCustomer(customer).subscribe(
      (result: Customer) => {
        this.customerService.getAllCustomer();
      });
    console.log('gdfgdfgdfgdfgdf');
  }
}
