package factoryMethod.clothing;

public class Electronics implements Product {
    private String manufacturer; 
    private String model; 

    public Electronics(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    @Override
    public String getDescription() {
        return "Electronics by " + manufacturer + " model " + model;
    }
    
}
