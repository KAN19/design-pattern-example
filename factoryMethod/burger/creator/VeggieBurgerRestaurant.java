package factoryMethod.burger.creator;

import factoryMethod.burger.product.Burger;
import factoryMethod.burger.product.VeggieBurger;

public class VeggieBurgerRestaurant extends Restaurant {

    @Override
    protected Burger createBurger() {
        return new VeggieBurger();
    }
    
}
