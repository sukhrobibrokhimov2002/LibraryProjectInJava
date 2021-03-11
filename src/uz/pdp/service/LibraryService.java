package uz.pdp.service;

public interface LibraryService {

    void register();

    void getUserList();

    void addBook();

    void editBook();

    void deleteBook();

    void addUser();

    void editUser();

    void deleteUser();

    void rent();

    void getBooksList(int a);

    void rentedBooks();
}
