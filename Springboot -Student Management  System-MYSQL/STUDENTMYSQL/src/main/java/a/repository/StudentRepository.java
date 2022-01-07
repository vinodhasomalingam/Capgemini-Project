package a.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import a.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
