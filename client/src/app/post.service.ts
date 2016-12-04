import { Injectable } from "@angular/core";
import { Http } from "@angular/http";
import { Observable } from "rxjs";
import "rxjs/add/operator/map";
import { Person } from "./person";

@Injectable()
export class PostService {

    private url = "http://localhost:8080/artifact-1.0-SNAPSHOT/rest/hello";

    constructor(private http: Http) {
    }

    getAll(): Observable<Person[]> {
        return this.http.get(this.url).map(res => res.json());
    }
}
