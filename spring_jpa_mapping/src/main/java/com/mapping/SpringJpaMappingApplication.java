package com.mapping;

import com.mapping.entity.Emp;
import com.mapping.entity.Mobile;
import com.mapping.repository.EmpRepo;
import com.mapping.repository.MobileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaMappingApplication implements CommandLineRunner {

	@Autowired
	private EmpRepo empRepo;

	@Autowired
	private MobileRepo mobileRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaMappingApplication.class, args);
		System.out.println("Spring data mapping here ");
	}

	@Override
	public void run(String... args) throws Exception {

//		Emp emp = new Emp();
//		emp.setEmpName("Ram Kumar");

//		Mobile mb = new Mobile();
//		mb.setMobileName("I Phone 15 Pro");
//
//		//emp.setMobile(mb);
//		mb.setEmp(emp);
//
//		empRepo.save(emp);
//		mobileRepo.save(mb);
//
//		System.out.println("Save successfully");

//		Emp emp = empRepo.findById(2).get();
//		System.out.println("name = " + emp.getEmpName());
//		System.out.println("Mobile = " + emp.getMobile().getMobileName());
//
//		Mobile mb = mobileRepo.findById(4).get();
//		System.out.println(mb.getEmp().getEmpName());
//		System.out.println(mb.getMobileName());

	}
}
