import { Component, OnInit } from "@angular/core";
import { PostService } from "./post.service";
import {Person} from "./person";
import {Observable} from "rxjs";

@Component({
    selector: 'post-app',
    templateUrl: './app.component.html',
    providers: [PostService]
})
export class AppComponent implements OnInit {

    people: Observable<Person[]>;

    constructor(private postService: PostService) {
    }

    ngOnInit() {
        this.people = this.postService.getAll();
    }
}
