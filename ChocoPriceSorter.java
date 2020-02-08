package maven.newyear;

import java.util.Comparator;

public class ChocoPriceSorter implements Comparator<Chocolate>{
	public int compare(Chocolate o1, Chocolate o2) {
		int res;
		if(o1.getPrice() > o2.getPrice()){
			res =  1;
		}else if (o1.getPrice() < o2.getPrice()){
			res = -1;
		}
		else{
			res = 0;
		}
		return res;
		
	}
}
