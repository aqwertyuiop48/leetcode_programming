/*
 * @lc app=leetcode id=1111 lang=kotlin
 *
 * [1111] Maximum Nesting Depth of Two Valid Parentheses Strings
 */

class Solution { fun maxDepthAfterSplit(seq: String): IntArray = IntArray(seq.length).also { arr -> seq.indices.fold(0) { d, i -> if (seq[i] == '(') (d + 1).also { arr[i] = it % 2 } else (d - 1).also { arr[i] = d % 2 } } } }