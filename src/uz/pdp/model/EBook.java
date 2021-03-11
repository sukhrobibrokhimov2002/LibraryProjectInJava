package uz.pdp.model;

public class EBook extends Book {
    private String MB;
    private String srcAddress;

    public EBook() {

    }

    public EBook(String title, String author, String publisher, String publishedDate,String numberOfPages, String price, String MB, String srcAddress) {
        super(title, author, publisher, publishedDate, numberOfPages, price);
        this.MB = MB;
        this.srcAddress = srcAddress;
    }

    public String  getMB() {
        return MB;
    }

    public void setMB(String MB) {
        this.MB = MB;
    }

    public String getSrcAddress() {
        return srcAddress;
    }

    public void setSrcAddress(String srcAddress) {
        this.srcAddress = srcAddress;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        setNumberOfPages("\nMB of the Book: "+MB+"\nWeb address of the Book: "+srcAddress);
    }
}
