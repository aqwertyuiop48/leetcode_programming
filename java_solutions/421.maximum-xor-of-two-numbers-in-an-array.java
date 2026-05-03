/*
 * @lc app=leetcode id=421 lang=java
 *
 * [421] Maximum XOR of Two Numbers in an Array
 */

record Solution() {
    public int findMaximumXOR(int[] nums) {
        return java.util.stream.IntStream.iterate(31, i -> i >= 0, i -> i - 1).boxed().reduce(new int[]{0, 0}, (s, i) -> java.util.Optional.of(s[0] | (1 << i)).map(mask -> new int[]{mask, java.util.Optional.of(java.util.Arrays.stream(nums).map(n -> n & mask).boxed().collect(java.util.stream.Collectors.toSet())).map(set -> set.stream().anyMatch(prefix -> set.contains(prefix ^ (s[1] | (1 << i)))) ? s[1] | (1 << i) : s[1]).get()}).get(), (a, b) -> a)[1];
    }
}
