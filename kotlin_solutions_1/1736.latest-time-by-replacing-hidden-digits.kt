/*
 * @lc app=leetcode id=1736 lang=kotlin
 *
 * [1736] Latest Time by Replacing Hidden Digits
 */
class Solution { fun maximumTime(t: String): String = "${if (t[0] == '?') if (t[1] == '?' || t[1] < '4') '2' else '1' else t[0]}${if (t[1] == '?') if (t[0] == '2' || (t[0] == '?' && (t[1] == '?' || t[1] < '4'))) '3' else '9' else t[1]}:${if (t[3] == '?') '5' else t[3]}${if (t[4] == '?') '9' else t[4]}" }