package maven.newyear;

import java.util.ArrayList;

public class CalculateWeightOfGift extends Gift {

	public CalculateWeightOfGift(int i, String n, int p, int w) {
		super(i, n, p, w);
	}
	public static void main(String[] args) {
		Chocolate c1 = new Gift(1, "dairymilk", 100, 300);
		Chocolate c2 = new Gift(2, "milkybar", 200, 500);
		Chocolate c3 = new Gift(3,"kitkat",50,10);
		ArrayList<Chocolate> g1 = new ArrayList<Chocolate>();
		g1.add(c1);
		g1.add(c2);
		g1.add(c3);
		
		int tot_weig = calWeight(g1);
		System.out.println("Weight of the Gift is : " + tot_weig);
		

	}

}
