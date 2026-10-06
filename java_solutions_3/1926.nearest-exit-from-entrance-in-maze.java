/*
 * @lc app=leetcode id=1926 lang=java
 *
 * [1926] Nearest Exit from Entrance in Maze
 */

class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        return (maze[entrance[0]][entrance[1]] = '+') == '+'
            ? java.util.stream.IntStream.of(java.util.stream.Stream.iterate(java.util.List.of(entrance), f -> !f.isEmpty(),
                    f -> f.stream().flatMap(p -> java.util.Arrays.stream(new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}}).map(d -> new int[]{p[0] + d[0], p[1] + d[1]}))
                        .filter(x -> x[0] >= 0 && x[1] >= 0 && x[0] < maze.length && x[1] < maze[0].length && maze[x[0]][x[1]] == '.' && (maze[x[0]][x[1]] = '+') == '+').toList())
                .skip(1).map(f -> f.stream().anyMatch(x -> x[0] == 0 || x[1] == 0 || x[0] == maze.length - 1 || x[1] == maze[0].length - 1)).toList().indexOf(true))
                .map(i -> i < 0 ? -1 : i + 1).findFirst().getAsInt()
            : -1;
    }
}
