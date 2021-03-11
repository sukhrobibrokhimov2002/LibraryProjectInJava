package uz.pdp;

import uz.pdp.model.Student;
import uz.pdp.service.LibraryService;
import uz.pdp.service.LibraryServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryServiceImpl services = new LibraryServiceImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our Library");
        System.out.println("1-Sign Up \n0-Exit");
        System.out.print("Option: ");
        int option = scanner.nextInt();
        if (option == 1) {
            services.register();
        } else {
            System.exit(0);
        }
        while (true) {
            System.out.println();
            System.out.println("1=>Add book  \n2=>Edit Book  \n3=>Delete Book  \n4=>Add User " +
                    "\n5=>Edit User  \n6=>Delete User  \n7=>Rent  \n8=>Book list  \n9=>User list  " +
                    "\n10=>Students who rented Books  \n11=>Information About Books \n0=>Exit ");
            System.out.println();
            System.out.print("Option: ");
            int option1 = scanner.nextInt();
            switch (option1) {
                case 1:
                    services.addBook();
                    break;
                case 2:
                    services.editBook();
                    break;
                case 3:
                    services.deleteBook();
                    break;
                case 4:
                    services.register();
                    break;
                case 5:
                    services.editUser();
                    break;
                case 6:
                    services.deleteUser();
                    break;
                case 7:
                    services.rent();
                    break;
                case 8:
                    services.getBooksList(1);
                    services.getBooksList(2);
                    break;
                case 9:
                    services.getUserList();
                    break;
                case 10:
                    services.rentedBooks();
                    break;
                case 11:
                    services.printInfo();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                System.out.println("You entered wrong option ! ! !");
                break;
            }


        }
    }
}
