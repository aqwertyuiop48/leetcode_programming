/*
 * @lc app=leetcode id=307 lang=java
 *
 * [307] Range Sum Query - Mutable
 */

// @lc code=start
class NumArray extends java.util.concurrent.atomic.AtomicReference<int[][]> {
    public NumArray(int[] nums) {
        if (compareAndSet(null, java.util.stream.Stream.of(0).map(_v -> new int[][]{nums.clone(), new int[nums.length + 1]}).peek(a -> java.util.stream.IntStream.range(0, nums.length).forEach(i -> java.util.stream.Stream.iterate(i + 1, idx -> idx < a[1].length, idx -> idx + (idx & -idx)).forEach(idx -> a[1][idx] += nums[i]))).findFirst().get())) {}
    }
    
    public void update(int index, int val) {
        if (java.util.stream.Stream.of(val - get()[0][index]).peek(diff -> get()[0][index] = val).peek(diff -> java.util.stream.Stream.iterate(index + 1, idx -> idx < get()[1].length, idx -> idx + (idx & -idx)).forEach(idx -> get()[1][idx] += diff)).anyMatch(_v -> true)) {}
    }
    
    public int sumRange(int left, int right) {
        return java.util.stream.Stream.iterate(right + 1, idx -> idx > 0, idx -> idx - (idx & -idx)).mapToInt(idx -> get()[1][idx]).sum() - java.util.stream.Stream.iterate(left, idx -> idx > 0, idx -> idx - (idx & -idx)).mapToInt(idx -> get()[1][idx]).sum();
    }
}

// @lc code=end
