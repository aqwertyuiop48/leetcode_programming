/*
 * @lc app=leetcode id=2600 lang=kotlin
 *
 * [2600] K Items With the Maximum Sum
 */

class Solution {fun kItemsWithMaximumSum(numOnes: Int, numZeros: Int, numNegOnes: Int, k: Int) = if (k <= numOnes) k else if (k <= numOnes + numZeros) numOnes else numOnes - minOf(k - numOnes - numZeros, numNegOnes)}
