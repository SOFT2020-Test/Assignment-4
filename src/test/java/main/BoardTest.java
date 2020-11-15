package main;

import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest extends TestCase {

    private Board board;

    @BeforeEach
    protected void setUp() throws Exception {
        board = new Board();
        board.setUp();
    }

    @Test
    public void test_Player_Wins() {
        board.placePiece(1, "player");
        board.placePiece(4, "cpu");
        board.placePiece(2, "player");
        board.placePiece(9, "CPU");
        board.placePiece(3, "player");
        board.printBoard();
        Enum result = board.findWinner();
        assertEquals(Results.WON, result);
    }

    @Test
    public void test_CPU_Wins() {
        board.placePiece(9, "player");
        board.placePiece(1, "CPU");
        board.placePiece(6, "player");
        board.placePiece(2, "CPU");
        board.placePiece(5, "player");
        board.placePiece(3, "CPU");
        board.printBoard();
        Enum result = board.findWinner();
        assertEquals(Results.LOSE, result);
    }

    @Test
    void test_It_A_Draw() {
        board.placePiece(1, "player");
        board.placePiece(2, "CPU");
        board.placePiece(3, "player");
        board.placePiece(4, "CPU");
        board.placePiece(5, "player");
        board.placePiece(6, "CPU");
        board.placePiece(7, "player");
        board.placePiece(8, "cpu");
        board.placePiece(9, "player");
        board.printBoard();
        Enum result = board.findWinner();
        assertEquals(Results.DRAW, result);
    }

    @Test
    void test_No_Winner_Found_Yet() {
        board.placePiece(1, "player");
        board.placePiece(2, "CPU");
        board.placePiece(3, "player");
        board.placePiece(4, "CPU");
        board.printBoard();
        Enum result = board.findWinner();
        assertEquals(Results.NEXT_ROUND, result);
    }

    @Test
    public void test_Position_Taken() {
        board.placePiece(1, "player");
        boolean taken = board.positionTaken(1);
        assertEquals(true, taken);
    }

    @Test
    public void test_Position_Not_Taken() {
        board.placePiece(1, "player");
        boolean taken = board.positionTaken(2);
        assertEquals(false, taken);
    }

    @Test
    void test_Play() {
    }
}