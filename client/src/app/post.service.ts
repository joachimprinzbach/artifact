import { Injectable } from "@angular/core";
import { Http } from "@angular/http";
import { Observable } from "rxjs";
import "rxjs/add/operator/map";
import { Person } from "./person";

@Injectable()
export class PostService {

    private url = "/rest/hello";

    constructor(private http: Http) {
    }

    getAll(): Observable<Person[]> {
        return this.http.get(this.url).map(res => res.json());
    }
}
