package SpringDIAndIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Assignment1 {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentGenerator.class);
		for (int i = 1; i <= 2; i++) {
			Student student = (Student) context.getBean("student" + i);
			System.out.println("Details of the student\t: ");
			System.out.println("Student Id\t: " + student.getStudentId());
			System.out.println("Student Name\t: " + student.getStudentName());
			for (Test test : student.getStudentTest()) {
				System.out.println("	Student Test Details\t: ");
				System.out.println("	Test Id\t: " + test.getTestId());
				System.out.println("	Test Title\t: " + test.getTestTitle());
				System.out.println("	Test Marks\t: " + test.getTestMarks());
			}
		}
	}
}
