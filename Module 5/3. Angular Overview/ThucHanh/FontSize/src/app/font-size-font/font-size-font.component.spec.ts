import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FontSizeFontComponent } from './font-size-font.component';

describe('FontSizeFontComponent', () => {
  let component: FontSizeFontComponent;
  let fixture: ComponentFixture<FontSizeFontComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FontSizeFontComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FontSizeFontComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
