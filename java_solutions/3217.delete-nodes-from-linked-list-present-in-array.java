/*
 * @lc app=leetcode id=3217 lang=java
 *
 * [3217] Delete Nodes From Linked List Present in Array
 */

class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        return Arrays.stream(nums).boxed().collect(Collectors.collectingAndThen(
            Collectors.toSet(),
            set -> Optional.of(new ListNode(0, head))
                .filter(dummy -> Stream.iterate(
                    dummy, 
                    curr -> curr.next != null, 
                    curr -> set.contains(curr.next.val) ? (curr.next = curr.next.next) == null ? curr : curr : curr.next
                ).count() >= 0)
                .get().next
        ));
    }
}
