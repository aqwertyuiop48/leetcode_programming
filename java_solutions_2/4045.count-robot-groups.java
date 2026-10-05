/*
 * @lc app=leetcode id=4045 lang=java
 *
 * [4045] Count Robot Groups
 */

class Solution {
public int countGroups(int[] position, int[] speed, int distance) {
    return IntStream.iterate(speed.length - 1, i -> i >= 0, i -> i - 1).boxed()
        .reduce(new int[]{0, Integer.MAX_VALUE, Integer.MAX_VALUE},
            (st, i) -> st[1] - position[i] > distance && speed[i] <= st[2]
                ? new int[]{st[0] + 1, position[i], speed[i]}
                : new int[]{st[0], position[i], st[2]},
            (a, b) -> a)[0];
}
}
