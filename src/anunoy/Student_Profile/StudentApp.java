package anunoy.Student_Profile;

import java.util.Scanner;

import anunoy.Student_Profile.model.Student;

public class StudentApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Name : ");
		String studentName = sc.nextLine();

		System.out.println("What is youd ID : ");
		int id = sc.nextInt();

		System.out.println("What is your semester : ");
		String semester = sc.nextLine();

		System.out.println("What is your student type : ");
		String studentType = sc.nextLine();

		System.out.println("What is your Credit  : ");
		int creditNo = sc.nextInt();

		System.out.println("What is per credit Cost : ");
		int perCreditCost = sc.nextInt();

		System.out.println("Total Cost : ");
		double totalCost = sc.nextDouble();

		Student student = new Student(studentType);

		student.setStudentName(studentName);
		student.setStudentID(id);
		student.setSemester(semester);
		student.setStudentType(studentType);
		student.setCreditNo(creditNo);
		student.setPerCreditCost(perCreditCost);
		student.setTotalCreditCost(totalCost);

		if (student.getCreditNo() > 18 || student.getCreditNo() < 3) {
			System.out.println("Maximum 18 credits allowed and minimum 3 credits allowed");
		}
		
		
		
		
		

	}

}
