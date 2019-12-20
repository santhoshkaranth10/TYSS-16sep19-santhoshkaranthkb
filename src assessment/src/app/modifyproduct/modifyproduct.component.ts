import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-modifyproduct',
  templateUrl: './modifyproduct.component.html',
  styleUrls: ['./modifyproduct.component.css']
})
export class ModifyproductComponent implements OnInit {
  error: any;

  constructor(private auth: AuthService) { }

  modifyproduct(form: NgForm){
    this.auth.modifyproduct(form.value).subscribe(data => {
      console.log(data);
    }, err => {
      this.error = err.error.message;
    });
  }

  ngOnInit() {
  }

}
