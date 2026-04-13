/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
 */

class Solution {
    public boolean isPalindrome(ListNode head) {
        return Stream.iterate(head, Objects::nonNull, n -> n.next)
            .map(n -> n.val)
            .collect(Collectors.collectingAndThen(
                Collectors.toList(),
                list -> IntStream.range(0, list.size() / 2)
                    .allMatch(i -> Objects.equals(list.get(i), list.get(list.size() - 1 - i)))
            ));
    }
}
