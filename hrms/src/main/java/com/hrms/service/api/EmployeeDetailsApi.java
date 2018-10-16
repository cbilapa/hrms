package com.hrms.service.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.service.backendServices.EmployeeService;
import com.hrms.service.model.EmployeeJson;

@RestController
public class EmployeeDetailsApi {
	
	@Autowired
	EmployeeService employeeService;
	

	@RequestMapping("/getStatus")
	public String getServiceStatus() {
		return "Hrms Backend Service are running";
	}
	
	@RequestMapping("/getEmployee")
	public EmployeeJson getEmployee() {
		return employeeService.getEmployee(435);
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/saveEmployeeDetails/{employeeJson}")
	public boolean saveEmployeeDetails(EmployeeJson employeeJson) {
		return employeeService.saveEmployee(employeeJson);
	}

}
