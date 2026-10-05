/*
 * @lc app=leetcode id=4037 lang=java
 *
 * [4037] Maximum Valid Split Positions II
 */

class Solution {
    public int maxValidSplits(int[] nums) {
        return Optional.<IntBinaryOperator>of((x, y) -> Stream.iterate(new int[]{x, y}, p -> new int[]{p[1], p[0] % p[1]})
                .dropWhile(p -> p[1] != 0).findFirst().get()[0])
            .map(gcd -> Optional.<UnaryOperator<int[]>>of(arr -> Optional.of(new int[1])
                    .map(acc -> Arrays.stream(arr).map(v -> acc[0] = gcd.applyAsInt(acc[0], v)).toArray()).get())
                .map(pg -> Optional.<UnaryOperator<int[]>>of(arr -> IntStream.range(0, arr.length).map(i -> arr[arr.length - 1 - i]).toArray())
                    .map(rev -> Optional.<IntUnaryOperator>of(skip -> Optional.of(IntStream.range(0, nums.length).filter(i -> i != skip).map(i -> nums[i]).toArray())
                            .map(rem -> Optional.of(pg.apply(rem))
                                .map(pre -> Optional.of(rev.apply(pg.apply(rev.apply(rem))))
                                    .map(suf -> (int) IntStream.range(0, rem.length - 1).filter(i -> pre[i] == suf[i + 1]).count())
                                    .get())
                                .get())
                            .get())
                        .map(cnt -> Optional.of(pg.apply(nums))
                            .map(pre -> Optional.of(rev.apply(pg.apply(rev.apply(nums))))
                                .map(suf -> IntStream.concat(IntStream.of(-1), IntStream.concat(
                                        IntStream.range(1, nums.length).filter(i -> pre[i] != pre[i - 1]),
                                        IntStream.range(0, nums.length - 1).filter(i -> suf[i] != suf[i + 1])).distinct())
                                    .map(cnt).max().getAsInt())
                                .get())
                            .get())
                        .get())
                    .get())
                .get())
            .get();
    }
}
