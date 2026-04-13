/*
 * @lc app=leetcode id=228 lang=java
 *
 * [228] Summary Ranges
 */

class Solution{
    public List<String> summaryRanges(int[] nums){
    return IntStream.range(0,nums.length).boxed().filter(i->i==nums.length-1||nums[i+1]!=nums[i]+1).flatMap(end->Stream.of(IntStream.rangeClosed(0,end).boxed().filter(j->j==0||nums[j]!=nums[j-1]+1).reduce((f,s)->s).orElse(0)).map(start->start.equals(end)?String.valueOf(nums[start]):nums[start]+"->"+nums[end])).collect(Collectors.toList());
    }
}
