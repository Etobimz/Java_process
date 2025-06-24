package Projects.LibrarySystem;

import java.util.ArrayList;
import java.util.Scanner;



public class Book{
    String title;
    String author;
    int id;
    boolean isBorrowed = false;



    @Override
    public String toString() {
        return  title + " by " + author + "(ID: " + id + ")";

    }


    public boolean isAvailable() {
           return  !isBorrowed;
            
        }

    public boolean  borrow() {

        if (!isBorrowed) {
            isBorrowed = true;
            return  true;
            
        } 
        else {
            return false;
        }


    }






    public void addBookFromUserInput(Library library) {
        System.out.println("Enter book details; ");

        Scanner scanner = new Scanner(System.in);
        ArrayList<Object> books = new ArrayList<>();


        OUTER:
        while (true) {
            System.out.println("Enter  'q' to quit or 'c' to continue : \n");
            String title_dummy = scanner.nextLine();
            if (null == title_dummy) {
                System.out.println("Invalid input");
            } else {
                switch (title_dummy) {
                    case "q" -> {
                        library.Open_library();
                        break OUTER;
                    }
                    case "c" -> {
                        System.out.println("Book Title ");
                        title = scanner.nextLine();
                        books.add(title);
                        System.out.println("Enter Authors name: \n");
                        author = scanner.nextLine();
                        System.out.println("Enter book ID: \n");
                        id = scanner.nextInt();
                        scanner.nextLine(); // clear white space from nextint

                        if (books.size() == 3) {
                            System.out.println("Books added successfully!");
                            library.Library_books.add(books);
                            
                        } 
                        
                        else {
                            System.out.println("Error: Incomplete book details. Book not added.");

                        }
                        
                    }
                    default -> System.out.println("Invalid input");
                }
            }
        }
    scanner.close();



}

    












    }

    
    



