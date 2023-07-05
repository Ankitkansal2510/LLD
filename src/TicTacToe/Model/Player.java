package TicTacToe.Model;

import java.util.Scanner;

public class Player {

    private String PlayerName;
    private char symbol;
    private PlayerType playerType;

    public Player(String playerName, char symbol, PlayerType playerType) {
        PlayerName = playerName;
        this.symbol = symbol;
        this.playerType = playerType;
    }

    public Move decideMove(Board board){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please decide your move wisely");
        System.out.println("Please enter the row");
        int row=sc.nextInt();
        System.out.println("Please enter the column");
        int col=sc.nextInt();
        return new Move(this,new Cell(row,col));
    }
    public String getPlayerName() {
        return PlayerName;
    }

    public void setPlayerName(String playerName) {
        PlayerName = playerName;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
}
