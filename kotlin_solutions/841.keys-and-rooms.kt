/*
 * @lc app=leetcode id=841 lang=kotlin
 *
 * [841] Keys and Rooms
 */

class Solution { fun canVisitAllRooms(rooms: List<List<Int>>): Boolean = rooms.size.let { n -> BooleanArray(n) { false }.let { used -> DeepRecursiveFunction<Int, Unit> { room -> used[room].takeIf { !it }?.let { used[room] = true }?.let { _ -> rooms[room].forEach { next -> callRecursive(next) } } }.invoke(0).let { _ -> used.all { it } } } } }

