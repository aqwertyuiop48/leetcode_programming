/*
 * @lc app=leetcode id=1710 lang=java
 *
 * [1710] Maximum Units on a Truck
 */

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        return Arrays.stream(boxTypes)
            .sorted((a, b) -> b[1] - a[1])
            .reduce(new int[]{0, truckSize}, (acc, box) -> new int[]{
                acc[0] + Math.min(box[0], acc[1]) * box[1], 
                acc[1] - Math.min(box[0], acc[1])
            }, (a, b) -> a)[0];
    }
}
