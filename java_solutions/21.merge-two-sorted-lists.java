/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// semicolons : 1
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        return Optional.of(new Object[]{null, null}).map(funcs -> Optional.of(funcs).map(f -> Optional.of(f[0] = (Function<ListNode, List<Integer>>)(head -> head == null ? new ArrayList<>() : Stream.concat(Stream.of(head.val), ((Function<ListNode, List<Integer>>)f[0]).apply(head.next).stream()).collect(Collectors.toList()))).map(x -> f).orElse(f)).orElse(funcs)).map(funcs -> Stream.concat(((Function<ListNode, List<Integer>>)funcs[0]).apply(l1).stream(), ((Function<ListNode, List<Integer>>)funcs[0]).apply(l2).stream()).sorted().collect(Collectors.toList())).map(list -> Optional.of(new Object[]{null}).map(toNodeArr -> Optional.of(toNodeArr[0] = (Function<List<Integer>, ListNode>)(lst -> lst.isEmpty() ? null : new ListNode(lst.get(0), ((Function<List<Integer>, ListNode>)toNodeArr[0]).apply(lst.subList(1, lst.size()))))).map(x -> ((Function<List<Integer>, ListNode>)toNodeArr[0]).apply(list)).orElse(null)).orElse(null)).orElse(null);
    }
}
// @lc code=end

