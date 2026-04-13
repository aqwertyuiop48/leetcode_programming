/*
 * @lc app=leetcode id=1610 lang=java
 *
 * [1610] Maximum Number of Visible Points
 */

class Solution {
    public int visiblePoints(List<List<Integer>> points, int angle, List<Integer> location) {
        return Arrays.stream(new int[][]{new int[]{0}}).peek(res -> {
            if (new int[]{0, 0, 0, 0, 0, 0} instanceof int[] v && new double[1][points.size()] instanceof double[][] ang) {
                while (v[0] < 4) {
                    if (v[0] == 0) {
                        if (v[1] < points.size()) {
                            if (points.get(v[1]).get(0).equals(location.get(0)) && points.get(v[1]).get(1).equals(location.get(1))) {
                                if (((v[2] += 1) | 1) != 0) {}
                            } else {
                                if (((ang[0][v[3]] = Math.toDegrees(Math.atan2(points.get(v[1]).get(1) - location.get(1), points.get(v[1]).get(0) - location.get(0))) < 0 ? Math.toDegrees(Math.atan2(points.get(v[1]).get(1) - location.get(1), points.get(v[1]).get(0) - location.get(0))) + 360 : Math.toDegrees(Math.atan2(points.get(v[1]).get(1) - location.get(1), points.get(v[1]).get(0) - location.get(0)))) != -100) && ((v[3] += 1) | 1) != 0) {}
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        } else {
                            if (((v[0] = 1) | 1) != 0) {}
                        }
                    } else if (v[0] == 1) {
                        if (((ang[0] = Arrays.stream(ang[0]).limit(v[3]).sorted().toArray()) != null) && ((v[4] = ang[0].length) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                            if (((ang[0] = Arrays.copyOf(ang[0], v[4] * 2)) != null)) {
                                while (v[1] < v[4]) {
                                    if (((ang[0][v[4] + v[1]] = ang[0][v[1]] + 360) != -100) && ((v[1] += 1) | 1) != 0) {}
                                }
                                if (((v[0] = 2) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[5] = 0) | 1) != 0) {}
                            }
                        }
                    } else if (v[0] == 2) {
                        if (v[1] < v[4]) {
                            while (v[5] < ang[0].length && ang[0][v[5]] - ang[0][v[1]] <= angle) {
                                if (((v[5] += 1) | 1) != 0) {}
                            }
                            if (((res[0] = Math.max(res[0], v[5] - v[1])) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                        } else {
                            if (((res[0] += v[2]) | 1) != 0 && ((v[0] = 10) | 1) != 0) {}
                        }
                    }
                }
            }
        }).findFirst().orElse(null)[0];
    }
}
