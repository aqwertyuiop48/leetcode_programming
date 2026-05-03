/*
 * @lc app=leetcode id=470 lang=java
 *
 * [470] Implement Rand10() Using Rand7()
 */

class Solution extends SolBase {
    public int rand10() {
        return java.util.stream.Stream.iterate(41, v -> v > 40, v -> (rand7() - 1) * 7 + rand7()).filter(v -> v <= 40).findFirst().get() % 10 + 1;
    }
}
