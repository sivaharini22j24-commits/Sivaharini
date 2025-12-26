package CarRental;

public abstract class BaseFunctionalities implements BaseFunctionalitiesInterface{
    private int vehicleno;
    private int rent;


    public int getVehicleno() {
        return vehicleno;
    }

    public void setVehicleno(int vehicleno) {
        this.vehicleno = vehicleno;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }
}
