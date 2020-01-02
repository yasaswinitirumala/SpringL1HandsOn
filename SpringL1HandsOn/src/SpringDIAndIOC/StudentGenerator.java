package SpringDIAndIOC;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentGenerator {

	@Bean(name = "student1")
	public Student getStudent1() {
		Student student = new Student();
		student.setStudentId("S001");
		student.setStudentName("Jonty Rhodes");
		ArrayList<Test> arrayTests = new ArrayList<Test>();
		Test test1 = new Test("T001", 80, "Spring MVC");
		arrayTests.add(test1);
		student.setStudentTest(arrayTests);
		return student;
	}

	@Bean(name = "student2")
	public Student getStudent2() {
		Student student = new Student();
		student.setStudentId("S002");
		student.setStudentName("Harry Potter");
		ArrayList<Test> arrayTests = new ArrayList<Test>();
		Test test1 = new Test("T001", 84, "Spring MVC");
		Test test2 = new Test("T002", 95, "Spring Boot");
		arrayTests.add(test1);
		arrayTests.add(test2);
		student.setStudentTest(arrayTests);
		return student;
	}
}
