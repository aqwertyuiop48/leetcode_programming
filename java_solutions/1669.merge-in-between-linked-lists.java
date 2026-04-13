/*
 * @lc app=leetcode id=1669 lang=java
 *
 * [1669] Merge In Between Linked Lists
 */

class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        return CompletableFuture.supplyAsync(() ->  
        Stream.of(new ListNode[][] {{
                Stream.iterate(list1, n -> n.next).limit(a).reduce((f, s) -> s).get(), 
                Stream.iterate(list1, n -> n.next).limit(b + 2).reduce((f, s) -> s).get(), 
                Stream.iterate(list2, Objects::nonNull, n -> n.next).reduce((f, s) -> s).get() 
            }})
            .peek(nodes -> nodes[0].next = list2)
            .peek(nodes -> nodes[2].next = nodes[1])
            .map(nodes -> list1) 
            .findFirst()
            .get()
            ).join();
    }
}
