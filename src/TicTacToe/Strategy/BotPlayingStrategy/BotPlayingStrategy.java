package TicTacToe.Strategy.BotPlayingStrategy;

import TicTacToe.Model.Board;
import TicTacToe.Model.Move;
import TicTacToe.Model.Player;

public interface BotPlayingStrategy {
    Move decidedMove(Player player, Board board);
}
