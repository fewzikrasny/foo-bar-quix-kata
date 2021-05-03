import {Component, OnDestroy, OnInit} from '@angular/core';
import {Subscription} from 'rxjs';
import {FooBarQuixService} from './service/foo-bar-quix.service';
import {Result} from './model/result';

@Component({
  selector: 'app-foo-bar-quix',
  templateUrl: './foo-bar-quix.component.html',
  styleUrls: ['./foo-bar-quix.component.scss']
})
export class FooBarQuixComponent implements OnInit, OnDestroy {

  // tslint:disable-next-line:variable-name
  private _result: Result;
  // tslint:disable-next-line:variable-name
  private _subscription: Subscription[] = [];
  numbersConverted: NumberConverted[] = [];
  inputNumber: number;

  constructor(private fooBarQuixService: FooBarQuixService) {
  }

  ngOnInit(): void {
  }

  ngOnDestroy(): void {
    this._subscription.forEach(value => value.unsubscribe());
  }

  convertNumber(inputNumber: number): void {
    this.inputNumber = inputNumber;
    this._subscription.push(this.fooBarQuixService.getConvertedValue(inputNumber).subscribe(response => {
      this._result = response;
    }));
  }

  numberConverted(): void {
    this.numbersConverted.push(
      {
        numberToConvert: this.inputNumber,
        result: this._result.result
      }
    );
    this.inputNumber = null;
    this._result = null;
  }
}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}
