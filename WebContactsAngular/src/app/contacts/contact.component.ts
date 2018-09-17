import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent implements OnInit {

  pageContacts: any;


  constructor(private http: HttpClient) { }

  ngOnInit() {
    this.http.get('http://localhost:8080/findPersons?mc=wa&page=1&size=6')
      .subscribe(data =>{
        this.pageContacts = data;
      }, err => {
        console.log('ErreuR : '+err);
      });
  }

}
