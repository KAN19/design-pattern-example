package factoryMethod.pizza;

// Concrete creator
public class ChessPizzaFactory implements PizzaFactory {

    @Override
    public Pizza createPizza() {
        return new ChessPizza(); 
    }
    
}
