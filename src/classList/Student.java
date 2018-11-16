package classList;

//import java.util.Arrays;
//import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Student { // implements Comparable<Student> {

	protected String id;
	protected String name;
	protected Double cgpa;

	public Student(String studentID, String studentName, double studentCGPA) {
		id = studentID;
		name = studentName;
		cgpa = studentCGPA;
	}

	public boolean equals(Object arg) {
		if (arg == null) {
			return false;
		}

		if (this == arg) {
			return true;
		}
		if (arg instanceof Student) {
			Student that = (Student) arg;
			if ((this.id.equals(that.id)) && (this.name.equals(that.name)) && (this.cgpa.equals(that.cgpa))) {
				return true;
			}
		}
		return false;
	}

	public int hashCode() {
		return Objects.hash(this.id);
		
	}

	public String toString() {
		return "\n" + "ID: " + id + " Name: " + name + " CGPA: " + cgpa;
	}

//	@Override
//	public int compareTo(Student that) {
//		return this.id.compareTo(that.id);
//	}

	public static void main(String[] args) {

		Set<Student> students = new HashSet<Student>();

		students.add(new Student("cs011", "Lennon", 2.1));
		students.add(new Student("cs101", "dasd", 1.1));
		students.add(new Student("cs021", "aweb", 3.1));
		students.add(new Student("cs031", "bqew", 4.0));

		System.out.println(students.contains(new Student("cs011", "Lennon", 2.1)));

		System.out.println(students.toString());

//		System.out.println("Before sorting by student ID");
//		System.out.println("Student-ID \t Name \t CGOA (for 4.0) ");
//		System.out.println(Arrays.toString(students));

//		Arrays.sort(students, new CGPAComparator());
//
//		System.out.println("After sorting by student ID");
//		System.out.println("Student-ID \t Name \t CGOA (for 4.0) ");
//		System.out.println(Arrays.toString(students));
	}

}

//class CGPAComparator implements Comparator<Student> {
//	public int compare(Student s1, Student s2) {
//		if (s1.id.compareTo(s2.id) == 0)
//			return (s1.cgpa.compareTo(s2.cgpa));
//		return (s1.id.compareTo(s2.id));
//	}
//}