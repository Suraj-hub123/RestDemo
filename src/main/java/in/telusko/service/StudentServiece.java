package in.telusko.service;

import java.util.List;

import in.telusko.model.Student;



public interface StudentServiece {

	public Student saveStudent(Student student);
	public Student updateStudent(Student student);
	public List<Student> findAllStudents();
	public void delete(int id);
	
	
}
