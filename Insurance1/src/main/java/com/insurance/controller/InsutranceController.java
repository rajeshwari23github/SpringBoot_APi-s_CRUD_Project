package com.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Insurance;
import com.insurance.service.InsuranceService;
@RestController
@RequestMapping("/insurance")
public class InsutranceController {
	@Autowired
  private	InsuranceService insuranceService;
  @PostMapping("/insertdata")
 
 public ResponseEntity<Insurance> saveInsuranceInfo( @RequestBody Insurance insurance){
	Insurance insurance1= insuranceService.saveInsurenceInfo(insurance);
	 	 return ResponseEntity.ok().body(insurance1);
	  }
//  @GetMapping("/getdata/{id}")
//  public ResponseEntity<Insurance> getInsuranceDataById(@PathVariable("id") Integer id){
//	Insurance insurance = insuranceService.getInsuranceDataByid(id);
//	return ResponseEntity.ok().body(insurance) ;
//	  }
//  @DeleteMapping("/deletedata/{id}")
//  public void deleteInsuranceDataById(@PathVariable("id")Integer id) {
//	  insuranceService.deleteInsuranceData(id);
//	    }
//  @GetMapping("/getalldata")
//  public ResponseEntity<List<Insurance>> fetchAllInsuranceData(){
//	 List<Insurance> list = insuranceService.fetchAllInsuranceData();
//	return ResponseEntity.ok().body(list);
//	  
//  }
}
