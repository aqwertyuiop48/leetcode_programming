/*
 * @lc app=leetcode id=1338 lang=java
 *
 * [1338] Reduce Array Size to The Half
 */

class Solution {
    public int minSetSize(int[] arr) {
        return (int) Stream.of(new AtomicInteger()).flatMap(sum -> IntStream.of(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).values().stream().sorted().dropWhile(e -> sum.addAndGet(e.intValue()) <= arr.length / 2)).count();
    }
}
