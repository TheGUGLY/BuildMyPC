import { Component, OnInit } from '@angular/core';
import { MovieService } from '../movie.service';

@Component({
    selector: 'app-movie-create',
    templateUrl: './movie.create.component.html',
    styleUrls: ['./movie.create.component.css']
})

export class MovieCreateComponent implements OnInit {
    title: string = '';
    genre: string = '';
    rating: number = 0;
    description: string = '';
    
    service: MovieService;

    constructor(service: MovieService) {
        this.service = service;
    }

    ngOnInit() { }

    onSave() {
        if (this.title.length === 0 ) {
            alert('enter title');
        } else if (this.genre.length === 0 ) {
            alert('enter genre');
        } else if (this.description.length === 0 ) {
            alert('enter description');
        } else {
            this.service
                .postMovieWithoutImage(this.title, this.description, this.rating, this.genre)
                .subscribe((response) => {
                   if(response.status==200)
                   alert("movie added");
                    
                });
        }
    }

    onCancel() {
        this.title = '';
        this.description = '';
        this.genre = '';
        this.rating = 0;
    }
}
