/*
 * @lc app=leetcode id=3777 lang=java
 *
 * [3777] Minimum Deletions to Make Alternating Substring
 */

class Solution {
    public int[] minDeletions(String s, int[][] queries) {
        return Stream.<Object[]>of(new Object[]{
            new int[s.length() + 1],               // s[0]: BIT array
            s.chars().map(c -> c - 'A').toArray(), // s[1]: String data array
            s.length(),                            // s[2]: n
            (BiConsumer<Integer, Integer>) (i, d) -> {} // s[3]: Placeholder
        }).map(sArr -> new Object[]{
            sArr[0], sArr[1], sArr[2],
            (BiConsumer<Integer, Integer>) (i, d) -> IntStream.iterate(i, j -> j <= (int)sArr[2], j -> j + (j & -j)).forEach(j -> ((int[])sArr[0])[j] += d),
            (IntFunction<Integer>) (i) -> IntStream.iterate(i, j -> j > 0, j -> j - (j & -j)).map(j -> ((int[])sArr[0])[j]).sum()
        }).peek(st -> IntStream.range(0, (int)st[2] - 1).filter(i -> ((int[])st[1])[i] == ((int[])st[1])[i+1]).forEach(i -> ((BiConsumer<Integer, Integer>)st[3]).accept(i + 1, 1)))
          .flatMap(st -> Arrays.stream(queries).map(q -> q[0] == 1 ? 
              Stream.of(q[1]).peek(i -> Stream.of(0).allMatch(z -> 
                  (i <= 0 || (Stream.of(0).peek(dummy -> ((BiConsumer<Integer, Integer>)st[3]).accept(i, ((int[])st[1])[i] == ((int[])st[1])[i-1] ? -1 : 0)).allMatch(d -> true))) &&
                  (i >= (int)st[2] - 1 || (Stream.of(0).peek(dummy -> ((BiConsumer<Integer, Integer>)st[3]).accept(i + 1, ((int[])st[1])[i] == ((int[])st[1])[i+1] ? -1 : 0)).allMatch(d -> true))) &&
                  (((int[])st[1])[i] ^= 1) >= 0 &&
                  (i <= 0 || (Stream.of(0).peek(dummy -> ((BiConsumer<Integer, Integer>)st[3]).accept(i, ((int[])st[1])[i] == ((int[])st[1])[i-1] ? 1 : 0)).allMatch(d -> true))) &&
                  (i >= (int)st[2] - 1 || (Stream.of(0).peek(dummy -> ((BiConsumer<Integer, Integer>)st[3]).accept(i + 1, ((int[])st[1])[i] == ((int[])st[1])[i+1] ? 1 : 0)).allMatch(d -> true)))
              )).map(i -> -1).findFirst().get() : ((IntFunction<Integer>)st[4]).apply(q[2]) - ((IntFunction<Integer>)st[4]).apply(q[1])
          )).filter(res -> res >= 0).mapToInt(i -> i).toArray();
    }
}
