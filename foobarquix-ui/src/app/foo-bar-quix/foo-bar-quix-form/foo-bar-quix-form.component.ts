import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-foo-bar-quix-form',
  templateUrl: './foo-bar-quix-form.component.html',
  styleUrls: ['./foo-bar-quix-form.component.scss']
})
export class FooBarQuixFormComponent implements OnInit {

  fooBarQuixForm: FormGroup;
  inputNumber: FormControl;

  @Output()
  public submitNumberOutput: EventEmitter<number> = new EventEmitter();

  constructor(
    private formBuilder: FormBuilder
  ) {
  }

  ngOnInit(): void {
    this.inputNumber = this.formBuilder.control('', [
      Validators.required
    ]);

    this.fooBarQuixForm = this.formBuilder.group({
      inputNumber: this.inputNumber
    });

    this.fooBarQuixForm.valueChanges.subscribe(
      () => this.submitNumber()
    );
  }

  submitNumber(): void {
    const inputNumberEmmiter = this.fooBarQuixForm.valid ? this.inputNumber.value : null;
    this.submitNumberOutput.emit(inputNumberEmmiter);
  }
}
