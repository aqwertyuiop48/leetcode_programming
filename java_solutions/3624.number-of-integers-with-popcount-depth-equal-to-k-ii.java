/*
 * @lc app=leetcode id=3624 lang=java
 *
 * [3624] Number of Integers With Popcount-Depth Equal to K II
 */

class Solution {
    public int[] popcountDepth(long[] nums, long[][] queries) {
        return ((Function<Object[], int[]>) s -> 
            // 1. Recursive Popcount Depth (s[3])
            ((s[3] = (LongFunction<Integer>) x -> x == 1 ? 0 : 1 + ((LongFunction<Integer>)s[3]).apply(Long.bitCount(x))) != null) &&

            // 2. Recursive BIT Update (s[4]) - FIXED: No semicolons, direct casting
            ((s[4] = (Function<Object[], Boolean>) args -> 
                ((int)args[1] >= ((int[])args[0]).length) ? true : 
                ((((int[])args[0])[(int)args[1]] += (int)args[2]) > Integer.MIN_VALUE && 
                ((Function<Object[], Boolean>)s[4]).apply(new Object[]{
                    args[0], 
                    (int)args[1] + ((int)args[1] & -(int)args[1]), 
                    args[2]
                }))
            ) != null) &&

            // 3. Recursive BIT Query (s[5])
            ((s[5] = (BiFunction<int[], Integer, Integer>) (bit, i) -> 
                i <= 0 ? 0 : bit[i] + ((BiFunction<int[], Integer, Integer>)s[5]).apply(bit, i - (i & -i))
            ) != null) &&

            // 4. Initialize BITs
            IntStream.range(0, nums.length).allMatch(i -> 
                ((Function<Object[], Boolean>)s[4]).apply(new Object[]{ 
                    ((int[][])s[1])[((LongFunction<Integer>)s[3]).apply(nums[i])], i + 1, 1 
                })
            ) ?

            // 5. Process Queries
            java.util.Arrays.stream(queries).flatMapToInt(q -> 
                (q[0] == 1) 
                ? // Range Query: query(r+1) - query(l)
                  IntStream.of(
                      ((BiFunction<int[], Integer, Integer>)s[5]).apply(((int[][])s[1])[(int)q[3]], (int)q[2] + 1) - 
                      ((BiFunction<int[], Integer, Integer>)s[5]).apply(((int[][])s[1])[(int)q[3]], (int)q[1])
                  )
                : // Update Query
                  (
                      ((Function<Object[], Boolean>)s[4]).apply(new Object[]{ 
                          ((int[][])s[1])[((LongFunction<Integer>)s[3]).apply(nums[(int)q[1]])], (int)q[1] + 1, -1 
                      }) &&
                      ((nums[(int)q[1]] = q[2]) > -1 || true) &&
                      ((Function<Object[], Boolean>)s[4]).apply(new Object[]{ 
                          ((int[][])s[1])[((LongFunction<Integer>)s[3]).apply(nums[(int)q[1]])], (int)q[1] + 1, 1 
                      }) 
                      ? IntStream.empty() : IntStream.empty()
                  )
            ).toArray() 
            : new int[0]
        ).apply(new Object[]{
            nums,                          // s[0]
            new int[6][nums.length + 1],   // s[1]
            queries,                       // s[2]
            null, null, null               // s[3], s[4], s[5]
        });
    }
}
