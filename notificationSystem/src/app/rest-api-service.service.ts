import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { notification } from './admin-portal/notification';
import { Subscribe } from './Subscribe';
@Injectable({
  providedIn: 'root'
})
export class RestApiServiceService {
  subscribe(sub:Subscribe) {
    console.log(sub)
    const headers = new HttpHeaders({'Authorization': 'Bearer my-token', 'My-Custom-Header': 'foobar'});
    return this.http.patch("http://localhost:9000/editSubscriptions",sub,{headers,responseType:'text' as 'json'}).pipe(
      map(
        userData => {
         
          console.log(userData)
    
          return userData;
        }
      )
    );
  }
  removeData(id:notification) {
    console.log(id.id)
    const headers = new HttpHeaders({'Authorization': 'Bearer my-token', 'My-Custom-Header': 'foobar'});
    return this.http.patch("http://localhost:9000/deleteNotifications",id.id,{headers,responseType:'text' as 'json'}).pipe(
      map(
        userData => {
         
          console.log(userData)
    
          return userData;
        }
      )
    );
  }
  showData() {
  
    const headers = new HttpHeaders({'Authorization': 'Bearer my-token', 'My-Custom-Header': 'foobar'});
    return this.http.get("http://localhost:9000/showNotifications", { headers, responseType: 'json' }).pipe(
      map(
        userData => {
         
          console.log(userData)
    
          return userData;
        }
      )
    );
  }
  
  constructor(private http:HttpClient) { }
  sendData(not: import("./admin-portal/notification").notification) {
    console.log(not.content)
    const headers = new HttpHeaders({'Authorization': 'Bearer my-token', 'My-Custom-Header': 'foobar'});
    return this.http.post("http://localhost:9000/", not,{ headers, responseType: 'text' as 'json' }).pipe(
      map(
        userData => {
         
          console.log(userData)
      
          return userData;
        }
      )
    );
  }


}
