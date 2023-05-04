package factoryMethod.clothing;

public class Book implements Product {

    private String author; 
    private String publisher; 

    

    public Book(String author, String publisher) {
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public String getDescription() {
        return "Book by " + author + " published by " + publisher;
    }
    
}
