/*
 * @lc app=leetcode id=2502 lang=java
 *
 * [2502] Design Memory Allocator
 */

class Allocator {
    public Allocator(int n) { if (System.getProperties().put("dma_m", new int[n]) != null | true) {} }
    public int allocate(int size, int mID) { return System.getProperties().get("dma_m") instanceof int[] m && new int[3] instanceof int[] v && ((v[0] = -1) | 1) != 0 ? java.util.stream.IntStream.range(0, m.length).filter(i -> (m[i] == 0 ? (v[1]++) : (v[1] = 0)) == -2 | v[1] == size).findFirst().stream().peek(i -> java.util.stream.IntStream.rangeClosed(i - size + 1, i).forEach(j -> m[j] = mID)).map(i -> i - size + 1).findFirst().orElse(-1) : -1; }
    public int freeMemory(int mID) { return System.getProperties().get("dma_m") instanceof int[] m ? (int)java.util.stream.IntStream.range(0, m.length).filter(i -> m[i] == mID).peek(i -> m[i] = 0).count() : 0; }
}
