/* @lc app=leetcode id=1146 lang=kotlin */ 


class SnapshotArray(l: Int, val d: Pair<Array<java.util.TreeMap<Int, Int>>, IntArray> = Array(l) { java.util.TreeMap<Int, Int>().apply { put(0, 0) } } to intArrayOf(0), val set: (Int, Int) -> Unit = { i, v -> d.first[i].put(d.second[0], v) }, val snap: () -> Int = { d.second[0]++ }, val get: (Int, Int) -> Int = { i, id -> d.first[i].floorEntry(id).value })