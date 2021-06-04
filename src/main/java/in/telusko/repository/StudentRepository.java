package in.telusko.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.telusko.model.Student;

@Repository
public interface StudentRepository extends  CrudRepository<Student, Integer>{

}
