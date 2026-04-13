/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
 */

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        return Stream.iterate(head, Objects::nonNull, node -> node.next) .map(node -> node.val) .distinct() .collect(Collectors.collectingAndThen( Collectors.toCollection(ArrayList::new), list -> list.reversed().stream().reduce( null, (next, val) -> new ListNode(val, next), (a, b) -> a ) ));
    }
}
