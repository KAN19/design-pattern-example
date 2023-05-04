package factoryMethod.clothing;

public class ElectronicsFactory implements ProductFactory {

    @Override
    public Product createProduct() {
        String manufacturer = InputHelper.getUserInput("Enter manufacturer: ");
        String model = InputHelper.getUserInput("Enter model: ");
        return new Electronics(manufacturer, model);
    }
    
}
