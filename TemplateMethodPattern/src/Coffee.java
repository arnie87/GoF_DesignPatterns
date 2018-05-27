public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Brew coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding milk and sugar");
    }
}
