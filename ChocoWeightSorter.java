package maven.newyear;

import java.util.Comparator;

public class ChocoWeightSorter implements Comparator<Chocolate>{
	public int compare(Chocolate o1, Chocolate o2) {
		int res;
		if(o1.getWeight() > o2.getWeight()){
			res =  1;
		}else if (o1.getWeight() < o2.getWeight()){
			res = -1;
		}
		else{
			res = 0;
		}
		return res;
		
	}
}
