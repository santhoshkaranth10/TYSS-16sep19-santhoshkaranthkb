import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

// import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { RouterModule } from '@angular/router';
import { HelpComponent } from './help/help.component';
import { FooterComponent } from './footer/footer.component';
import { DataBindingsComponent } from './data-bindings/data-bindings.component';
import { PropertyBindingComponent } from './data-bindings/property-binding/property-binding.component';
import { EventBindingComponent } from './data-bindings/event-binding/event-binding.component';
import { TwoWayBindingComponent } from './data-bindings/two-way-binding/two-way-binding.component';
import { StructuralDirectivesComponent } from './directives/structural-directives/structural-directives.component';
import { NgIfComponent } from './directives/structural-directives/ng-if/ng-if.component';
import { NgForComponent } from './directives/structural-directives/ng-for/ng-for.component';
import { NgSwitchComponent } from './directives/structural-directives/ng-switch/ng-switch.component';
import { CustomDirective } from './custom.directive';
import { RegisterComponent } from './register/register.component';
import { Registerform1Component } from './registerform1/registerform1.component';
import { Registerform2Component } from './registerform2/registerform2.component';
import { Registerform3Component } from './registerform3/registerform3.component';
import { Registerform4Component } from './registerform4/registerform4.component';
// import { RegisterPageComponent } from './register-page/register-page.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';
import { DollarPipe } from './dollar.pipe';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    AboutComponent,
    HelpComponent,
    FooterComponent,
    DataBindingsComponent,
    PropertyBindingComponent,
    EventBindingComponent,
    TwoWayBindingComponent,
    StructuralDirectivesComponent,
    NgIfComponent,
    NgForComponent,
    NgSwitchComponent,
    CustomDirective,
    RegisterComponent,
    Registerform1Component,
    Registerform2Component,
    Registerform3Component,
    Registerform4Component,
    // RegisterPageComponent,
    ReactiveFormComponent,
    ParentComponent,
    ChildComponent,
    CommentComponent,
    CommentDetailsComponent,
    DollarPipe
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
     {path : '' , component : HomeComponent },
     {path : 'about' , component : AboutComponent },
     {path : 'help' , component : HelpComponent },
     {path : 'property-binding' , component : PropertyBindingComponent},
     {path : 'event-binding' , component : EventBindingComponent},
     {path : 'two-way-binding' , component : TwoWayBindingComponent},
     {path : 'ng-if' , component : NgIfComponent},
     {path : 'ng-for' , component : NgForComponent},
     {path : 'ngSwitch' , component : NgSwitchComponent},
     {path :  'register' , component: RegisterComponent},
     {path : 'registerform1' , component : Registerform1Component },
     {path : 'registerform2' , component : Registerform2Component },
     {path : 'registerform3' , component : Registerform3Component },
     {path : 'registerform4' , component : Registerform4Component },
     {path : 'reactive-form' , component : ReactiveFormComponent},
     {path : 'parent' , component : ParentComponent},
     {path : 'comment-details' , component :  CommentDetailsComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
