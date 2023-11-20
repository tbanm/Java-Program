package project_java;

public class subjectMarks {

	public static void main(String[] args) {
		int sub1 = 30;
		int sub2 = 25;
		int sub3 = 20;
		int total = sub1 + sub2 + sub3;
		System.out.println("The total number is:" +total);
		int percentage = (total/3) * 2;
		
		System.out.println("The percentage is:" +percentage+"%");
		
		//Uses condition
		
		if (percentage >= 90) {
			System.out.println("A+ Grade");
		}else if (percentage >= 80) {
			System.out.println("A Grade");
		}else if (percentage >=70) {
			System.out.println("B Grade");
		}else {
			System.out.println("You fail.");
		}

	}

}
