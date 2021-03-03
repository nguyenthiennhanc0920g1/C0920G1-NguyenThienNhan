import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-font-size-font',
  templateUrl: './font-size-font.component.html',
  styleUrls: ['./font-size-font.component.css']
})
export class FontSizeFontComponent implements OnInit {
  fontSize = 14;

  constructor() {
  }

  onChange(value): void {
    console.log(value);
    this.fontSize = value;
  }

  ngOnInit(): void {
  }

}
