/*
 * @lc app=leetcode id=3533 lang=java
 *
 * [3533] Concatenated Divisibility
 */

class Solution {
    public int[] concatenatedDivisibility(int[] nums, int k) {
        return Optional.of(new Object[]{Arrays.stream(nums).sorted().toArray(), new int[nums.length], new HashMap<Long, Boolean>(), new int[nums.length], new BiFunction[1], nums.length, k, (1 << nums.length) - 1}).map((Object[] st) -> IntStream.range(0, (int)st[5]).map(i -> (((int[])st[1])[i] = (int) LongStream.range(0, ((int[])st[0])[i] == 0 ? 1 : (int)Math.log10(((int[])st[0])[i]) + 1).reduce(1L, (m, d) -> (m * 10L) % (int)st[6])) * 0).sum() == 0 ? st : st).map((Object[] st) -> (((BiFunction<Integer, Integer, Boolean>[])st[4])[0] = (BiFunction<Integer, Integer, Boolean>) ((mask, rem) -> (int)mask == (int)st[7] ? ((int)rem == 0) : Optional.of(((long)(int)mask << 32) | (long)(int)rem).map(key -> ((Map<Long, Boolean>)st[2]).containsKey(key) ? ((Map<Long, Boolean>)st[2]).get(key) : Optional.of(IntStream.range(0, (int)st[5]).filter(i -> ((int)mask & (1 << i)) == 0).anyMatch(i -> ((BiFunction<Integer, Integer, Boolean>[])st[4])[0].apply((int)mask | (1 << i), (int)mask == 0 ? ((int[])st[0])[i] % (int)st[6] : (int)(((long)(int)rem * ((int[])st[1])[i] + ((int[])st[0])[i]) % (int)st[6])) ? ((((int[])st[3])[Integer.bitCount((int)mask)] = ((int[])st[0])[i]) * 0 == 0) : false)).map(res -> ((Map<Long, Boolean>)st[2]).put(key, res) == null ? res : res).get()).get())) != null ? st : st).map((Object[] st) -> ((BiFunction<Integer, Integer, Boolean>[])st[4])[0].apply(0, 0) ? (int[])st[3] : new int[0]).get();
    }
}
