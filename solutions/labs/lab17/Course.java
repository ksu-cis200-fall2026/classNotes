public class Course {
	private ResizeableArray roster;
	private int size;
	
	public Course() {
		roster = new ResizeableArray();
		size = 0;
	}
	
	public void addStudent(Student s) {
		roster.add(s);
		size++;
	}
	
	public ResizeableArray getStudentsWithMajor(String m) {
		ResizeableArray match = new ResizeableArray();

		//it is OK if they just use equals
		for (int i = 0; i < size; i++) {
			Student cur = (Student) roster.get(i);
			if (cur.getMajor().equalsIgnoreCase(m)) {
				match.add(cur);
			}
		}

		return match;
	}
	
	public ResizeableArray getHonorRoll() {
		ResizeableArray match = new ResizeableArray();

		//it is OK if they just use equals
		for (int i = 0; i < size; i++) {
			Student cur = (Student) roster.get(i);
			if (cur.getGPA() >= 3.5) {
				match.add(cur);
			}
		}

		return match;
	}
}