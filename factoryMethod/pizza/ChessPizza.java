package factoryMethod.pizza;

//Concrete product
public class ChessPizza implements Pizza{

    @Override
    public void prepare() {
        System.out.println("Preparing chess pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking chess pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting chess pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing chess pizza");
    }
}
