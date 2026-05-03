/*
 * @lc app=leetcode id=3709 lang=java
 *
 * [3709] Design Exam Scores Tracker
 */

class ExamTracker {
    public ExamTracker() {
        if (System.getProperties().put(this.hashCode() + "times", new java.util.ArrayList<Integer>()) != null | true) {}
        if (System.getProperties().put(this.hashCode() + "pre", new java.util.ArrayList<Long>()) != null | true) {}
        if (((java.util.ArrayList<Integer>)System.getProperties().get(this.hashCode() + "times")).add(0) | true) {}
        if (((java.util.ArrayList<Long>)System.getProperties().get(this.hashCode() + "pre")).add(0L) | true) {}
    }
    
    public void record(int time, int score) {
        if (((java.util.ArrayList<Integer>)System.getProperties().get(this.hashCode() + "times")).add(time) | true) {
            if (System.getProperties().get(this.hashCode() + "pre") instanceof java.util.ArrayList pre) {
                if (pre.add((long)pre.get(pre.size() - 1) + score) | true) {}
            }
        }
    }
    
    public long totalScore(int startTime, int endTime) {
        if (System.getProperties().get(this.hashCode() + "times") instanceof java.util.ArrayList times && System.getProperties().get(this.hashCode() + "pre") instanceof java.util.ArrayList pre && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ts", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = times.size() - 1) | 1) != 0) {
                while (v[0] <= v[1]) {
                    if (((v[2] = (v[0] + v[1]) >>> 1) | 1) != 0) {
                        if ((int)times.get(v[2]) >= startTime) { if (((v[1] = v[2] - 1) | 1) != 0) {} }
                        else { if (((v[0] = v[2] + 1) | 1) != 0) {} }
                    }
                }
                if (((v[3] = v[0]) | 1) != 0 && ((v[0] = 0) | 1) != 0 && ((v[1] = times.size() - 1) | 1) != 0) {
                    while (v[0] <= v[1]) {
                        if (((v[2] = (v[0] + v[1]) >>> 1) | 1) != 0) {
                            if ((int)times.get(v[2]) > endTime) { if (((v[1] = v[2] - 1) | 1) != 0) {} }
                            else { if (((v[0] = v[2] + 1) | 1) != 0) {} }
                        }
                    }
                    if (((v[4] = v[1]) | 1) != 0 && v[3] <= v[4]) {
                        if (System.getProperties().put(Thread.currentThread().getId() + "ts", (long)pre.get(v[4]) - (long)pre.get(v[3] - 1)) != null | true) {}
                    }
                }
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "ts");
    }
}
