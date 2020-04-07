
public class Student {
		static int studentId;
		static int semesterNo;
		static String studentName;
		static String departmentName;
		public Student(int SID, String Sname, String DepName, int sem) {
			studentId = SID;
			studentName = Sname;
			departmentName = DepName;
			semesterNo = sem;
		}
		void display() {
			System.out.println("StudentId: " +studentId+"\nName of the student: "+studentName+"\nDepartment Name:"+departmentName+"\nSemester Number: "+semesterNo);
		}
}
