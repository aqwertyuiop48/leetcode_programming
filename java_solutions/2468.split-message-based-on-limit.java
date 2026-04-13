/*
 * @lc app=leetcode id=2468 lang=java
 *
 * [2468] Split Message Based on Limit
 */

class Solution { public String[] splitMessage(String message, int limit) { return ((Function<int[], String[]>) sum -> IntStream.rangeClosed(1, message.length()).filter(seg -> (sum[0] += (seg + "").length()) > 0 && limit > 3 + (seg + "").length() * 2 && seg * limit - seg * (3 + (seg + "").length()) - sum[0] >= message.length()).mapToObj(seg -> ((Function<int[], String[]>) idx -> IntStream.rangeClosed(1, seg).mapToObj(i -> ((Function<Integer, String>) end -> message.substring(idx[0], (idx[0] = end)) + "<" + i + "/" + seg + ">").apply(Math.min(message.length(), idx[0] + limit - (3 + (i + "").length() + (seg + "").length())))).toArray(String[]::new)).apply(new int[1])).findFirst().orElse(new String[0])).apply(new int[1]); } }
