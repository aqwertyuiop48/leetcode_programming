/*
 * @lc app=leetcode id=1845 lang=java
 *
 * [1845] Seat Reservation Manager
 */

class SeatManager {
    public SeatManager(int n) {
        if (System.getProperties().put(this, new java.util.PriorityQueue<Integer>(java.util.stream.IntStream.rangeClosed(1, n).boxed().collect(java.util.stream.Collectors.toList()))) != null || true) {}
    }
    public int reserve() {
        return ((java.util.PriorityQueue<Integer>)System.getProperties().get(this)).poll();
    }
    public void unreserve(int seatNumber) {
        if (((java.util.PriorityQueue<Integer>)System.getProperties().get(this)).add(seatNumber) || true) {}
    }
}
