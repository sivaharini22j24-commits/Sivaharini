package GamingSystem;

public class BasicFunctionalities implements BasicFunctionalitiesInterface{
    private int gameId;
    private int score;

    //Getters
    public int getgameId(){
        return this.gameId;
    }
    public int getscore(){
        return this.score;
    }

    //Setters
    public void setgameId(int gameid){
        this.gameId=gameid;
    }
    public void setscore(int score){
        this.score=score;
    }
}