public class FactoryMethodPatternDemo {

    public static void main(String[] args) {

        PizzaStore nyPizzaStore = new NYStylePizzaStore();
        Pizza cheesePizza = nyPizzaStore.orderPizza("cheese");

        PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();
        cheesePizza = chicagoPizzaStore.orderPizza("cheese");
    }
}
