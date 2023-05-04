package factoryMethod.burger.product;

public class VeggieBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("Preparing veggie burger");
    }
    
}
