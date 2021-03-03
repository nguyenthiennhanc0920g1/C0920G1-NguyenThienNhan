import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomerDelelteComponent } from './customer-delelte.component';

describe('CustomerDelelteComponent', () => {
  let component: CustomerDelelteComponent;
  let fixture: ComponentFixture<CustomerDelelteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CustomerDelelteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CustomerDelelteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
