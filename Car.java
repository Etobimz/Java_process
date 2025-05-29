
 


public class Car extends Vehicle {

    // ATTRIBUTES -- The characteristics or features an instance of the class have
    String make;
    String name;
    int year;
    String model =   "Lexus";
    double price = 10000.00;
    String color;
    double speed;



    int seats = 4;



    // STATIC SAMPLes

    static int car_no = 0;

    static void car_no_meth() {
        System.out.println("Number of cars is " + car_no);


    }


    // Constructor
    
    Car (String make, int year, String color, double speed, String name) {

        super(speed, name);

        this.make = make;
        this.year = year;
        this.color = color;
        car_no++;

    

    }







   




    // METHODS -- Things an instance of the class are able to do or actions they can perform
    void drive() {
        System.out.println("You drive "+model+"\n");
    }

    void car_skin () {

        System.out.println("You drive a "+color + " car\n");


    }

    void display_car() {
        System.out.println("Brand: " + this.make + ", " +  "year: " + this.year + ", " + "Color: " + this.color + "\n");



    }



    // toString() method to ovewrite tostring showing us the address(hashcode) and class name

    @Override
    public String toString() {
        return "Car { " +
                    "brand: " + make + "," +
                    "year: " + year + "," +
                    "model: " + model + "," +
                    "color: " + color +  "," + " } ";

                    
                    
    }

       

    






    







    
}
