package in.telusko.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import in.telusko.model.Student;
import in.telusko.repository.StudentRepository;

@Service
//@Component
public class StudentServiceImpl implements StudentServiece {

	@Autowired
	private StudentRepository studentRepo;
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		 return studentRepo.save(student);
	}

	@Override
	public List<Student> findAllStudents() {
		// TODO Auto-generated method stub
		return (List<Student>) studentRepo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(id);
	}

	  
}
