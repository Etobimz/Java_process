package Projects;
import java.util.*;


public class Calculator {



    // VARargs for variable amount of param.
    // numbers is being treated as an arry of numbers
    public Integer add (Integer... numbers) {
        System.out.println("Add numbers and type in '=' at the end to sum them up ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        String scan_character = scanner2.next();


        
        // converting numbers array to an ArayList
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(numbers));
        numberList.add(number);
        int i = 0;
    

        while (scan_character != "=") {

        
                    for (Integer val : numberList) {
                        return val[i] + val[i+1];

                    
        }
    
            
        }

    }

    public static void main(String[] args) {
        
    }
    
}
