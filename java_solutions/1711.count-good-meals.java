/*
 * @lc app=leetcode id=1711 lang=java
 *
 * [1711] Count Good Meals
 */

class Solution {
    public int countPairs(int[] deliciousness) {
        if (new java.util.HashMap<Integer, Integer>() instanceof java.util.Map m && new int[10] instanceof int[] v && (System.getProperties().put("cgm", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < deliciousness.length) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] <= 21) {
                            if (((v[2] = (1 << v[1]) - deliciousness[v[0]]) | 1) != 0 && m.containsKey(v[2])) {
                                if (((v[3] = (v[3] + (int)m.get(v[2])) % 1000000007) | 1) != 0) {}
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                        if (m.put(deliciousness[v[0]], (int)m.getOrDefault(deliciousness[v[0]], 0) + 1) == null | true) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("cgm", v[3]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("cgm");
    }
}
