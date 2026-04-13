/*
 * @lc app=leetcode id=1721 lang=java
 *
 * [1721] Swapping Nodes in a Linked List
 */

class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        return Stream.iterate(head, Objects::nonNull, n -> n.next)
            .collect(Collectors.collectingAndThen(
                Collectors.toList(),
                l -> Stream.of(l.get(k - 1).val)
                    .peek(v -> l.get(k - 1).val = l.get(l.size() - k).val)
                    .peek(v -> l.get(l.size() - k).val = v)
                    .map(v -> l.get(0))
                    .findFirst()
                    .get()
            ));
    }
}
