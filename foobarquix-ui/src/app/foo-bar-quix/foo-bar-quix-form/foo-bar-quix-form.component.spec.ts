import {ReactiveFormsModule} from '@angular/forms';
import {Observable, of, throwError} from 'rxjs';
import {Result} from '../model/result';
import {FooBarQuixFormComponent} from './foo-bar-quix-form.component';
import {ComponentFixture, TestBed, waitForAsync} from '@angular/core/testing';
import {CommonModule} from '@angular/common';
import {FooBarQuixRoutingModule} from '../foo-bar-quix-routing.module';
import {HttpClientTestingModule} from '@angular/common/http/testing';
import {FooBarQuixService} from '../service/foo-bar-quix.service';

const result: Result = new Result();

class FooBarQuixServiceMock {
  getConvertedValue(inputNumber: number): Observable<Result> {
    if (inputNumber != null) {
      return of(result);
    } else {
      return throwError('Unable to retrieve correspondence');
    }
  }
}

describe('FooBarQuixFormComponent', () => {
  let component: FooBarQuixFormComponent;
  let fixture: ComponentFixture<FooBarQuixFormComponent>;

  beforeEach(waitForAsync(() => {
    TestBed.configureTestingModule({
      imports: [ReactiveFormsModule, CommonModule, FooBarQuixRoutingModule, HttpClientTestingModule],
      declarations: [FooBarQuixFormComponent],
      providers: [
        {
          provide: FooBarQuixService,
          useClass: FooBarQuixServiceMock
        }
      ]
    })
      .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FooBarQuixFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
    component.ngOnInit();
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should have an invalid form', () => {
    // then
    expect(component.fooBarQuixForm.valid).toBeFalsy();
  });

  it('should have an input number', () => {
    const compiled = fixture.debugElement.nativeElement;
    const inputNumber = compiled.querySelector('input');
    expect(inputNumber.id).toBe('inputNumber');
  });

  describe('should have invalid form if invalid input number', () => {
    shouldBeAnInvalidForm('This field is required');

    // tslint:disable-next-line:typedef
    function shouldBeAnInvalidForm(nomStep) {
      it(nomStep, () => {
        // GIVEN
        const inputNumberControl = component.fooBarQuixForm.controls.inputNumber;
        const compiled = fixture.debugElement.nativeElement;

        // WHEN
        inputNumberControl.setValue(null);

        // then
        expect(component.fooBarQuixForm.valid).toBeFalsy();
      });
    }
  });

  it('should have valid form if valid input number', () => {
    // GIVEN
    const inputNumberControl = component.fooBarQuixForm.controls.inputNumber;

    // WHEN
    inputNumberControl.setValue(3);

    // then
    expect(component.fooBarQuixForm.valid).toBeTruthy();
  });
});
