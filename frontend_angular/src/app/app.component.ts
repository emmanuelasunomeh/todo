import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpHeaders } from  '@angular/common/http';
import { FormBuilder, FormGroup } from '@angular/forms';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent  implements OnInit{

 drugList: any[] = [];
  drugForm: FormGroup = this.fb.group({
  name: [''],
  brand_name: ['']
 })

  constructor(private http: HttpClient, private fb:FormBuilder){
  }

  ngOnInit(): void {
    this.listAllDrug();
  
  }

  createDrug(){
    var headers = new HttpHeaders({'Content-Type': 'application/x-www-form-urlencoded'});

    this.http.post("http://localhost:8080/api/v1/drug", this.drugForm.value, {headers}).subscribe(
      (data: any) =>{console.log(data);
      }
    );
  }
  
  listAllDrug(){
    var headers = new HttpHeaders({'Content-Type': 'application/x-www-form-urlencoded'});

    this.http.get("http://localhost:8080/api/v1/drug", {headers}).subscribe((data: any) => {
      this.drugList = data['data']
    })

  }
}
