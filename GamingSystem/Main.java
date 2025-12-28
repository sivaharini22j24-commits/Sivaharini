//This is my gaming system application
//my 3 entities-player,SingleplayerGame,MultiplayerGame
//Player knows his GameID,score,gamemode and rounds
//Singleplayergame knows the gameID,score
//Multiplayer knows the gameID,score
//Both Singleplayergame and Multiplayergame performs start game and end game method
//Singleplayergame have a unique method named savedprogress()
//Multiplayergame have a unique method name the invite friend()

package GamingSystem;

public class Main {
    public static void main(String[]args) {
        //Required Information
        PlayerInterface player = new Player();
        SinglePlayerGameInterface single = new SinglePlayerGame();
        player.setgameId(18);
        player.setscore(50);
        player.setgameMode("Single Player");
        player.setrounds(2);

        PlayerInterface player1 = new Player();
        MultiPlayerGameInterface multi = new MultiPlayerGame();
        player1.setgameId(7);
        player1.setscore(100);
        player1.setgameMode("Multi Player");
        player1.setrounds(4);

        single.setgameId(player.getgameId());
        single.setscore(player.getscore());

        multi.setgameId(player1.getgameId());
        multi.setscore(player1.getscore());

        //Drama
        if (player.getgameMode() == "Single Player") {
            System.out.println("=====PLAYER1:SINGLE=====");
            single.startGame(player.getrounds());
            single.saveProgress();
        }
        if (player1.getgameMode() == "Single Player") {
            System.out.println("=====PLAYER1:SINGLE=====");
            single.startGame(player1.getrounds());
            single.saveProgress();
        }
        if (player.getgameMode() == "Multi Player") {
            System.out.println("=====PLAYER2:MULTI=====");
            multi.startGame(player.getrounds());
            multi.inviteFriend();
        }
        if (player1.getgameMode() == "Multi Player") {
            System.out.println("=====PLAYER2:MULTI=====");
            multi.startGame(player1.getrounds());
            multi.inviteFriend();
        }
    }
}