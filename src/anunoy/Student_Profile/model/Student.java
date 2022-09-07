package anunoy.Student_Profile.model;

public class Student {

	private String StudentName;
	private int studentID;
	private String Semester;
	private String studentType;
	private int perCreditCost;
	private int creditNo;
	private double totalCreditCost;
	
	
	public Student(String studentType) {  // Constructor
		this.studentType = studentType;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentType() {
		return studentType;
	}

	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}

	public int getCreditNo() {
		return creditNo;
	}

	public void setCreditNo(int creditNo) {
		this.creditNo = creditNo;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getSemester() {
		return Semester;
	}

	public void setSemester(String semester) {
		Semester = semester;
	}

	public int getPerCreditCost() {
		return perCreditCost;
	}

	public void setPerCreditCost(int perCreditCost) {
		this.perCreditCost = perCreditCost;
	}

	public double getTotalCreditCost() {
		return totalCreditCost;
	}

	public void setTotalCreditCost(double totalCreditCost) {
		this.totalCreditCost = totalCreditCost;
	}

}
