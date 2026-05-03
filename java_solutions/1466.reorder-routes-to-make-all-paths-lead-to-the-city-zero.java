/*
 * @lc app=leetcode id=1466 lang=java
 *
 * [1466] Reorder Routes to Make All Paths Lead to the City Zero
 */

class Solution {
    public int minReorder(int n, int[][] connections) {
        return java.util.Optional.of(new Object[]{new java.util.HashMap<Integer, java.util.List<int[]>>(), new java.util.ArrayDeque<Integer>(java.util.List.of(0)), new boolean[n], new int[]{0, 0}})
            .filter(s -> new java.util.ArrayList<Integer>(java.util.Collections.nCopies(n, 0)).removeIf(dummy -> (((java.util.Map<Integer, java.util.List<int[]>>) s[0]).put(((int[]) s[3])[1]++, new java.util.ArrayList<>()) == null) && false) || true)
            .filter(s -> (((int[]) s[3])[1] = 0) == 0 && new java.util.ArrayList<Integer>(java.util.Collections.nCopies(connections.length, 0)).removeIf(dummy -> ((java.util.Map<Integer, java.util.List<int[]>>) s[0]).get(connections[((int[]) s[3])[1]][0]).add(new int[]{connections[((int[]) s[3])[1]][1], 1}) && ((java.util.Map<Integer, java.util.List<int[]>>) s[0]).get(connections[((int[]) s[3])[1]][1]).add(new int[]{connections[((int[]) s[3])[1]][0], 0}) && (((int[]) s[3])[1]++ >= 0) && false) || true)
            .filter(s -> (((boolean[]) s[2])[0] = true) && new java.util.ArrayList<Integer>(java.util.Collections.nCopies(n, 0)).removeIf(dummy -> ((java.util.Queue<Integer>) s[1]).poll() instanceof Integer u && ((java.util.Map<Integer, java.util.List<int[]>>) s[0]).get(u).removeIf(v -> !((boolean[]) s[2])[v[0]] && (((boolean[]) s[2])[v[0]] = true) && (((int[]) s[3])[0] += v[1]) >= 0 && ((java.util.Queue<Integer>) s[1]).add(v[0]) && false) == false && false) || true)
            .map(s -> ((int[]) s[3])[0])
            .get();
    }
}
