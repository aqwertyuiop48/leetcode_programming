/*
 * @lc app=leetcode id=64 lang=kotlin
 *
 * [64] Minimum Path Sum
 */

class Solution{fun minPathSum(grid:Array<IntArray>):Int=grid.run{IntArray(size*this[0].size){this[it/this[0].size][it%this[0].size]}.apply{(1 until this@run[0].size).forEach{j->this[j]+=this[j-1]}}.apply{(1 until this@run.size).forEach{i->this[i*this@run[0].size]+=this[(i-1)*this@run[0].size]}}.also{dp->(1 until this@run.size).forEach{i->(1 until this@run[0].size).forEach{j->dp[i*this@run[0].size+j]+=minOf(dp[(i-1)*this@run[0].size+j],dp[i*this@run[0].size+j-1])}}}[size*this[0].size-1]}}

