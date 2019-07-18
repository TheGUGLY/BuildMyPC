import { Injectable } from '@angular/core';
import { Http, RequestOptions, Headers } from '@angular/http';

@Injectable()
export class MovieService {
    http: Http;
    baseUrl = 'http://localhost:8080/test_boot/movies';

    constructor(http: Http) {
        this.http = http;
    }

    public getMovies() {
        // GET
        return this.http.get(this.baseUrl);
    }

    public postMovieWithoutImage(title: string, description: string, rating: number, genre: string) {
        // POST
        const body = {
            'title': title,
            'genre': genre,
            'rating': rating,
            'description' : description
        };

        // add the content type
        const headers = new Headers({'Content-Type': 'application/json'});

        // add the header to the existing list of header key-value pairs
        const requestOptions = new RequestOptions({headers: headers});

        return this.http.post(this.baseUrl, body, requestOptions);
    }

    public createMovieWithImage(file: any, title: string, description: string, rating: number, genre: string) {
        const formData = new FormData();
        formData.append('imageFile', file);
        formData.append('title', title);
        formData.append('description', description);
        formData.append('rating', '' + rating);
        formData.append('genre', genre);

        return this.http.post(this.baseUrl + '/upload', formData);
    }

    public deleteMovie(id) {
        // DELETE
        return this.http.delete(this.baseUrl + '/' + id);
    }
}
