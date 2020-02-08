package maven.newyear;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public  class Gift extends Chocolate {

	public Gift(int i, String n, int p, int w) {
		super(i, n, p, w);
	}
	static int calWeight(ArrayList<Chocolate> g1){
		int tot = 0;
		for(int i = 0; i < g1.size(); i++){
			tot = tot + g1.get(i).getWeight();
		}
		return tot;
		
	}
	static int countChocos(ArrayList<Chocolate> g1,int option){
		Scanner sc = new Scanner(System.in);
		int count = 0;
		switch(option){
		case 1:
			System.out.println("Enter the price");
			int n = sc.nextInt();
			for(int i = 0;i < g1.size(); i++)
			{
				if(g1.get(i).getPrice() < n)
					count = count + 1;
			}
			break;
		case 2:
			System.out.println("Enter the price");
			int n1 = sc.nextInt();
			for(int i = 0;i < g1.size(); i++)
			{
				if(g1.get(i).getPrice() >  n1)
					count = count + 1;
			}
			break;
		default:
			count = 0;
		}
		return count;
	}
	static void sort_chocos(ArrayList<Chocolate> g1,int option){
		switch(option){
		case 1:
			Collections.sort(g1);	
			break;
		case 2:
			Collections.sort(g1, new ChocoNameSorter());
			break;
		case 3:
			Collections.sort(g1, new ChocoPriceSorter());
			break;
		case 4:
			Collections.sort(g1, new ChocoWeightSorter());
			break;
		}
		System.out.println("After Sorting");
		System.out.println(g1);
		
	}


}
