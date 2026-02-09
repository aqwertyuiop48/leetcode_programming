/*
 * @lc app=leetcode id=63 lang=kotlin
 *
 * [63] Unique Paths II
 */

class Solution{fun uniquePathsWithObstacles(obstacleGrid:Array<IntArray>):Int=obstacleGrid.run{if(this[0][0]==1)0 else IntArray(size*this[0].size).apply{this[0]=1}.also{dp->(0 until size).forEach{i->(0 until this[0].size).forEach{j->if(this[i][j]==1)dp[i*this[0].size+j]=0 else if(i>0||j>0)dp[i*this[0].size+j]=(if(i>0)dp[(i-1)*this[0].size+j]else 0)+(if(j>0)dp[i*this[0].size+j-1]else 0)}}}[size*this[0].size-1]}}

