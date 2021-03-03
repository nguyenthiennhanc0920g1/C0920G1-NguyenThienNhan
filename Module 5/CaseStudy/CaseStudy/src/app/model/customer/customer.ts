import {CustomerType} from '../customer-type/customer-type';

export class Customer {
  customerId: number;
  customerName: string;
  customerBirthday: string;
  customerGender: number;
  customerIdCard: number;
  customerPhone: string;
  customerEmail: string;
  customerAddress: string;
  customerTypeId: CustomerType;
  constructor(customerId: number, customerName: string, customerBirthday: string, customerGender: number, customerIdCard: number,
              customerPhone: string, customerEmail: string, customerAddress: string, customerTypeId: CustomerType) {
    this.customerId = customerId;
    this.customerName = customerName;
    this.customerBirthday = customerBirthday;
    this.customerGender = customerGender;
    this.customerIdCard = customerIdCard;
    this.customerPhone = customerPhone;
    this.customerEmail = customerEmail;
    this.customerAddress = customerAddress;
    this.customerTypeId = customerTypeId;
  }
}
