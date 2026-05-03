/*
 * @lc app=leetcode id=478 lang=java
 *
 * [478] Generate Random Point in a Circle
 */

record Solution(double r, double x, double y) {
    public double[] randPoint() {
        return java.util.Optional.of(Math.random() * 2 * Math.PI).map(theta -> java.util.Optional.of(Math.sqrt(Math.random()) * r).map(len -> new double[]{x + len * Math.cos(theta), y + len * Math.sin(theta)}).get()).get();
    }
}
