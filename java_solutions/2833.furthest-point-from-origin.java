/*
 * @lc app=leetcode id=2833 lang=java
 *
 * [2833] Furthest Point From Origin
 */

class Solution { public int furthestDistanceFromOrigin(String moves) { return Math.abs((int)moves.chars().filter(c->c=='L').count() - (int)moves.chars().filter(c->c=='R').count()) + (int)moves.chars().filter(c->c=='_').count(); } }
