import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Registerform2Component } from './registerform2.component';

describe('Registerform2Component', () => {
  let component: Registerform2Component;
  let fixture: ComponentFixture<Registerform2Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Registerform2Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Registerform2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
