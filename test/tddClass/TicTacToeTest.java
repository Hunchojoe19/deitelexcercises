package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static tddClass.PlayersClass.*;
import static tddClass.BoardElement.*;


import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {
    private TicTacToe board;
    @BeforeEach
    public void setUp(){
        board = new TicTacToe();
    }
    @Test
    void boardCanBeCreatedTest(){
        assertNotNull(board);
    }
    @Test
    void testThatBoardHasElements(){
        assertNotNull(board.getCellElement());
    }

    @Test
    void testThatTicTacToeHasTwoPlayers(){
        assertEquals(2, PlayersClass.values().length);
    }

    @Test
    void testThatTicTacToeHasPlayerOne(){
        assertNotNull(PLAYER1);
    }

    @Test
    void testThatTicTacToeHasPlayerTwo(){

        assertNotNull(PLAYER2);
    }

    @Test
    void testThatPlayerOneCanMarkTheBoard(){
        board.currentPlayerMarks(PLAYER1,1);
        assertEquals("X", board.getPlayArray()[0][0]);
        board.currentPlayerMarks(PLAYER1,4);
        assertEquals("X", board.getPlayArray()[1][0]);
        board.currentPlayerMarks(PLAYER1,5);
        assertEquals("X", board.getPlayArray()[1][1]);
        board.currentPlayerMarks(PLAYER1,7);
        assertEquals("X", board.getPlayArray()[2][0]);
        System.out.println(board.printOnBoard());
    }

    @Test
    void testThatPlayerTwoCanMarkTheBoard(){
        board.currentPlayerMarks(PLAYER2,3);
        assertEquals("O", board.getPlayArray()[0][2]);
        board.currentPlayerMarks(PLAYER2,2);
        assertEquals("O", board.getPlayArray()[0][1]);
        board.currentPlayerMarks(PLAYER2,9);
        assertEquals("O", board.getPlayArray()[2][2]);
        board.currentPlayerMarks(PLAYER2,6);
        assertEquals("O", board.getPlayArray()[1][2]);
        board.currentPlayerMarks(PLAYER2,8);
        assertEquals("O", board.getPlayArray()[2][1]);
        System.out.println(board.printOnBoard());
    }

    @Test
    void testThatBoardIsEmptyByDefault(){
        assertEquals(EMPTY, board.getCellElement());
    }

    @Test
    void testThatTheGameCanBeWonByOneOfThePlayers(){
        assertEquals(EMPTY, board.getCellElement());
        board.currentPlayerMarks(PLAYER1,1);
        board.currentPlayerMarks(PLAYER1,5);
        board.currentPlayerMarks(PLAYER1,9);
        String prompt = """
                | X |   |   |
                ____________
                |   | X |   |
                _____________
                |   |   | X |

                """;
        assertTrue(GameWinner.hasWon(board.getPlayArray()));
    }

    @Test
    void testThatGameCanBeWonInFirstRow(){
        board.currentPlayerMarks(PLAYER2,1);
        board.currentPlayerMarks(PLAYER2,2);
        board.currentPlayerMarks(PLAYER2,3);
        String prompt = """
                | O | O | O |
                ____________
                |   |   |   |
                _____________
                |   |   |   |

                """;
        assertTrue(GameWinner.boardFirstRow(board.getPlayArray()));
    }

    @Test
    void testThatGameCanBeWonInSecondRow(){
        board.currentPlayerMarks(PLAYER1,4);
        board.currentPlayerMarks(PLAYER1,5);
        board.currentPlayerMarks(PLAYER1,6);
        String prompt = """
                |   |   |   |
                ____________
                | X | X | X |
                _____________
                |   |   |   |

                """;
        assertTrue(GameWinner.boardSecondRow(board.getPlayArray()));
    }

    @Test
    void testThatGameCanBeWonInThirdRow(){
        board.currentPlayerMarks(PLAYER2, 7);
        board.currentPlayerMarks(PLAYER2,8);
        board.currentPlayerMarks(PLAYER2,9);
        String prompt = """
                |   |   |   |
                ____________
                |   |   |   |
                _____________
                | O | O | O |

                """;
        assertTrue(GameWinner.boardThirdRow(board.getPlayArray()));
    }

    @Test
    void testThatGameCanBeWonInFirstColumn(){
        board.currentPlayerMarks(PLAYER1,1);
        board.currentPlayerMarks(PLAYER1,4);
        board.currentPlayerMarks(PLAYER1,7);
        String prompt = """
                | X |  |  |
                ____________
                | X |  |  |
                _____________
                | X |  |  |

                """;
        assertTrue(GameWinner.boardFirstColumn(board.getPlayArray()));
    }

    @Test
    void testThatGameCanBeWonInSecondColumn(){
        board.currentPlayerMarks(PLAYER2,2);
        board.currentPlayerMarks(PLAYER2,5);
        board.currentPlayerMarks(PLAYER2,8);
        String prompt = """
                |  | O |  |
                ____________
                |  | O |  |
                _____________
                |  | O |  |

                """;

        assertTrue(GameWinner.boardSecondColumn(board.getPlayArray()));
    }

    @Test
    void testThatGameCanBeWonInThreeColumn(){
        board.currentPlayerMarks(PLAYER1,3);
        board.currentPlayerMarks(PLAYER1,6);
        board.currentPlayerMarks(PLAYER1,9);
        String prompt = """
                |  |   | X |
                ____________
                |   |  | X |
                _____________
                |   |  | X |

                """;
        assertTrue(GameWinner.boardThirdColumn(board.getPlayArray()));
    }

    @Test
    void testThatGameCanBeWonInRightDiagonal(){
        board.currentPlayerMarks(PLAYER2,3);
        board.currentPlayerMarks(PLAYER2,5);
        board.currentPlayerMarks(PLAYER2,7);
        String prompt = """
                |   |  | O |
                ____________
                |   | O |  |
                _____________
                | O |   |  |

                """;
        assertTrue(GameWinner.boardRightDiagonal(board.getPlayArray()));

    }

    @Test
    void testThatGameCanBeWonInLeftDiagonal() {
        board.currentPlayerMarks(PLAYER1, 9);
        board.currentPlayerMarks(PLAYER1, 5);
        board.currentPlayerMarks(PLAYER1, 1);
        String prompt = """
                | X |   |   |
                ____________
                |   | X |   |
                _____________
                |   |   | X |

                """;
        assertTrue(GameWinner.leftDiagonal(board.getPlayArray()));
    }

    @Test
    void testThatTwoPlayersCantPlayOnSamePosition(){
        board.currentPlayerMarks(PLAYER1,4);
        assertEquals("X", board.getPlayArray()[1][0]);
        assertThrows(IllegalArgumentException.class, ()->board.currentPlayerMarks(PLAYER2,4));
    }

    @Test
    void testThatPlayersCantPlayOutsideTheBoard(){
        assertThrows(ArrayIndexOutOfBoundsException.class, () ->board.currentPlayerMarks(PLAYER1, 10));
    }

    @Test
    void testThatGameCanEndInDraw(){
        board.currentPlayerMarks(PLAYER1, 1);
        board.currentPlayerMarks(PLAYER2, 2);
        board.currentPlayerMarks(PLAYER1, 5);
        board.currentPlayerMarks(PLAYER2, 3);
        board.currentPlayerMarks(PLAYER1, 6);
        board.currentPlayerMarks(PLAYER2, 4);
        board.currentPlayerMarks(PLAYER1, 7);
        board.currentPlayerMarks(PLAYER2, 9);
        board.currentPlayerMarks(PLAYER1, 8);
        String prompt = """
                _____________
                | X | O | O |
                | O | X | X |
                | X | X | O |
                _____________
                """;
        assertTrue(GameWinner.isDraw(board.getPlayArray(), 9));
    }

}

