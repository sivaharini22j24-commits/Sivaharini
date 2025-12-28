package GamingSystem;

public class Player extends BasicFunctionalities implements PlayerInterface{
    private String gameMode;
    private int rounds;

    //Getters
    public String getgameMode(){
        return this.gameMode;
    }
    public int getrounds(){
        return this.rounds;
    }

    //Setters
    public void setgameMode(String mode){
        this.gameMode=mode;
    }
    public void setrounds(int rounds){
        this.rounds=rounds;
    }
}
