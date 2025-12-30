package RideBookingSystem;

public class Autoride {
    private int rideId;
    private int fare;
    private int destination;


    public int getRideId() {
        return rideId;
    }

    public void setRideId(int rideId) {
        this.rideId = rideId;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }
    public void startRide(String destination){
        this.fare=fare*50;
        System.out.println("Ride Started To");
        System.out.println(destination);
    }
}

