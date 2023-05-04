package factoryMethod.clothing;

public class MyCompany {
    private ProductFactory factory;

    public MyCompany(ProductFactory factory) {
        this.factory = factory;
    }

    public Product manufactureProduct() {
        if (factory == null) {
            throw new IllegalStateException("Factory not set");
        }
        Product product = factory.createProduct();
        System.out.println("Manufactured " + product.getDescription());

        return product; 
    }

    public void setFactory(ProductFactory factory) {
        this.factory = factory;
    }
    
}
