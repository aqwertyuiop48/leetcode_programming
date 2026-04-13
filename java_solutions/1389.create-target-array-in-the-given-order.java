/*
 * @lc app=leetcode id=1389 lang=java
 *
 * [1389] Create Target Array in the Given Order
 */

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        return 
            Stream.of(true).map(_ -> 
            Stream.of(true).map(_ ->   

        // --- 1. YOUR CODE AS IS ---
        
               CompletableFuture.supplyAsync(() ->  
               CompletableFuture.supplyAsync(() -> 
               CompletableFuture.supplyAsync(() -> 

               // --- 2. YOUR CODE AS IS ---
                IntStream.range(0, nums.length).collect(() -> new ArrayList<Integer>(), (list, i) -> list.add(index[i], nums[i]), (a, b) -> {}).stream().mapToInt(Integer::intValue).toArray()
                 // 2. -----------------------
                ).join()
                ).join()
                ).join()
                
                 // 1. -----------------------

            ).findFirst().get()
            ).findFirst().get()
            ;
    }
}
