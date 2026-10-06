/*
 * @lc app=leetcode id=909 lang=java
 *
 * [909] Snakes and Ladders
 */

class Solution {
    public int snakesAndLadders(int[][] board) {
        return new boolean[board.length * board.length + 1] instanceof boolean[] seen && (seen[1] = true)
            && ((java.util.function.IntUnaryOperator) t -> board[board.length - 1 - (t - 1) / board.length][(t - 1) / board.length % 2 == 0 ? (t - 1) % board.length : board.length - 1 - (t - 1) % board.length] == -1 ? t
                : board[board.length - 1 - (t - 1) / board.length][(t - 1) / board.length % 2 == 0 ? (t - 1) % board.length : board.length - 1 - (t - 1) % board.length]) instanceof java.util.function.IntUnaryOperator dst
            ? java.util.stream.Stream.iterate(java.util.List.of(1), l -> !l.isEmpty(),
                    l -> l.stream().flatMap(s -> java.util.stream.IntStream.rangeClosed(s + 1, Math.min(s + 6, board.length * board.length)).map(dst).boxed())
                        .filter(d -> !seen[d] && (seen[d] = true)).toList())
                .map(l -> l.contains(board.length * board.length)).toList().indexOf(true)
            : -1;
    }
}
