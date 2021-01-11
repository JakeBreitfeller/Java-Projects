package csit112lab2;

import java.util.ArrayList;

public class Course {
			private String course;
		    private Student s1, s2, s3, s4, s5;
		    private int studentcount = 0;
		 
		    public Course() 
		    {
		        course = "";
		    }
		 
		    public Course(String name) 
		    {
		        course = name;
		    }
		 
		    public Student addStudent(Student s1) 
		    {
		        if (studentcount == 0) {
		            s1 = new Student(course, course, null, null, studentcount, studentcount, studentcount);
  	                studentcount++;
		            return s1;
		        } else if (studentcount == 1) {
		            s2 = new Student(course, course, null, null, studentcount, studentcount, studentcount);
		            studentcount++;
		            return s2;
		        } else if (studentcount == 2) {
		            s3 = new Student(course, course, null, null, studentcount, studentcount, studentcount);
		            studentcount++;
		            return s3;
		        } else if (studentcount == 3) {
		            s4 = new Student(course, course, null, null, studentcount, studentcount, studentcount);
		            studentcount++;
		            return s4;
		        } else if (studentcount == 4) {
		            s5 = new Student(course, course, null, null, studentcount, studentcount, studentcount);
		            studentcount++;
		            return s5;
		        } else {
		            System.out.println("Sorry! The course is full. Please try again next term.");
		        }
		        return null;
		    }
		    
		    public double average() 
		    {
		        final int maxstudent = 5;
		        return (s1.average() + s2.average() + s3.average() + s4.average() + s5.average()) / maxstudent;
		    }
		     
		    public String roll() {
		        String result;
		        result = s1.toString() + "/n";
		        result += s2.toString() + "/n";
		        result += s3.toString() + "/n";
		        result += s4.toString() + "/n";
		        result += s5.toString() + "/n";
		         
		        return result;
		    }
		     
}
