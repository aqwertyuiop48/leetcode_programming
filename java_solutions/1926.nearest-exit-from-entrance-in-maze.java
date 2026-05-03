/*
 * @lc app=leetcode id=1926 lang=java
 *
 * [1926] Nearest Exit from Entrance in Maze
 */

class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        return java.util.stream.Stream.iterate(new Object[]{java.util.Collections.singletonList(new int[]{entrance[0], entrance[1], 0}), new boolean[maze.length][maze[0].length]}, s -> !((java.util.List<int[]>)s[0]).isEmpty(), s -> new Object[]{((java.util.List<int[]>)s[0]).stream().peek(arr -> ((boolean[][])s[1])[arr[0]][arr[1]] = true).flatMap(arr -> java.util.stream.Stream.of(new int[]{arr[0]+1, arr[1]}, new int[]{arr[0]-1, arr[1]}, new int[]{arr[0], arr[1]+1}, new int[]{arr[0], arr[1]-1}).filter(n -> n[0] >= 0 && n[0] < maze.length && n[1] >= 0 && n[1] < maze[0].length && maze[n[0]][n[1]] == '.' && !((boolean[][])s[1])[n[0]][n[1]]).map(n -> new int[]{n[0], n[1], arr[2]+1})).collect(java.util.stream.Collectors.toList()), s[1]}).filter(s -> ((java.util.List<int[]>)s[0]).stream().anyMatch(arr -> (arr[0] != entrance[0] || arr[1] != entrance[1]) && (arr[0] == 0 || arr[0] == maze.length - 1 || arr[1] == 0 || arr[1] == maze[0].length - 1)) || ((java.util.List<int[]>)s[0]).isEmpty()).findFirst().map(s -> ((java.util.List<int[]>)s[0]).stream().filter(arr -> (arr[0] != entrance[0] || arr[1] != entrance[1]) && (arr[0] == 0 || arr[0] == maze.length - 1 || arr[1] == 0 || arr[1] == maze[0].length - 1)).findFirst().map(arr -> arr[2]).orElse(-1)).orElse(-1);
    }
}
