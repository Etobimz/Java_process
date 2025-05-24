public class Swallow {

    String soup;
    String swal_name;
    String tempt;
    String plate_type;
    
    // Constructor_1
    Swallow (String soup, String swal_name, String tempt) {

        this.soup = soup;
        this.swal_name = swal_name;
        this.tempt = tempt;



    }




     // Constructor_2  - Same name diff param
     Swallow (String soup, String swal_name, String tempt, String plate_type ) {

        this.soup = soup;
        this.swal_name = swal_name;
        this.tempt = tempt;
        this.plate_type = plate_type;
  
    
}


    // Constructor_3 - empty param
    Swallow () {
        //System.out.println("ok");
    }




}