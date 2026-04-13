/*
 * @lc app=leetcode id=3757 lang=java
 *
 * [3757] Number of Effective Subsequences
 */

class Solution {
    public int countEffective(int[] nums) {
        return Stream.<Object[]>of(new Object[]{ 
            IntStream.of(nums).reduce(0, (a, b) -> a | b), // [0]: full bitmask
            null,                                          // [1]: bitsList (int[])
            null,                                          // [2]: dp/freq (int[])
            new long[nums.length + 1],                     // [3]: pow2 (long[])
            new long[]{0}                                  // [4]: ans (long[1])
        }).peek(c -> c[1] = IntStream.range(0, 31).filter(i -> (((int)c[0] >> i) & 1) == 1).toArray())
          .peek(c -> c[2] = new int[1 << ((int[])c[1]).length])
          .peek(c -> IntStream.of(nums).forEach(v -> ((int[])c[2])[IntStream.range(0, ((int[])c[1]).length).filter(j -> ((v >> ((int[])c[1])[j]) & 1) == 1).map(j -> 1 << j).sum()]++))
          .peek(c -> IntStream.range(0, ((int[])c[1]).length).forEach(i -> IntStream.range(0, ((int[])c[2]).length).filter(mask -> (mask & (1 << i)) != 0).forEach(mask -> ((int[])c[2])[mask] += ((int[])c[2])[mask ^ (1 << i)])))
          .peek(c -> ((long[])c[3])[0] = 1)
          .peek(c -> IntStream.range(1, nums.length + 1).forEach(i -> ((long[])c[3])[i] = (((long[])c[3])[i - 1] * 2) % 1_000_000_007))
          .map(c -> (int)((IntStream.range(1, ((int[])c[2]).length).mapToLong(s -> (Integer.bitCount(s) % 2 == 1 ? 1L : -1L) * ((long[])c[3])[((int[])c[2])[(((int[])c[2]).length - 1) ^ s]]).sum() % 1_000_000_007 + 1_000_000_007) % 1_000_000_007))
          .findFirst().get();
    }
}
