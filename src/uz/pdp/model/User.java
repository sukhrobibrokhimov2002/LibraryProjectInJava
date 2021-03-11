package uz.pdp.model;

public abstract class User {
    private String fullName;
    private String passportNumber;
    private String birthDate;
    private String phone;
    private String email;
    private String expireDate;
    private Book[] books;
    User(){

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public User(String fullName, String passportNumber, String birthDate, String phone, String email, String expireDate) {
        this.fullName = fullName;
        this.passportNumber = passportNumber;
        this.birthDate = birthDate;
        this.phone = phone;
        this.email = email;
        this.expireDate = expireDate;
    }

    public User(String fullName, String passportNumber, String birthDate, String phone, String email, String expireDate, Book[] books) {
        this.fullName = fullName;
        this.passportNumber = passportNumber;
        this.birthDate = birthDate;
        this.phone = phone;
        this.email = email;
        this.expireDate = expireDate;
        this.books = books;
    }
}
