package factoryMethod.burger.creator;

import factoryMethod.burger.product.Burger;

public abstract class Restaurant {
    public void orderBurger() {
        Burger burger = createBurger();
        burger.prepare();
    }

    protected abstract Burger createBurger();
}
