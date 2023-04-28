import { Component, OnInit } from '@angular/core';
import { User } from '../models/user';
import { UserService } from '../services/user.service';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit{
  user: User = new User();
  constructor(private _userService: UserService, private _router: Router){

  }
  ngOnInit(): void {

  }
  saveUser(){
    this._userService.saveUser(this.user).subscribe(
      data => {console.log('response',data);
        this._router.navigateByUrl("/users");
      }
    )
  }
}
