import { MovieCreateImageComponent } from './movies/form-image/movie.create.image.component';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { MovieListComponent } from './movies/list/movie.list.component';
import { MovieService } from './movies/movie.service';
import { MovieCreateComponent } from './movies/form/movie.create.component';

@NgModule({
  declarations: [
    AppComponent,
    MovieListComponent,
    MovieCreateComponent,
    MovieCreateImageComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    FormsModule,
    // router
    RouterModule.forRoot([
      { path: 'list', component: MovieListComponent },
      { path: 'create', component: MovieCreateImageComponent },
      { path: 'create-without-image', component: MovieCreateComponent }
    ])
  ],
  providers: [
    MovieService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
