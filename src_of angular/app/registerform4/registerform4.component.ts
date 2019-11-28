import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-registerform4',
  templateUrl: './registerform4.component.html',
  styleUrls: ['./registerform4.component.css']
})
export class Registerform4Component implements OnInit {

  constructor() { }

  ngOnInit() {
  }
    loginData(form: NgForm){
     console.log(form.value) 
    }
}
