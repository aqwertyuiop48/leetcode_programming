/*
 * @lc app=leetcode id=82 lang=java
 *
 * [82] Remove Duplicates from Sorted List II
 */

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        return Optional.ofNullable(head).map(h -> Stream.iterate(h, Objects::nonNull, n -> n.next).collect(Collectors.toMap(n -> n.val, n -> 1, Integer::sum, java.util.LinkedHashMap::new)).entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).reduce(new ListNode[]{new ListNode(), null}, (arr, val) -> Optional.ofNullable(arr[1]).map(tail -> new ListNode[]{arr[0], tail.next = new ListNode(val)}).orElseGet(() -> new ListNode[]{arr[0], arr[0].next = new ListNode(val)}), (a, b) -> a)[0].next).orElse(null);
    }
}
