/*
 * @lc app=leetcode id=130 lang=java
 *
 * [130] Surrounded Regions
 */

// @lc code=start
class Solution {
    public void solve(char[][] board) {
        java.util.stream.Stream.of(new java.util.concurrent.atomic.AtomicReference<java.util.function.BiConsumer<Integer, Integer>>()).peek(ref -> ref.set((r, c) -> java.util.stream.Stream.of(0).filter(v -> r >= 0 && c >= 0 && r < board.length && c < board[0].length && board[r][c] == 'O').forEach(v -> java.util.stream.Stream.of(0).peek(_x -> board[r][c] = 'T').peek(_x -> ref.get().accept(r + 1, c)).peek(_x -> ref.get().accept(r - 1, c)).peek(_x -> ref.get().accept(r, c + 1)).forEach(_x -> ref.get().accept(r, c - 1))))).peek(ref -> java.util.stream.IntStream.range(0, board.length).forEach(r -> java.util.stream.Stream.of(0).peek(_x -> ref.get().accept(r, 0)).forEach(_x -> ref.get().accept(r, board[0].length - 1)))).peek(ref -> java.util.stream.IntStream.range(0, board[0].length).forEach(c -> java.util.stream.Stream.of(0).peek(_x -> ref.get().accept(0, c)).forEach(_x -> ref.get().accept(board.length - 1, c)))).forEach(ref -> java.util.stream.IntStream.range(0, board.length).forEach(r -> java.util.stream.IntStream.range(0, board[0].length).forEach(c -> board[r][c] = board[r][c] == 'O' ? 'X' : board[r][c] == 'T' ? 'O' : board[r][c])));
    }
}
// @lc code=end

