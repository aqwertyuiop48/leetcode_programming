/*
 * @lc app=leetcode id=850 lang=java
 *
 * [850] Rectangle Area II
 */

class Solution {
    public int rectangleArea(int[][] rectangles) {
        if (new Object[]{new int[rectangles.length * 2], new int[rectangles.length * 2], new int[rectangles.length * 2 * rectangles.length * 2], new int[15]} instanceof Object[] v) {
            if (((((int[])v[3])[0] = 0) | 1) != 0) {}
            while (((int[])v[3])[0] < rectangles.length) {
                if (((((int[])v[0])[((int[])v[3])[0] * 2] = rectangles[((int[])v[3])[0]][0]) | 1) != 0 && ((((int[])v[0])[((int[])v[3])[0] * 2 + 1] = rectangles[((int[])v[3])[0]][2]) | 1) != 0 && ((((int[])v[1])[((int[])v[3])[0] * 2] = rectangles[((int[])v[3])[0]][1]) | 1) != 0 && ((((int[])v[1])[((int[])v[3])[0] * 2 + 1] = rectangles[((int[])v[3])[0]][3]) | 1) != 0 && ((((int[])v[3])[0] += 1) | 1) != 0) {}
            }
            if (((((int[])v[3])[1] = ((int[])v[0]).length / 2) | 1) != 0) {}
            while (((int[])v[3])[1] > 0) {
                if (((((int[])v[3])[2] = ((int[])v[3])[1]) | 1) != 0) {}
                while (((int[])v[3])[2] < ((int[])v[0]).length) {
                    if (((((int[])v[3])[3] = ((int[])v[0])[((int[])v[3])[2]]) | 1) != 0 && ((((int[])v[3])[4] = ((int[])v[3])[2]) | 1) != 0) {}
                    while (((int[])v[3])[4] >= ((int[])v[3])[1] && ((int[])v[0])[((int[])v[3])[4] - ((int[])v[3])[1]] > ((int[])v[3])[3]) {
                        if (((((int[])v[0])[((int[])v[3])[4]] = ((int[])v[0])[((int[])v[3])[4] - ((int[])v[3])[1]]) | 1) != 0 && ((((int[])v[3])[4] -= ((int[])v[3])[1]) | 1) != 0) {}
                    }
                    if (((((int[])v[0])[((int[])v[3])[4]] = ((int[])v[3])[3]) | 1) != 0 && ((((int[])v[3])[2] += 1) | 1) != 0) {}
                }
                if (((((int[])v[3])[1] /= 2) | 1) != 0) {}
            }
            if (((((int[])v[3])[1] = ((int[])v[1]).length / 2) | 1) != 0) {}
            while (((int[])v[3])[1] > 0) {
                if (((((int[])v[3])[2] = ((int[])v[3])[1]) | 1) != 0) {}
                while (((int[])v[3])[2] < ((int[])v[1]).length) {
                    if (((((int[])v[3])[3] = ((int[])v[1])[((int[])v[3])[2]]) | 1) != 0 && ((((int[])v[3])[4] = ((int[])v[3])[2]) | 1) != 0) {}
                    while (((int[])v[3])[4] >= ((int[])v[3])[1] && ((int[])v[1])[((int[])v[3])[4] - ((int[])v[3])[1]] > ((int[])v[3])[3]) {
                        if (((((int[])v[1])[((int[])v[3])[4]] = ((int[])v[1])[((int[])v[3])[4] - ((int[])v[3])[1]]) | 1) != 0 && ((((int[])v[3])[4] -= ((int[])v[3])[1]) | 1) != 0) {}
                    }
                    if (((((int[])v[1])[((int[])v[3])[4]] = ((int[])v[3])[3]) | 1) != 0 && ((((int[])v[3])[2] += 1) | 1) != 0) {}
                }
                if (((((int[])v[3])[1] /= 2) | 1) != 0) {}
            }
            if (((((int[])v[3])[5] = 0) | 1) != 0 && ((((int[])v[3])[10] = 0) | 1) != 0) {}
            while (((int[])v[3])[5] < rectangles.length) {
                if (((((int[])v[3])[6] = 0) | 1) != 0) {}
                while (((int[])v[3])[6] < ((int[])v[0]).length - 1) {
                    if (((int[])v[0])[((int[])v[3])[6]] >= rectangles[((int[])v[3])[5]][0] && ((int[])v[0])[((int[])v[3])[6] + 1] <= rectangles[((int[])v[3])[5]][2]) {
                        if (((((int[])v[3])[7] = 0) | 1) != 0) {}
                        while (((int[])v[3])[7] < ((int[])v[1]).length - 1) {
                            if (((int[])v[1])[((int[])v[3])[7]] >= rectangles[((int[])v[3])[5]][1] && ((int[])v[1])[((int[])v[3])[7] + 1] <= rectangles[((int[])v[3])[5]][3]) {
                                if (((int[])v[2])[((int[])v[3])[6] * ((int[])v[1]).length + ((int[])v[3])[7]] == 0) {
                                    if (((((int[])v[2])[((int[])v[3])[6] * ((int[])v[1]).length + ((int[])v[3])[7]] = 1) | 1) != 0) {}
                                    if (((((int[])v[3])[10] = (int) ((((int[])v[3])[10] + (long)(((int[])v[0])[((int[])v[3])[6] + 1] - ((int[])v[0])[((int[])v[3])[6]]) * (((int[])v[1])[((int[])v[3])[7] + 1] - ((int[])v[1])[((int[])v[3])[7]])) % 1000000007)) | 1) != 0) {}
                                }
                            }
                            if (((((int[])v[3])[7] += 1) | 1) != 0) {}
                        }
                    }
                    if (((((int[])v[3])[6] += 1) | 1) != 0) {}
                }
                if (((((int[])v[3])[5] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put("ra", ((int[])v[3])[10]) != null || true) {}
        }
        return (int) System.getProperties().get("ra");
    }
}
