public class QueensProblem {
    //?Pratik Sherdiwala (Codelytics)

    static final int totalQueens = 4;

    boolean isSafe(int board[][], int row, int col) {

        int i, j;
        //check row on left side
        for (i = 0; i < col; i++) {
            if (board[row][i] == 1)
                return false;
        }

        //check upper diagonal on left side
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }

        /* Check lower diagonal on left side */
        for (i = row, j = col; j >= 0 && i < totalQueens; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    static boolean solveNQUtil(int board[][], int col) {

        //if all queens are placed
        if (col >= totalQueens) return true;

        for (int i = 0; i < totalQueens; i++) {

        }
        return false;
    }

    static boolean solveNQ() {
        int board[][] = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        return false;
    }

    public static void main(String[] args) {

    }
}
