package factoryMethod.clothing;

public class Clothing implements Product {
    private String brand; 
    private String size; 

    public Clothing(String brand, String size) {
        this.brand = brand;
        this.size = size;
    }

    @Override
    public String getDescription() {
        return "Clothing by " + brand + " size " + size;
    }

}
