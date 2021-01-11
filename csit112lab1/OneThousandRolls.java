package csit112lab1;

public class OneThousandRolls {
	
	public static void main(String[] args)
	{
		
	int boxcars = 0;
	PairOfDice p1 = new PairOfDice();
	
	for(int x = 0; x < 1000; x++) {
		p1.roll();
		if (p1.getTotalFaceValue() == 12) {
			boxcars += 1;
		}
	}
	
	System.out.println("The number of box cars rolled is " + boxcars);
	}
}
