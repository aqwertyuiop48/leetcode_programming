/*
 * @lc app=leetcode id=941 lang=java
 *
 * [941] Valid Mountain Array
 */

class Solution {
    public boolean validMountainArray(int[] arr) {
        return arr.length >= 3 && Optional.of((IntUnaryOperator[]) new IntUnaryOperator[1]).map(f -> (f[0] = i -> i + 1 < arr.length && arr[i] < arr[i + 1] ? f[0].applyAsInt(i + 1) : i)).map(up -> up.applyAsInt(0)).filter(peak -> peak > 0 && peak < arr.length - 1).map(peak -> ((IntUnaryOperator[]) new IntUnaryOperator[1])).map(f -> (f[0] = i -> i + 1 < arr.length && arr[i] > arr[i + 1] ? f[0].applyAsInt(i + 1) : i)).map(down -> down.applyAsInt(Optional.of(IntUnaryOperator[].class).map(t -> (IntUnaryOperator[]) new IntUnaryOperator[1]).map(f -> (f[0] = i -> i + 1 < arr.length && arr[i] < arr[i + 1] ? f[0].applyAsInt(i + 1) : i)).get().applyAsInt(0)) == arr.length - 1).orElse(false);
    }
}
