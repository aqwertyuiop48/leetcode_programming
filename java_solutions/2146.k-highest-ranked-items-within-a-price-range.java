/*
 * @lc app=leetcode id=2146 lang=java
 *
 * [2146] K Highest Ranked Items Within a Price Range
 */

class Solution {
    public java.util.List<java.util.List<Integer>> highestRankedKItems(int[][] grid, int[] pricing, int[] start, int k) {
        if (new int[15] instanceof int[] v && new int[grid.length][grid[0].length] instanceof int[][] dist && (System.getProperties().put("hrk", new java.util.ArrayList<java.util.List<Integer>>()) != null | true)) {
            if (new int[grid.length * grid[0].length * 4] instanceof int[] q && System.getProperties().put("items", new java.util.ArrayList<int[]>()) != null | true && System.getProperties().get("items") instanceof java.util.List items) {
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < grid.length) {
                        if (((v[1] = 0) | 1) != 0) { while (v[1] < grid[0].length) { if (((dist[v[0]][v[1]++] = -1) | 1) != 0) {} } }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (((q[0] = start[0]) | 1) != 0 && ((q[1] = start[1]) | 1) != 0 && ((dist[start[0]][start[1]] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 2) | 1) != 0) {
                        while (v[2] < v[3]) {
                            if (((v[4] = q[v[2]++]) | 1) != 0 && ((v[5] = q[v[2]++]) | 1) != 0) {
                                if (grid[v[4]][v[5]] >= pricing[0] && grid[v[4]][v[5]] <= pricing[1]) { if (items.add(new int[]{dist[v[4]][v[5]], grid[v[4]][v[5]], v[4], v[5]}) | true) {} }
                                if (v[4] > 0 && grid[v[4]-1][v[5]] != 0 && dist[v[4]-1][v[5]] == -1) { if (((dist[v[4]-1][v[5]] = dist[v[4]][v[5]] + 1) | 1) != 0 && ((q[v[3]++] = v[4]-1) | 1) != 0 && ((q[v[3]++] = v[5]) | 1) != 0) {} }
                                if (v[4] < grid.length - 1 && grid[v[4]+1][v[5]] != 0 && dist[v[4]+1][v[5]] == -1) { if (((dist[v[4]+1][v[5]] = dist[v[4]][v[5]] + 1) | 1) != 0 && ((q[v[3]++] = v[4]+1) | 1) != 0 && ((q[v[3]++] = v[5]) | 1) != 0) {} }
                                if (v[5] > 0 && grid[v[4]][v[5]-1] != 0 && dist[v[4]][v[5]-1] == -1) { if (((dist[v[4]][v[5]-1] = dist[v[4]][v[5]] + 1) | 1) != 0 && ((q[v[3]++] = v[4]) | 1) != 0 && ((q[v[3]++] = v[5]-1) | 1) != 0) {} }
                                if (v[5] < grid[0].length - 1 && grid[v[4]][v[5]+1] != 0 && dist[v[4]][v[5]+1] == -1) { if (((dist[v[4]][v[5]+1] = dist[v[4]][v[5]] + 1) | 1) != 0 && ((q[v[3]++] = v[4]) | 1) != 0 && ((q[v[3]++] = v[5]+1) | 1) != 0) {} }
                            }
                        }
                        if (System.getProperties().put("s_items", ((java.util.List<int[]>)items).stream().sorted((a, b) -> a[0] != b[0] ? a[0] - b[0] : (a[1] != b[1] ? a[1] - b[1] : (a[2] != b[2] ? a[2] - b[2] : a[3] - b[3]))).collect(java.util.stream.Collectors.toList())) != null | true) {
                            if (System.getProperties().get("hrk") instanceof java.util.List res && System.getProperties().get("s_items") instanceof java.util.List sItems && ((v[6] = 0) | 1) != 0) {
                                while (v[6] < Math.min(k, sItems.size())) {
                                    if (res.add(java.util.Arrays.asList(((int[])sItems.get(v[6]))[2], ((int[])sItems.get(v[6]))[3])) | true && ((v[6] += 1) | 1) != 0) {}
                                }
                            }
                        }
                    }
                }
            }
        }
        return (java.util.List<java.util.List<Integer>>) System.getProperties().get("hrk");
    }
}
