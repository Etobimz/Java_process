
package Projects.Contactbook;
import java.util.*;









public class Contact_Book {


    //Contact_Book () {} 

    private ArrayList<ArrayList<?>> Contact_info = new ArrayList<>(); // lists in list 
    // "<?>" to allpow mixed types of arrays


    

    
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
                this.view_contacts();
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



       

       //ArrayList<String> name = new ArrayList<>();
        //ArrayList<String> email = new ArrayList<>();
        // ArrayList<Integer> phoneNumber = new ArrayList<>();
        ArrayList<Object> con_inf = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

       
        
        while (true) {


            //System.out.print("Enter name: ");
            String name_user = scanner.nextLine();
     

            if ("q".equals(name_user)) {
                break;
              
            } 

            else {
                con_inf.add(name_user);




            }

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


        }


        scanner.close();
        
    }







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

    public void view_contacts() {
        if (Contact_info.isEmpty()) {
            System.out.println("No contacts available.");
            }
        else {
            System.out.println("Contacts:");
        for (ArrayList<?> contactField : Contact_info) {
            System.out.println(contactField);
            }
             }
        
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