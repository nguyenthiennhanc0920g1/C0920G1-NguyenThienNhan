import {Component, OnInit} from '@angular/core';
import {CustomerService} from '../../../services/customer/customer.service';
import {NgbModal} from '@ng-bootstrap/ng-bootstrap';
import {AbstractControl, FormControl, FormGroup, Validators} from '@angular/forms';
import {Customer} from '../../../models/customer/customer';

@Component({
  selector: 'app-customer-update',
  templateUrl: './customer-update.component.html',
  styleUrls: ['./customer-update.component.scss']
})
export class CustomerUpdateComponent implements OnInit {
  public customerUpdate: Customer;
  private customers: Customer[];

  constructor(private customerService: CustomerService,
              private modal: NgbModal) {
  }

  formUpdateCustomer = new FormGroup({
      id: new FormControl(),
      idCustomer: new FormControl(),
      name: new FormControl('', [Validators.required, Validators.pattern(/[A-Za-z+]/)]),
      dayOpen: new FormControl('', this.checkDate),
      dayStart: new FormControl('', this.checkDate),
      kyHan: new FormControl(),
      soTienGui: new FormControl(),
      laiSuat: new FormControl(),
      uuDai: new FormControl(),
    }
  );
  customer: Customer;

  ngOnInit(): void {
    this.pathData(this.customerUpdate);
  }

  pathData(customer: Customer) {
    if (customer) {
      this.formUpdateCustomer.patchValue({
          id: customer.id,
          idCustomer: customer.idCustomer,
          name: customer.nameCustomer,
          dayOpen: customer.dayOpen,
          dayStart: customer.dayStart,
          kyHan: customer.kyHan,
          soTienGui: customer.soTienGui,
          laiSuat: customer.laiSuat,
          uuDai: customer.uuDai,
        }
      );
    }
  }

  checkDate(abstractControl: AbstractControl): any {
    const value = abstractControl.value;
    const year = Number(value.substr(0, 4));

    return new Date().getFullYear() - year >= 0 ? null : {date: true};
  }

  onSubmit() {
    this.customerService.updateCustomer(this.createFormData()).subscribe((data: Customer[]) => {
      this.modal.dismissAll(true);
      // tslint:disable-next-line:only-arrow-functions
      setTimeout(function() {
        alert('Chỉnh Sửa Thành Công ');
      }, 500);
    });
  }

  createFormData(): Customer {
    return Object.assign(this.customerUpdate,
      {
        id: this.formUpdateCustomer.get('id').value,
        idCustomer: this.formUpdateCustomer.get('idCustomer').value,
        name: this.formUpdateCustomer.get('name').value,
        dayOpen: this.formUpdateCustomer.get('dateOpen').value,
        dayStart: this.formUpdateCustomer.get('dateStart').value,
        kyHan: this.formUpdateCustomer.get('kyhan').value,
        soTienGui: this.formUpdateCustomer.get('soTienGui').value,
        laiSuat: this.formUpdateCustomer.get('laiSuat').value,
        uuDai: this.formUpdateCustomer.get('uuDai').value,
      });
  }

  close() {
    this.modal.dismissAll();
  }

}
