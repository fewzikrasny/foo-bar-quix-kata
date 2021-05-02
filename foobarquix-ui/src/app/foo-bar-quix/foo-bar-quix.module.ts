import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {FooBarQuixFormComponent} from './foo-bar-quix-form/foo-bar-quix-form.component';
import {FooBarQuixComponent} from './foo-bar-quix.component';
import {ReactiveFormsModule} from '@angular/forms';


@NgModule({
  declarations: [
    FooBarQuixFormComponent,
    FooBarQuixComponent,
  ],
  imports: [
    CommonModule,
    ReactiveFormsModule
  ]
})
export class FooBarQuixModule {
}
