/*
 * @lc app=leetcode id=207 lang=java
 *
 * [207] Course Schedule
 */

// @lc code=start
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        return java.util.stream.Stream.<Object[]>of(new Object[]{(java.util.List<Integer>[]) new java.util.ArrayList[numCourses], new int[numCourses], new java.util.concurrent.atomic.AtomicReference<java.util.function.Function<Integer, Boolean>>()}).peek(a -> java.util.stream.IntStream.range(0, numCourses).forEach(i -> ((java.util.List<Integer>[]) a[0])[i] = new java.util.ArrayList<>())).peek(a -> java.util.Arrays.stream(prerequisites).forEach(p -> ((java.util.List<Integer>[]) a[0])[p[1]].add(p[0]))).peek(a -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Function<Integer, Boolean>>) a[2]).set(curr -> ((int[]) a[1])[curr] == 1 ? false : ((int[]) a[1])[curr] == 2 ? true : java.util.stream.Stream.of(curr).peek(c -> ((int[]) a[1])[c] = 1).map(c -> ((java.util.List<Integer>[]) a[0])[c].stream().allMatch(nxt -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Function<Integer, Boolean>>) a[2]).get().apply(nxt))).peek(res -> ((int[]) a[1])[curr] = res ? 2 : 1).findFirst().get())).map(a -> java.util.stream.IntStream.range(0, numCourses).allMatch(i -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.Function<Integer, Boolean>>) a[2]).get().apply(i))).findFirst().get();
    }
}
// @lc code=end

