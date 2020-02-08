package maven.newyear;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class TestSorting extends  Gift {

	public TestSorting(int i, String n, int p, int w) {
		super(i, n, p, w);
		// TODO Auto-generated constructor stub
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
		System.out.println("Enter option "+ "\n" + "1 to sort by id ,2 to sort by name, 3 to sort by price, 4 to sort by weight");
		int option = sc.nextInt();
		sort_chocos(g1,option);
		
		 
		 

	        
	       
	}

}
