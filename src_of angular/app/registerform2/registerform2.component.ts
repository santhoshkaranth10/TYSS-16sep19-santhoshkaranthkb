import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-registerform2',
  templateUrl: './registerform2.component.html',
  styleUrls: ['./registerform2.component.css']
})
export class Registerform2Component implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  loginData(form: NgForm) {
    console.log(form.value);
  }
}
