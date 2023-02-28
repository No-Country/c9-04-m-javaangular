import { ViewportScroller } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css'],
})
export class NavbarComponent {
  open = false;

  constructor(private viewPortscroller: ViewportScroller){

  }

  scrollToElement(elementId:string): void {
    document.getElementById(elementId)!.scrollIntoView({
      behavior: 'smooth',
    });
  }
}
