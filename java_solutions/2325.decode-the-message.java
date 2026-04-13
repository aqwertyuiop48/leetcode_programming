/*
 * @lc app=leetcode id=2325 lang=java
 *
 * [2325] Decode the Message
 */

class Solution {
    public String decodeMessage(String key, String message) {
        return Optional.of(new int[128]).map(map -> Stream.of(new int[]{'a'})
            .peek(ptr -> key.chars().filter(c -> c != ' ' && map[c] == 0)
                .forEach(c -> map[c] = ptr[0]++))
            .map(ptr -> message.chars()
                .mapToObj(c -> c == ' ' ? " " : String.valueOf((char) map[c]))
                .collect(Collectors.joining()))
            .findFirst().get())
        .get();
    }
}
