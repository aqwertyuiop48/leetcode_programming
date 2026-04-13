/*
 * @lc app=leetcode id=3812 lang=java
 *
 * [3812] Minimum Edge Toggles on a Tree
 */

class Solution {
    public List<Integer> minimumFlips(int n, int[][] edges, String start, String target) {
        return Stream.<Object[]>of(new Object[]{ IntStream.range(0, n).mapToObj(i -> new ArrayList<int[]>()).collect(Collectors.toList()), start.chars().map(c -> c - '0').toArray(), target.chars().map(c -> c - '0').toArray(), new ArrayList<Integer>(), null }).peek(c -> IntStream.range(0, edges.length).allMatch(i -> ((List<List<int[]>>) ((Object[])c)[0]).get(edges[i][0]).add(new int[]{edges[i][1], i}) && ((List<List<int[]>>) ((Object[])c)[0]).get(edges[i][1]).add(new int[]{edges[i][0], i}))).peek(c -> ((Object[])c)[4] = (BiFunction<Object[], int[], Boolean>) (ctx, p) -> ((List<List<int[]>>) ctx[0]).get(p[0]).stream().filter(e -> e[0] != p[1]).allMatch(e -> ((BiFunction<Object[], int[], Boolean>) ctx[4]).apply(ctx, new int[]{e[0], p[0], e[1]})) && (((int[]) ctx[1])[p[0]] != ((int[]) ctx[2])[p[0]] && p[2] != -1 ? ((List<Integer>) ctx[3]).add(p[2]) && (((int[]) ctx[1])[p[0]] ^= 1) >= 0 && (((int[]) ctx[1])[p[1]] ^= 1) >= 0 : true)).peek(c -> ((BiFunction<Object[], int[], Boolean>) ((Object[])c)[4]).apply((Object[])c, new int[]{0, 0, -1})).map(c -> ((int[]) ((Object[])c)[1])[0] != ((int[]) ((Object[])c)[2])[0] ? Arrays.asList(-1) : ((List<Integer>) ((Object[])c)[3]).stream().sorted().collect(Collectors.toList())).findFirst().get();
    }
}
