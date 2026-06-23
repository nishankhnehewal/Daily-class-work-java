class vehicle{
    String brand_name;
    double Max_speed;
    void setvehicledetails(String brand , double maxspeed)
    {
        this.brand_name=brand;
        this.Max_speed=maxspeed;
    }
    void displayvehicledetails (){
        System.out.println("Brand name is " + " - " + brand_name);
        System.out.println("Maximum speed is " + " - " + Max_speed);
    }
}

class contaning extends vehicle {
    String fule_type;
   
    void setfuledetails(String fuletype)
    {
        this.fule_type=fuletype;
    }
    void displayfuledetails (){
        System.out.println("Fule type  is " + " - " + fule_type);
        
    }
}

public class vehiclemanagement {
    public static void main(String[] args) {
        contaning c = new contaning();
        c.setvehicledetails("toyota", 180);
        c.setfuledetails("petrol");
        c.displayvehicledetails();
        c.displayfuledetails();
    }
    
}
