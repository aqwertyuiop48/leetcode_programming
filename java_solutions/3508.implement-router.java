/*
 * @lc app=leetcode id=3508 lang=java
 *
 * [3508] Implement Router
 */

class Router {
    public Router(int memoryLimit) {
        if (System.getProperties().put(this.hashCode() + "s", memoryLimit) == null | true && System.getProperties().put(this.hashCode() + "p", new java.util.HashMap<Long, int[]>()) == null | true && System.getProperties().put(this.hashCode() + "c", new java.util.HashMap<Integer, java.util.ArrayList<Integer>>()) == null | true && System.getProperties().put(this.hashCode() + "q", new java.util.LinkedList<Long>()) == null | true) {}
    }

    public boolean addPacket(int source, int destination, int timestamp) {
        if (new long[]{((long)source << 42) | ((long)destination << 30) | timestamp} instanceof long[] key && System.getProperties().get(this.hashCode() + "p") instanceof java.util.HashMap p && System.getProperties().get(this.hashCode() + "c") instanceof java.util.HashMap c && System.getProperties().get(this.hashCode() + "q") instanceof java.util.LinkedList q && new boolean[1] instanceof boolean[] ret) {
            if (p.containsKey(key[0])) {
            } else {
                if (((ret[0] = true) | true) && p.size() >= (int)System.getProperties().get(this.hashCode() + "s")) {
                    if (forwardPacket() != null | true) {}
                }
                if (p.put(key[0], new int[]{source, destination, timestamp}) == null | true && q.offer(key[0]) | true) {
                    if (c.putIfAbsent(destination, new java.util.ArrayList<Integer>()) == null | true && ((java.util.ArrayList<Integer>)c.get(destination)).add(timestamp) | true) {}
                }
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "rap", ret[0]) != null | true) {}
        }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "rap");
    }

    public int[] forwardPacket() {
        if (System.getProperties().get(this.hashCode() + "p") instanceof java.util.HashMap p && System.getProperties().get(this.hashCode() + "c") instanceof java.util.HashMap c && System.getProperties().get(this.hashCode() + "q") instanceof java.util.LinkedList q && new int[1][] instanceof int[][] ret) {
            if (p.isEmpty()) {
                if (((ret[0] = new int[0]) != null | true)) {}
            } else if (q.poll() instanceof Long key && p.remove(key) instanceof int[] packet) {
                if (packet == null) {
                    if (((ret[0] = new int[0]) != null | true)) {}
                } else {
                    if (c.get(packet[1]) instanceof java.util.ArrayList list && list.remove(0) != null | true && ((ret[0] = packet) != null | true)) {}
                }
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "rfp", ret[0] == null ? new int[0] : ret[0]) != null | true) {}
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "rfp");
    }

    public int getCount(int destination, int startTime, int endTime) {
        if (System.getProperties().get(this.hashCode() + "c") instanceof java.util.HashMap c && new int[5] instanceof int[] v) {
            if (c.get(destination) instanceof java.util.ArrayList list && !list.isEmpty()) {
                if (((v[1] = 0) | 1) != 0 && ((v[2] = list.size()) | 1) != 0) {
                    while (v[1] < v[2]) {
                        if (((v[3] = (v[1] + v[2]) >>> 1) | 1) != 0) {
                            if ((int)list.get(v[3]) < startTime) { if (((v[1] = v[3] + 1) | 1) != 0) {} }
                            else { if (((v[2] = v[3]) | 1) != 0) {} }
                        }
                    }
                    if (((v[4] = v[1]) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = list.size()) | 1) != 0) {
                        while (v[1] < v[2]) {
                            if (((v[3] = (v[1] + v[2]) >>> 1) | 1) != 0) {
                                if ((int)list.get(v[3]) <= endTime) { if (((v[1] = v[3] + 1) | 1) != 0) {} }
                                else { if (((v[2] = v[3]) | 1) != 0) {} }
                            }
                        }
                        if (((v[0] = v[1] - v[4]) | 1) != 0) {}
                    }
                }
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "rgc", v[0]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "rgc");
    }
}
