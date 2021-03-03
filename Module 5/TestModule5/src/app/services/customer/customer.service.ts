import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Customer} from '../../models/customer/customer';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  private urlCustomer = 'http://localhost:3000/customerList';
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
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

  createCustomer(customer: Customer) {
    return this.http.post<Customer>(this.urlCustomer, JSON.stringify(customer), this.httpOptions);
  }

  deleteCustomerById(id: number) {
    return this.http.delete(this.urlCustomer + '/' + id);
  }

  getById(id: number): Observable<any> {
    return this.http.get(this.urlCustomer + '/' + id);
  }
  updateCustomer(customer: Customer) {
    return this.http.put(this.urlCustomer + '/' + customer.idCustomer, customer, this.httpOptions);
  }
}
