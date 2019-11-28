import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Registerform3Component } from './registerform3.component';

describe('Registerform3Component', () => {
  let component: Registerform3Component;
  let fixture: ComponentFixture<Registerform3Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Registerform3Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Registerform3Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
