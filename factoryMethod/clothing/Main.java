package factoryMethod.clothing;

public class Main {
    public static void main(String[] args) {
        ProductFactory bookFactory = new BookFactory();
        ProductFactory electronicFactory = new ElectronicsFactory();
        ProductFactory clothingFactory = new ClothingFactory();

        MyCompany company = new MyCompany(bookFactory);
        company.manufactureProduct();

        company.setFactory(electronicFactory);
        company.manufactureProduct();

        company.setFactory(clothingFactory);
        company.manufactureProduct();
    }
}
