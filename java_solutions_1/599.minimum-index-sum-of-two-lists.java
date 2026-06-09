/*
 * @lc app=leetcode id=599 lang=java
 *
 * [599] Minimum Index Sum of Two Lists
 */

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        return java.util.stream.Stream.of(0).map(_v -> new Object[]{new java.util.HashMap<String, Integer>(), new java.util.ArrayList<String>(), new int[]{Integer.MAX_VALUE}}).peek(a -> java.util.stream.IntStream.range(0, list1.length).forEach(i -> ((java.util.Map<String, Integer>) a[0]).put(list1[i], i))).peek(a -> java.util.stream.IntStream.range(0, list2.length).filter(i -> ((java.util.Map<String, Integer>) a[0]).containsKey(list2[i])).forEach(i -> java.util.stream.Stream.of(i + ((java.util.Map<String, Integer>) a[0]).get(list2[i])).peek(sum -> java.util.stream.Stream.of(0).filter(_x -> sum < ((int[]) a[2])[0]).peek(_x -> ((java.util.List<String>) a[1]).clear()).forEach(_x -> ((int[]) a[2])[0] = sum)).filter(sum -> sum == ((int[]) a[2])[0]).forEach(sum -> ((java.util.List<String>) a[1]).add(list2[i])))).map(a -> ((java.util.List<String>) a[1]).toArray(new String[0])).findFirst().get();
    }
}
