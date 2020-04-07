
public class StudentReportCard extends Student {
	int total_subjects,points_earned;
	float gpa,cgpa;
	public StudentReportCard(int SID, String Sname, String DepName, int sem, int sub, int pts) {
		super(SID, Sname, DepName, sem);
		total_subjects = sub;
		points_earned = pts;
	}
	public void gpaCalculator() {
		gpa =(float) (total_subjects*points_earned)/7;
	}
	public void cgpaCalculator(float gpa) {
		cgpa = (gpa/semesterNo);
	}
	void display() {
		super.display();
		gpaCalculator();
		cgpaCalculator(gpa);
		System.out.println("GPA Computed: "+gpa+"\nCGPA Computed: "+cgpa);
	}
}
