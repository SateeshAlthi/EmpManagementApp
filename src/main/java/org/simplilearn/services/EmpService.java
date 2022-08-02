package org.simplilearn.services;

import java.util.List;
import java.util.Optional;

import org.simplilearn.entities.Emp;
import org.simplilearn.exceptions.EmployeeNotFoundException;

public interface EmpService {
	
	void insert(Emp e);
	void delete (int eno);
	List<Emp> getAll();
	Emp get(int eno) throws EmployeeNotFoundException;

}
