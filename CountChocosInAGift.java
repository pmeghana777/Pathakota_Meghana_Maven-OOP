package maven.newyear;

import java.util.ArrayList;
import java.util.Scanner;

public class CountChocosInAGift extends Gift {

	public CountChocosInAGift(int i, String n, int p, int w) {
		super(i, n, p, w);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Chocolate c1 = new Gift(1, "dairymilk", 100, 300);
		Chocolate c2 = new Gift(2, "milkybar", 200, 500);
		Chocolate c3 = new Gift(3,"kitkat",50,10);
		ArrayList<Chocolate> g1 = new ArrayList<Chocolate>();
		g1.add(c1);
		g1.add(c2);
		g1.add(c3);
		int option;
		System.out.println("Enter the option to count candies in the gift :"+ "\n" + "1. To count candies less than given price" + "\n" + "2. To count candies greater than given price");
		option = sc.nextInt();
		int cou = countChocos(g1,option);
		System.out.println("The value of count on given option is " + cou);
		

	}

}

