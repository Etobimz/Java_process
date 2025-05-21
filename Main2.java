import java.util.ArrayList;

import java.util.Scanner;






/* 

//  PRINTF()
//  Two arguments = format string %n(new line) + (object/variable/value)


public class Main2 {
    public static void main(String[] args) {

        boolean myBoolean = true;
        int age = 5;
        String greeting = "Hello";
        double decimal_no = 12.5;
        char charac = '@';


        System.out.printf("String is %20s%n", greeting);
        // width{right justify with %20s to give 20 spaces before printing the string with "s"}

        System.out.printf("int is %d%n", age);

        System.out.printf("%.3f is a decimal number %n", decimal_no); 
        // precision{.3f, show only 3 numbers digits after the decimal}

        System.out.printf(" %c is a character %n", charac);
        System.out.printf("boolean is %b%n", myBoolean);

        
    }

    
}


*/









/* 

// FINAL keyword
//Anything declared as final cannot be chnaged or updated again.

public class Main2 {

    public static void main(String[] args) {

        final double PI  = 3.14159;
        PI = 5;  // Cannnot be reassigned.
        
        System.out.println(PI);
        
    }
}

*/










// OOP {object orientated programming}

public  class Main2 {

    public static void main(String[] args) {

    // object = an instance of a class that may contain attributes and methods
    // example: (phone, cofee cup, computer) 

    Car my_firstcar = new Car();
    System.out.println(my_firstcar.model+"\n");
    my_firstcar.car_skin();
        
    }
}