package Projects.LibrarySystem;

//  class that stores the books in an arraylist
// view books , borrow books and return books


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Library {

    public ArrayList<ArrayList<Object>> Library_books = new ArrayList<>(); // lists in list 

    Scanner scanner = new Scanner(System.in);


    

    public void Open_library() {

        while (true) { // Loop the menu
            
            System.out.println("Hi, you're opening the Library menu ");
            System.out.println("Choose 1  to view, 2 to borrow, 3 to return book, 4 to searchbook, 5 to exit ");
        
            int selection = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            switch (selection) {
                //case 1:
                    //..Book book = new Book();
                    //book.addBookFromUserInput(this);
                  //  this.loadBooksFromFile( "file");

                 //   break;
    
                case 1:
                    this.displayBooks();
                    break;
    
                case 2:
                    this.borrowBook();
                    break;

                case 3:
                    this.returnBook();
                    break;

                case 4:
                    this.searchBooks();
                    break;
                
                case 5:
                    System.out.println("Exiting...");
                    
                    //break;
                    return; // exit the loop
            
                default:
                    System.out.println("Not a valid response");
                    break;
            }
    
            
        }
    

    }















    public  void loadBooksFromFile(String filename) {

        try {
            // The FileReader class is used to open and read the contents of a file.

            // BufferedReader: 
                    // class wraps around the FileReader to improve performance.
                    // It reads the file in chunks (buffers) instead of character by character, making it faster 
                    // and more efficient.
                    // It also provides the readLine() method, which allows you to read one line of text at a time

                    BufferedReader br = new BufferedReader(new FileReader(filename));
                    //String filename = scanner.nextLine();


                    String line;

                    while ((line = br.readLine())!= null) { 
                       String details[] = line.split(",");
                       if (details.length == 3) {
                        ArrayList <Object> books = new ArrayList<>();
                        books.add(details[0]);
                        books.add(details[1]);
                        int id = Integer.parseInt(details[2]);
                        books.add(id);
                        Library_books.add(books);
                           
                       } 
                       
                       else {
                        System.out.println("Couldnt read file, file invomplete " + line);


                       }

                       System.out.println("Books loaded successfully!");

                        
                    }
                    br.close(); // Close the BufferedReader to release resources


            
        } 
        
        catch (IOException e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage()); // Concise message
            e.printStackTrace(); // Full stack trace for debugging
        }



    }














    public  void displayBooks() {

        if (Library_books.isEmpty()) {
            System.out.println("No Books available.\n");
            //this.Open_library();
            return;
            }


        else {
            // Sort Contact_info by name (first index)
            Collections.sort(Library_books, (ArrayList<Object> o1, ArrayList<Object> o2) -> {
                String name1 = (String) o1.get(0);
                String name2 = (String) o2.get(0);
                return name1.compareTo(name2);
            });


        System.out.println("\n Books available in library (sorted by title):");
        for (ArrayList<Object> book : Library_books) {

            if ( book.size() < 3) {
                System.out.println("Incorrect entry skipping");
                continue;
            }

            String title =  (String) book.get(0);
            String author = (String) book.get(1);
            Integer id = (Integer) book.get(2);

            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Book id: " + id);
            System.out.println("----------------------");

           

        }

        
        
            }
   

}








    public void  borrowBook () {
        // Book b = new Book();
        //b.isAvailable();
        //b.borrow();
            System.out.println("Enter the ID of the book you want to borrow : ");
          
            boolean bookFound = false; // Flag to check if the book exists


            
                try {
                    int id = scanner.nextInt();
                    for (ArrayList<Object> book : Library_books) {
                        if ( (Integer) book.get(2) == id) {
            
                            System.out.println("You have succesfully borrowed the book.");
                            Library_books.remove(book);
                            bookFound = true;
                        break;
                            
                            
                            
                        }
                    }
            
            
                        if (!bookFound) {
                            System.out.println("Book with ID " + id + " not found or already borrowed.");
                    }
            
                    System.out.println("\nUpdated list of available books:");
                    this.displayBooks(); // Display the updated list of books
            
            
                
            

                }
                
                catch (InputMismatchException e) {
                    // TODO: handle exception
                    System.out.println("invalid input enter a right input ");
                    scanner.nextLine(); // Clear the invalid input from the scanner
                }

            

        
            }






    public void returnBook() {
        ArrayList<Object> return_book = new ArrayList<>();

        System.out.println("Enter details of the book youre willing to return\n ");

        System.out.println("\nID of the book you want to return? ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character



        
        for (ArrayList<Object> book : Library_books) {
           
            if ( (Integer) book.get(2) == id) {
                System.out.println("Book already been returned, can't return duplicates");
      
                this.displayBooks();
                return;
                    
            }

    }
            
        System.out.println("Enter Book Title");
        String Title = scanner.nextLine();

        System.out.println("\nEnter Authors name");
        String Author = scanner.nextLine();


         return_book.add(0,Title);
         return_book.add(1,Author);
         return_book.add(2,id);


           Library_books.add(return_book);
           System.out.println("Returned book sucessfuly");
             this.displayBooks();

    }






    public void searchBooks() {

        System.out.println("\nID of the book you want to search if available ? \n");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (ArrayList<Object> book : Library_books) {
           
            if ( (Integer) book.get(2) == id) {
                System.out.println("Book found!: "  + book.get(0)); // Assuming book.get(0) is the title
                System.out.println("Author: " + book.get(1)); // Assuming book.get(1) is the author
                System.out.println("ID: " + book.get(2)); // Print the book ID
            

                 }

       /* 
            else {

            System.out.println("book not found, please search another book \n");
    
            
                 }

                 */

             }

            
            
            System.out.println( " Do you want to search for another book?  Y to contine Q to quit" );
            String response = scanner.nextLine();
            
            if (response.equals("y") ) {
                    this.searchBooks();
                    
                } 
                
                else if (response.equals("q" ) ) {
                    this.Open_library();
                    
                }
    


}
    

    


    
}
























































