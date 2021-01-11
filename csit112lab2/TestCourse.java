package csit112lab2;

public class TestCourse {
	public static void main(String[] args) {
			        // your code will go here!!!
			        Address school = new Address("800 Lancaster Ave.", "Villanova", "PA", 19085);
			        Address home1 = new Address("21 Jump Street", "Lynchburg", "VA", 24551);
			        Address home2 = new Address("123 Main Street", "Euclid", "OH", 44132);
			        Address home3 = new Address("114 Park Drive.", "Westwood", "NJ", 07732);
			     
			         
			        final int s1test1 = 76;
			        final int s1test2 = 89;
			        final int s1test3 = 84;
			        final int s2test1 = 60;
			        final int s2test2 = 55;
			        final int s2test3 = 72;
			        final int s3test1 = 89;
			        final int s3test2 = 95;
			        final int s3test3 = 82;
			         
			        Course course1 = new Course("Geography");
			        Student student1 = new Student(null, null, home3, home3);
			        Student student2 = new Student(null, null, home3, home3);
			        Student student3 = new Student(null, null, home3, home3);
			        addStudent(student1);
			        addStudent(student2);
			        addStudent(student3);
			         
			         
			        System.out.println(course1.roll());
			         
			        System.out.println();
			        System.out.println("Question four was called and ran sucessfully.");
			    }

	}
			 

