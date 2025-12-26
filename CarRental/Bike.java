package CarRental;

public class Bike extends Vehicle implements BikeInterface {

    public void booking(int days){
        int rent=this.getRent()*days;
        System.out.println("Booking Successful!!!");
        System.out.println(rent);
        System.out.println(days);
    }
    public void cancel(){
        int rent=this.getRent()-this.getRent();
        System.out.println("Booking Cancelled");
        System.out.println(rent);
    }
    public void helmet(String helmet){
        System.out.println("Helmet Included");
    }

}
