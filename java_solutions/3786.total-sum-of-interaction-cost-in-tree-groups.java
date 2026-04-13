/*
 * @lc app=leetcode id=3786 lang=java
 *
 * [3786] Total Sum of Interaction Cost in Tree Groups
 */

class Solution {
    public long interactionCosts(int n, int[][] edges, int[] group) {
        return Stream.<Object[]>of(new Object[]{
            IntStream.range(0, n).mapToObj(i -> new ArrayList<Integer>()).toList(), // s[0]: Adj
            new int[21],    // s[1]: Total group counts
            new long[1],   // s[2]: Total Cost answer
            new int[n],    // s[3]: Parent array
            new int[n],    // s[4]: BFS Order array
            new int[n][21] // s[5]: DP counts table
        }).filter(s -> Arrays.stream(edges).allMatch(e -> ((List<List<Integer>>) s[0]).get(e[0]).add(e[1]) && ((List<List<Integer>>) s[0]).get(e[1]).add(e[0])))
          .filter(s -> Arrays.stream(group).allMatch(g -> (((int[]) s[1])[g]++) >= 0))
          .filter(s -> IntStream.range(0, n).allMatch(i -> (((int[][]) s[5])[i][group[i]] = 1) > 0))
          .filter(s -> Stream.of(new ArrayDeque<Integer>()).filter(q -> q.add(0)).allMatch(q -> 
              Stream.of(new boolean[n]).filter(v -> v[0] = true).allMatch(v -> 
                  IntStream.range(0, n).allMatch(i -> 
                      Stream.of(q.poll()).filter(u -> (((int[]) s[4])[i] = u) >= 0).allMatch(u -> 
                          ((List<List<Integer>>) s[0]).get(u).stream().filter(nb -> !v[nb]).allMatch(nb -> 
                              (v[nb] = true) && (((int[]) s[3])[nb] = u) >= 0 && q.add(nb)
                          )
                      )
                  )
              )
          ))
          .map(s -> IntStream.iterate(n - 1, i -> i > 0, i -> i - 1).allMatch(i -> 
              Stream.of(((int[]) s[4])[i]).allMatch(u -> 
                  Stream.of(((int[]) s[3])[u]).allMatch(p -> 
                      IntStream.range(1, 21).allMatch(g -> 
                          (((long[]) s[2])[0] += (long) ((int[][]) s[5])[u][g] * (((int[]) s[1])[g] - ((int[][]) s[5])[u][g])) != -1L 
                          && (((int[][]) s[5])[p][g] += ((int[][]) s[5])[u][g]) >= 0
                      )
                  )
              )
          ) ? ((long[]) s[2])[0] : ((long[]) s[2])[0])
          .findFirst().get();
    }
}
