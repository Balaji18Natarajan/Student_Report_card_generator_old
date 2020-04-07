import java.util.Scanner;

public class MainClass {

	public static boolean validateInputs(int studentId,int semNumber, int total_subjects, int points_earned) {
		if((String.valueOf(studentId).length() == 4) && (semNumber >=1 && semNumber <=7) && (total_subjects >=1 && total_subjects <=7) && (points_earned >=1 && points_earned <=20))
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Student ID");
		int SID = in.nextInt();
		System.out.println("Enter Student Name");
		String sname = in.next();
		System.out.println("Enter Department Name");
		String depname = in.next();
		System.out.println("Enter Semester Number");
		int Sem = in.nextInt();
		System.out.println("Enter Total number of Subjects");
		int Sub = in.nextInt();
		System.out.println("Enter Points earned");
		int pts = in.nextInt();
		in.close();
		boolean res = validateInputs(SID,Sem,Sub,pts);
		if(res) {
			StudentReportCard reportObject = new StudentReportCard(SID,sname,depname,Sem,Sub,pts);
		  	reportObject.display();
		}
		else
			System.out.println("Invalid Request");
	}

}
