package factoryMethod.pizza;

// Concrete creator
public class PepperoniPizzaFactory implements PizzaFactory {

    @Override
    public Pizza createPizza() {
        return new PepperoniPizza(); 
    }
    
}
