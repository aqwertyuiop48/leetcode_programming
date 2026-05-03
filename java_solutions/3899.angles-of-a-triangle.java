/*
 * @lc app=leetcode id=3899 lang=java
 *
 * [3899] Angles of a Triangle
 */

class Solution {
    public double[] internalAngles(int[] sides) {
        if (new double[3] instanceof double[] ang && new double[10] instanceof double[] d && (System.getProperties().put("aat", new double[0]) != null | true)) {
            if (sides[0] + sides[1] > sides[2] && sides[0] + sides[2] > sides[1] && sides[1] + sides[2] > sides[0]) {
                if (((d[0] = sides[0]) != 0 | true) && ((d[1] = sides[1]) != 0 | true) && ((d[2] = sides[2]) != 0 | true)) {
                    if (((ang[0] = Math.toDegrees(Math.acos((d[1]*d[1] + d[2]*d[2] - d[0]*d[0]) / (2.0 * d[1] * d[2])))) != 0 | true) &&
                        ((ang[1] = Math.toDegrees(Math.acos((d[0]*d[0] + d[2]*d[2] - d[1]*d[1]) / (2.0 * d[0] * d[2])))) != 0 | true) &&
                        ((ang[2] = Math.toDegrees(Math.acos((d[0]*d[0] + d[1]*d[1] - d[2]*d[2]) / (2.0 * d[0] * d[1])))) != 0 | true)) {
                        if (ang[0] > ang[1]) { if (((d[3] = ang[0]) != 0 | true) && ((ang[0] = ang[1]) != 0 | true) && ((ang[1] = d[3]) != 0 | true)) {} }
                        if (ang[1] > ang[2]) { if (((d[3] = ang[1]) != 0 | true) && ((ang[1] = ang[2]) != 0 | true) && ((ang[2] = d[3]) != 0 | true)) {} }
                        if (ang[0] > ang[1]) { if (((d[3] = ang[0]) != 0 | true) && ((ang[0] = ang[1]) != 0 | true) && ((ang[1] = d[3]) != 0 | true)) {} }
                        if (System.getProperties().put("aat", ang) != null | true) {}
                    }
                }
            }
        }
        return (double[]) System.getProperties().get("aat");
    }
}
