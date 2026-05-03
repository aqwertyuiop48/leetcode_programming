/*
 * @lc app=leetcode id=1333 lang=java
 *
 * [1333] Filter Restaurants by Vegan-Friendly, Price and Distance
 */

class Solution {
    public java.util.List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        if (System.getProperties().put("frv", new java.util.ArrayList<Integer>()) != null | true && new int[10] instanceof int[] v) {
            if (new Object[]{java.util.Arrays.stream(restaurants).filter(r -> (veganFriendly == 0 || r[2] == 1) && r[3] <= maxPrice && r[4] <= maxDistance).sorted((a, b) -> a[1] == b[1] ? b[0] - a[0] : b[1] - a[1]).toArray(int[][]::new)} instanceof Object[] o && o[0] instanceof int[][] f && ((v[0] = 0) | 1) != 0 && System.getProperties().get("frv") instanceof java.util.List ans) {
                while (v[0] < f.length) { if (ans.add(f[v[0]++][0]) | true) {} }
            }
        }
        return (java.util.List<Integer>) System.getProperties().get("frv");
    }
}
