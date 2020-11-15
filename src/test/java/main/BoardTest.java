package main;

import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoardTest extends TestCase {

    private Board board;

    @BeforeEach
    protected void setUp() throws Exception {
        board = new Board();
        board.setUp();
    }

    @Test
    public void test_Player_Wins() {
        board.placePiece(1, Players.YOU);
        board.placePiece(4, Players.CPU);
        board.placePiece(2, Players.YOU);
        board.placePiece(9, Players.CPU);
        board.placePiece(3, Players.YOU);
        board.printBoard();
        Enum result = board.findWinner();
        assertEquals(Results.WON, result);
    }

    @Test
    public void test_CPU_Wins() {
        board.placePiece(9, Players.YOU);
        board.placePiece(1, Players.CPU);
        board.placePiece(6, Players.YOU);
        board.placePiece(2, Players.CPU);
        board.placePiece(5, Players.YOU);
        board.placePiece(3, Players.CPU);
        board.printBoard();
        Enum result = board.findWinner();
        assertEquals(Results.LOSE, result);
    }

    @Test
    void test_It_A_Draw() {
        board.placePiece(1, Players.YOU);
        board.placePiece(2, Players.CPU);
        board.placePiece(3, Players.YOU);
        board.placePiece(4, Players.CPU);
        board.placePiece(5, Players.YOU);
        board.placePiece(6, Players.CPU);
        board.placePiece(7, Players.YOU);
        board.placePiece(8, Players.CPU);
        board.placePiece(9, Players.YOU);
        board.printBoard();
        Enum result = board.findWinner();
        assertEquals(Results.DRAW, result);
    }

    @Test
    void test_No_Winner_Found_Yet() {
        board.placePiece(1, Players.YOU);
        board.placePiece(2, Players.CPU);
        board.placePiece(3, Players.CPU);
        board.placePiece(4, Players.YOU);
        board.printBoard();
        Enum result = board.findWinner();
        assertEquals(Results.NEXT_ROUND, result);
    }

    @Test
    public void test_Position_Taken() {
        board.placePiece(1, Players.YOU);
        boolean taken = board.positionTaken(1);
        assertEquals(true, taken);
    }

    @Test
    public void test_Position_Not_Taken() {
        board.placePiece(1, Players.YOU);
        board.placePiece(3, Players.YOU);
        boolean taken = board.positionTaken(2);
        assertEquals(false, taken);
    }

    @Test
    void test_Play() {
    }
}