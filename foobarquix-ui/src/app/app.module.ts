import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {HttpClientModule} from '@angular/common/http';
import {AppComponent} from './app.component';
import {ReactiveFormsModule} from '@angular/forms';
import {HomeComponent} from './home/home.component';
import {RouterModule} from '@angular/router';
import {NavBarComponent} from './nav-bar/nav-bar.component';
import {FrontEndInstructionComponent} from './front-end-instruction/front-end-instruction.component';
import {BackEndInstructionComponent} from './back-end-instruction/back-end-instruction.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    NavBarComponent,
    FrontEndInstructionComponent,
    BackEndInstructionComponent
  ],
  imports: [
    BrowserModule, ReactiveFormsModule, HttpClientModule,
    RouterModule.forRoot([
      {path: '', redirectTo: 'home', pathMatch: 'full'},
      {path: 'home', component: HomeComponent},
      {
        path: 'foo-bar-quix',
        loadChildren: () => import('./foo-bar-quix/foo-bar-quix.module').then(mod => mod.FooBarQuixModule)
      }
    ])
  ],
  providers: [
    {provide: 'SERVER_URL', useValue: 'http://localhost:8080'}
  ],
  bootstrap: [AppComponent]
})
export class AppModule {
}
