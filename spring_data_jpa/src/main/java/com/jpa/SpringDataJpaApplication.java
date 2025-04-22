package com.jpa;

import com.jpa.entity.Student;
import com.jpa.repository.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
	ApplicationContext ap = SpringApplication.run(SpringDataJpaApplication.class, args);
		System.out.println("Ram kumar");
		StudentRepo st = ap.getBean(StudentRepo.class);

		Student s1 = st.findByName("Mahi Kumari");
		System.out.println(s1);

		List<Student> s2 = st.findByAddress("Pakistan");
		s2.forEach(sm -> System.out.println(sm));


//		Student student = new Student();
//		student.setName("KL Rahul");
//		student.setAddress("Nepal");
//		st.save(student);

//		List<Student> list = (List<Student>) st.findAll();
//		list.forEach(student1 -> System.out.println(student1));

//		Student sm = st.findById(2).get();
//		sm.setName("Sarita Kumari");
//		System.out.println(sm);
//		st.save(sm);

//		List<Student> list = (List<Student>) st.findAll();
//		list.forEach(student1 -> System.out.println(student1));
		
	}

}
