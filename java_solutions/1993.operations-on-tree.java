/*
 * @lc app=leetcode id=1993 lang=java
 *
 * [1993] Operations on Tree
 */

class LockingTree {
    public LockingTree(int[] p) {
        if (System.getProperties().put(this, new Object[]{p, new int[p.length], new long[p.length * 32]}) == null && java.util.stream.IntStream.range(0, p.length).allMatch(i -> java.util.stream.IntStream.iterate(i, c -> c != -1, c -> ((int[])((Object[])System.getProperties().get(this))[0])[c]).peek(c -> ((long[])((Object[])System.getProperties().get(this))[2])[c * 32 + (i >> 6)] |= (1L << (i & 63))).count() >= 0)) {}
    }

    public boolean lock(int n, int u) {
        return ((int[])((Object[])System.getProperties().get(this))[1])[n] == 0 && (((int[])((Object[])System.getProperties().get(this))[1])[n] = u) > 0;
    }

    public boolean unlock(int n, int u) {
        return ((int[])((Object[])System.getProperties().get(this))[1])[n] == u && (((int[])((Object[])System.getProperties().get(this))[1])[n] = 0) == 0;
    }

    public boolean upgrade(int n, int u) {
        return ((int[])((Object[])System.getProperties().get(this))[1])[n] == 0 
            && java.util.stream.IntStream.iterate(n, i -> i != -1, i -> ((int[])((Object[])System.getProperties().get(this))[0])[i]).allMatch(i -> ((int[])((Object[])System.getProperties().get(this))[1])[i] == 0) 
            && java.util.stream.IntStream.range(0, ((int[])((Object[])System.getProperties().get(this))[0]).length).filter(i -> (((long[])((Object[])System.getProperties().get(this))[2])[n * 32 + (i >> 6)] & (1L << (i & 63))) != 0 && ((int[])((Object[])System.getProperties().get(this))[1])[i] != 0).peek(i -> ((int[])((Object[])System.getProperties().get(this))[1])[i] = 0).count() > 0 
            && (((int[])((Object[])System.getProperties().get(this))[1])[n] = u) > 0;
    }
}
