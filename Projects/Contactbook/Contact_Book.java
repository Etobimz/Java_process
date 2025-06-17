
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


    }

}





















 /* 
        // Array of Objects
 

        // objects/ instances
        Car car_type_1 = new Car("toyota", 2005, "blue");

        Car car_type_2 = new Car("Camry", 2025, "black");
        

        // array of objects
        Car[] Cars = {car_type_1,car_type_2};


        for (Car car : Cars) {
            car.display_car();
            
       */





         /* 
            else {

                name.add(name_user);


                System.out.print("Enter email: ");
                String email_user = scanner.nextLine();
                email.add(email_user);


                System.out.print("Enter phone number: ");
                int phoneNumber_user = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character left by nextInt()

                phoneNumber.add(phoneNumber_user);

            }


        
       
            
        }

        /
        Contact_info.add(name);
        Contact_info.add(email);
        Contact_info.add(phoneNumber);

       
           //  System.out.println(contact);
        //}
        */








/* 
    public void view_contacts() {
         for (ArrayList<?> contact : Contact_info) {
            //  "<?>" to loop over different array types  here was ints and Strings
            int i = 0 ;
            while (i < Contact_info.size()) {
                System.out.println(Contact_info.get(i).get(i));
                
            }

}

            
*/