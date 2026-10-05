/*
 * @lc app=leetcode id=3986 lang=java
 *
 * [3986] Number of Elapsed Seconds Between Two Times
 */

class Solution {
public int secondsBetweenTimes(String startTime, String endTime) {
    return Stream.of(endTime, startTime).mapToInt(x -> Arrays.stream(x.split(":")).mapToInt(Integer::parseInt).reduce(0, (a, b) -> a * 60 + b)).reduce((e, s) -> e - s).getAsInt();
}
}
