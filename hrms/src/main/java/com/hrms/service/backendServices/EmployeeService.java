package com.hrms.service.backendServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.service.model.EmployeeJson;
import com.hrms.service.respository.EmployeeRespository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRespository employeeRespository;
	
	public EmployeeJson getEmployee(int Id) {
		EmployeeJson employeeJson = null;
		employeeJson =  employeeRespository.findById(Id).get();
		return employeeJson;
//		return new EmployeeJson(435, "Chetan", "Developer", "Engineer", "chetan.bilapate@gmail.com", "8976313434" ,"Ghansoli");
	}
	
	public boolean saveEmployee(EmployeeJson employeeJson) {
		employeeRespository.save(employeeJson);
		return true;
	}

}
