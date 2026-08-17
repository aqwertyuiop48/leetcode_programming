/*
 * @lc app=leetcode id=1717 lang=kotlin
 *
 * [1717] Maximum Score From Removing Substrings
 */

class Solution {
    fun maximumGain(s: String, x: Int, y: Int): Int = (if (x >= y) Triple('a', 'b', x) to Triple('b', 'a', y) else Triple('b', 'a', y) to Triple('a', 'b', x)).let { (p1, p2) -> StringBuilder().let { sb -> s.fold(0) { score, ch -> if (sb.isNotEmpty() && sb.last() == p1.first && ch == p1.second) sb.deleteAt(sb.length - 1).run { score + p1.third } else sb.append(ch).run { score } }.let { score1 -> sb.toString().let { rem -> StringBuilder().let { sb2 -> rem.fold(0) { score, ch -> if (sb2.isNotEmpty() && sb2.last() == p2.first && ch == p2.second) sb2.deleteAt(sb2.length - 1).run { score + p2.third } else sb2.append(ch).run { score } }.let { score2 -> score1 + score2 } } } } } }
}