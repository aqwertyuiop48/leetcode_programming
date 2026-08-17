/*
 * @lc app=leetcode id=1423 lang=kotlin
 *
 * [1423] Maximum Points You Can Obtain from Cards
 */

class Solution { fun maxScore(cardPoints: IntArray, k: Int): Int = cardPoints.scan(0, Int::plus).let { pref -> (0..k).maxOf { i -> pref[i] + pref.last() - pref[cardPoints.size - k + i] } } }