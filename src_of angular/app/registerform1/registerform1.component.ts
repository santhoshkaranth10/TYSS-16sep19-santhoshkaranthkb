import { Component, OnInit } from '@angular/core';
import {  NgForm } from '@angular/forms';

@Component({
  selector: 'app-registerform1',
  templateUrl: './registerform1.component.html',
  styleUrls: ['./registerform1.component.css']
})
export class Registerform1Component implements OnInit {

  constructor() {}

  ngOnInit() {
  }
  loginData(form: NgForm) {
    console.log(form.value);
  }

}
