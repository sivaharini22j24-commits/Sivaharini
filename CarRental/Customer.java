package CarRental;

public class Customer extends BaseFunctionalities implements CustomerInterface{
    private String vehicletype;
    private int rentaldays;


    public String getVehicletype() {
        return vehicletype;
    }

    public void setVehicletype(String vehicletype) {
        this.vehicletype = vehicletype;
    }

    public int getRentaldays() {
        return rentaldays;
    }

    public void setRentaldays(int rentaldays) {
        this.rentaldays = rentaldays;
    }
}
