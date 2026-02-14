/*
 * @lc app=leetcode id=649 lang=kotlin
 *
 * [649] Dota2 Senate
 */

class Solution {fun predictPartyVictory(senate: String): String = generateSequence(senate to (0 to 0)) { (s, ban) -> s.fold(StringBuilder() to ban) { (ns, b), c -> if (c == 'R') (if (b.second > 0) ns to (b.first to b.second - 1) else ns.append(c) to (b.first + 1 to b.second)) else (if (b.first > 0) ns to (b.first - 1 to b.second) else ns.append(c) to (b.first to b.second + 1)) }.let { it.first.toString() to it.second } }.first { it.first.all { c -> c == it.first[0] } }.first.let { if (it[0] == 'R') "Radiant" else "Dire" }}

