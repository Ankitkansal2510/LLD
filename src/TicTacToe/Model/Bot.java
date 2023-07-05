package TicTacToe.Model;

import TicTacToe.Factories.BotPlayingStrategyFactory;
import TicTacToe.Strategy.BotPlayingStrategy.BotPlayingStrategy;

public class Bot extends Player{

    BotdiffcultyLevel botdiffcultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(String playerName, char symbol, BotdiffcultyLevel botdiffcultyLevel) {
        super(playerName, symbol, PlayerType.BOT);
        this.botdiffcultyLevel=botdiffcultyLevel;
        this.botPlayingStrategy= BotPlayingStrategyFactory.getBotPlayingStrategy(botdiffcultyLevel.EASY);
    }
}
