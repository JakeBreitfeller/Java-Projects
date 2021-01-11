package csit112lab1;

public class StarB {
	public static void main(String[] args) {
        int rows = 10;
        for (int x = 1; x <= rows; x++) {
            for (int y = 1; y <= rows - x; y++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= x; z++) {
                System.out.print("*");
            }
            System.out.println("");
        }
	}
}
