/*
 * @lc app=leetcode id=1845 lang=kotlin
 *
 * [1845] Seat Reservation Manager
 */
class SeatManager(n: Int) {
    val pq = java.util.PriorityQueue((1..n).toList())
    fun reserve(): Int = pq.poll()
    fun unreserve(seatNumber: Int) = pq.add(seatNumber).let {}
}