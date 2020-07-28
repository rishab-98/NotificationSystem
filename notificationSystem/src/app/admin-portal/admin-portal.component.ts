import { Component, OnInit } from '@angular/core';
import { RestApiServiceService } from '../rest-api-service.service';
import { notification } from './notification';

@Component({
  selector: 'app-admin-portal',
  templateUrl: './admin-portal.component.html',
  styleUrls: ['./admin-portal.component.css']
})
export class AdminPortalComponent implements OnInit {
  audience;
  event;
  content;
  not: notification = new notification();
noti:notification[]= [];
  constructor(private service: RestApiServiceService) { }


  ngOnInit(): void {
  }
  SendNotification() {
    this.not.content = this.content;
    this.not.type = this.event;
    console.log(this.event);

    let resp = this.service.sendData(this.not);
    resp.subscribe(data => {
      console.log(data);
    })

  }

  showNotifications(){
    let resp = this.service.showData();
    resp.subscribe(data=>{
      console.log(data);
      const length = Object.keys(data).length;
      console.log(length);
      for (var i = 0; i < length; i++) {
        this.noti[i] = new notification();
        console.log(this.noti[i]);
        this.noti[i].type = data[i]["type"];
        this.noti[i].id=data[i]["id"];
        this.noti[i].content = data[i]["content"];
      }

    })
  }

  delete(n:notification){
    console.log(n);
    let resp = this.service.removeData(n);
    resp.subscribe(data=>{
      console.log(data)
    })
  }

}
