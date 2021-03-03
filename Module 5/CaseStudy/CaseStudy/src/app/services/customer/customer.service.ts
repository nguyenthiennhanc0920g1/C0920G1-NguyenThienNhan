import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Customer} from '../../model/customer/customer';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  urlCustomer = 'http://localhost:3000/customerList';
  public currentCustomer: Customer = {
    customerId: null,
    customerName: '',
    customerBirthday: '',
    customerGender: null,
    customerIdCard: null,
    customerPhone: '',
    customerEmail: '',
    customerAddress: '',
    customerTypeId: {
      idCustomerType: null,
      nameCustomerType: ''
    }
  };

  constructor(private http: HttpClient) {
  }

  public async getAllCustomer(): Promise<Customer[]> {
    return new Promise<Customer[]>((resolve) => {
      const arr: Observable<Customer> = this.http.get<Customer>(this.urlCustomer);
      arr.subscribe(data => {
        // @ts-ignore
        const customers: Customer[] = data as Customer[];
        resolve(customers);
      });
    });
  }

  createCustomer(customer: Customer): Observable<Customer> {
    return this.http.post<Customer>(this.urlCustomer, customer);
  }

  updateCustomer(customer: Customer): Observable<Customer> {
    return this.http.put<Customer>(this.urlCustomer + '/' + customer.customerId, customer);
  }

  deleteCustomer(id: number): Observable<Customer> {
    return this.http.delete<Customer>(this.urlCustomer + '/' + id);
  }
}
