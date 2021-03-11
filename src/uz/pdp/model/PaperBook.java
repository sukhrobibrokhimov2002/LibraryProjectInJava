package uz.pdp.model;

public class PaperBook extends Book {

    private String weight;
    private String size;

    public PaperBook() {
    }

    public PaperBook(String title, String author, String publisher, String publishedDate,String numberOfPages, String price, String weight, String size) {
        super(title, author, publisher, publishedDate, numberOfPages, price);
        this.weight = weight;
        this.size = size;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Weigth of the Book: "+weight);

    }
}
