/*
 * @lc app=leetcode id=1720 lang=java
 *
 * [1720] Decode XORed Array
 */

class Solution {
    public int[] decode(int[] encoded, int first) {
        return Stream.iterate(new int[]{first, 0}, a -> new int[]{a[0] ^ encoded[a[1]], a[1] + 1})
            .limit(encoded.length + 1)
            .mapToInt(a -> a[0])
            .toArray();
    }
}
