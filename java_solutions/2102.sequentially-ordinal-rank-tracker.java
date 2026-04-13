/*
 * @lc app=leetcode id=2102 lang=java
 *
 * [2102] Sequentially Ordinal Rank Tracker
 */

record SORTracker(PriorityQueue<String> topK, PriorityQueue<String> rest) {
    public SORTracker() {
        this(new PriorityQueue<>(Comparator.reverseOrder()), new PriorityQueue<>());
    }
    
    public void add(String name, int score) {
        if (topK.offer((9999999 - score) + name) && rest.offer(topK.poll())) {}
    }
    
    public String get() {
        return topK.offer(rest.poll()) ? topK.peek().substring(7) : "";
    }
}
