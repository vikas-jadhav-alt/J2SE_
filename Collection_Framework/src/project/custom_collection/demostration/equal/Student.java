package project.custom_collection.demostration.equal;

public class Student {

	private int rollNo;
	private String course;

	public Student(int rollNo, String course) {
		super();
		this.rollNo = rollNo;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student(" + rollNo + ", " + course + ")";
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getCourse() {
		return course;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public boolean equals(Object obj) {

		/**
		 * intanceOf operator is used to avoid NullPointerException(NPE) and
		 * ClassCastException(CCE) at runtime
		 */
		if (obj instanceof Student) {
			/**
			 * Type Casting So that we can access the members of Student object as with
			 * Object reference (i.e PARENT ) we can't get access to child class members
			 */
			Student o = (Student) obj;

			/**
			 * Using equals method in CASE of String to check the state as, using ==
			 * operator, for Object we compares the reference variables only, not the state
			 */
			return (this.rollNo == o.rollNo) && (this.course.equals(o.course));
		}

		return false;

	}

}
