import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-searchbyname',
  templateUrl: './searchbyname.component.html',
  styleUrls: ['./searchbyname.component.css']
})
export class SearchbynameComponent implements OnInit {
  product1: any;
  product: [];
  error: any;

  constructor(private auth: AuthService) { }

  dosearch(form: NgForm) {
    this.product1 = form.value.name;
    this.auth.getdata(this.product1).subscribe(data => {
    this.product1 = data.products;
  }, err => {
    console.log(err);
    this.error = err.error.message;
  });
}

  ngOnInit() {
  }

}
