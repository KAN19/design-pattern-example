package factoryMethod.burger;

import factoryMethod.burger.creator.BeefBurgerRestaurant;
import factoryMethod.burger.creator.Restaurant;
import factoryMethod.burger.creator.VeggieBurgerRestaurant;

public class Client {
    public static void main(String[] args) {
        Restaurant beefRestaurant = new BeefBurgerRestaurant(); 
        beefRestaurant.orderBurger();

        Restaurant veggieRestaurant = new VeggieBurgerRestaurant(); 
        veggieRestaurant.orderBurger();
    }
}
