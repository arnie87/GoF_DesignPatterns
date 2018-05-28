
public class CompositePatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Leaf leaf1 = new Leaf("node1");
		Leaf leaf2 = new Leaf("node2");
		
		Composite composite1 = new Composite();
		composite1.addLeaf(leaf1);
		composite1.addLeaf(leaf2);
		
		composite1.print();
		
		composite1.removeLeaf(leaf1);
		
		composite1.print();
		
		leaf1.print();
	}

}
