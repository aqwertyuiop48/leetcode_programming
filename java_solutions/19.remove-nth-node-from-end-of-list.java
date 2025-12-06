/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
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
    public ListNode removeNthFromEnd(ListNode l1, int n) {
        return (ListNode)Optional.of(new Function[]{null}).map(toList -> Optional.of(toList[0] = node -> node == null ? new ArrayList<Integer>() : Stream.concat(Stream.of(((ListNode)node).val), ((List<Integer>)toList[0].apply(((ListNode)node).next)).stream()).collect(Collectors.toList())).map(f -> (List<Integer>)f.apply(l1)).orElse(null)).map(li -> IntStream.range(0, li.size()).filter(i -> i != li.size() - n).mapToObj(li::get).collect(Collectors.toList())).map(li -> Optional.of(new Function[]{null}).map(toNode -> Optional.of(toNode[0] = list -> ((List<Integer>)list).isEmpty() ? null : new ListNode(((List<Integer>)list).get(0), (ListNode)toNode[0].apply(((List<Integer>)list).subList(1, ((List<Integer>)list).size())))).map(f -> (ListNode)f.apply(li)).orElse(null)).orElse(null)).orElse(null);
    }
}
// @lc code=end

