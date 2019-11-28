import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-registerform3',
  templateUrl: './registerform3.component.html',
  styleUrls: ['./registerform3.component.css']
})
export class Registerform3Component implements OnInit {

  constructor() { }

  ngOnInit() {
  }
   loginData(form: NgForm){
     console.log(form.value);
   }
}
