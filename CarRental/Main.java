package CarRental;

public class Main {
    public static void main(String[] args){
    CustomerInterface customer=new Customer();
    BikeInterface bike=new Bike();
    CarInterface car=new Car();

    customer.setVehicletype("Bike");
    customer.setRentaldays(2);

    bike.setVehicleno(5868);
    bike.setRent(500);
    bike.booking(customer.getRentaldays());
    bike.helmet("Helmet Included");

    Customer customer2=new Customer();
    customer2.setVehicletype("Car");
    customer.setRentaldays(3);

    car.setVehicleno(6927);
    car.setRent(2500);
    car.booking(customer.getRentaldays());
    car.driver("Driver Included");
}
}
