
public class Leaf implements Component {
	
	public String name;
	
	public Leaf(String name) {
		this.name = name;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Leaf: "+name);
	}

}
