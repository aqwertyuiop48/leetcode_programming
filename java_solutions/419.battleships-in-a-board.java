/*
 * @lc app=leetcode id=419 lang=java
 *
 * [419] Battleships in a Board
 */

record Solution() {
    public int countBattleships(char[][] board) {
        return (int) java.util.stream.IntStream.range(0, board.length).mapToLong(i -> java.util.stream.IntStream.range(0, board[0].length).filter(j -> board[i][j] == 'X' && (i == 0 || board[i - 1][j] != 'X') && (j == 0 || board[i][j - 1] != 'X')).count()).sum();
    }
}
