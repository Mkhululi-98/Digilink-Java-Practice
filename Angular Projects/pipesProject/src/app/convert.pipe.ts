import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'convert'
})
export class ConvertPipe implements PipeTransform {

  transform(value: any,unit: string): any {
    if(!value){
      return "";
    }
    switch(unit){
      case "m":
        return value * 1.609*1000;
      case "km": 
        return value * 1.609;
      case "cm":
        return value * 1.609*1000*1000;
      default:
        throw new Error("Unit not supported")
    }
    return value * 1.609;
  }

}
