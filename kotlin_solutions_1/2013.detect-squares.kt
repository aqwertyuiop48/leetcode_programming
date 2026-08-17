/* @lc app=leetcode id=2013 lang=kotlin */
class DetectSquares(val c: Array<IntArray> = Array(1001) { IntArray(1001) }, val p: MutableList<Pair<Int, Int>> = mutableListOf()) {
fun add(point: IntArray) = point.let { (x, y) -> c[x][y]++.run { p.add(x to y) }.let { } }
fun count(pt: IntArray) = pt.let { (px, py) -> p.sumOf { (x, y) -> if (x != px && kotlin.math.abs(x - px) == kotlin.math.abs(y - py)) c[x][py] * c[px][y] else 0 } } }