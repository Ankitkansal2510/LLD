package TicTacToe.Factories;

import TicTacToe.Model.BotdiffcultyLevel;
import TicTacToe.Strategy.BotPlayingStrategy.BotPlayingStrategy;
import TicTacToe.Strategy.BotPlayingStrategy.RandomBotPlayingStrategy;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getBotPlayingStrategy(BotdiffcultyLevel botdiffcultyLevel){
        return new RandomBotPlayingStrategy();
    }
}
