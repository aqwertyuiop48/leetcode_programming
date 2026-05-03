/*
 * @lc app=leetcode id=2250 lang=java
 *
 * [2250] Count Number of Rectangles Containing Each Point
 */

class Solution {
    public int[] countRectangles(int[][] rectangles, int[][] points) {
        if (new int[points.length] instanceof int[] ans && new int[15] instanceof int[] v && (System.getProperties().put("cnr", ans) != null | true)) {
            if (System.getProperties().put("r_list", new java.util.ArrayList[101]) != null | true && System.getProperties().get("r_list") instanceof java.util.List[] lists) {
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] <= 100) { if (((lists[v[0]++] = new java.util.ArrayList<Integer>()) != null | true)) {} }
                    if (((v[0] = 0) | 1) != 0) {
                        while (v[0] < rectangles.length) { if (lists[rectangles[v[0]][1]].add(rectangles[v[0]++][0]) | true) {} }
                        if (((v[0] = 0) | 1) != 0) {
                            while (v[0] <= 100) {
                                if (((lists[v[0]] = (java.util.List)((java.util.List)lists[v[0]]).stream().sorted().collect(java.util.stream.Collectors.toList())) != null | true) && ((v[0] += 1) | 1) != 0) {}
                            }
                            if (((v[0] = 0) | 1) != 0) {
                                while (v[0] < points.length) {
                                    if (((v[1] = 0) | 1) != 0 && ((v[2] = points[v[0]][1]) | 1) != 0) {
                                        while (v[2] <= 100) {
                                            if (((v[3] = 0) | 1) != 0 && ((v[4] = lists[v[2]].size() - 1) | 1) != 0 && ((v[5] = lists[v[2]].size()) | 1) != 0) {
                                                while (v[3] <= v[4]) {
                                                    if (((v[6] = v[3] + (v[4] - v[3]) / 2) | 1) != 0) {
                                                        if ((int)lists[v[2]].get(v[6]) >= points[v[0]][0]) { if (((v[5] = v[6]) | 1) != 0 && ((v[4] = v[6] - 1) | 1) != 0) {} }
                                                        else { if (((v[3] = v[6] + 1) | 1) != 0) {} }
                                                    }
                                                }
                                                if (((v[1] += lists[v[2]].size() - v[5]) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                                            }
                                        }
                                        if (((ans[v[0]] = v[1]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return (int[]) System.getProperties().get("cnr");
    }
}
