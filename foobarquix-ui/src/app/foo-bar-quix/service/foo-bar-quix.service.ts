import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable, throwError} from 'rxjs';
import {Result} from '../model/result';
import {environment} from '../../../environments/environment';
import {map} from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class FooBarQuixService {
  constructor(private http: HttpClient) {
  }

  getConvertedValue(inputNumber: number): Observable<Result> {
    return this.http.get<Result>(`${environment.backEndUrl}/${inputNumber}`).pipe(
      map((response: Result) => {
        if (response) {
          return response;
        } else {
          throwError('Unable to retrieve correspondence');
        }
      }),
    );
  }
}
