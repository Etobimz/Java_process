
 


public class Car {

    // ATTRIBUTES -- The characteristics or features an instance of the class have
    String make;
    int year;
    String model =   "Lexus";
    double price = 10000.00;
    String color;


    // Constructor
    Car (String make,  int year, String color) {
        this.make = make;
        this.year = year;
        this.color = color;

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
