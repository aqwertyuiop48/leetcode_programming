/*
 * @lc app=leetcode id=482 lang=java
 *
 * [482] License Key Formatting
 */

class Solution {
    public String licenseKeyFormatting(String s, int k) {
        return Optional.of(s.replace("-", "").toUpperCase()).map(str -> IntStream.range(0, str.length()).mapToObj(i -> "" + str.charAt(str.length() - 1 - i)).collect(Collectors.joining()).replaceAll("(.{" + k + "})(?!$)", "$1-")).map(res -> new StringBuilder(res).reverse().toString()).get();
    }
}
