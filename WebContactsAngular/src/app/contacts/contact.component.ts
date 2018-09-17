import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {ContactsService} from "../../services/contact.service";

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent implements OnInit {

  pageContacts: any;


  constructor(public http: HttpClient/*, public contactService: ContactsService*/) { }

  ngOnInit() {
     this.http.get('http://localhost:8080/findPersons?mc=wa&page=1&size=6')
      .subscribe(data =>{
        this.pageContacts = data;
      }, err => {
        console.log('ErreuR : '+err);
      });
   /* this.contactService.getContacts().subscribe(data => {
      this.pageContacts = data;
    }, err => {
      console.log("L'erreuR : "+err);
    });*/
  }

}
