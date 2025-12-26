package CarRental;

public class Car extends Vehicle implements CarInterface{

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
    public void driver(String driver){
        System.out.println("Driver Included");
    }
}
