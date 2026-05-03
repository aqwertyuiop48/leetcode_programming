/*
 * @lc app=leetcode id=1275 lang=java
 *
 * [1275] Find Winner on a Tic Tac Toe Game
 */

class Solution {
    public String tictactoe(int[][] moves) {
        return java.util.Optional.of(new Object[]{new int[2][8], "Pending"})
            .filter(state -> java.util.stream.IntStream.range(0, moves.length).allMatch(i -> 
                java.util.Optional.of(i % 2).filter(p -> 
                    (((int[][]) state[0])[p][moves[i][0]] += 1) > 0 &&
                    (((int[][]) state[0])[p][moves[i][1] + 3] += 1) > 0 &&
                    (moves[i][0] == moves[i][1] ? (((int[][]) state[0])[p][6] += 1) > 0 : true) &&
                    (moves[i][0] + moves[i][1] == 2 ? (((int[][]) state[0])[p][7] += 1) > 0 : true) &&
                    ((((int[][]) state[0])[p][moves[i][0]] == 3 || 
                      ((int[][]) state[0])[p][moves[i][1] + 3] == 3 || 
                      ((int[][]) state[0])[p][6] == 3 || 
                      ((int[][]) state[0])[p][7] == 3) ? 
                      (state[1] = (p == 0 ? "A" : "B")) != null : true)
                ).isPresent() && state[1].equals("Pending")
            ) || true)
            .map(state -> state[1].equals("Pending") ? (moves.length == 9 ? "Draw" : "Pending") : (String) state[1])
            .orElse("Pending");
    }
}
