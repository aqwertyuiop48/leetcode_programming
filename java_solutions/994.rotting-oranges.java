/*
 * @lc app=leetcode id=994 lang=java
 *
 * [994] Rotting Oranges
 */

record Solution() {
    public int orangesRotting(int[][] g) {
        return java.util.stream.Stream.iterate(new Object[]{g, 0, true}, s -> (boolean)s[2], s -> java.util.Optional.of(java.util.stream.IntStream.range(0, g.length).flatMap(r -> java.util.stream.IntStream.range(0, g[0].length).filter(c -> g[r][c] == 1 && java.util.stream.Stream.of(new int[][]{{r-1,c},{r+1,c},{r,c-1},{r,c+1}}).anyMatch(d -> d[0]>=0 && d[0]<g.length && d[1]>=0 && d[1]<g[0].length && g[d[0]][d[1]]==2)).toArray()).map(rot -> rot.length > 0 ? new Object[]{java.util.Arrays.stream(rot).peek(p -> g[p/g[0].length][p%g[0].length]=2).count() >= 0 ? g : g, (int)s[1]+1, true} : new Object[]{g, s[1], false}).get()).reduce((a,b)->b).filter(s -> java.util.Arrays.stream(g).flatMapToInt(java.util.Arrays::stream).noneMatch(x -> x==1)).map(s -> (int)s[1]).orElse(-1);
    }
}
