package TicTacToe.Controller;

import TicTacToe.Model.Game;
import TicTacToe.Model.GameStatus;
import TicTacToe.Model.Player;

import java.util.List;

public class GameController {
    public Game createGame(int dimension, List<Player> player){
        return Game.getBuilder().setDimension(dimension).setPlayer(player).build();
    }

    public void displayBoard(Game game){
        game.getBoard().display();
    }

    public GameStatus getGameStatus(Game game){
        return game.getGameStatus();
    }

    public void getNextMove(Game game){
        game.makeNextMove();
    }

    public Player getWinner(Game game){
       return  game.getWinner();
    }
}
