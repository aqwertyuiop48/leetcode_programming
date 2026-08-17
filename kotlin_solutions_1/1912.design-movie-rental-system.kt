/* @lc app=leetcode id=1912 lang=kotlin */
class MovieRentingSystem(n: Int, entries: Array<IntArray>) {
val p = mutableMapOf<String, Int>().apply { entries.forEach { put("${it[0]}#${it[1]}", it[2]) } }
val a = mutableMapOf<Int, java.util.TreeSet<IntArray>>().apply { entries.forEach { computeIfAbsent(it[1]) { java.util.TreeSet { x, y -> if (x[0] != y[0]) x[0].compareTo(y[0]) else x[1].compareTo(y[1]) } }.add(intArrayOf(it[2], it[0])) } }
val r = java.util.TreeSet<IntArray> { x, y -> if (x[0] != y[0]) x[0].compareTo(y[0]) else if (x[1] != y[1]) x[1].compareTo(y[1]) else x[2].compareTo(y[2]) }
fun search(m: Int) = a[m]?.take(5)?.map { it[1] } ?: emptyList()
fun rent(s: Int, m: Int) = p["$s#$m"]?.let { pr -> a[m]?.removeIf { it[0] == pr && it[1] == s }.also { r.add(intArrayOf(pr, s, m)) } }
fun drop(s: Int, m: Int) = p["$s#$m"]?.let { pr -> r.removeIf { it[0] == pr && it[1] == s && it[2] == m }.also { a.computeIfAbsent(m) { java.util.TreeSet { x, y -> if (x[0] != y[0]) x[0].compareTo(y[0]) else x[1].compareTo(y[1]) } }.add(intArrayOf(pr, s)) } }
fun report() = r.take(5).map { listOf(it[1], it[2]) } }