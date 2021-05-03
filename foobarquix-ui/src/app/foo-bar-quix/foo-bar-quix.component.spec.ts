import {Observable, of, throwError} from 'rxjs';
import {FooBarQuixService} from './service/foo-bar-quix.service';
import {Result} from './model/result';
import {ComponentFixture, TestBed, waitForAsync} from '@angular/core/testing';
import {ReactiveFormsModule} from '@angular/forms';
import {CommonModule} from '@angular/common';
import {FooBarQuixRoutingModule} from './foo-bar-quix-routing.module';
import {HttpClientTestingModule} from '@angular/common/http/testing';
import {FooBarQuixComponent} from './foo-bar-quix.component';

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

describe('FooBarQuixComponent', () => {
  let component: FooBarQuixComponent;
  let fixture: ComponentFixture<FooBarQuixComponent>;

  beforeEach(waitForAsync(() => {
    TestBed.configureTestingModule({
      imports: [ReactiveFormsModule, CommonModule, FooBarQuixRoutingModule, HttpClientTestingModule],
      declarations: [FooBarQuixComponent],
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
    fixture = TestBed.createComponent(FooBarQuixComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
    component.ngOnInit();
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should have a title in an h2 tag', () => {
    const compiled = fixture.debugElement.nativeElement;
    expect(compiled.querySelector('h2').textContent).toContain('Already converted values :');
  });

  it('should have a Convert button', () => {
    const compiled = fixture.debugElement.nativeElement;
    expect(compiled.querySelector('button.container__button').textContent).toContain('Convert');
  });
});
