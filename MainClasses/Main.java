package MainClasses;

import java.util.ArrayList;

    /* 
    import java.util.ArrayList;
    
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






/* 
// WHILE AND FOR LOOPS



public class Main {

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceries = new ArrayList<>(); // lists in list 

        ArrayList<String> food = new ArrayList<>();
        food.add("rice");
        food.add("beans");
        food.add("yam");


        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("Okra");
        vegetables.add("spinach");
        vegetables.add("ewedu");

        ArrayList<String> drinks = new ArrayList<>();
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


















