/*
 * @lc app=leetcode id=3695 lang=java
 *
 * [3695] Maximize Alternating Sum Using Swaps
 */

class Solution {
    public long maxAlternatingSum(int[] nums, int[][] swaps) {
        return Stream.<Object[]>of(new Object[]{IntStream.range(0, nums.length).toArray(), IntStream.range(0, nums.length).map(i -> 1).toArray(), (BiFunction<Object[], Integer, Integer>) (ctx, i) -> ((int[]) ((Object[]) ctx)[0])[i] == i ? i : (((int[]) ((Object[]) ctx)[0])[i] = ((BiFunction<Object[], Integer, Integer>) ((Object[]) ctx)[2]).apply(ctx, ((int[]) ((Object[]) ctx)[0])[i]))}).map(s -> Arrays.stream(swaps).allMatch(p -> Stream.of(new int[]{((BiFunction<Object[], Integer, Integer>) ((Object[]) s)[2]).apply(s, p[0]), ((BiFunction<Object[], Integer, Integer>) ((Object[]) s)[2]).apply(s, p[1])}).allMatch(r -> r[0] == r[1] || ((((int[]) ((Object[]) s)[1])[r[0]] < ((int[]) ((Object[]) s)[1])[r[1]]) ? (((int[]) ((Object[]) s)[0])[r[0]] = r[1]) >= 0 && (((int[]) ((Object[]) s)[1])[r[1]] += ((int[]) ((Object[]) s)[1])[r[0]]) >= 0 : (((int[]) ((Object[]) s)[0])[r[1]] = r[0]) >= 0 && (((int[]) ((Object[]) s)[1])[r[0]] += ((int[]) ((Object[]) s)[1])[r[1]]) >= 0))) ? IntStream.range(0, nums.length).boxed().collect(Collectors.groupingBy(i -> ((BiFunction<Object[], Integer, Integer>) ((Object[]) s)[2]).apply(s, i))).values().stream().mapToLong(indices -> Stream.<Object[]>of(new Object[]{indices.stream().filter(idx -> idx % 2 == 0).count(), indices.stream().map(idx -> nums[idx]).sorted(Comparator.reverseOrder()).collect(Collectors.toList())}).mapToLong(vars -> IntStream.range(0, ((List<Integer>) vars[1]).size()).mapToLong(i -> i < (long) vars[0] ? (long) ((List<Integer>) vars[1]).get(i) : -(long) ((List<Integer>) vars[1]).get(i)).sum()).findFirst().getAsLong()).sum() : 0L).findFirst().get();
    }
}
