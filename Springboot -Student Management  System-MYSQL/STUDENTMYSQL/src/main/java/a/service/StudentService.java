package a.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import a.model.Student;
import a.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired // for Dependency Injection by spring
	StudentRepository studentRepository;

	public void saveOrUpdate(Student student) {
		studentRepository.save(student);

	}

	public void delete(int id) {
		studentRepository.deleteById(id);
	}

	public List<Student> getAllStudents() {
		List<Student> x = new ArrayList<>();
		studentRepository.findAll().forEach(y -> x.add(y));
		return x;

	}

	public Student getStudentById(int id) {
		return studentRepository.findById(id).get();

	}

}