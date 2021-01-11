package csit112lab2;

public class Student
{
private String firstName, lastName;
private Address homeAddress, schoolAddress;
private int score1, score2, score3, test1, test2, test3;
//-----------------------------------------------------------------
//  Constructor: Sets up this student with the specified values.
//-----------------------------------------------------------------
public Student (String first, String last, Address home, Address school, int s1, int s2, int s3)
{
firstName = first;
lastName = last;
homeAddress = home;
schoolAddress = school;
score1 = s1;
score2 = s2;
score3 = s3;
}
//--------------------------------------------------------------------------------------------------------
// Overloaded constructor: this constructor sets all the default scores to 0 rather than parameter values.
//--------------------------------------------------------------------------------------------------------
public Student (String first, String last, Address home, Address school)
{
firstName = first;
lastName = last;
homeAddress = home;
schoolAddress = school;
score1 = 0;
score2 = 0;
score3 = 0;
}

public void setTestScore(int t1, int t2, int t3, int s1, int s2, int s3)
{
	test1 = t1;
	test2 = t2;
	test3 = t3;
	score1 = s1;
	score2 = s2;
	score3 = s3;
}

public int getTestScore(int test)
{
  	if (test == test1)
  		return score1;
  		else if (test == test2)
  			return score2;
  		else 
  			return score3;
}

public int average(int avg)
{
	avg = ((score1 + score2 + score3)/3);
	return avg;
}

//-----------------------------------------------------------------
//  Returns a string description of this Student object.
//-----------------------------------------------------------------
public String toString()
{
String result;
result = firstName + " " + lastName + "\n";
result += "Home Address:\n" + homeAddress + "\n";
result += "School Address:\n" + schoolAddress + "\n";
result += "Scores: " + score1 + " " + score2 + " " + score3 + "\n";
result += "Average Score " + ((score1 + score2 + score3)/3);
return result;
}
}