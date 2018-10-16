package com.hrms.service.respository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hrms.service.model.EmployeeJson;

@Component
public interface EmployeeRespository extends CrudRepository<EmployeeJson, Integer> {

}
