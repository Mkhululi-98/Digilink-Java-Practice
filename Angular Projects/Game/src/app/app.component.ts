import { Component } from '@angular/core';
import {lorem } from "faker"
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  randomText = lorem.sentence();
  enteredText = '';
  onInput(value: string){
    console.log(value);
    this.enteredText = value;
  }
  compare(ltext: string,etext: string){
    if(!etext){
      return 'pending';
    }
    else if(ltext === etext){
      return 'correct';
    }
    else {
      return 'incorrect';
    }
      
  }
}
