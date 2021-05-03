import {RouterModule, Routes} from '@angular/router';
import {NgModule} from '@angular/core';
import {FooBarQuixComponent} from './foo-bar-quix.component';

const routes: Routes = [{
  path: '',
  component: FooBarQuixComponent
}];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class FooBarQuixRoutingModule {

}
