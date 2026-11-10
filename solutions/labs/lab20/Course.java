import java.util.*;

public class Course {
	private ArrayList<Student> roster;
	
	public Course() {
		roster = new ArrayList<Student>();
	}
	
	public void addStudent(Student s) {
		roster.add(s);
	}
	
	public ArrayList<Student> getStudentsWithMajor(String m) {
		ArrayList<Student> match = new ArrayList<Student>();

		for (int i = 0; i < roster.size(); i++) {
			Student cur = roster.get(i);
			if (cur.getMajor().equalsIgnoreCase(m)) {
				match.add(cur);
			}
		}

		return match;
	}
	
	public ArrayList<Student> getHonorRoll() {
		ArrayList<Student> match = new ArrayList<Student>();

		//it is OK if they just use equals
		for (int i = 0; i < roster.size(); i++) {
			Student cur = roster.get(i);
			if (cur.getGPA() >= 3.5) {
				match.add(cur);
			}
		}

		return match;
	}
}