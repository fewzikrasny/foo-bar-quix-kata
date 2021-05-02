import {inject, TestBed} from '@angular/core/testing';
import {environment} from '../../../environments/environment';
import {FooBarQuixService} from './foo-bar-quix.service';
import {HttpClientTestingModule, HttpTestingController} from '@angular/common/http/testing';


describe('FooBarQuixService', () => {
  let service: FooBarQuixService;
  let httpMock: any;

  const backEndUrl: string = environment.backEndUrl;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
      providers: [FooBarQuixService]
    });

    service = TestBed.inject(FooBarQuixService);
    httpMock = TestBed.inject(HttpTestingController);

  });

  afterEach(() => {
    httpMock.verify();
  });

  it('should be created', () => {
    const fooBarQuixService: FooBarQuixService = TestBed.inject(FooBarQuixService);
    expect(fooBarQuixService).toBeTruthy();
  });

  it('should convert input number 3 to Foo string', inject(
    [HttpTestingController, FooBarQuixService],
    (
      // tslint:disable-next-line:no-shadowed-variable
      httpMock: HttpTestingController,
      fooBarQuixService: FooBarQuixService
    ) => {

      // GIVEN
      const inputNumber = 3;
      const resultFromBack = 'FooFoo';

      // WHEN
      let fooString = '';
      fooBarQuixService.getConvertedValue(inputNumber).subscribe(response => {
        fooString = response.result;
      });

      // THEN
      const req = httpMock.expectOne(`${backEndUrl}/${inputNumber}`);
      req.flush(resultFromBack);
      expect(req.request.method).toBe('GET');
    }));

  it('should convert input number 5 to Bar string', inject(
    [HttpTestingController, FooBarQuixService],
    (
      // tslint:disable-next-line:no-shadowed-variable
      httpMock: HttpTestingController,
      fooBarQuixService: FooBarQuixService
    ) => {

      // GIVEN
      const inputNumber = 5;
      const resultFromBack = 'BarBar';

      // WHEN
      let fooString = '';
      fooBarQuixService.getConvertedValue(inputNumber).subscribe(response => {
        fooString = response.result;
      });

      // THEN
      const req = httpMock.expectOne(`${backEndUrl}/${inputNumber}`);
      req.flush(resultFromBack);
      expect(req.request.method).toBe('GET');
    }));

  it('should convert input number 7 to Quix string', inject(
    [HttpTestingController, FooBarQuixService],
    (
      // tslint:disable-next-line:no-shadowed-variable
      httpMock: HttpTestingController,
      fooBarQuixService: FooBarQuixService
    ) => {

      // GIVEN
      const inputNumber = 7;
      const resultFromBack = 'QuixQuix';

      // WHEN
      let fooString = '';
      fooBarQuixService.getConvertedValue(inputNumber).subscribe(response => {
        fooString = response.result;
      });

      // THEN
      const req = httpMock.expectOne(`${backEndUrl}/${inputNumber}`);
      req.flush(resultFromBack);
      expect(req.request.method).toBe('GET');
    }));
});

