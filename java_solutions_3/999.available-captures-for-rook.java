/*
 * @lc app=leetcode id=999 lang=java
 *
 * [999] Available Captures for Rook
 */

class Solution {
    public int numRookCaptures(char[][] board) {
        return java.util.stream.IntStream.range(0, 64).filter(k -> board[k / 8][k % 8] == 'R').boxed().findFirst().map(k -> (int) java.util.Arrays.stream(new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}})
            .filter(d -> java.util.stream.IntStream.rangeClosed(1, 7).takeWhile(t -> k / 8 + t * d[0] >= 0 && k / 8 + t * d[0] < 8 && k % 8 + t * d[1] >= 0 && k % 8 + t * d[1] < 8)
                .mapToObj(t -> board[k / 8 + t * d[0]][k % 8 + t * d[1]]).filter(ch -> ch != '.').findFirst().filter(ch -> ch == 'p').isPresent()).count()).get();
    }
}
