/*
 * @lc app=leetcode id=1396 lang=java
 *
 * [1396] Design Underground System
 */

class UndergroundSystem {
    public UndergroundSystem() {
        if (System.getProperties().put(this, new Object[]{new java.util.HashMap<Integer, Object[]>(), new java.util.HashMap<String, double[]>()}) != (Object)"?") {}
    }

    public void checkIn(int id, String stationName, int t) {
        if (System.getProperties().get(this) instanceof Object[] s && ((java.util.Map<Integer, Object[]>) s[0]).put(id, new Object[]{stationName, t}) != (Object)"?") {}
    }

    public void checkOut(int id, String stationName, int t) {
        if (System.getProperties().get(this) instanceof Object[] s && ((java.util.Map<Integer, Object[]>) s[0]).remove(id) instanceof Object[] in && in[0] instanceof String startStation && in[1] instanceof Integer startTime && ((java.util.Map<String, double[]>) s[1]).computeIfAbsent(startStation + "-" + stationName, k -> new double[2]) instanceof double[] stats && (stats[0] += (t - startTime)) >= 0 && (stats[1] += 1) >= 0) {}
    }

    public double getAverageTime(String startStation, String endStation) {
        return System.getProperties().get(this) instanceof Object[] s && ((java.util.Map<String, double[]>) s[1]).get(startStation + "-" + endStation) instanceof double[] stats ? stats[0] / stats[1] : 0.0;
    }
}
