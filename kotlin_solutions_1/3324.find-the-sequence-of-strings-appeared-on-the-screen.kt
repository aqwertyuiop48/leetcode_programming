/*
 * @lc app=leetcode id=3324 lang=java
 *
 * [3324] Find the Sequence of Strings Appeared on the Screen
 */
fun stringSequence(target: String): List<String> = mutableListOf<String>().also { ans -> target.indices.fold("") { cur, i -> (0..(target[i] - 'a')).forEach { j -> ans.add(cur + ('a' + j).toChar()) }.let { cur + target[i] } } }