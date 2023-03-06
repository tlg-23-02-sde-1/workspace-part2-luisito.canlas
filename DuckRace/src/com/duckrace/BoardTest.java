package com.duckrace;

import static com.duckrace.Reward.*;

class BoardTest {

    public static void main(String[] args) {
        Board board = new Board();

        board.dumpStudentIdMap();
        System.out.println();

        board.update(2, PRIZES);
        board.update(2, DEBIT_CARD);
        board.update(1, DEBIT_CARD);
        board.update(9, PRIZES);
        board.update(9, PRIZES);
        board.update(12, PRIZES);
        board.update(11, PRIZES);
        board.update(11, DEBIT_CARD);
        board.update(11, DEBIT_CARD);
        board.update(11, DEBIT_CARD);
        board.update(11, DEBIT_CARD);
        board.update(11, DEBIT_CARD);
        board.update(11, DEBIT_CARD);
        board.update(11, DEBIT_CARD);
        board.update(11, DEBIT_CARD);
        board.update(11, DEBIT_CARD);
        board.update(13, PRIZES);

        board.show();
    }
}