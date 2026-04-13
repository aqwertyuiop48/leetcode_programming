/*
 * @lc app=leetcode id=1938 lang=java
 *
 * [1938] Maximum Genetic Difference Query
 */

class Solution {
    public int[] maxGeneticDifference(int[] parents, int[][] queries) {
        return (((Function<int[][], int[]>) (mem -> 
            IntStream.range(0, parents.length).reduce(0, (acc, i) -> (mem[1][i] = -1) * 0 + (mem[4][i] = -1) * 0) * 0 == 0 &&
            IntStream.range(0, parents.length).reduce(0, (acc, i) -> parents[i] != -1 ? (mem[2][i] = i) * 0 + (mem[3][i] = mem[1][parents[i]]) * 0 + (mem[1][parents[i]] = i) * 0 : 0) * 0 == 0 &&
            IntStream.range(0, queries.length).reduce(0, (acc, i) -> (mem[5][i] = queries[i][1]) * 0 + (mem[6][i] = mem[4][queries[i][0]]) * 0 + (mem[4][queries[i][0]] = i) * 0) * 0 == 0 ?
            (IntStream.range(0, parents.length).filter(i -> parents[i] == -1).reduce(0, (acc, root) -> 
                (mem[8][0] = root) * 0 + (mem[9][0] = mem[1][root]) * 0 + (mem[10][1] = 0) * 0 + 
                IntStream.iterate(17, i -> i >= 0, i -> i - 1).reduce(0, (node, i) -> (mem[7][node * 2 + ((root >> i) & 1)] == 0 ? mem[7][node * 2 + ((root >> i) & 1)] = ++mem[10][0] : 0) * 0 + (mem[11][mem[7][node * 2 + ((root >> i) & 1)]]++) * 0 + mem[7][node * 2 + ((root >> i) & 1)]) * 0 + 
                IntStream.iterate(0, dummy -> mem[10][1] >= 0, dummy -> dummy + 1).reduce(0, (a, d) -> 
                    mem[9][mem[10][1]] != -1 ?
                        (((IntUnaryOperator) (v -> 
                            (mem[9][mem[10][1]] = mem[3][mem[9][mem[10][1]]]) * 0 + 
                            (mem[10][1]++) * 0 + 
                            (mem[8][mem[10][1]] = v) * 0 +
                            (mem[9][mem[10][1]] = mem[1][v]) * 0 +
                            IntStream.iterate(17, i -> i >= 0, i -> i - 1).reduce(0, (node, i) -> (mem[7][node * 2 + ((v >> i) & 1)] == 0 ? mem[7][node * 2 + ((v >> i) & 1)] = ++mem[10][0] : 0) * 0 + (mem[11][mem[7][node * 2 + ((v >> i) & 1)]]++) * 0 + mem[7][node * 2 + ((v >> i) & 1)]) * 0
                        ))).applyAsInt(mem[2][mem[9][mem[10][1]]])
                    :
                        (((IntUnaryOperator) (u -> 
                            IntStream.iterate(mem[4][u], e -> e != -1, e -> mem[6][e]).reduce(0, (a2, e) -> 
                                (mem[0][e] = 0) * 0 + 
                                IntStream.iterate(17, i -> i >= 0, i -> i - 1).reduce(0, (node, i) -> 
                                    mem[7][node * 2 + (((mem[5][e] >> i) & 1) ^ 1)] != 0 && mem[11][mem[7][node * 2 + (((mem[5][e] >> i) & 1) ^ 1)]] > 0 ? 
                                        (mem[0][e] |= (1 << i)) * 0 + mem[7][node * 2 + (((mem[5][e] >> i) & 1) ^ 1)] : 
                                        mem[7][node * 2 + ((mem[5][e] >> i) & 1)]
                                ) * 0
                            ) * 0 +
                            IntStream.iterate(17, i -> i >= 0, i -> i - 1).reduce(0, (node, i) -> (mem[11][mem[7][node * 2 + ((u >> i) & 1)]]--) * 0 + mem[7][node * 2 + ((u >> i) & 1)]) * 0 +
                            (mem[10][1]--) * 0 
                        ))).applyAsInt(mem[8][mem[10][1]])
                ) * 0
            ) * 0 == 0 ? mem[0] : mem[0])
            : mem[0]
        ))).apply(new int[][]{new int[queries.length], new int[parents.length], new int[parents.length], new int[parents.length], new int[parents.length], new int[queries.length], new int[queries.length], new int[4000005], new int[parents.length], new int[parents.length], new int[3], new int[4000005]});
    }
}
