import { Component, OnInit } from '@angular/core';
import { Subscribe } from '../Subscribe';
import { RestApiServiceService } from '../rest-api-service.service';

@Component({
  selector: 'app-employee-portal',
  templateUrl: './employee-portal.component.html',
  styleUrls: ['./employee-portal.component.css']
})
export class EmployeePortalComponent implements OnInit {
newPolicy;
event;
nagarroNews;
holiday;
urgentHelp;
sub:Subscribe= new Subscribe();
  username: any;
  constructor(private service:RestApiServiceService) { }

  ngOnInit(): void {
  }
  subscribe(){
//console.log(this.event + this.urgentHelp + this.holiday+this.nagarroNews+this.newPolicy)
this.sub.username=this.username;
this.sub.event= this.event;
this.sub.holiday=this.holiday;
this.sub.nagarroNews= this.nagarroNews;
this.sub.newPolicy= this.newPolicy;
this.sub.urgentHelp=this.urgentHelp;
console.log(this.username);
 let resp = this.service.subscribe(this.sub);
resp.subscribe(data=>{
  console.log(data);
})
  }

}
