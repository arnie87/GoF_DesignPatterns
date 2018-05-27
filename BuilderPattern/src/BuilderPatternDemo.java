public class BuilderPatternDemo {

    public static void main(String[] args) {


        CarBuilder builder = new CarBuilderImpl();
        Car car = builder.setColor("red").setWheels(4).build();

        System.out.println("Built: "+car.toString());

    }
}
