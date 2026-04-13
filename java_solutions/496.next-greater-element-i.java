/*
 * @lc app=leetcode id=496 lang=java
 *
 * [496] Next Greater Element I
 */

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        return(Arrays.stream(nums1)
    .map(x -> IntStream.range(Arrays.asList(Arrays.stream(nums2).boxed().toArray(Integer[]::new)).indexOf(x)+1, nums2.length)
                       .mapToObj(j -> nums2[j])
                       .filter(y -> y > x)
                       .findFirst()
                       .orElse(-1))
    .toArray());

    }
}
