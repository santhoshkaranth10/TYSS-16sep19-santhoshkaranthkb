import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parentbike',
  templateUrl: './parentbike.component.html',
  styleUrls: ['./parentbike.component.css']
})
export class ParentbikeComponent implements OnInit {
  

  Bikes = [
    {
      img: 'https://cdn.pixabay.com/photo/2016/04/07/06/53/bmw-1313343__340.jpg',
      name: 'bike'
    },
    {
      img :'https://cdn.pixabay.com/photo/2016/09/23/21/08/motorcycle-1690452__340.jpg',
      name : 'motorcycle'
    },
    {
      img : 'https://cdn.pixabay.com/photo/2014/05/02/23/53/shed-336505__340.jpg',
      name: 'motorbike'
    }
  ];
  constructor() { }

  ngOnInit() {
  }

}
