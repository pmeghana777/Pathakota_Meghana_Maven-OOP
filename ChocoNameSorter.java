package maven.newyear;

import java.util.Comparator;

public class ChocoNameSorter implements Comparator<Chocolate>{
	public int compare(Chocolate o1, Chocolate o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
