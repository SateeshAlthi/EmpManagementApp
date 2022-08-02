package org.simplilearn.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.simplilearn.entities.Emp;
import org.simplilearn.exceptions.EmployeeNotFoundException;
import org.simplilearn.repositories.EmpRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmpServiceImpl implements EmpService{
	
	
	private EmpRepository emprepository;

	public EmpServiceImpl(EmpRepository emprepository) {
		super();
		this.emprepository = emprepository;
	}

	@Override
	public void insert(Emp e) {
		emprepository.save(e);
		
	}

	@Override
	public void delete(int eno) {
		emprepository.deleteById(eno);
		
	}

	@Override
	public List<Emp> getAll() {
		return emprepository.findAll();
	}

	@Override
	public Emp get(int eno) throws EmployeeNotFoundException {
		
		Emp e = emprepository.findById(eno).orElseThrow(()-> new EmployeeNotFoundException("Employee Not Found"));
		
		return e ;
	}

}
