
package Projects.Contactbook;
import java.util.*;








public class Contact_Book {


    Contact_Book () {} 


    

    
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















