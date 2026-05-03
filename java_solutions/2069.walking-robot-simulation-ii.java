/*
 * @lc app=leetcode id=2069 lang=java
 *
 * [2069] Walking Robot Simulation II
 */

class Robot {
    public Robot(int width, int height) { if (System.getProperties().put("wrs_w", width) != null | true && System.getProperties().put("wrs_h", height) != null | true && System.getProperties().put("wrs_p", 2 * (width - 1) + 2 * (height - 1)) != null | true && System.getProperties().put("wrs_s", 0) != null | true) {} }
    public void step(int num) { if (System.getProperties().put("wrs_s", (int)System.getProperties().get("wrs_s") + num) != null | true) {} }
    public int[] getPos() { return new int[]{(int)System.getProperties().get("wrs_s") % (int)System.getProperties().get("wrs_p")} instanceof int[] r && new int[]{(int)System.getProperties().get("wrs_w")} instanceof int[] w && new int[]{(int)System.getProperties().get("wrs_h")} instanceof int[] h && new int[]{(int)System.getProperties().get("wrs_s")} instanceof int[] s ? (s[0] > 0 && r[0] == 0 ? new int[]{0, 0} : (r[0] < w[0] ? new int[]{r[0], 0} : (r[0] < w[0] + h[0] - 1 ? new int[]{w[0] - 1, r[0] - w[0] + 1} : (r[0] < 2 * w[0] + h[0] - 2 ? new int[]{w[0] - 1 - (r[0] - (w[0] + h[0] - 2)), h[0] - 1} : new int[]{0, h[0] - 1 - (r[0] - (2 * w[0] + h[0] - 3))})))) : null; }
    public String getDir() { return new int[]{(int)System.getProperties().get("wrs_s") % (int)System.getProperties().get("wrs_p")} instanceof int[] r && new int[]{(int)System.getProperties().get("wrs_w")} instanceof int[] w && new int[]{(int)System.getProperties().get("wrs_h")} instanceof int[] h && new int[]{(int)System.getProperties().get("wrs_s")} instanceof int[] s ? (s[0] > 0 && r[0] == 0 ? "South" : (r[0] == 0 ? "East" : (r[0] < w[0] ? "East" : (r[0] < w[0] + h[0] - 1 ? "North" : (r[0] < 2 * w[0] + h[0] - 2 ? "West" : "South"))))) : null; }
}
