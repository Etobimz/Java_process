
package Projects.Contactbook;
import java.util.*;









public class Contact_Book {


    //Contact_Book () {} 


    private ArrayList<ArrayList<Object>> Contact_info = new ArrayList<>(); // lists in list 
    // Changed to ArrayList<Object> to allow sorting with Comparator


    Scanner scanner = new Scanner(System.in);



    

    
    public void activate_contact_book() {

        while (true) { // Loop the menu
            
        System.out.println("Hi, you're opening your contact book ");
        System.out.println("Choose 1 to add, 2 to view, 3 to search, 4 to exit ");

        int selection = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character


        
        switch (selection) {
            case 1:
                this.add_contact();
                break;

            case 2:
                this.view_contacts();
                break;

            case 3:
                this.search_contact();
                break;

            case 4:
                System.out.println("Exiting...");
                
                //break;
                return; // exit the loop
        
            default:
                System.out.println("Not a valid response");
                break;
        }

        
    }


    }



    public void add_contact() {

        System.out.println("Please kindly enter your: name, email, phoneNumber in this order ");



       

      
        


       
        
        while (true) {

            ArrayList<Object> con_inf = new ArrayList<>();

            System.out.print("Enter name (or 'q' to quit) ");
            String name_user = scanner.nextLine();
     

            if ("q".equals(name_user)) {
                //this.activate_contact_book();
                break;
              
            } 

            else {
                
                con_inf.add(name_user);

                System.out.println("Enter email address");
                String email = scanner.nextLine();
                con_inf.add(email);


                System.out.println("Enter Phone number ");
                int phone_no = scanner.nextInt();
                scanner.nextLine();  // Consume the newline character left by nextInt()
                con_inf.add(phone_no);


                System.out.println("Contact added successfully!");
                Contact_info.add(con_inf);


            }

          

        }


        
        
    
        
    }




    


    public void view_contacts() {
        if (Contact_info.isEmpty()) {
            System.out.println("No contacts available.");
            }


        else {
            // Sort Contact_info by name (first index)
            Collections.sort(Contact_info, new Comparator<ArrayList<Object>>() {
            @Override
            public int compare(ArrayList<Object> o1, ArrayList<Object> o2) {
                String name1 = (String) o1.get(0);
                String name2 = (String) o2.get(0);
                return name1.compareTo(name2);
            }

        });


        // int i = 0;  i++;
        // while (i<Contact_info.size()) {

        System.out.println("\nContacts (sorted by name):");
        for (ArrayList<Object> contact : Contact_info) {
            String name = (String) contact.get(0);
            String email = (String) contact.get(1);
            Integer phone_no = (Integer) contact.get(2);

            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("Phone Number: " + phone_no);
            System.out.println("----------------------");

           

        }

        
        
            }
   
}



    public  void search_contact() {
        String search = scanner.nextLine();
        System.out.println("Enter first name you're willing to search \n");
        System.out.println("Enter 'q' to stop searching and 'c' to continue searching \n");

        while (true) {

            if (search == "q") {
               break;
                
            }

            else if (search == "c") {

                //int i = 0;

                for (ArrayList<Object> contact : Contact_info) {

                    String name = (String) contact.get(0);
                 
                    
                    // Compare the first numberOfLetters of a string 
                    //  .substring(0,numberofLetters)

                    boolean matchFound = false;

                    if (name.length() >= search.length() && name.substring(0,search.length()).equals(search)) 
                    
                    {
                        System.out.println("Match exits" + name);
                        matchFound = true;
                        
                    }


                    else {
                        System.out.println("Invalid input. Enter 'q' to quit or 'c' to continue.");


                    }
                    
                }
                
            }



        }


    }

}

















