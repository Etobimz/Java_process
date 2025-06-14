package Projects;
import java.util.*;


public class Calculator {



    // VARargs for variable amount of param.
    // numbers is being treated as an arry of numbers
    public Integer add() {

        System.out.println("enter q to end it and c to continue ");
        Scanner scanner2 = new Scanner(System.in);



        
        // converting numbers array to an ArayList
        ArrayList<Integer> numberList = new ArrayList<>();
        
        Integer sum = 0;

        
       

        //while (!scan_character.equals("q") && scan_character.equals("c")) {

        while ( true ) {
        
        
            System.out.println("enter a number 'q' to quit: ");

            if (scanner2.hasNextInt()) {
                int number = scanner2.nextInt();
                numberList.add(number);  
                sum += number;
            }

            else {
                String scan_character = scanner2.next();


                if (scan_character.equals("q")) {
                    break;

                }

                else if (!scan_character.equals("c")) {
                    System.out.println("Invalid input. Please enter a number or 'q' to quit.");
                    
                }

            
            }


        
            

            
        

        }

            scanner2.close();
            System.out.println("\nSum is: ");
            return sum;


            
        }









    public Integer multiply() {
        
                System.out.println("enter q to end it and c to continue ");
                Scanner scanner2 = new Scanner(System.in);
        
        
        
                
                // converting numbers array to an ArayList
                ArrayList<Integer> numberList = new ArrayList<>();
                
                Integer product = 1;
        
                
               
        
                //while (!scan_character.equals("q") && scan_character.equals("c")) {
        
                while ( true ) {
                
                
                    System.out.println("enter a number 'q' to quit: ");
        
                    if (scanner2.hasNextInt()) {
                        int number = scanner2.nextInt();
                        numberList.add(number);  
                        product *= number;
                    }
        
                    else {
                        String scan_character = scanner2.next();
        
        
                        if (scan_character.equals("q")) {
                            break;
        
                        }
        
                        else if (!scan_character.equals("c")) {
                            System.out.println("Invalid input. Please enter a number or 'q' to quit.");
                            
                        }
        
                    
                    }
        
        
                
                    
        
                    
                
        
                }
        
                    scanner2.close();
                    System.out.println("\nProduct is: ");
                    return product;
        
        
                    
    }



    public Integer subtact() {
        
        System.out.println("enter q to end it and c to continue ");
        Scanner scanner2 = new Scanner(System.in);



        
        // converting numbers array to an ArayList
        ArrayList<Integer> numberList = new ArrayList<>();
        
        Integer new_val = 0;

        
       

        //while (!scan_character.equals("q") && scan_character.equals("c")) {

        while ( true ) {
        
        
            System.out.println("enter a number 'q' to quit: ");

            if (scanner2.hasNextInt()) {
                int number = scanner2.nextInt();
                numberList.add(number);  
                new_val = number - new_val;
            }

            else {
                String scan_character = scanner2.next();


                if (scan_character.equals("q")) {
                    break;

                }

                else if (!scan_character.equals("c")) {
                    System.out.println("Invalid input. Please enter a number or 'q' to quit.");
                    
                }

            
            }


        
            

            
        

        }

            scanner2.close();
            System.out.println("\n Your new value after the subtraction(s) is: ");
            return new_val;


            
}
                        
            


    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println(calc.subtact());
        
    }
    
}







