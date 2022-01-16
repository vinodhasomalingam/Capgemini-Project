package com.capgemini;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.capgemini.entity.StudentEntity;
import com.capgemini.repository.StudentRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class StudentTest {
	
	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private TestEntityManager entityManager;

	@BeforeEach
	void setup() {
		StudentEntity studentEntity = new StudentEntity(44, "vino", 9999, "pondicherry");
		entityManager.persist(studentEntity);
	}

	@Test
	public void findByStudentId() {
		StudentEntity student = studentRepository.findById(44).get();
		assertEquals(44, student.getId());
	}

	@Test
	public void findByStudentname() {
		StudentEntity student = studentRepository.findById(44).get();
		assertEquals("vino", student.getName());
	}
	
	@Test
	public void findByStudentrollno() {
		StudentEntity student = studentRepository.findById(44).get();
		assertEquals(9999, student.getRollNo());
	}

	@Test
	public void findByStudentaddress() {
		StudentEntity student = studentRepository.findById(44).get();
		assertEquals("pondicherry", student.getAddress());
	}

}
