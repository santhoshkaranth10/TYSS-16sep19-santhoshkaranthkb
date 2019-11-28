import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-addmovies',
  templateUrl: './addmovies.component.html',
  styleUrls: ['./addmovies.component.css']
})
export class AddmoviesComponent implements OnInit {

  get addMovie() {
    return this.form.get('addMovie');
  }

  get movieTitle() {
    return this.form.get('movieTitle');
  }
   get movieImgUrl() {
    return this.form.get('movieImgUrl');
   }
   get movieDescription() {
    return this.form.get('movieDescription');
   }

  form = new FormGroup({
    addMovie : new FormControl('', [Validators.required]),
    movieTitle : new FormControl('', [Validators.required]),
    movieImgUrl : new FormControl('', [Validators.required]),
    movieDescription : new FormControl('', [Validators.required]),
    
    });

  constructor() { }

  ngOnInit() {
  }
  loginData(form){
    console.log(form.value);
  }
}