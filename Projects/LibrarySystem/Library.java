package Projects.LibrarySystem;

//  class that stores the books in an arraylist
// view books , borrow books and return books


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Library {

    public ArrayList<ArrayList<Object>> Library_books = new ArrayList<>(); // lists in list 

    

    public void Open_library() {
        Scanner scanner = new Scanner(System.in);

        while (true) { // Loop the menu
            
            System.out.println("Hi, you're opening the Library menu ");
            System.out.println("Choose 1 to add, 2 to view, 3 to boroow, 4 to return book, 5 to searchbook, 6 to exit ");
        
            int selection = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            switch (selection) {
                case 1:
                    Book book = new Book();
                    book.addBookFromUserInput(this);
                    break;
    
                case 2:
                    this.displayBooks();
                    break;
    
                case 3:
                   // this.borrowBook();
                    break;

                case 4:
                    //this.returnBook
                    break;

                case 5:
                    //this.searchBooks
                    break;
                
                case 6:
                    System.out.println("Exiting...");
                    
                    //break;
                    return; // exit the loop
            
                default:
                    System.out.println("Not a valid response");
                    break;
            }
    
            
        }
    

    }







    public  void displayBooks() {

        if (Library_books.isEmpty()) {
            System.out.println("No Books available.");
            }


        else {
            // Sort Contact_info by name (first index)
            Collections.sort(Library_books, (ArrayList<Object> o1, ArrayList<Object> o2) -> {
                String name1 = (String) o1.get(0);
                String name2 = (String) o2.get(0);
                return name1.compareTo(name2);
            });


        // int i = 0;  i++;
        // while (i<Contact_info.size()) {

        System.out.println("\n Books available in library (sorted by title):");
        for (ArrayList<Object> book : Library_books) {

            if ( book.size() < 3) {
                System.out.println("Incorrect entry skipping");
                continue;
            }

            String title = (String) book.get(0);
            String author = (String) book.get(1);
            Integer id = (Integer) book.get(2);

            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Book id: " + id);
            System.out.println("----------------------");

           

        }

        
        
            }
   
}








    }
    

    




    















































// instead of an array list or me manually creating an array of books with htei authors name and etc, can I find like a pdf with list of books names and other fertures and use the read from 