import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  router: Router;

  constructor(router: Router) {
    this.router = router;
  }

  onNavigateList() {
    this.router.navigate(['/list']);
  }

  onNavigateCreateMovie() {
    this.router.navigate(['/create']);
  }

  onNavigateCreateMovieWithoutImage() {
    this.router.navigate(['/create-without-image']);
  }
}
