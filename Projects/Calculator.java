package Projects;
import java.util.*;


public class Calculator {



    // VARargs for variable amount of param.
    // numbers is being treated as an arry of numbers
    public Integer add() {

        System.out.println("enter q to end it and c to continue ");
        Scanner scanner2 = new Scanner(System.in);
        String scan_character = scanner2.next();




        
        




        /* 
        if (!number) {
        Scanner scanner2 = new Scanner(System.in);
        String scan_character = scanner2.next();
        }

        Integer... numbers

        */


        
        // converting numbers array to an ArayList
        ArrayList<Integer> numberList = new ArrayList<>();
        
        Integer sum = 0;

        
       

        while (scan_character != "q") {

            
           
           if (scan_character == "c") {

            System.out.println("enter a number ");
            //Scanner scanner = new Scanner(System.in);
            int number = scanner2.nextInt();
            numberList.add(number);  
            sum += number;

            //scanner.close();

            }


            /* 
            else {
                System.out.println("Invalid input. Type 'c' to continue or 'q' to quit.");
            }

            System.out.println("Enter 'q' to quit or 'c' to continue: ");
            scan_character = scanner2.next(); // Update the scan_character

            */
            

           


            
        }
                
                scanner2.close();
                return sum;
    

    }



    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println(calc.add());
        
    }
    
}
