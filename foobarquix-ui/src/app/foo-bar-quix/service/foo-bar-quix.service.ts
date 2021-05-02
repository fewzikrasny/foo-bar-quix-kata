import {Injectable} from '@angular/core';
import {Observable} from 'rxjs';
import {Result} from '../model/result';

@Injectable({
  providedIn: 'root'
})
export class FooBarQuixService {
  constructor() {
  }

  getConvertedValue(inputNumber: number): Observable<Result> {
    return null;
  }
}
