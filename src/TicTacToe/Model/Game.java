package TicTacToe.Model;

import TicTacToe.Exception.InvalidGameConstructionParametersException;
import TicTacToe.Strategy.GameWinningStrategy.GameWinningStrategy;
import TicTacToe.Strategy.GameWinningStrategy.OrderOneStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> player;
    private List<Move> move;
    private GameWinningStrategy gameWinningStrategy;
    private GameStatus gameStatus;
    private int nextPlayerIndex;
    private Player winner;

    private Game(){
    }

    public Board getBoard() {
        return board;
    }
    public void setBoard(Board board) {
        this.board = board;
    }
    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public static GameBuilder getBuilder() {
        return new GameBuilder();
    }
    public List<Player> getPlayer() {
        return player;
    }

    public void setPlayer(List<Player> player) {
        this.player = player;
    }

    public List<Move> getMove() {
        return move;
    }

    public void setMove(List<Move> move) {
        this.move = move;
    }

    public GameWinningStrategy getGameWinningStrategy() {
        return gameWinningStrategy;
    }

    public void setGameWinningStrategy(GameWinningStrategy gameWinningStrategy) {
        this.gameWinningStrategy = gameWinningStrategy;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public void makeNextMove(){
        Player currentPlayMove=player.get(nextPlayerIndex);
        System.out.println("It is " + currentPlayMove.getPlayerName() + " turn ");
        Move move=currentPlayMove.decideMove(this.board);

        int row=move.getCell().getRow();
        int col=move.getCell().getCol();
        System.out.println("Move happened at: " + row + "," + col + ".");
        board.getBoard().get(row).get(col).setCellState(CellState.FILLED);
        board.getBoard().get(row).get(col).setPlayer(currentPlayMove);
        Move finalMove=new Move(currentPlayMove,board.getBoard().get(row).get(col));
        this.move.add(finalMove);

        if(gameWinningStrategy.checkWinner(board,currentPlayMove,finalMove.getCell())){
            gameStatus=GameStatus.ENDED;
            winner=currentPlayMove;
        }
        nextPlayerIndex+=1;
        nextPlayerIndex%=player.size();
    }

    public static class GameBuilder{
        private int dimension;
        private List<Player> player;

        public GameBuilder setDimension(int dimension){
            this.dimension=dimension;
            return this;
        }
        public GameBuilder setPlayer(List<Player> player){
            this.player=player;
            return this;
        }

        public Game build(){
            try{
                valid();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
            Game game=new Game();
            game.setGameStatus(GameStatus.INPROGRESS);
            game.setPlayer(player);
            game.setMove(new ArrayList<>());
            game.setBoard(new Board(dimension));
            game.setNextPlayerIndex(0);
            game.setGameWinningStrategy(new OrderOneStrategy(dimension));
            return game;
        }

        private void valid() throws InvalidGameConstructionParametersException {
            if(dimension<3){
                throw new InvalidGameConstructionParametersException("Dimension cannot be less then 3");
            }

            if(player.size()!=dimension-1){
                throw new InvalidGameConstructionParametersException("Player should be less then dimesnion -1");
            }
        }
    }
}
