/*
 * @lc app=leetcode id=143 lang=java
 *
 * [143] Reorder List
 */

class Solution {
    public void reorderList(ListNode head) {
        Optional.ofNullable(head).ifPresent(h -> Stream.of(Stream.iterate(h, Objects::nonNull, n -> n.next).collect(Collectors.toList())).peek(list -> Stream.concat(IntStream.range(0, list.size() / 2).boxed().flatMap(i -> Stream.of(list.get(i), list.get(list.size() - 1 - i))), list.size() % 2 != 0 ? Stream.of(list.get(list.size() / 2)) : Stream.empty()).reduce((a, b) -> a.next = b).ifPresent(last -> last.next = null)).findAny());
    }
}
