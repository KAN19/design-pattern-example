package factoryMethod.pizza;

public class Main {
    public static void main(String[] args) {
        PizzaFactory chessPizzaFactory = new ChessPizzaFactory();
        PizzaFactory pepperoniPizzaFactory = new PepperoniPizzaFactory();

        PizzaStore store1 = new PizzaStore(chessPizzaFactory); 
        Pizza chessPizza = store1.orderPizza();

        PizzaStore store2 = new PizzaStore(pepperoniPizzaFactory);
        Pizza pepperoniPizza = store2.orderPizza();
        
    }
}
