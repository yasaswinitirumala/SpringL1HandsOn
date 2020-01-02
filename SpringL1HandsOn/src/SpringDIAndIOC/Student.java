package SpringDIAndIOC;

import java.util.ArrayList;

public class Student {
	private String studentId;
	private String studentName;
	private ArrayList<Test> studentTest;
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public ArrayList<Test> getStudentTest() {
		return studentTest;
	}
	public void setStudentTest(ArrayList<Test> studentTest) {
		this.studentTest = studentTest;
	}
}
