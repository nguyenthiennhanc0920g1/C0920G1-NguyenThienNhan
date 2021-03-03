import {Component, OnInit} from '@angular/core';
import {CustomerService} from '../../../services/customer/customer.service';
import {NgbModal} from '@ng-bootstrap/ng-bootstrap';
import {Customer} from '../../../models/customer/customer';
import {CustomerListComponent} from '../customer-list/customer-list.component';

@Component({
  selector: 'app-customer-delete',
  templateUrl: './customer-delete.component.html',
  styleUrls: ['./customer-delete.component.scss']
})
export class CustomerDeleteComponent implements OnInit {
  customer: Customer;
  customers: Customer[];
  constructor(private customerService: CustomerService,
              private  modal: NgbModal) {
  }

  ngOnInit(): void {
  }

  deleteCustomer() {
    this.customerService.deleteCustomerById(this.customer.idCustomer).subscribe(async data => {
      this.modal.dismissAll();
      // tslint:disable-next-line:only-arrow-functions
      setTimeout(function() {
        alert('Xóa Thành Công');
      }, 500);
    }, error => console.log(error));
  }

  close() {
    this.modal.dismissAll();
  }
}
