package com.naveen.service;

import org.springframework.stereotype.Service;

import com.naveen.entity.Address;
import com.naveen.entity.Employee;
import com.naveen.repository.AddresRepository;
import com.naveen.repository.EmpRepositroy;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {

	private EmpRepositroy empRepo;
	
	private AddresRepository addrRepo;

	public EmployeeService(EmpRepositroy empRepo, AddresRepository addrRepo) {
		this.empRepo = empRepo;
		this.addrRepo = addrRepo;
	}
	
	
	@Transactional(rollbackOn = Exception.class)
	public void saveData() {
		
		Employee emp = new Employee();
		emp.setEmpId(201);
		emp.setEmpName("ketan");
		emp.setEmpSal(25000.00);
		empRepo.save(emp);
		
		// check with and without comment in DB
//		int i = 10/0; // we are using an exception if transaction is not done successful then other one also not done
		
		Address addr = new Address();
		addr.setAddrId(501);
		addr.setEmpId(201);
		addr.setCity("Pune");
		addr.setState("MH");
		addr.setCountry("India");
		addrRepo.save(addr);
		
	}
	
}
