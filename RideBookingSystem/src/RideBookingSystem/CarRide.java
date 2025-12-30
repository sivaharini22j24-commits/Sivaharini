package RideBookingSystem;

public class CarRide {
    private int rideID;
    private int fare;
    public CarRide(int rideID,int fare){
        this.rideID=rideID;
        this.fare=fare;
    }
    public CarRide(){

    }

    public int getRideID() {
        return rideID;
    }

    public void setRideID(int rideID) {
        this.rideID = rideID;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }
    public void startRide(String destination){
        this.fare=fare*100;
        System.out.println("Ride Started To");
        System.out.println(destination);
    }
}
