package Assignment1Part2;

import java.util.ArrayList;

import Assignment1.Course;
import Assignment1.Lecturer;
import Assignment1.Student;
import Assignment1.Module;

public class App {
	public static void main (String args[]) {
		
		//Student init
		Student s1 = new Student("Ann Summers", "21237020", "1998-06-22");
		Student s2 = new Student("Bob Fitzgerald", "22377211", "1998-11-03");
		Student s3 = new Student("Carl Heally", "22893731", "2000-10-28");
		Student s4 = new Student("Danielle Williams", "22329873", "1998-01-03");
		Student s5 = new Student("Steven Crowley", "22871545", "1994-12-15");
		Student s6 = new Student("Kenneth Ives", "22666128", "1997-04-09");
		Student s7 = new Student("Jane Marie Penningsworth", "22442199", "1999-08-13");
		Student s8 = new Student("Fred Jones", "22189680", "1999-09-30");
		
		//Lecturer init
		Lecturer l1 = new Lecturer("Dorethy Anderson", "469405","1987-11-20");
		Lecturer l2 = new Lecturer("Phillip Hastings", "255089", "1979-03-14");
		Lecturer l3 = new Lecturer("Jack Feiler", "433222", "1983-07-02");
		
		//Module init
		Module m1 = new Module("Software Eng.", "CT4101", l1);
		Module m2 = new Module("Applied Systems", "CT543", l2);
		Module m3 = new Module("Machine Learning", "CT4112", l2);
		Module m4 = new Module("Cybersecurity", "CT242", l3);
		Module m5 = new Module("Image Proccessing", "CT340", l3);
		
		
		//Course Init
		Course c1 = new Course("Computer Science and I.T.", "2022-09-02", "2023-05-21");
		c1.addModule(m1);
		c1.addModule(m3);
		c1.addModule(m4);
		c1.addModule(m5);
		Course c2 = new Course("Arts in Data Anayltics", "2022-09-02", "2023-04-30");
		c2.addModule(m1);
		c2.addModule(m2);
		c2.addModule(m5);
		Course c3 = new Course("Electronic and Computing Engineering", "2022-09-09", "2023-05-06");
		c3.addModule(m1);
		c3.addModule(m2);
		c3.addModule(m3);
		c3.addModule(m4);

		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);
		
		//Add modules and courses to students
		s1.addCourse(c1);
		s1.addModule(m1);
		s1.addModule(m3);
		s1.addModule(m4);
		s1.addModule(m5);

		s2.addCourse(c1);
		s2.addModule(m1);
		s2.addModule(m3);
		s2.addModule(m4);

		s3.addCourse(c1);
		s3.addModule(m1);
		s3.addModule(m3);
		s3.addModule(m5);

		s4.addCourse(c2);
		s4.addModule(m1);
		s4.addModule(m5);

		s5.addCourse(c2);
		s5.addModule(m1);
		s5.addModule(m2);
		s5.addModule(m5);

		s6.addCourse(c3);
		s6.addModule(m2);
		s6.addModule(m3);
		s6.addModule(m4);

		s7.addCourse(c3);
		s7.addModule(m1);
		s7.addModule(m3);
		s7.addModule(m4);

		s8.addCourse(c1);
		s8.addCourse(c3);
		s8.addModule(m1);
		s8.addModule(m2);
		s8.addModule(m3);
		s8.addModule(m4);
		s8.addModule(m5);

		ArrayList<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		students.add(s7);
		students.add(s8);

		System.out.println("Courses");
		for(int i = 0; i < courses.size(); i++){
			String str = "";
			str += "Course name: ";
			str += courses.get(i).getName();
			str += "\nModules:\n";
			for(int j = 0; j < courses.get(i).getModules().size(); j++)
			{
				str += "Name: ";
				str += courses.get(i).getModules().get(j).getName();
				str += "\t\tCode: ";
				str += courses.get(i).getModules().get(j).getId();
				str += "\n";
			}
			str += "\n";
			System.out.println(str);
		}
		
		System.out.println("Students");
		for(int i = 0; i < students.size(); i++){
			String str = "";
			str += "\nID: ";
			str += students.get(i).getId();
			str += "\nName: ";
			str += students.get(i).getName();
			str += "\n";

			str += "\nModules:\n";
			for(int j = 0; j < students.get(i).getModules().size(); j++)
			{
				str += "Name: ";
				str += students.get(i).getModules().get(j).getName();
				str += "\t\tCode: ";
				str += students.get(i).getModules().get(j).getId();
				str += "\n";
			}

			str += "\nCourses:\n";
			for(int j = 0; j < students.get(i).getCourses().size(); j++)
			{
				str += "Name: ";
				str += students.get(i).getCourses().get(j).getName();
				str += "\n";
			}
			System.out.println(str);
		}
	}
}


