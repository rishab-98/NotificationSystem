import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {AdminPortalComponent} from './admin-portal/admin-portal.component';
import {EmployeePortalComponent} from './employee-portal/employee-portal.component';
const routes: Routes = [
  {path: "", redirectTo:"employee", pathMatch:"full"},
  {path:"employee", component:EmployeePortalComponent},
  {path:"admin", component:AdminPortalComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
