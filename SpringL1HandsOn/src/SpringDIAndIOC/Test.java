package SpringDIAndIOC;

public class Test {
	private String testId;
	private int testMarks;
	private String testTitle;

	public Test(String testId, int testMarks, String testTitle) {
		super();
		this.testId = testId;
		this.testMarks = testMarks;
		this.testTitle = testTitle;
	}

	public String getTestId() {
		return testId;
	}

	public int getTestMarks() {
		return testMarks;
	}

	public String getTestTitle() {
		return testTitle;
	}
}
