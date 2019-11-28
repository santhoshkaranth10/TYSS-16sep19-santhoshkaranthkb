import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
   name: string = 'santhosh' ;
   imgUrl = 'https://cdn.pixabay.com/photo/2019/09/26/03/09/flower-4504952__340.jpg';
   address: string = 'indiranagar bangalore-560038' ;
   colorName: string = 'red';
   isActive: boolean = false;
   colSpanValue: number = 2;
  constructor() { }

  ngOnInit() {
    setInterval(() => {
      this.colorName = 'yellow';
      this.isActive = !this.isActive;
    }, 2000);
    }

}
