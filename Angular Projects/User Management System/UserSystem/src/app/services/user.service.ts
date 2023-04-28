import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, map } from 'rxjs';
import { User } from '../models/user';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  private getUrl: string = "http://localhost:8080/api/v1/users";
  constructor(private _httpClient: HttpClient) { }

  getUsers(): Observable<User[]>{
    return this._httpClient.get<User[]>(this.getUrl).pipe(
      map(response => response)
    )
  }

  saveUser(user: User): Observable<User>{
    return this._httpClient.post<User>(this.getUrl,user);
  }
}
