
public class Battleships_in_a_Board {

    public int countBattleships(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (i != 0 && board[i][j] == 'X' && board[i - 1][j] == 'X') {
                    continue;
                }
                if (j != 0 && board[i][j] == 'X' && board[i][j - 1] == 'X') {
                    continue;
                }
                if (board[i][j] == 'X') {
                    count++;
                }
            }
        }
        return count;
    }
}
