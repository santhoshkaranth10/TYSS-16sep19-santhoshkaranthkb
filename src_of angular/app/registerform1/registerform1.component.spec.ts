import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Registerform1Component } from './registerform1.component';

describe('Registerform1Component', () => {
  let component: Registerform1Component;
  let fixture: ComponentFixture<Registerform1Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Registerform1Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Registerform1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
