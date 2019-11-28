import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Registerform4Component } from './registerform4.component';

describe('Registerform4Component', () => {
  let component: Registerform4Component;
  let fixture: ComponentFixture<Registerform4Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Registerform4Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Registerform4Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
