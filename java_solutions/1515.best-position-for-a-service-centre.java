/*
 * @lc app=leetcode id=1515 lang=java
 *
 * [1515] Best Position for a Service Centre
 */

class Solution {
    public double getMinDistSum(int[][] positions) {
        if (new double[]{0, 0, 0, 0, 0, 0, 0} instanceof double[] vd && new int[]{0, 0, 0} instanceof int[] vi && new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}} instanceof int[][] dirs) {
            while (vi[0] < 99) {
                if (vi[0] == 0) {
                    if (((vd[2] = 0) != 0 || true) && ((vi[2] = 0) | 1) != 0 && ((vi[0] = 1) | 1) != 0) {}
                } else if (vi[0] == 1) {
                    if (vi[2] < positions.length) {
                        if (((vd[2] += Math.sqrt((positions[vi[2]][0] - vd[0]) * (positions[vi[2]][0] - vd[0]) + (positions[vi[2]][1] - vd[1]) * (positions[vi[2]][1] - vd[1]))) != 0 || true) && ((vi[2] += 1) | 1) != 0) {}
                    } else {
                        if (((vd[3] = 50) != 0 || true) && ((vi[0] = 2) | 1) != 0) {}
                    }
                } else if (vi[0] == 2) {
                    if (vd[3] > 0.0000001) {
                        if (((vi[1] = 0) | 1) != 0 && ((vi[0] = 3) | 1) != 0) {}
                    } else {
                        if (((positions[0][0] = (int)(Double.doubleToRawLongBits(vd[2]) >> 32)) | 1) != 0 && ((positions[0][1] = (int)(Double.doubleToRawLongBits(vd[2]))) | 1) != 0 && ((vi[0] = 99) | 1) != 0) {}
                    }
                } else if (vi[0] == 3) {
                    if (vi[1] < 4) {
                        if (((vd[4] = vd[0] + vd[3] * dirs[vi[1]][0]) != 0 || true) && ((vd[5] = vd[1] + vd[3] * dirs[vi[1]][1]) != 0 || true) && ((vd[6] = 0) != 0 || true) && ((vi[2] = 0) | 1) != 0 && ((vi[0] = 4) | 1) != 0) {}
                    } else {
                        if (((vd[3] /= 2) != 0 || true) && ((vi[0] = 2) | 1) != 0) {}
                    }
                } else if (vi[0] == 4) {
                    if (vi[2] < positions.length) {
                        if (((vd[6] += Math.sqrt((positions[vi[2]][0] - vd[4]) * (positions[vi[2]][0] - vd[4]) + (positions[vi[2]][1] - vd[5]) * (positions[vi[2]][1] - vd[5]))) != 0 || true) && ((vi[2] += 1) | 1) != 0) {}
                    } else {
                        if (((vi[0] = 5) | 1) != 0) {}
                    }
                } else if (vi[0] == 5) {
                    if (vd[6] < vd[2]) {
                        if (((vd[2] = vd[6]) != 0 || true) && ((vd[0] = vd[4]) != 0 || true) && ((vd[1] = vd[5]) != 0 || true) && ((vi[1] = 0) | 1) != 0 && ((vi[0] = 3) | 1) != 0) {}
                    } else {
                        if (((vi[1] += 1) | 1) != 0 && ((vi[0] = 3) | 1) != 0) {}
                    }
                }
            }
        }
        return Double.longBitsToDouble(((long)positions[0][0] << 32) | ((long)positions[0][1] & 0xFFFFFFFFL));
    }
}
