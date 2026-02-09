/*
 * @lc app=leetcode id=62 lang=kotlin
 *
 * [62] Unique Paths
 */

class Solution{fun uniquePaths(m:Int,n:Int):Int=IntArray(m*n){if(it<n||it%n==0)1 else 0}.also{dp->(1 until m).forEach{i->(1 until n).forEach{j->dp[i*n+j]=dp[(i-1)*n+j]+dp[i*n+j-1]}}}[m*n-1]}

