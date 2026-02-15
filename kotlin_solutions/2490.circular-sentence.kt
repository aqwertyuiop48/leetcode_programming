/*
 * @lc app=leetcode id=2490 lang=kotlin
 *
 * [2490] Circular Sentence
 */

class Solution {fun isCircularSentence(sentence: String) = sentence.split(" ").let { it.zipWithNext().all { (a, b) -> a.last() == b.first() } && it.first().first() == it.last().last() }}

