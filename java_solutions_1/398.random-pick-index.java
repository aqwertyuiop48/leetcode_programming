/*
 * @lc app=leetcode id=398 lang=java
 *
 * [398] Random Pick Index
 */

class Solution extends java.util.concurrent.atomic.AtomicReference<Solution.S> {
    record S(int[] n, java.util.Random r) {}
    
    public Solution(int[] nums) { 
        if (compareAndSet(null, new S(nums, new java.util.Random()))) {} 
    }
    
    public int pick(int target) { 
        return java.util.stream.Stream.of(java.util.stream.IntStream.range(0, get().n.length).filter(i -> get().n[i] == target).toArray()).map(indices -> indices[get().r.nextInt(indices.length)]).findFirst().get(); 
    }
}
