package TicTacToe;

import TicTacToe.Controller.GameController;
import TicTacToe.Model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTocGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        GameController gameController=new GameController();
        System.out.println("What should be the dimension of the Game");
        int dimension=sc.nextInt();
        System.out.println("Will there be a bot playing yes/no");
        String isBotString=sc.next();
        List<Player> player=new ArrayList<>();
        int toIterate=dimension-1;
        for(int i=0;i<toIterate;i++){
            System.out.println("What is the name of the player? " + i);
            String playerName = sc.next();

            System.out.println("What is the symbol for this player" + i);
            char playerSymbol = sc.next().charAt(0);
            player.add(new Player(playerName,playerSymbol, PlayerType.HUMAN));
        }

        if(isBotString.equals("y")){
            System.out.println("What is the name of the bot? ");
            String botName = sc.next();

            System.out.println("What is the symbol for this bot" );
            char botSymbol = sc.next().charAt(0);

            player.add(new Bot(botName, botSymbol, BotdiffcultyLevel.EASY));
        }

        Game game=gameController.createGame(dimension,player);

        while(gameController.getGameStatus(game).equals(GameStatus.INPROGRESS)){
            System.out.println("This is your current board");
            gameController.displayBoard(game);
            gameController.getNextMove(game);
        }

        System.out.println("Game has ended. Result was: ");
        if(!game.getGameStatus().equals(GameStatus.DRAW)){
            System.out.println("Winner is: ." + gameController.getWinner(game).getPlayerName());
            gameController.displayBoard(game);
        }
    }
}
