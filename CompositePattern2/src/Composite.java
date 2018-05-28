import java.util.ArrayList;

public class Composite implements Component {

	public ArrayList<Leaf> leafs;

	public Composite() {
		leafs = new ArrayList<Leaf>();
	}

	public void addLeaf(Leaf l) {
		leafs.add(l);
	}

	public void removeLeaf(Leaf l) {
		leafs.remove(l);
	}
	
	public ArrayList<Leaf> getLeafs() {
		return leafs;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		for (Leaf l : leafs) {
			System.out.println("Leaf: "+l.name);
		}
	}

}
