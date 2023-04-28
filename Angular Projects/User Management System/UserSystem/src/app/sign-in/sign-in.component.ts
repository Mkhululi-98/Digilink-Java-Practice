import { Component } from '@angular/core';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-sign-in',
  templateUrl: './sign-in.component.html',
  styleUrls: ['./sign-in.component.css']
})
export class SignInComponent {
  constructor(private router: Router){

  }
  validateUser(){
    this.router.navigateByUrl("users")
  }
  registerUser(){
    this.router.navigateByUrl("register");
  }
}
