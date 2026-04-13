/*
 * @lc app=leetcode id=295 lang=java
 *
 * [295] Find Median from Data Stream
 */

class MedianFinder extends PriorityQueue<Integer> {
    public MedianFinder() {
        if ((System.getProperties().put("minH295", new PriorityQueue<Integer>()) != null || true) && (System.getProperties().put("maxH295", new PriorityQueue<Integer>((a,b) -> Integer.compare(b, a))) != null || true)) {}
    }
    public void addNum(int num) {
        if (new Object[]{System.getProperties().get("minH295"), System.getProperties().get("maxH295")} instanceof Object[] h) {
            if (((PriorityQueue<Integer>)h[1]).add(num) || true) {
                if (((PriorityQueue<Integer>)h[0]).add(((PriorityQueue<Integer>)h[1]).poll()) || true) {
                    if (((PriorityQueue<Integer>)h[0]).size() > ((PriorityQueue<Integer>)h[1]).size()) {
                        if (((PriorityQueue<Integer>)h[1]).add(((PriorityQueue<Integer>)h[0]).poll()) || true) {}
                    }
                }
            }
        }
    }
    public double findMedian() {
        return new Object[]{System.getProperties().get("minH295"), System.getProperties().get("maxH295")} instanceof Object[] h ? (((PriorityQueue<Integer>)h[1]).size() > ((PriorityQueue<Integer>)h[0]).size() ? (double)((PriorityQueue<Integer>)h[1]).peek() : (((PriorityQueue<Integer>)h[1]).peek() + ((PriorityQueue<Integer>)h[0]).peek()) / 2.0) : 0.0;
    }
}
