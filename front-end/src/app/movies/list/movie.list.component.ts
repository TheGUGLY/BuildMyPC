import { MovieService } from './../movie.service';
import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'app-movie-list',
    templateUrl: './movie.list.component.html',
    styleUrls: ['./movie.list.component.css']
})

export class MovieListComponent implements OnInit {
    movies: any[];
    service: MovieService;

    constructor(service: MovieService) {
        this.service = service;
        this.reloadMovies();
    }

    reloadMovies() {
        const observable = this.service.getMovies();
        // numbers.map((number) => { return number * number; })
        observable.subscribe((response) => {
            const result = response.json();
            // 20 == '20'   => true (== does not check the data type)
            // 20 === '20'  => false (=== checks both the data type and the value)
            this.movies = result;
            
            console.log(result);
        });
    }

    ngOnInit() { }

    deleteMovie(id) {
        const answer = confirm('are you sure you want to delete this movie?'+id);
        if (answer === true) {
            
            this.service
            .deleteMovie(id)
            .subscribe((response) =>  {
           //     const result = response.json();
                if (response.status  === 200) {
                    this.reloadMovies();
                } else {
                    alert('error occured');
                }
            });
        }
    }
}
