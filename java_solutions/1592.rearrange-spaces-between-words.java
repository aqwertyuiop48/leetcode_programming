/*
 * @lc app=leetcode id=1592 lang=java
 *
 * [1592] Rearrange Spaces Between Words
 */

class Solution {
    public String reorderSpaces(String text) {
        return CompletableFuture.supplyAsync(() -> text.chars().filter(c -> c == ' ').count())
            .thenApply(spaces -> Stream.of(text.trim().split("\\s+"))
                .filter(w -> !w.isEmpty())
                .collect(Collectors.collectingAndThen(Collectors.toList(), words -> 
                    words.size() == 1 
                        ? words.get(0) + " ".repeat(spaces.intValue())
                        : String.join(" ".repeat(spaces.intValue() / (words.size() - 1)), words) 
                          + " ".repeat(spaces.intValue() % (words.size() - 1))
                )))
            .join();
    }
}
