package uz.pdp.model;

public abstract class Book {
    private String title;
    private String author;
    private String publisher;
    private String publishedDate;
    private String numberOfPages;
    private String price;
    private boolean status = true; //kitob bor holat un!

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(String numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Book(String title, String author, String publisher, String publishedDate,String numberOfPages, String price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publishedDate = publishedDate;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    public Book(String title, String author, String publisher, String publishedDate, String numberOfPages, String price, boolean status) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publishedDate = publishedDate;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.status = status;
    }

    public Book() {
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


   public void printInfo(){
        System.out.println("Title: "+title+"\nAuthor: "+author+"\nPublisher: "+publisher+
                "\nPublished date: "+publishedDate+"\nNumber of pages: "+numberOfPages+
                "\nPrice: "+price);
    }

}
