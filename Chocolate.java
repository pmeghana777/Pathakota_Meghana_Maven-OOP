package maven.newyear;

public abstract class Chocolate implements Comparable<Chocolate>{
	protected int id = -1;
	private String name = null;
	private int price = -1;
	private int weight = -1;
	
	public Chocolate(int i,String n, int p, int w){
		this.id = i;
		this.name = n;
		this.price = p;
		this.weight = w;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int compareTo(Chocolate c){
		return this.id - c.id; 
	}
	public String toString() {
        return "Chocolate : " + id + " - " + name + " - " + price + " - " + weight + "\n";
    }
}
