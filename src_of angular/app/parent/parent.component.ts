import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  selectedCar;
  Cars = [
    {
      imgUrl: 'https://cdn.pixabay.com/photo/2012/05/29/00/43/car-49278__340.jpg',
      name: 'sports car'
    },
   {  
      imgUrl: 'https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918408__340.jpg',
      name: 'bmw'
    },
    {
      imgUrl:'https://cdn.pixabay.com/photo/2014/09/07/22/34/car-race-438467__340.jpg',
      name: 'ferrari'
    },
    {
      imgUrl:'https://cdn.pixabay.com/photo/2014/10/22/17/22/ford-498244__340.jpg',
      name: 'ford'
    }
  ];
  constructor() { }

  ngOnInit() {
  }
  sendCar(car){
   
    console.log(car);
    this.selectedCar = car;
  }
}
