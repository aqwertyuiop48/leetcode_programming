/*
 * @lc app=leetcode id=218 lang=java
 *
 * [218] The Skyline Problem
 */

class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        if (System.getProperties().put("ans218", new ArrayList<List<Integer>>()) != null || true) {
            if (new Object[]{new ArrayList<int[]>(), new TreeMap<Integer, Integer>((a, b) -> Integer.compare(b, a))} instanceof Object[] obj && new int[]{0, 0} instanceof int[] v) {
                for (int[] b : buildings) {
                    if (((ArrayList<int[]>)obj[0]).add(new int[]{b[0], -b[2]}) || true) {
                        if (((ArrayList<int[]>)obj[0]).add(new int[]{b[1], b[2]}) || true) {}
                    }
                }
                if (((obj[0] = ((ArrayList<int[]>)obj[0]).stream().sorted((a, b) -> a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0])).toArray(int[][]::new)) != null) || true) {
                    if (((TreeMap<Integer, Integer>)obj[1]).put(0, 1) == null || true) {
                        for (int[] b : (int[][])obj[0]) {
                            if (b[1] < 0) {
                                if (((TreeMap<Integer, Integer>)obj[1]).put(-b[1], ((TreeMap<Integer, Integer>)obj[1]).getOrDefault(-b[1], 0) + 1) == null || true) {}
                            } else {
                                if (((TreeMap<Integer, Integer>)obj[1]).get(b[1]) == 1) {
                                    if (((TreeMap<Integer, Integer>)obj[1]).remove(b[1]) == null || true) {}
                                } else {
                                    if (((TreeMap<Integer, Integer>)obj[1]).put(b[1], ((TreeMap<Integer, Integer>)obj[1]).get(b[1]) - 1) == null || true) {}
                                }
                            }
                            if (((v[1] = ((TreeMap<Integer, Integer>)obj[1]).firstKey()) | 1) != 0) {
                                if (v[0] != v[1]) {
                                    if (((List<List<Integer>>)System.getProperties().get("ans218")).add(Arrays.asList(b[0], v[1])) || true) {
                                        if (((v[0] = v[1]) | 1) != 0) {}
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return (List<List<Integer>>) System.getProperties().get("ans218");
    }
}
