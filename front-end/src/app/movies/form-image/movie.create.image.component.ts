import { MovieService } from './../movie.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
    selector: 'app-movie-create-image',
    templateUrl: './movie.create.image.component.html',
    styleUrls: ['./movie.create.image.component.css']
})

export class MovieCreateImageComponent implements OnInit {
    title = '';
    description = '';
    rating = 0;
    genre = '';

    image: any;
    //service: MovieService;
    //router: Router;

    constructor(private service: MovieService, private router: Router) {
        //this.service = service;
        //this.router = router;
    }

    ngOnInit() { }

    onSave() {
        this.service
            .createMovieWithImage(this.image, this.title, this.description, this.rating, this.genre)
            .subscribe((response) => {
                console.log(response);
                this.router.navigate(['/list']);
            });
    }

    onCancel() {
        this.router.navigate(['/list']);
    }

    onSelectImage(event) {
        console.log(event);
        this.image = event.target.files[0];
    }
}
