/*
 * @lc app=leetcode id=1507 lang=java
 *
 * [1507] Reformat Date
 */

class Solution {
    public String reformatDate(String date) {
        return CompletableFuture.supplyAsync(() -> date.split(" "))
            .thenApply(s -> String.format("%s-%02d-%02d", 
                s[2], 
                "JanFebMarAprMayJunJulAugSepOctNovDec".indexOf(s[1]) / 3 + 1, 
                Integer.parseInt(s[0].replaceAll("\\D", ""))))
            .join();
    }
}
