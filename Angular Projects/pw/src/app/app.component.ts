import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  password = "";
  length = 0;
  includeLetters = false;
  includeNumbers = false;
  includeSymbols = false;

  onChangeLength(value: string){
      const parseValue = parseInt(value);
      if(!isNaN(parseValue)){
          this.length = parseValue;
      }
  }

  onChangeLetters(){
    this.includeLetters = !this.includeLetters;
    console.log(this.includeNumbers);
  }

  onChangeNumbers(){
    this.includeNumbers = !this.includeNumbers;
  }
  onChangeSymbols(){
    this.includeSymbols = !this.includeSymbols;
  }

  onButtonClick(){
    let nums = "1234567890";
    let letters = "abcdefghijklmnopqrstuvwxyz";
    let syms = "!@#$%^&*()_+=~`<>?';{}[]";

    let temp = "";
    if(this.includeLetters){
      temp += letters;
  
    }
    
    if(this.includeNumbers){
      temp += nums;
    }
    
    if(this.includeSymbols){
      temp += syms;
    }
    let pass = "";
    for(let i = 0;i < this.length;i++){
      const ind = Math.floor(Math.random()* temp.length);
      pass += temp[ind]; 
    }
    this.password = pass;
  }
}
