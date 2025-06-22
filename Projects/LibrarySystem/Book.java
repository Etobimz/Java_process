package Projects.LibrarySystem;

import java.util.ArrayList;
import java.util.Scanner;



public class Book {
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


    public void addBookFromUserInput() {

       Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();



        while (true) { 

            

        
        
        System.out.println("Enter book Title and 'q' to quit or 'c' to continue : \n");
        title = scanner.nextLine();

        System.out.println("Enter Authors name: \n");
        author = scanner.nextLine();


        System.out.println("Enter book ID: \n");
        id = scanner.nextInt();









        scanner.close();
        

    }


}

    




    }

    
    



