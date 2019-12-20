import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrls: ['./addproduct.component.css']
})
export class AddproductComponent implements OnInit {
  error: any;

  constructor(private auth: AuthService) { }

  addproduct(form: NgForm) {
    console.log(form.value);
    this.auth.addproduct(form.value).subscribe(data => {
      console.log(data);
    }, err => {
      this.error = err.error.message;
    });
  }

  ngOnInit() {
  }

}
