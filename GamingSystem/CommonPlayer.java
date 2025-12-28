package GamingSystem;

public abstract class CommonPlayer extends BasicFunctionalities implements CommonPlayerInterface{
    public void startGame(int rounds){
        int score=rounds*10;
        System.out.println("Game Started");
        System.out.println("Score:");
        System.out.println(score);
    }
    public void endGame(){
        System.out.println("Game Over");
    }
}