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








/* 

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

*/






 /* 

// CONSTRUCTORs { create objects with diffrent characteristics or features }
// A special method that is called when an object is instantiated (created) 

public class Main2 {

    public static void main(String[] args) {
        
        Human human_1 = new Human("sho", 32, 180);
        Human human_2 = new Human("dee", 64, 122);

        System.out.println(human_2.height+"\n");

        human_1.eat();

        System.out.println();

        human_2.drink();
    }
}
*/








/*

// Overloaded - CONSTRUCTORs { multiple constructors within a class with same name 
// but have diffrent parameters }
// name + parameters =  signature

public class Main2 {

    public static void main(String[] args) {

        // same name constructors diff params
        Swallow first_serve = new Swallow("veg", "aml", "hot");

        System.out.println("Your order combo is as follows:\n ");
        System.out.println(first_serve.soup);
        System.out.println(first_serve.swal_name);
        System.out.println(first_serve.tempt);

        System.out.println();

        


        Swallow second_serve = new Swallow("okr", " ffs", "cold", "curved");

        System.out.println("Your order combo is as follows:\n ");
        System.out.println(second_serve.soup);
        System.out.println(second_serve.swal_name);
        System.out.println(second_serve.tempt);
        System.out.println(second_serve.plate_type);

        System.out.println();




        Swallow empty_serve = new Swallow();
        System.out.println(empty_serve.swal_name);




        
    }
}

 */






 
 /* 

 // toString Method 
 // toString() = Special method that all objects inherit, that returns a string that "textually rep" an object
 // can be used implicitly and explicitly


 public class Main2 {
 
    public static void main(String[] args) {
        Car show_car = new Car();
        
        System.out.println();

        System.out.println(show_car.toString());

       
        System.out.println();

        //or 
        System.out.println(show_car);
        
    }
 }


 */
 




 