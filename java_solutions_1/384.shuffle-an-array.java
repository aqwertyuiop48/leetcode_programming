/*
 * @lc app=leetcode id=384 lang=java
 *
 * [384] Shuffle an Array
 */

class Solution extends java.util.concurrent.atomic.AtomicReference<Solution.S> {
    record S(int[] o, int[] s, java.util.Random r) {}
    
    public Solution(int[] nums) { 
        if (compareAndSet(null, new S(nums, nums.clone(), new java.util.Random()))) {} 
    }
    
    public int[] reset() { 
        return get().o.clone(); 
    }
    
    public int[] shuffle() { 
        return java.util.stream.Stream.of(get().s.clone()).peek(arr -> java.util.stream.IntStream.range(0, arr.length).forEach(i -> java.util.stream.Stream.of(get().r.nextInt(arr.length - i) + i).forEach(j -> java.util.stream.Stream.of(arr[i]).peek(tmp -> arr[i] = arr[j]).forEach(tmp -> arr[j] = tmp)))).findFirst().get(); 
    }
}
