import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-for',
  templateUrl: './ng-for.component.html',
  styleUrls: ['./ng-for.component.css']
})
export class NgForComponent implements OnInit {
    
  Products = [
    {
      img1: "https://cdn.pixabay.com/photo/2016/01/08/11/57/butterfly-1127666__340.jpg",
      name: "flower",
      price: 200
    },
    {
      img2: "https://cdn.pixabay.com/photo/2014/12/17/21/30/wild-flowers-571940__340.jpg",
      name: "flower",
      price: 300
    },
    {
      img3: "https://cdn.pixabay.com/photo/2018/02/08/22/27/flower-3140492__340.jpg",
      name: "flower",
      price: 400
    }
  ];
  constructor() { }

  ngOnInit() {
  }

}
