/*
 * @lc app=leetcode id=331 lang=kotlin
 *
 * [331] Verify Preorder Serialization of a Binary Tree
 */

class Solution {fun isValidSerialization(preorder: String) = preorder.split(",").fold(1 to true) { (slots, valid), str -> if (!valid || slots <= 0) (slots to false) else ((slots - 1 + if (str != "#") 2 else 0) to true) }.let { (slots, valid) -> valid && slots == 0 }}

