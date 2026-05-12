/*
 * @lc app=leetcode id=86 lang=java
 *
 * [86] Partition List
 */

class Solution {
    public ListNode partition(ListNode head, int x) {
        return new Object[]{java.util.stream.Stream.iterate(head, n -> n != null, n -> n.next).toArray(ListNode[]::new)} instanceof Object[] arr 
            ? java.util.stream.Stream.concat(
                java.util.stream.Stream.of((ListNode[])arr[0]).filter(n -> n.val < x), 
                java.util.stream.Stream.of((ListNode[])arr[0]).filter(n -> n.val >= x)
              ).reduce((a, b) -> (a.next = b))
               .map(last -> (last.next = null) == null ? 
                  java.util.stream.Stream.concat(
                      java.util.stream.Stream.of((ListNode[])arr[0]).filter(n -> n.val < x), 
                      java.util.stream.Stream.of((ListNode[])arr[0]).filter(n -> n.val >= x)
                  ).findFirst().orElse(null) 
                  : null
               ).orElse(null) 
            : null;
    }
}
