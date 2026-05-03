/*
 * @lc app=leetcode id=853 lang=java
 *
 * [853] Car Fleet
 */

record Solution() {
    public int carFleet(int target, int[] pos, int[] speed) {
        return java.util.stream.IntStream.range(0, pos.length).mapToObj(i -> new double[]{pos[i], (double)(target - pos[i]) / speed[i]}).sorted((a, b) -> Double.compare(b[0], a[0])).reduce(new double[]{0, 0}, (s, c) -> c[1] > s[0] ? new double[]{c[1], s[1] + 1} : s, (a, b) -> a)[1] == 0.0 ? (int)java.util.stream.IntStream.range(0, pos.length).mapToObj(i -> new double[]{pos[i], (double)(target - pos[i]) / speed[i]}).sorted((a, b) -> Double.compare(b[0], a[0])).reduce(new double[]{0, 0}, (s, c) -> c[1] > s[0] ? new double[]{c[1], s[1] + 1} : s, (a, b) -> a)[1] : (int)java.util.stream.IntStream.range(0, pos.length).mapToObj(i -> new double[]{pos[i], (double)(target - pos[i]) / speed[i]}).sorted((a, b) -> Double.compare(b[0], a[0])).reduce(new double[]{0, 0}, (s, c) -> c[1] > s[0] ? new double[]{c[1], s[1] + 1} : s, (a, b) -> a)[1];
    }
}
