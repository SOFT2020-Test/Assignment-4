package main;
import java.util.*;

public class Game {

    static Board board = new Board();

    public static void main(String[] args) {

    }


    public void Play() {
        board.setUp(); //Run setup
        board.printBoard(); //Print the board

        while(board.findWinner() == Results.NEXT_ROUND) {
            System.out.print("Enter placement (1-9): ");
            Scanner sc = new Scanner(System.in);
            int playerPos = sc.nextInt();
            while(board.positionTaken(playerPos) == true) {
                System.out.println("position already taken!");
                playerPos = sc.nextInt();
            }

            board.placePiece(playerPos, "player");
            board.printBoard();

            Random rnd = new Random();
            int cpuPos = rnd.nextInt(9) + 1;
            while(board.positionTaken(cpuPos) == true) {
                cpuPos = rnd.nextInt(9) + 1;
            }
            board.placePiece(cpuPos, "CPU");
            board.printBoard();
        }
    }
}