package TicTacToe.Strategy.GameWinningStrategy;

import TicTacToe.Model.Board;
import TicTacToe.Model.Cell;
import TicTacToe.Model.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderOneStrategy implements GameWinningStrategy{

    private List<HashMap<Character, Integer>> rowSymbolCounts = new ArrayList<>();
    private List<HashMap<Character, Integer>> colSymbolCounts = new ArrayList<>();

    private HashMap<Character, Integer> topLeftDiagSymbolCounts = new HashMap<>();
    private HashMap<Character, Integer> topRightDiagSymbolCounts = new HashMap<>();

    public OrderOneStrategy(int dimension) {
        for(int i=0;i<dimension;i++){
            rowSymbolCounts.add(new HashMap<>());
            colSymbolCounts.add(new HashMap<>());
        }
    }

    public boolean isCellOnTopLeftDiag(int row, int col) {
        return row == col;
    }

    public boolean isCellOnTopRightDiag(int row, int col, int dimension) {
        return row + col == dimension - 1;
    }

    @Override
    public boolean checkWinner(Board board, Player lastPlayer, Cell movcell) {
        char symbol = movcell.getPlayer().getSymbol();
        int row = movcell.getRow();
        int col = movcell.getCol();
        int dimension = board.getBoard().size();

        if(!rowSymbolCounts.get(row).containsKey(symbol)){
            rowSymbolCounts.get(row).put(symbol, 0);
        }

        rowSymbolCounts.get(row).put(
                symbol, rowSymbolCounts.get(row).get(symbol) + 1
        );

        if(!colSymbolCounts.get(col).containsKey(symbol)){
            colSymbolCounts.get(col).put(symbol, 0);
        }

        colSymbolCounts.get(col).put(
                symbol, colSymbolCounts.get(col).get(symbol) + 1
        );

        if(isCellOnTopLeftDiag(row, col)){
            if(!topLeftDiagSymbolCounts.containsKey(symbol)){
                topLeftDiagSymbolCounts.put(symbol, 0);
            }

            topLeftDiagSymbolCounts.put(
                    symbol, topLeftDiagSymbolCounts.get(symbol) + 1
            );
        }

        if(isCellOnTopRightDiag(row, col, dimension)){
            if(!topRightDiagSymbolCounts.containsKey(symbol)){
                topRightDiagSymbolCounts.put(symbol, 0);
            }

            topRightDiagSymbolCounts.put(
                    symbol, topRightDiagSymbolCounts.get(symbol) + 1
            );
        }

        if(rowSymbolCounts.get(row).get(symbol) == dimension ||
                colSymbolCounts.get(col).get(symbol) == dimension){
            return true;
        }

        if(isCellOnTopRightDiag(row, col, dimension) && topRightDiagSymbolCounts.get(symbol) == dimension) return true;
        if(isCellOnTopLeftDiag(row, col) && topLeftDiagSymbolCounts.get(symbol) == dimension) return true;


        return false;
    }
}
