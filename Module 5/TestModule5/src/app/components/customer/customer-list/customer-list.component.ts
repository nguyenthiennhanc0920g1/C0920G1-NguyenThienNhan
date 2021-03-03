import {Component, OnInit} from '@angular/core';
import {CustomerService} from '../../../services/customer/customer.service';
import {Customer} from '../../../models/customer/customer';
import {NgbModal} from '@ng-bootstrap/ng-bootstrap';
import {CustomerDeleteComponent} from '../customer-delete/customer-delete.component';
import {CustomerUpdateComponent} from '../customer-update/customer-update.component';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.scss']
})
export class CustomerListComponent implements OnInit {
  customers: Customer[] = [];
  search: string;
  p: any;
  key = 'id';
  reverse = false;
  customer: Customer;

  constructor(private customerService: CustomerService,
              private modal: NgbModal) {
  }

  ngOnInit(): void {
    this.loadData();
  }

  async loadData(): Promise<void> {
    this.customers = await this.customerService.getAllCustomer();
  }

  async searchByName(): Promise<void> {
    this.customers = await this.customerService.getAllCustomer();
    this.customers = this.customers.filter((c: Customer): boolean => {
      return c.nameCustomer.toLowerCase().indexOf(this.search.toLowerCase()) >= 0 ||
        c.id.toString().indexOf(this.search) >= 0;
    });
  }

  sort(key) {
    this.key = key;
    this.reverse = !this.reverse;
  }

  returnCustomer(customer: Customer) {
    const ref1 = this.modal.open(CustomerDeleteComponent);
    ref1.componentInstance.customer = customer;
    ref1.componentInstance.modalRef = ref1;
    ref1.result.finally(() => {
      this.customerService.getAllCustomer();
    });
  }

  updateCustomer(customer: Customer) {
    const ref = this.modal.open(CustomerUpdateComponent);
    ref.componentInstance.customerUpdate = customer;
  }
}
