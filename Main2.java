
import java.io.FileWriter;
import java.io.IOException;




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
 












 /* 


// Array of Objects
 public class Main2 {
 
    public static void main(String[] args) {

        // objects/ instances
        Car car_type_1 = new Car("toyota", 2005, "blue");

        Car car_type_2 = new Car("Camry", 2025, "black");
        

        // array of objects
        Car[] Cars = {car_type_1,car_type_2};


        for (Car car : Cars) {
            car.display_car();
            
            
        }

    }
 }


 */


















 /* 

 // OBJECTs Passing
 // Passing objects as an argument in to a method 
 public class Main2 {
 
    public static void main(String[] args) {
        Garage garage = new Garage();
        Car car_1 = new Car("toyota", 2004, "yellow");
        Car car_2 = new Car("lexus", 2027, "black");




        System.out.println();

        // park{method}of other class , car_1 & car_2{instances/objects} of first class passed as an arg, 
        // garage{instance} of other class

        garage.park(car_1);
        garage.park(car_2);


    }
 }

 */









/* 
 // STATIC keyword
 // static = modidifer. A single copy of a variable/method is created and shared.
 // The class owns the static member

 public class Main2 {



    public static void main(String[] args) {

        Car car_1 = new Car("toy", 2, "burgundy");
        Car car_2 = new Car("lex", 4, "lah");

        //Use static for variables that should be shared across all instances of a class (class-level variables).
        // where var here is  { car_no }
        System.out.println(Car.car_no);

        // Use static for utility or helper methods that do not depend on instance variables.
        // where method here is  { car_no_meth() }
        System.out.println();

        car_1.car_no_meth();
        car_2.car_no_meth();

        
    }


 }

 */




/* 
 // INHERITANCE
 // = The process where one class acquires the attr and meethods of another
 // public class child_class  extends parent_class{ }
 // make two classes use or have access to the same method

 public class Main2 {
 
    public static void main(String[] args) {
        Car car_1 = new Car("yot", 2040, "ble");
        car_1.go();
        Bicycle bic_1 = new Bicycle();
        bic_1.stop();
        car_1.stop();



        System.out.println(car_1.seats);

       

        System.out.println(bic_1.wheels);


    }
 }

*/


















/* 
// METHOD OVeriding
// Declaring a method in a sub classs, which is already present in the parent class done so
// the child class class can give its own implementation secific to itself

public class Main2 {

    public static void main(String[] args) {

        Vehicle vech = new Vehicle();
        vech.moves();

        System.out.println();

        Bicycle bic = new Bicycle();
        bic.moves();
    }
}

*/

















/* 

//  super keyword
//  refers to the superclass (parent)of an object very similar to the "this" keyword

public class Main2 {

    public static void main(String[] args) {
        Bicycle bic = new Bicycle(4, "xspo","male");
        Bicycle bic_2 = new Bicycle(42, "lp","fmel");
        Car car = new Car("ll", 5, "yell", 10, "toyo");

        System.out.println(bic.rider_gender);
        System.out.println(bic.name);

        System.out.println();

        System.out.println(bic.toString());
        System.out.println(bic_2.toString());



       
        
    }
}

*/











/* 


// ABSTRACTION
// abstract classes cannot be instantiated, but thier subclass or child can be
 // abstract methods are declared without implmentation

 // see it as some security. It forc one to not use abstract or vague details



 public class Main2 {
 
    public static void main(String[] args) {

        Bicycle new_bi = new Bicycle(2, "gg", "ma");

        new_bi.mov_1();
            
        };
        
    }

 
    */















/* 

// Access Modifiers
// Packages are collections of classes
// cc package1 and package2

*/












/* 
// ENCAPSULATION = attribute of a class will be hidden or private
// can be accessed only through methods (  getters & setters )
// only be used only if you have to, not neccessary

public class Main2 {

    public static void main(String[] args) {
        Car2 car = new Car2("toyo", 2050, "black");
        Car2 car_1 = new Car2("camr", 2000, "yellow");

        
        System.out.println(car.get_make());


        System.out.println();


        System.out.println(car.get_year());
        car.set_year(3040);


        System.out.println();


        System.out.println(car.get_year());



    }





   

    
}
*/















/*

 // COPY OBJECTS

 public class Main2 {

    public static void main(String[] args) {
        Car2 car1 = new Car2("toyo", 2050, "black");

        // instead of using the first constructor with the param (make, year, color)
        //Car2 car2 = new Car2("camr", 2000, "yellow");


        // copy using setters and getters method
        // car2.copy(car1);

        System.out.println(car1);
        // System.out.println(car2);



        

        System.out.println();




        // copy using overloaded methods{constructors}

        // you can use the 2nd overloaded constructor that uses the 
        // copy method with param ("Classname ObjectToCopy") 


        Car2 car2 = new Car2 (car1);

        // test to chnage the argument for the 2nd instance/object to test or see they have or 
        // point to diffrent addresses but the copying was succesfull
        car2.set_year(2004);



        System.out.println(car1.toString());

        // or without "object.toString()"
        System.out.println(car2);



    }



    }

 */























 /*

    // INTERFACEs
    // A template that can be applied to a class. similiar to class inheritance
    // but specifies what a class has/must do. Classes can apply more than one interface,
    // inheritance is limited to 1 super

    // public "interface"  Super_class_name {
    
    //  some abstract method with  no body  }

    // public Child_class "implement"  Super_class_name {
    
    //  some abstract method with  a body named in the super class () {}  }

    public class Main2 {
    
        public static void main(String[] args) {

            Fish fish = new Fish();
            Hawk hawk = new Hawk();
            Rabbit rabbit = new Rabbit();

            fish.flee();
            fish.hunt();

            System.out.println();

            hawk.hunt();

            System.out.println();

            rabbit.flee();

            
        }
    }


    */



















    /* 




    // POLYMORPHISM; poly--  "many",  morph--  "form"
    // The ability of an object to identify as more than one type



    public class Main2 {
    
        public static void main(String[] args) {

            Bicycle bic = new Bicycle(40, "xspo", "male");
            Car car = new Car("toyo", 3320, "blue", 70, "lex");
            Boat boat = new Boat(12, "paddle_towers");

            Vehicle[] vehicles =  {bic,car,boat};
            for (Vehicle vehicle : vehicles) {
                vehicle.mov_1();
                System.out.println();
                
            }

           
            
        }
    }


    
*/











/* 


// Dynamic POLYMORPHISM
// dyanmic --  you dont know the object at runtime until after compilation

public class Main2 {

    public static void main(String[] args) {


        /// dynamic !
        Animal animal;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Chose an animal: "+ "/n");
        System.out.println("1 - Dog" + " " + " 2- Cat ");
        int choice = scanner.nextInt();

        if (choice == 1) {

            animal = new Dog();
            animal.speak();
        }

        else if (choice == 2) {

            animal = new Cat();
            animal.speak();
        }

        else {

            System.out.println("Wrong number");
            animal = new Animal();
            animal.speak();
        }



        
    }
}


*/











/* 

// EXCEPTIONS HANDLING
// an event that occurs during the execution of  a program that disrupts the normal flow of instructions


public class Main2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        


        try {


        System.out.println(" enter a number to divide");  
        int x = scanner.nextInt();
        
        
        System.out.println(" enter a number to divide by");
        int y = scanner.nextInt();

        int z = x/y;
        System.out.println(z);
        

        }


        catch (ArithmeticException e) {

            System.out.println("Cant divid by 0");


        }

        catch (InputMismatchException e) {

            System.out.println("incorrect input, only integers ");


        }


        // all exception i.e excepts all possible errors
        catch (Exception e ) {

            System.out.println("general exception");



        }

        /// finally block, runs irrespective of if an exception or no exception occurs
        /// close any open scanners or files that might be open
        /// 
        finally{

            System.out.println("always run");

            scanner.close();


        }









    


        
    }
}


*/




















/* 

/// File class
/// file is an absrtact representation of file and directory pathnames


public class Main2 {

     public static void main(String[] args) {

        File file = new File("secret_mesage.txt");

        if (file.exists()) {
            System.out.println("file exits");
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getPath());
            System.out.println(file.lastModified());
            
            
        } else {

            System.out.println("file doesnt exist");
            
        }








      
   

    }





}




*/








//FileWriter( write to a file)
// always have to be written in a try - catch block

public class Main2 {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("roses are red \nViolets are blue \n");

            //append to the last line
            writer.append("ending");
            writer.close();


        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}