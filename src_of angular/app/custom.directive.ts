import { ElementRef, Directive, HostBinding, HostListener } from '@angular/core';

@Directive({
    selector : '[custDir]'
})


export class CustomDirective{
   constructor(private el: ElementRef) {
    this.el.nativeElement.style.backgroundColor = 'red';
   }

   @HostBinding('style.backgroundColor') color ='green';  //here color is nothing but a variable it can be anything

   @HostListener('mouseenter') mouseenterEvent()  {
       this.el.nativeElement.style.backgroundColor = 'blue';
   }

   @HostListener('mouseleave') mouseLeaveEvent() {
       this.el.nativeElement.style.backgroundColor = 'yellow';
   }
}