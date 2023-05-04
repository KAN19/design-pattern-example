package factoryMethod.burger.creator;

import factoryMethod.burger.product.BeefBurger;
import factoryMethod.burger.product.Burger;

public class BeefBurgerRestaurant extends Restaurant {

    @Override
    protected Burger createBurger() {
        return new BeefBurger();
    }
    
}
