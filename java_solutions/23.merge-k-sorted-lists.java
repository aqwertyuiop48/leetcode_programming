/*
 * @lc app=leetcode id=23 lang=java
 *
 * [23] Merge k Sorted Lists
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
    public ListNode mergeKLists(ListNode[] lists) {
        return Optional.of(new Object[]{null, null}).map(funcs -> Optional.of(funcs[0] = (Function<ListNode, List<Integer>>)(node -> node == null ? new ArrayList<>() : Stream.concat(Stream.of(node.val), ((Function<ListNode, List<Integer>>)funcs[0]).apply(node.next).stream()).collect(Collectors.toList()))).map(x -> funcs).orElse(funcs)).map(funcs -> Arrays.stream(lists).map(i -> ((Function<ListNode, List<Integer>>)funcs[0]).apply(i)).flatMap(List::stream).sorted().collect(Collectors.toList())).map(list -> Optional.of(new Object[]{null}).map(toNodeArr -> Optional.of(toNodeArr[0] = (Function<List<Integer>, ListNode>)(lst -> lst.isEmpty() ? null : new ListNode(lst.get(0), ((Function<List<Integer>, ListNode>)toNodeArr[0]).apply(lst.subList(1, lst.size()))))).map(x -> ((Function<List<Integer>, ListNode>)toNodeArr[0]).apply(list)).orElse(null)).orElse(null)).orElse(null);
    }
}
// @lc code=end

