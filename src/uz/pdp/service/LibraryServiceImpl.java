package uz.pdp.service;

import uz.pdp.model.*;

import java.util.Scanner;

public class LibraryServiceImpl implements LibraryService {
    User[] users;
    Book[] books;
    EBook[] eBooks = new EBook[100];
    PaperBook[] paperBooks = new PaperBook[100];
    int eBookId = -1;
    int paperBookId = -1;
    int studentId = -1;
    int studentBookRentId=-1;
    boolean check=false;
    Scanner scanner = new Scanner(System.in);
    Student[] studentHolder = new Student[100];
    String [] studentBookRent=new String[100];
    String [] bookrented=new String[100];

    public void continueAddBook() {
        System.out.println();
        System.out.println("1=>Add again  \n2=>Menu");
        System.out.print("Option: ");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                addBook();
                break;
            case 2:
                break;
            default:
                System.out.println("Entered wrong option");
                continueAddBook();
                break;
        }

    }

    public void continueAddUser() {
        System.out.println();
        System.out.println("1=>Add again  \n2=>Menu");
        System.out.print("Option: ");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                addUser();
                break;
            case 2:
                break;
            default:
                System.out.println("Entered wrong option");
                continueAddBook();
                break;
        }
    }

    @Override
    public void register() {
        System.out.println();
        scanner = new Scanner(System.in);
        studentId++;
        System.out.println("Your ID=>" + studentId);
        studentHolder[studentId] = new Student();
        System.out.println("Enter your full name: ");
        studentHolder[studentId].setFullName(scanner.nextLine());
        System.out.println("Enter your Passport number: ");
        studentHolder[studentId].setPassportNumber(scanner.nextLine());
        System.out.println("Enter your birth date: ");
        studentHolder[studentId].setBirthDate(scanner.nextLine());
        System.out.println("Enter your Phone number: ");
        studentHolder[studentId].setPhone(scanner.nextLine());
        System.out.println("Enter your email: ");
        studentHolder[studentId].setEmail(scanner.nextLine());
        System.out.println("Enter expire date of your passport: ");
        studentHolder[studentId].setPassportNumber(scanner.nextLine());
        System.out.println("Enter your University name: ");
        studentHolder[studentId].setPassportNumber(scanner.nextLine());
        System.out.println("Enter your Major: ");
        studentHolder[studentId].setPassportNumber(scanner.nextLine());
        System.out.println("Successfully registered ! ! ! !");
    }

    @Override
    public void addBook() {
        System.out.println("1=>EBook" + "\n2=>Paper Book");
        System.out.print("Option: ");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println();
                scanner = new Scanner(System.in);
                eBookId++;
                System.out.println("Your ID=>" + eBookId);
                eBooks[eBookId] = new EBook();
                System.out.println("Enter title of the book: ");
                eBooks[eBookId].setTitle(scanner.nextLine());
                System.out.println("Enter Author of the book: ");
                eBooks[eBookId].setAuthor(scanner.nextLine());
                System.out.println("Enter publisher of the book: ");
                eBooks[eBookId].setPublisher(scanner.nextLine());
                System.out.println("Enter price of the book: ");
                eBooks[eBookId].setPrice(scanner.nextLine());
                System.out.println("Enter source of the book: ");
                eBooks[eBookId].setSrcAddress(scanner.nextLine());
                System.out.println("Enter the MB of the book: ");
                eBooks[eBookId].setMB(scanner.nextLine());
                System.out.println("Enter the published date: ");
                eBooks[eBookId].setPublishedDate(scanner.nextLine());
                System.out.println("Enter the number of pages: ");
                eBooks[eBookId].setNumberOfPages(scanner.nextLine());
                System.out.println("Successfully added ! ! ! ! ");
                break;
            case 2:
                System.out.println();
                scanner = new Scanner(System.in);
                paperBookId++;
                System.out.println("Your ID=>" + paperBookId);
                paperBooks[paperBookId] = new PaperBook();
                System.out.println("Enter title of the book: ");
                paperBooks[paperBookId].setTitle(scanner.nextLine());
                System.out.println("Enter Author of the book: ");
                paperBooks[paperBookId].setAuthor(scanner.nextLine());
                System.out.println("Enter publisher of the book: ");
                paperBooks[paperBookId].setPublisher(scanner.nextLine());
                System.out.println("Enter price of the book: ");
                paperBooks[paperBookId].setPrice(scanner.nextLine());
                System.out.println("Enter size of the book: ");
                paperBooks[paperBookId].setSize(scanner.nextLine());
                System.out.println("Enter the weight  of the book: ");
                paperBooks[paperBookId].setWeight(scanner.nextLine());
                System.out.println("Enter the published date: ");
                paperBooks[paperBookId].setPublishedDate(scanner.nextLine());
                System.out.println("Enter the number og pages: ");
                paperBooks[paperBookId].setNumberOfPages(scanner.nextLine());
                System.out.println("Successfully added ! ! ! !");
                break;
            default:
                System.out.println("You entered wrong option");
                break;
        }
        continueAddBook();
    }

    @Override
    public void editBook() {
        System.out.println("Select book type. \n1=>Ebook  \n2=>Paper Book");
        System.out.print("Option: ");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.print("Enter The ID Of the book: ");
                int bookId1 = scanner.nextByte();
                for (int i = 0; i <= eBookId; i++) {
                    if (bookId1 == i) {
                        scanner = new Scanner(System.in);
                        eBooks[i] = new EBook();
                        System.out.print("Enter new title of the book: ");
                        eBooks[i].setTitle(scanner.nextLine());
                        System.out.print("Enter new Author of the book: ");
                        eBooks[i].setAuthor(scanner.nextLine());
                        System.out.print("Enter new publisher of the book: ");
                        eBooks[i].setPublisher(scanner.nextLine());
                        System.out.print("Enter new price of the book: ");
                        eBooks[i].setPrice(scanner.nextLine());
                        System.out.print("Enter new source of the book: ");
                        eBooks[i].setSrcAddress(scanner.nextLine());
                        System.out.print("Enter new the MB of the book: ");
                        eBooks[i].setMB(scanner.nextLine());
                        System.out.print("Enter new the published date: ");
                        eBooks[i].setPublishedDate(scanner.nextLine());
                        System.out.print("Enter new the number of pages: ");
                        eBooks[i].setNumberOfPages(scanner.nextLine());
                        System.out.print("Successfully added ! ! ! ! ");
                        break;

                    } else {
                        System.out.println("You entered wrong ID ! ! ! ! ");
                        break;
                    }
                }

                break;
            case 2:
                System.out.print("Enter ID of the book: ");
                bookId1 = scanner.nextInt();
                for (int i = 0; i < paperBookId; i++) {
                    if (bookId1 == i) {
                        scanner = new Scanner(System.in);
                        paperBooks[i] = new PaperBook();
                        System.out.println("Enter new title of the book: ");
                        paperBooks[i].setTitle(scanner.nextLine());
                        System.out.println("Enter new Author of the book: ");
                        paperBooks[i].setAuthor(scanner.nextLine());
                        System.out.println("Enter new publisher of the book: ");
                        paperBooks[i].setPublisher(scanner.nextLine());
                        System.out.println("Enter new price of the book: ");
                        paperBooks[i].setPrice(scanner.nextLine());
                        System.out.println("Enter new size of the book: ");
                        paperBooks[i].setSize(scanner.nextLine());
                        System.out.println("Enter new the weight  of the book: ");
                        paperBooks[i].setWeight(scanner.nextLine());
                        System.out.println("Enter new  the published date: ");
                        paperBooks[i].setPublishedDate(scanner.nextLine());
                        System.out.println("Enter new the number og pages: ");
                        paperBooks[i].setNumberOfPages(scanner.nextLine());
                        System.out.println("Successfully added ! ! ! !");
                        break;
                    } else {
                        System.out.println("You entered wrong ID ! ! ! !");
                    }
                    break;
                }
                break;

            default:
                System.out.println("Entered wrong option ! ! ! !");
                editBook();
        }

    }

    @Override
    public void deleteBook() {
        System.out.println("Select book type. \n1=>Ebook  \n2=>Paper Book");
        System.out.print("Option: ");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("Enter The ID Of the book");
                int bookId1 = scanner.nextByte();
                for (int i = 0; i <= eBookId; i++) {
                    if (i == bookId1) {
                        eBooks[bookId1] = new EBook(null, null, null, null, null, null, null, null);
                        System.out.println("Sucessfully deleted ! ! ! ! ! ");
                        break;
                    }
                }
                break;
            case 2:
                System.out.println("Enter The ID Of the book");
                int bookId2 = scanner.nextByte();
                for (int i = 0; i <= paperBookId; i++) {
                    if (i == bookId2) {
                        eBooks[bookId2] = new EBook(null, null, null, null, null, null, null, null);
                        System.out.println("Sucessfully deleted ! ! ! ! ! !");
                        break;
                    }
                }
                break;
            default:
                System.out.println("Entered wrong option!!!!1");
                deleteBook();

        }


    }

    @Override
    public void addUser() {
        register();
        continueAddUser();
    }

    @Override
    public void editUser() {
        System.out.print("Enter ID of the User: ");
        scanner=new Scanner(System.in);
        int studentId1=scanner.nextInt();
        for (int i = 0; i <=studentId ; i++) {
            if(studentId1==i){
                System.out.println("Enter your full name: ");
                studentHolder[i].setFullName(scanner.nextLine());
                System.out.println("Enter your Passport number: ");
                studentHolder[i].setPassportNumber(scanner.nextLine());
                System.out.println("Enter your birth date: ");
                studentHolder[i].setBirthDate(scanner.nextLine());
                System.out.println("Enter your Phone number: ");
                studentHolder[i].setPhone(scanner.nextLine());
                System.out.println("Enter your email: ");
                studentHolder[i].setEmail(scanner.nextLine());
                System.out.println("Enter expire date of your passport: ");
                studentHolder[i].setPassportNumber(scanner.nextLine());
                System.out.println("Enter your University name: ");
                studentHolder[i].setPassportNumber(scanner.nextLine());
                System.out.println("Enter your Major: ");
                studentHolder[i].setPassportNumber(scanner.nextLine());
                System.out.println("Successfully registered ! ! ! !");
                break;

            }
        }

    }

    @Override
    public void deleteUser() {
        System.out.println();
        System.out.print("Enter ID of the student: ");
        int studentId1 = scanner.nextInt();
        for (int i = 0; i <= studentId; i++) {
            if (studentId1 == i) {
                studentHolder[i] = new Student(null, null, null, null,
                        null, null, null, null);
                System.out.println("Successfully deleted ! ! !");
                break;
            }
        }

    }

    @Override
    public void rent() {
        scanner=new Scanner(System.in);
        System.out.println("Remember that you can rent only paperbooks ! ! ! !");
        getBooksList(1);
        System.out.print("Enter ID of the Book: ");
        int paperBookID1=scanner.nextInt();
        for (int i = 0; i <=paperBookId ; i++) {
            if(i==paperBookID1){
                System.out.print("Enter the User's ID: ");
                int studentId1=scanner.nextInt();
                for (int j = 0; j <=studentId ; j++) {
                    if(j==studentId1){
                        System.out.println(paperBooks[i].getTitle()+
                                " was rented by "+studentHolder[j].getFullName()+" ! ! ! !");
                        System.out.println(studentHolder[j].getFullName()+"====>"+paperBooks[i].getTitle());
                        studentBookRentId++;
                        studentBookRent[studentBookRentId]= studentHolder[j].getFullName();
                       bookrented[studentBookRentId]=paperBooks[i].getTitle();
                        break;
                    }
                }
                break;
            }
        }
    }

    @Override
    public void getBooksList(int a) {
        if (a == 1) {
            System.out.println();
            System.out.println("Paper Books:");
            for (int i = 0; i <= paperBookId; i++) {
                if (!paperBooks[paperBookId].getTitle().isEmpty()) {
                    System.out.println(i + "=>" + paperBooks[i].getTitle());
                }
            }
        }
        if (a == 2) {
            System.out.println();
            System.out.println("EBooks: ");
            for (int i = 0; i <= eBookId; i++) {
                if (!eBooks[eBookId].getTitle().isEmpty()) {
                    System.out.println(i + "=>" + eBooks[i].getTitle());

                }
            }

        }

    }

    @Override
    public void getUserList() {
        System.out.println();
        for (int i = 0; i <= studentId; i++) {
            System.out.println((i) + "=>" + studentHolder[i].getFullName());

        }
    }
    @Override
    public void rentedBooks() {
        for (int i = 0; i <= studentBookRentId; i++) {
            System.out.println(studentBookRent[i]+"=>"+bookrented[i]);
        }
    }
public void printInfo(){
        scanner=new Scanner(System.in);
    System.out.println("1-Ebook  \n2-PaperBook");
    System.out.print("Option: ");
    int option=scanner.nextInt();
    switch (option){
        case 1:
            System.out.print("Enter ID: ");
            int id=scanner.nextInt();
            for (int i = 0; i <=eBookId ; i++) {
                if(id==i){
                    eBooks[i].printInfo();
                    check=true;
                    break;
                }
            }
            if(check==false){
                System.out.println("There is not Book under this ID ! ! ! ");
            }
            break;
        case 2:
            System.out.print("Enter ID: ");
            int id1=scanner.nextInt();
            for (int i = 0; i <=paperBookId ; i++) {
                if(id1==i){
                    paperBooks[i].printInfo();
                    break;
                }
            }
break;

        default:
            System.out.println("You entered wrong Option ! ! ! !");
            printInfo();
    }
}


}
