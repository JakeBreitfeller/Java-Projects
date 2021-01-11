package csit112lab2;

public class StudentBody
{
//-----------------------------------------------------------------
//  Creates some Address and Student objects and prints them.
//-----------------------------------------------------------------
public static void main (String[] args)
{
Address school = new Address ("800 Lancaster Ave.", "Villanova", "PA", 19085);

Address jHome = new Address ("21 Jump Street", "Lynchburg", "VA", 24551);

Student john = new Student ("John", "Smith", jHome, school);

int testc = 1;
int testb = 2;
int testa = 3;

john.setTestScore(testa, testb, testc, 85, 90, 87);

Address mHome = new Address ("123 Main Street", "Euclid", "OH", 44132);

Student marsha = new Student ("Marsha", "Jones", mHome, school);

int testx = 1;
int testy = 2;
int testz = 3;

marsha.setTestScore(testx, testy, testz, 90, 95, 98);

System.out.println (john);

System.out.println ();

System.out.println (marsha);
}
}