package factoryMethod.clothing;

public class ClothingFactory implements ProductFactory {

    @Override
    public Product createProduct() {
        String brand = InputHelper.getUserInput("Enter brand: ");
        String type = InputHelper.getUserInput("Enter type: ");
        return new Clothing(brand, type);
    }
}
