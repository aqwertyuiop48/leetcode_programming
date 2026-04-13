/*
 * @lc app=leetcode id=3859 lang=java
 *
 * [3859] Count Subarrays With K Distinct Integers
 */

class Solution {
    public long countSubarrays(int[] nums, int k, int m) {
        return CompletableFuture.supplyAsync(() -> Optional.of(new int[3]).map(pointers -> Optional.of(new HashMap<Integer, Integer>()).map(countd -> Optional.of(new HashMap<Integer, Integer>()).map(countv -> Optional.of((Function<Void, Integer>[]) new Function[1]).map(dLoop -> Optional.of((Function<Void, Integer>[]) new Function[1]).map(vLoop -> Optional.of(dLoop[0] = v -> countd.size() > k ? Optional.ofNullable(countd.merge(nums[pointers[0]++], -1, (a, b) -> a + b == 0 ? null : a + b)).map(x -> 0).orElse(0) + dLoop[0].apply(null) : 0).map(dInit -> Optional.of(vLoop[0] = v -> pointers[2] >= k ? Optional.ofNullable(countv.merge(nums[pointers[1]++], -1, (a, b) -> a + b == 0 ? null : a + b)).map(nv -> nv == m - 1 ? pointers[2]-- : 0).orElseGet(() -> m == 1 ? pointers[2]-- : 0) * 0 + vLoop[0].apply(null) : 0).map(vInit -> IntStream.range(0, nums.length).mapToLong(right -> countd.merge(nums[right], 1, Integer::sum) * 0L + dLoop[0].apply(null) * 0L + (countv.merge(nums[right], 1, Integer::sum) == m ? pointers[2]++ : 0) * 0L + vLoop[0].apply(null) * 0L + (pointers[1] > pointers[0] ? pointers[1] - pointers[0] : 0L)).sum()).get()).get()).get()).get()).get()).get()).orElse(0L)).join();
    }
}
