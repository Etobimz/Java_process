
package Projects.LibrarySystem;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class lib2 {

    public ArrayList<ArrayList<Object>> Library_books = new ArrayList<>(); // List of books
    Scanner scanner = new Scanner(System.in);

    public void Open_library() {
        while (true) {
            System.out.println("Hi, you're opening the Library menu ");
            System.out.println("Choose 1 to view, 3 to borrow, 4 to return book, 5 to search book, 6 to exit ");

            int selection = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (selection) {
                case 1:
                    this.displayBooks();
                    break;

                case 3:
                    // this.borrowBook();
                    break;

                case 4:
                    // this.returnBook();
                    break;

                case 5:
                    // this.searchBooks();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return; // Exit the loop

                default:
                    System.out.println("Not a valid response");
                    break;
            }
        }
    }

    public void loadBooksFromFile(String filename) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;

            while ((line = br.readLine()) != null) {
                String[] details = line.split(",");
                if (details.length == 3) {
                    ArrayList<Object> books = new ArrayList<>();
                    books.add(details[0]); // Title
                    books.add(details[1]); // Author
                    int id = Integer.parseInt(details[2]); // ID
                    books.add(id);
                    Library_books.add(books);
                    System.out.println("Added book: " + books);
                } else {
                    System.out.println("Invalid book entry: " + line);
                }
            }
            br.close();
            System.out.println("Books loaded successfully!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void displayBooks() {
        if (Library_books.isEmpty()) {
            System.out.println("No Books available.\n");
            return; // Exit the method
        }

        // Sort books by title (first index)
        Collections.sort(Library_books, (ArrayList<Object> o1, ArrayList<Object> o2) -> {
            String name1 = (String) o1.get(0);
            String name2 = (String) o2.get(0);
            return name1.compareTo(name2);
        });

        System.out.println("\nBooks available in library (sorted by title):");
        for (ArrayList<Object> book : Library_books) {
            if (book.size() < 3) {
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