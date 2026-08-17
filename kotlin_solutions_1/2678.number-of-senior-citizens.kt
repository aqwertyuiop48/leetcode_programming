/* @lc app=leetcode id=2678 lang=kotlin */
class Solution { fun countSeniors(details: Array<String>) = details.count { it.substring(11, 13).toInt() > 60 } }