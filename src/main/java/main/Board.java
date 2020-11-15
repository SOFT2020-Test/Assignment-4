package main;
import java.util.*;

public class Board {

    private char[][] grid;
    private ArrayList<Integer> playerPositions;
    private ArrayList<Integer> cpuPositions;

    public void setUp() {
        grid = new char[][] {{' ', '|', ' ', '|', ' '},{'-', '+', '-', '+', '-'},{' ', '|', ' ', '|', ' '},{'+', '-', '+', '-', '+'},{' ', '|', ' ', '|', ' '}};
        playerPositions = new ArrayList<>();
        cpuPositions = new ArrayList<>();
    }

    public List<Integer> getPlayerPositions() {
        return playerPositions;
    }

    public List<Integer> getCpuPositions() {
        return cpuPositions;
    }

    public boolean positionTaken(int pos) {
        if(getPlayerPositions().contains(pos) || getCpuPositions().contains(pos)) {
            return true;
        } else {
            return false;
        }
    }

    public void placePiece(int pos, Enum player) {
            char symbol = ' ';
            if(player == Players.YOU) {
                symbol = 'X';
                playerPositions.add(pos);
            }

            if(player == Players.CPU) {
                symbol = 'O';
                cpuPositions.add(pos);
            }

            switch(pos) {
                case 1:
                    grid[0][0] = symbol;
                    break;
                case 2:
                    grid[0][2] = symbol;
                    break;
                case 3:
                    grid[0][4] = symbol;
                    break;
                case 4:
                    grid[2][0] = symbol;
                    break;
                case 5:
                    grid[2][2] = symbol;
                    break;
                case 6:
                    grid[2][4] = symbol;
                    break;
                case 7:
                    grid[4][0] = symbol;
                    break;
                case 8:
                    grid[4][2] = symbol;
                    break;
                case 9:
                    grid[4][4] = symbol;
                    break;
                default:
                    break;
            }
    }


    public void printBoard() {
        for (char[] row : grid) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println("");
        }
        System.out.println("------------------------\n");
    }



    public List<List> winConditions() {
        List<Integer> topRow = Arrays.asList(1,2,3);
        List<Integer> middleRow = Arrays.asList(4,5,6);
        List<Integer> bottomRow = Arrays.asList(7,8,9);

        List<Integer> leftColumn = Arrays.asList(1,4,7);
        List<Integer> middleColumn = Arrays.asList(2,5,8);
        List<Integer> rightColumn = Arrays.asList(3,6,9);

        List<Integer> diagonal1 = Arrays.asList(1,5,9);
        List<Integer> diagonal2  = Arrays.asList(7,5,3);

        List<List> winningConditions = new ArrayList<List>();
        winningConditions.add(topRow);
        winningConditions.add(middleRow);
        winningConditions.add(bottomRow);
        winningConditions.add(leftColumn);
        winningConditions.add(middleColumn);
        winningConditions.add(rightColumn);
        winningConditions.add(diagonal1);
        winningConditions.add(diagonal2);
        return winningConditions;
    }

    public Enum findWinner() {
        for (List list : winConditions()) {
            if(playerPositions.containsAll(list)) {
                System.out.println("You win!");
                return Results.WON;
            }
            if (cpuPositions.containsAll(list)) {
                System.out.println("You lose!");
                return Results.LOSE;
            }
            else if ((playerPositions.size() + cpuPositions.size()) == 9) {
                System.out.println("It's a draw!");
                return Results.DRAW;
            }
        }
        return Results.NEXT_ROUND;
    }
}
