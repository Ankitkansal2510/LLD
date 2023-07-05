package TicTacToe.Strategy.GameWinningStrategy;

import TicTacToe.Model.Board;
import TicTacToe.Model.Cell;
import TicTacToe.Model.Player;

public interface GameWinningStrategy {
    boolean checkWinner(Board board, Player lastPlayer, Cell movcell);
}
