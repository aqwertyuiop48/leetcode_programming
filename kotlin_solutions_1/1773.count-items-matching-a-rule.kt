/*
 * @lc app=leetcode id=1773 lang=kotlin
 *
 * [1773] Count Items Matching a Rule
 */
class Solution { fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int = ruleKey.let { key -> if (key == "type") 0 else if (key == "color") 1 else 2 }.let { idx -> items.count { it[idx] == ruleValue } } }