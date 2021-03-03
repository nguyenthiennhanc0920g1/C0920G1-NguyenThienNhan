import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.scss']
})
export class CalculatorComponent implements OnInit {
  number1 = 100;
  number2 = 100;
  result: number;
  constructor() { };

  ngOnInit(): void {
  };

  summation(): void{
    this.result = Number(this.number1) + Number(this.number2);
  };

  subtraction(): void{
    this.result = Number(this.number1) - Number(this.number2);
  };

  multiplication(): void{
    this.result = Number(this.number1) * Number(this.number2);
  };

  division(): void{
    this.result = Number(this.number1) / Number(this.number2);
  };
}
