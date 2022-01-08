package a.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import a.model.Student;
import a.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;

	@PostMapping("/studentsave")
	private int saveStudent(@RequestBody Student student) {
		studentService.saveOrUpdate(student);
		return student.getId();
	}

	@DeleteMapping("/studentdelete/{bbb}")
	private void deleteStudent(@PathVariable("bbb") int studentid) {
		studentService.delete(studentid);
	}

	@GetMapping("/studentget/{bbb}")
	private Student getStudent(@PathVariable("bbb") int studentid) {
		return studentService.getStudentById(studentid);
	}

	@GetMapping("/getallstudents")
	private List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

}
