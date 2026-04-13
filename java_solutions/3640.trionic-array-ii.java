/*
 * @lc app=leetcode id=3640 lang=java
 *
 * [3640] Trionic Array II
 */

class Solution {
    public long maxSumTrionic(int[] nums) {
        return Stream.of(new Object[][]{ { (long)-1e16, 1, 0, 0, 0L, 0, 0L, 0L, 0L, 0L } }) 
            // State: 0:res, 1:i, 2:a, 3:b, 4:net, 5:c, 6:lx, 7:rx, 8:left, 9:right
            .peek(s -> 
                IntStream.iterate(1, i -> (int)s[1] < nums.length - 2, i -> (int)s[1]) // Outer Loop condition
                    // Reset per-iteration variables
                    .filter(i -> (s[2] = s[1]) != null && (s[3] = s[1]) != null) // a=i, b=i
                    .filter(i -> (s[4] = (long)nums[(int)s[1]]) != null) // net=nums[i]
                    .filter(i -> (s[6] = (long)Integer.MIN_VALUE) != null && (s[7] = (long)Integer.MIN_VALUE) != null) // lx, rx reset
                    .filter(i -> (s[8] = 0L) != null && (s[9] = 0L) != null) // left, right reset
                    .peek(i -> {
                        if (
                            // LOGIC CHAIN
                            (
                                // 1. Decreasing Window: while(b+1<n && nums[b+1] < nums[b])
                                (IntStream.iterate(0, x -> (int)s[3] + 1 < nums.length && nums[(int)s[3] + 1] < nums[(int)s[3]], x -> x + 1)
                                    .peek(x -> s[4] = (long)s[4] + nums[(int)(s[3] = (int)s[3] + 1)])
                                    .count() >= 0) &&
                                
                                // Check: if(b==a) continue (We use negative logic: logic continues only if b != a)
                                ((int)s[3] != (int)s[2]) &&
                                
                                // Store c = b
                                ((s[5] = s[3]) != null) &&

                                // 2. Left Increasing Window: while(a-1>=0 && nums[a-1] < nums[a])
                                (IntStream.iterate(0, x -> (int)s[2] - 1 >= 0 && nums[(int)s[2] - 1] < nums[(int)s[2]], x -> x + 1)
                                    .peek(x -> s[6] = Math.max((long)s[6], (long)(s[8] = (long)s[8] + nums[(int)(s[2] = (int)s[2] - 1)])))
                                    .count() >= 0) &&

                                // Check: if(a==i) continue
                                ((int)s[2] != (int)s[1]) &&

                                // 3. Right Increasing Window: while(b+1<n && nums[b+1] > nums[b])
                                (IntStream.iterate(0, x -> (int)s[3] + 1 < nums.length && nums[(int)s[3] + 1] > nums[(int)s[3]], x -> x + 1)
                                    .peek(x -> s[7] = Math.max((long)s[7], (long)(s[9] = (long)s[9] + nums[(int)(s[3] = (int)s[3] + 1)])))
                                    .count() >= 0) &&

                                // Check: if(b==c) continue
                                ((int)s[3] != (int)s[5]) &&

                                // Valid Trionic Found: Update i = b - 1 and Update Result
                                ((s[1] = (int)s[3] - 1) != null) &&
                                ((s[0] = Math.max((long)s[0], (long)s[6] + (long)s[7] + (long)s[4])) != null)
                            ) 
                            // LOOP INCREMENT (Always executes because the previous block is OR'd or simply chained here)
                            // We attach it with || so it runs regardless of previous success/failure if arranged correctly, 
                            // OR simply place it in a way that side-effects occur.
                            // Better approach: wrap the logic above in a block that *always* returns false (or true), 
                            // then OR it with the increment.
                            || ((s[1] = (int)s[1] + 1) == null) 
                        ) {} 
                    })
                    .allMatch(i -> true) // Keep outer loop running
            )
            .map(s -> (long)s[0])
            .findFirst()
            .get();
    }
}
