
package Projects.Contactbook;
import java.util.*;









public class Contact_Book {


    //Contact_Book () {} 


    

    
    public void activate_contact_book() {

        System.out.println("Hi, you're opening your contact book ");
        System.out.println("Choose 1 to add, 2 to view, 3 to search, 4 to exit ");

        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();


        
        switch (selection) {
            case 1:
                this.add_contact();
                break;

            case 2:
                break;

            case 3:
                break;

            case 4:
                break;
        
            default:
                System.out.println("Not a valid response");
                break;
        }

        
      
       scanner.close();


    }

   

                





    public void add_contact() {

        System.out.println("Please kindly enter your: name, email, phoneNumber in this order ");


        ArrayList<ArrayList<String>> Contact_info = new ArrayList<>(); // lists in list 

        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> email = new ArrayList<>();
        ArrayList<Integer> phoneNumber = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

       
        
        while (true) {


            System.out.print("Enter name: ");
            String name_user = scanner.nextLine();
     

            if ("q".equals(name_user)) {
                break;
              
            } 


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

        Contact_info.add(name);
        Contact_info.add(email);

        //Contact_info.add(phoneNumber);


        scanner.close();
        
    }








    public void view_contacts() {


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

    }




    
}















