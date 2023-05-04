package factoryMethod.clothing;

public class BookFactory implements ProductFactory {

    @Override
    public Product createProduct() {
        String author = InputHelper.getUserInput("Enter author: ");
        String publisher = InputHelper.getUserInput("Enter publisher: ");
        return new Book(author, publisher);
    }
    
}
