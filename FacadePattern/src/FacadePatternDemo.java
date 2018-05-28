
public class FacadePatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeCreator creator = new ShapeCreator();
		
		creator.drawCircle();
		creator.drawRectangle();
		creator.drawSquare();
	}

}
