package GamingSystem;

public interface PlayerInterface extends BasicFunctionalitiesInterface{
    public String getgameMode();
    public int getrounds();
    public void setgameMode(String mode);
    public void setrounds(int rounds);
}