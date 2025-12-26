package CarRental;

public interface CarInterface extends BaseFunctionalitiesInterface{
    public void booking(int days);
    public void cancel();
    public void driver(String driver);
}