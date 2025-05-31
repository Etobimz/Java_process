public class Car2 {

    private String make;
    private int year;
    private String color;



    Car2 (String make, int year, String color) {
        this.set_make(make);
        this.set_year(year);
        this.set_color(color);




    }
    public static void main(String[] args) {
        
    }


    public String get_make () {
        return make;

    }

    public int get_year () {
        return year;

    }


    public String get_color () {
        return color;

    }







    
    public void set_make(String make) {
        this.make = make;


    }


    public void set_color(String color) {
        this.color = color;

    }

    public void set_year ( int year) {

        this.year = year;
    }






















}



