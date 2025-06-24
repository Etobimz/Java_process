package Projects.LibrarySystem;



public class MainRunLibSys {
    public static void main(String[] args) {
        Book b = new Book() ;
        b.isAvailable();
        //b.addBookFromUserInput();
        Library lib_user = new Library();
        //lib_user.loadBooksFromFile("books.txt");
        
        lib_user.loadBooksFromFile("/Users/abimbolaolarinde/Downloads/Jva/Projects/LibrarySystem/books.txt");
        lib_user.Open_library();

        
    }
}
