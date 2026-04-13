/*
 * @lc app=leetcode id=3772 lang=java
 *
 * [3772] Maximum Subgraph Score in a Tree
 */

class Solution {
    public int[] maxSubgraphScore(int n, int[][] edges, int[] good) {
        return Stream.<Object[]>of(new Object[]{
            IntStream.range(0, n).mapToObj(i -> new ArrayList<Integer>()).toList(), // s[0]: Adj
            new int[n], // s[1]: weight
            new int[n], // s[2]: downScore
            new int[n], // s[3]: upScore
            new int[n], // s[4]: ans
            new int[n], // s[5]: parent
            new int[n]  // s[6]: bfsOrder
        }).peek(s -> IntStream.range(0, n).allMatch(i -> (((int[]) s[1])[i] = (good[i] == 1 ? 1 : -1)) != 0))
          .peek(s -> Arrays.stream(edges).allMatch(e -> ((List<List<Integer>>) s[0]).get(e[0]).add(e[1]) && ((List<List<Integer>>) s[0]).get(e[1]).add(e[0])))
          .peek(s -> Stream.of(new ArrayDeque<Integer>()).peek(q -> q.add(0)).peek(q -> ((int[]) s[5])[0] = -1).allMatch(q -> 
              Stream.of(new boolean[n]).peek(v -> v[0] = true).allMatch(v -> 
                  IntStream.range(0, n).allMatch(i -> Stream.of(q.poll()).peek(u -> ((int[]) s[6])[i] = u).allMatch(u -> 
                      ((List<List<Integer>>) s[0]).get(u).stream().filter(nb -> !v[nb]).allMatch(nb -> 
                          (v[nb] = true) && (((int[]) s[5])[nb] = u) >= -1 && q.add(nb)
                      ))))))
          .peek(s -> IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).map(i -> ((int[]) s[6])[i]).allMatch(u -> 
              (((int[]) s[2])[u] = ((int[]) s[1])[u]) != 0 && 
              ((List<List<Integer>>) s[0]).get(u).stream().filter(v -> v != ((int[]) s[5])[u])
                  .allMatch(v -> (((int[]) s[2])[u] += Math.max(0, ((int[]) s[2])[v])) != 0x7FFFFFFF)))
          .peek(s -> IntStream.range(0, n).map(i -> ((int[]) s[6])[i]).allMatch(u -> 
              (((int[]) s[4])[u] = ((int[]) s[2])[u] + ((int[]) s[3])[u]) >= -0x7FFFFFFF && 
              ((List<List<Integer>>) s[0]).get(u).stream().filter(v -> v != ((int[]) s[5])[u]).allMatch(v -> 
                  (((int[]) s[3])[v] = Math.max(0, ((int[]) s[3])[u] + (((int[]) s[2])[u] - Math.max(0, ((int[]) s[2])[v])))) >= 0
              )))
          .map(s -> (int[]) s[4]).findFirst().get();
    }
}
