import java.util.ArrayList;

import java.util.Scanner;






/* 

public class  Main {

    public static void main(String[] args) {
       
         System.out.println("Hello");
        System.out.println("Hello neww"); 
        

        int x = 5;
        float y  = 5.9f;
        double k = 22.7;
        boolean n = true;
        char ascii = 'r';
        String first_s = "Hello string";
        
        long num = 4004040404040404044L;

        String x_1 = "ee";
        String y_1 = "ff";
        String tmp;
 
        tmp = x_1;
        x_1 = y_1;
        y_1 = tmp;
        

        System.out.println("x:"+x_1);
        System.out.println("y:"+y_1);
        

        
        System.out.println(x);
        System.out.println(y);
        System.out.println("My fractional number is " +y );
        System.out.println(num);
        System.out.println(n);
        System.out.println(ascii);
        System.out.println(first_s);

}

        
 
}

"

how you comment 

/* 
  This is a comment
  dd
  d 
  /* 
 
"
















/* 

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Your name is ");  
        String name = scanner.nextLine();
        System.out.println( name );

        System.out.println("input age"); 
        int age = scanner.nextInt();
        System.out.println("you're   " + age + " years old");


        /* 
        
        Because nextInt() only reads the number but leaves
         the Enter key ("newline") sitting in the input buffer.
        When nextLine() runs next, it immediately grabs that leftover 
        newline and thinks the user entered a blank line.
        
        */
        

        // scanner.nextLine();
       //  System.out.println("input food"); 
        // String fav_food = scanner.nextLine();
        // System.out.println("your best food is   " +  fav_food);
        // char letter = scanner.next(); 
        
   // }
    
// }



/* 


// operators = +, -, *, /, % 
public class Main {

    
    public static void main(String[] args) {
        
        double num = 11;
        num--;
        num++;
        num++;
        num = num /3;
        System.out.println(num);
    }
}


    */











    // CREATING A GRAPHICAL  USER INTERFACE
    import javax.swing.JOptionPane; // for gui


    /* 
    public class Main {
    
         public static void main(String[] args) {
            String name = JOptionPane.showInputDialog("What is your name? ");
            JOptionPane.showMessageDialog(null,"Hi " + name, null, 0);

            // Integer.parseInt() converts the string returned in the parenthesis so an "int" dt we neeed 

            int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
            JOptionPane.showMessageDialog(null, "You are " +age+ "years old");

            double height = Double.parseDouble(JOptionPane.showInputDialog("How tall are you?"));
            JOptionPane.showMessageDialog(null, "You are " +height+ " inches tall ");

            
         }
    }

    */










    /* 

    
    // RANDOM     VALUES/boolean/fractional 


    import java.util.Random;
    public class Main {
    
        public static void main(String[] args) {
            Random random = new Random();
            int x = random.nextInt(6+1);  // you can set the bound that is the last number you want it to reach
            System.out.println(x);

            boolean decision = random.nextBoolean();
            System.out.println(decision);

        }
    }



    */






    // LOGICAL OPERATORS































/* 

    // CONDITIONALS

    public class Main {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int age = scanner.nextInt();

            if (age <= 18) {
                System.out.println("Your are " +age+ " years old and you are a youngin");

            }

            else if (age >= 18 ) {
                System.out.println("Your are " +age+ " years old and you are an adult \n");

                if (age >= 40 && age <= 60) { 
                    System.out.println("You are an unc");
                }

                else {
                    System.out.println("Your are " +age+ " years old and you are a gramps/grams");
                }
                
            }

            if (age != 19 && age != 21) {
                System.out.println("not 19 or 21");
            }
            
        }
    }





*/







/* 


// SWITCHES =  Statement that allows a variable to be tested for equality against a list of values
// Just an alternative for lots of "IF" comparisons

public class Main {


     public static void main(String[] args) {
        

System.out.println("Type a day of the week");
Scanner scanner = new Scanner(System.in);
String day = scanner.nextLine();

switch(day) {
    case "Sunday": System.out.println(" Yes it is Sunday ");
    break; 

    case "Monday": System.out.println(" Yes it is Monday "); 
    break; 

    case "Tuesday": System.out.println(" Yes it is Tuesday "); 
    break; 

    case "Wednesday": System.out.println(" Yes it is Wednesday "); 
    break; 

    case "Thursday": System.out.println(" Yes it is Thursday "); 
    break; 

    case "Friday": System.out.println(" Yes it is Friday "); 
    break; 

    case "Saturday": System.out.println(" Yes it is Saturday "); 
    break; 

    default :  System.out.println("That is not a day of the week"); // default works when there is no match

}

}

}



*/







// WHILE AND FOR LOOPS


/* int n =10;
int i = 0;

while (i < n) {
    System.out.println(i);
    i++;





    ex2;

    Scanner scanner = new Scanner(System.in);
String name = " ";
while (name.isBlank()) {
    System.out.print("Enter your name");
    name = scanner.nextLine();

    
}

System.out.println("Your name is "+name);




 

 

public class Main {

    public static void main(String[] args) {

int i = 0;
int n = 10;

for (i = 0; i < n; i++) {
    System.err.println(i);





}



}


        
}



*/










/* 



// ARRAYS

public class Main {

     public static void main(String[] args) {
        
        int[] numbers = {3,4,5};
        numbers[0] = 7;
        System.out.println(numbers[0]);

        // OR

        String[] names = new String[3];
        names[0] = "Tola";
        names[1] = "sha"d;
        names[2] = "gif";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);


        }

     }
}




*/













/* 



// 2D ARRAYS
// ROWS then COLOUMNS

public class Main {

    public static void main(String[] args) {



    int[][] ages = new int[3][3];
    
    // OR

    int[][] ages_fm2 = {
                        {2,4,6}, 
                        {8,10,12}, 
                        {14,16,18}
    
    }; 


    ages_fm2[0][0] = 2;
    ages_fm2[0][1] = 4;
    ages_fm2[0][2] = 6;
    ages_fm2[1][0] = 8;
    ages_fm2[1][1] = 10;
    ages_fm2[1][2] = 12;
    ages_fm2[2][0] = 14;
    ages_fm2[2][1] = 16;
    ages_fm2[2][2] = 18;

    for (int i = 0; i < ages_fm2.length; i++) {
        

        for ( int j = 0; j<ages_fm2[i].length; j++) {
            System.out.print(ages_fm2[i][j] + " ");
            


        }
        System.out.println();


    }


    }

 }


 */
















 /*



 // SOME STRING METHODS

 public class Main {
 
    public static void main(String[] args) {
        
        String name = "Josiah  ";
        // boolean results = name.equalsIgnoreCase("josiah"); // check if two strings are the same ignoring case sensitivity
        // int results = name.length();   // len of a string
        // char results = name.charAt(1); // get the particular letter/char in a string using the index no
        // int results = name.indexOf('s');
        // boolean results = name.isEmpty();
        // String results = name.toLowerCase(); //     converrt to lower case
        // String results = name.toUpperCase();  //    convert to higher case
        // String results = name.trim(); //      To trim/remove whitespaces
        // String results = name.replace('h', 'a');  //   To replace leterrs in a string (old_letter, new_letter)
       


        



        // System.out.println(results);
    }
 }


  */


















/* 



  // WRAPPER CLASS
  //way to use primitve data types(int,boolean,char, double etc) as refrence dtypes and be able to use some methods with them
  // because primitive data types are more faster than refrence dt like 'Strings' etc


// Primitive  // wrapper
// boolean         Boolean
// int         Integer
// double       Double
 





Primitive	Basic non-object data types (like int)
Wrapper 	Object version of a primitive (Integer)
Autoboxing	Converts primitive → wrapper automatically
Unboxing	Converts wrapper → primitive automatically 



Integer a = 5;  // wrapper class to use this var Integer 'a' as objects in coections like ArrayList and they are faster
int b = a;  // Unboxing i.e converting a wrapper class back to its primitve form. Unboxing: Integer → int


double c = 10.5;
Double d  = c;   // Autoboxing i.e converting a normal prmitive to a wrapper class. Autoboxing: double → Double



*/












  


/* 


// ARRAYLIST  -- Basiclly a resizable array; elements can be added and removed after compilation
// store reference data types

public class Main {

    public static void main(String[] args) {
      ArrayList<String> food = new ArrayList<>();
      ArrayList<Integer> age = new ArrayList<>();

      food.add("rice");
      food.add("beans");
      food.set(1,"Poundo");
      food.addLast("lastt_food");

      age.add(3);
      age.add(5);
      age.add(0);
      age.set(2,4); // NB using set, the index mustve initially exiasted before setting a value there.
      
      for (int i = 0; i<food.size(); i++) {


        System.out.println(food.get(i));
      }

      System.out.println();

      for (int i = 0; i<age.size(); i++) {


        System.out.println(age.get(i));
      }

    }
}


*/
















/*  
// 2D ARRAYLIST
import java.util.*;
// Dynamic list of lists and can change the sizes at runtime

public class Main {

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceries = new ArrayList<>(); // lists in list 

        ArrayList<String> food = new ArrayList();
        food.add("rice");
        food.add("beans");
        food.add("yam");


        ArrayList<String> vegetables = new ArrayList();
        vegetables.add("Okra");
        vegetables.add("spinach");
        vegetables.add("ewedu");

        ArrayList<String> drinks = new ArrayList();
        drinks.add("Caprisonne");
        drinks.add("ribena");
        drinks.add("coke");
        

        // add the lists to the list
        groceries.add(vegetables);
        groceries.add(food);
        groceries.add(drinks);


        // print the lists
        System.out.println(groceries);
        System.out.println(groceries.get(1).get(0));






        
    }
}
*/

















/* 

// FOR EACH LOOP
//for looping/iterate through the elements of a an array/colllection

public class Main {

    public static void main(String[] args) {

        String[] months_l = new String[3];
        months_l[0] = "November";
        months_l[1] = "December";
        months_l[2] = "October";

        ArrayList<String> months = new ArrayList<>();
        months.add("Jan");
        months.add("Feb");
        months.add("March");
        months.add("April");

        // " : " means in here, as in for each datatype " i " in our ArrrayList, DO.
        for (String i : months) {
            System.out.println("This month is "+i.toUpperCase());
            

        }
        System.out.println();
        System.out.println();


        for (String k : months_l) {
            System.out.println("This month is "+k.toUpperCase());
        


        
    }
}

}


*/




















/* 

// METHODS
// a block of code that is executed wheen called upon

public class Main {

    public static void main(String[] args)  
    
    {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
       


        Scanner scanner2 = new Scanner(System.in);
        int ent_age = scanner.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        int height = scanner.nextInt();


        // To call the methods with an argument


        // hello(name); 
        // age(ent_age,height);
        
        int x = 5;
        int y = 10;
        int z = sum(x, y);
        System.out.println(z);
        
        

        
    }



    static void hello (String name) {
        System.out.println("Hello "+name);
        System.out.println();
    }

    static void age (int ent_age, int height) {
        System.out.println("You are "+ ent_age+ " years old and you  are " + height + "cm tall");
    }

    static int sum (int x , int y) {
        return  x + y;


    }

}



*/



















/* 


// OVERLOADED METHODS - Methods with the same name but diffrent parameters
// method name  + param = method signature

public class Main {

    public static void main(String[] args)
    
    { 
        
        // int list content
        int a_1 = add(1, 2);
        int a_2 = add(1, 2, 3);

        // decimal numbers list content
        double a_3 = add(1,2,5,4.0);
        double a_4 = add(2.0, 4.0, 3,7,4);

        // ArrayList creation
        ArrayList<Integer> Sums = new ArrayList<>();
        ArrayList<Double> Sum_decimal = new ArrayList<>();

        // add items to Integer dtype list 
        Sums.add(a_1);
        Sums.add(a_2);

        // add items to Double dtype list 
        Sum_decimal.add(a_3);
        Sum_decimal.add(a_4);



        for (int i : Sums) {
            System.out.println(i);
        }
        System.out.println();


        for (Double j : Sum_decimal) {
            System.out.println(j);
            
        }
      


    }
    





    static int add(int x, int y) {
        System.out.println("OVErload1 int dtype");
        return x + y;
    }

    static int add(int x, int y, int z) {

        System.out.println("OVErload2 int dtype");


        return x + y + z;
    }

    static double add(double x, double y, double a, double b) {

        System.out.println("OVErload3 double dtype");

        return x + y + a + b;
    }



    static double add(double x, double y, double a, double b, double c) {

        System.out.println("OVErload4 double dtype");
        System.out.println();


        return x + y + a + b + c;
    }
    

}


*/


















