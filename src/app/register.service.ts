import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';


@Injectable()
export class RegisterService {


constructor(private http: HttpClient) {
  }
  public API = '//localhost:8080';

  getAllMember(): Observable<any> {
    return this.http.get('//localhost:8080/members');
  }

}
