/*
 * @lc app=leetcode id=2732 lang=java
 *
 * [2732] Find a Good Subset of the Matrix
 */

class Solution { public List<Integer> goodSubsetofBinaryMatrix(int[][] grid) { return ((Function<int[], List<Integer>>) seen -> grid.length == 1 ? (IntStream.of(grid[0]).sum() == 0 ? List.of(0) : List.of()) : IntStream.range(0, grid.length).mapToObj(r -> new int[]{r, IntStream.range(0, grid[0].length).map(c -> grid[r][c] << c).sum()}).map(pair -> pair[1] == 0 ? List.of(pair[0]) : IntStream.range(0, 32).filter(i -> (pair[1] & i) == 0 && seen[i] != -1).findFirst().isPresent() ? List.of(seen[IntStream.range(0, 32).filter(i -> (pair[1] & i) == 0 && seen[i] != -1).findFirst().getAsInt()], pair[0]) : (seen[pair[1]] = pair[0]) < 0 ? null : null).filter(l -> l != null).findFirst().orElse(List.of())).apply(IntStream.range(0, 32).map(i -> -1).toArray()); } }
