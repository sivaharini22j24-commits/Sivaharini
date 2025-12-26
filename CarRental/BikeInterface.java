package CarRental;

public interface BikeInterface extends BaseFunctionalitiesInterface{
    public void booking(int days);
    public void cancel();
    public void helmet(String helmet);
}