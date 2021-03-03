import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {
  public name = 'Nhan';
  public age = 11;
  public cars = ['bwm', 'audi', 'honda', 'mec', 'toyota'];
  constructor() { }

  ngOnInit(): void {
  }
  public tangTuoi(){
    this.age++;
  }
}
