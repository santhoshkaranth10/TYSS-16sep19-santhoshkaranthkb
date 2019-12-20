import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  
  constructor(private http: HttpClient) { }

addproduct(product): Observable <any> {
 return this.http.post('http://localhost:8080/add', product, {headers: new HttpHeaders({'Content-Type': 'application/json'})});
}
modifyproduct(product): Observable <any> {
  return this.http.put('http://localhost:8080/modify', product, {headers: new HttpHeaders({'Content-Type': 'application/json'})});
}  
getdata(data) {
  return this.http.get <any> ('http://localhost:8080/get/${name}', data,  {headers: new HttpHeaders({'Content-Type': 'application/json'})});

}

}
