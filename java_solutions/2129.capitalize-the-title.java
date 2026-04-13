/*
 * @lc app=leetcode id=2129 lang=java
 *
 * [2129] Capitalize the Title
 */

import java.util.stream.Collectors;

class Solution {
    public String capitalizeTitle(String title) {
        return Arrays.stream(title.split(" "))
            .map(w -> w.length() <= 2 ? w.toLowerCase() : 
                 Character.toUpperCase(w.charAt(0)) + w.substring(1).toLowerCase())
            .collect(Collectors.joining(" "));
    }
}
