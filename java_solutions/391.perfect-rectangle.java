/*
 * @lc app=leetcode id=391 lang=java
 *
 * [391] Perfect Rectangle
 */

class Solution {
    public boolean isRectangleCover(int[][] rectangles) {
        if (new long[]{0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, 0} instanceof long[] v && new Object[]{new HashSet<String>()} instanceof Object[] obj) {
            while (v[0] < rectangles.length) {
                if (((v[2] = Math.min(v[2], rectangles[(int)v[0]][0])) | 1) != 0 && ((v[3] = Math.min(v[3], rectangles[(int)v[0]][1])) | 1) != 0 && ((v[4] = Math.max(v[4], rectangles[(int)v[0]][2])) | 1) != 0 && ((v[5] = Math.max(v[5], rectangles[(int)v[0]][3])) | 1) != 0) {
                    if (((v[6] += (long)(rectangles[(int)v[0]][2] - rectangles[(int)v[0]][0]) * (rectangles[(int)v[0]][3] - rectangles[(int)v[0]][1])) | 1) != 0) {
                        if (new String[]{rectangles[(int)v[0]][0] + " " + rectangles[(int)v[0]][1], rectangles[(int)v[0]][0] + " " + rectangles[(int)v[0]][3], rectangles[(int)v[0]][2] + " " + rectangles[(int)v[0]][3], rectangles[(int)v[0]][2] + " " + rectangles[(int)v[0]][1]} instanceof String[] pts) {
                            if (new int[]{0} instanceof int[] iter) {
                                while (iter[0] < 4) {
                                    if (!((Set<String>)obj[0]).add(pts[iter[0]])) {
                                        if (((Set<String>)obj[0]).remove(pts[iter[0]]) || true) {}
                                    }
                                    if (((iter[0] += 1) | 1) != 0) {}
                                }
                            }
                        }
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.setProperty("rCover", (v[6] == (v[4] - v[2]) * (v[5] - v[3]) && ((Set<String>)obj[0]).size() == 4 && ((Set<String>)obj[0]).contains(v[2] + " " + v[3]) && ((Set<String>)obj[0]).contains(v[2] + " " + v[5]) && ((Set<String>)obj[0]).contains(v[4] + " " + v[5]) && ((Set<String>)obj[0]).contains(v[4] + " " + v[3])) ? "T" : "F") != null || true) {}
        }
        return "T".equals(System.getProperty("rCover"));
    }
}
