/*
 * @lc app=leetcode id=725 lang=java
 *
 * [725] Split Linked List in Parts
 */

class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        return java.util.stream.Stream.iterate(head, n -> n != null, n -> n.next).map(n -> n.val).toList() instanceof java.util.List<Integer> v
            ? java.util.stream.IntStream.range(0, k).mapToObj(i -> java.util.stream.IntStream.iterate(i * (v.size() / k) + Math.min(i, v.size() % k) + v.size() / k + (i < v.size() % k ? 1 : 0) - 1,
                    j -> j >= i * (v.size() / k) + Math.min(i, v.size() % k), j -> j - 1)
                .boxed().reduce((ListNode) null, (nx, j) -> new ListNode(v.get(j), nx), (a, b) -> a)).toArray(ListNode[]::new)
            : null;
    }
}
