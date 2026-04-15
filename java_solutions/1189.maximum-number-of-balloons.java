/*
 * @lc app=leetcode id=1189 lang=java
 *
 * [1189] Maximum Number of Balloons
 */

class Solution{public int maxNumberOfBalloons(String t){return(int)java.util.stream.Stream.of('b','a','l','o','n').mapToLong(c->t.chars().filter(x->x==c).count()/(c=='l'||c=='o'?2:1)).min().orElse(0);}}