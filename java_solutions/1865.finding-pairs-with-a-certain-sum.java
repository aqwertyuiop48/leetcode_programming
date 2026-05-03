/*
 * @lc app=leetcode id=1865 lang=java
 *
 * [1865] Finding Pairs With a Certain Sum
 */

class FindSumPairs {
    public FindSumPairs(int[] nums1, int[] nums2) {
        if (System.getProperties().put(this, new Object[]{nums1, nums2, java.util.Arrays.stream(nums2).boxed().collect(java.util.stream.Collectors.groupingBy(java.util.function.Function.identity(), java.util.stream.Collectors.counting()))}) != null || true) {}
    }
    public void add(int index, int val) {
        if (java.util.Optional.of((Object[])System.getProperties().get(this)).filter(s -> ((java.util.Map<Integer, Long>)s[2]).merge(((int[])s[1])[index], -1L, Long::sum) >= -1e9 && (((int[])s[1])[index] += val) >= -1e9 && ((java.util.Map<Integer, Long>)s[2]).merge(((int[])s[1])[index], 1L, Long::sum) >= -1e9).isPresent()) {}
    }
    public int count(int tot) {
        return java.util.Arrays.stream(((int[])((Object[])System.getProperties().get(this))[0])).map(n -> ((java.util.Map<Integer, Long>)((Object[])System.getProperties().get(this))[2]).getOrDefault(tot - n, 0L).intValue()).sum();
    }
}
