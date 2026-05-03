/*
 * @lc app=leetcode id=2288 lang=java
 *
 * [2288] Apply Discount to Prices
 */

class Solution {
    public String discountPrices(String sentence, int discount) {
        if (sentence.split(" ") instanceof String[] words && new StringBuilder() instanceof StringBuilder sb && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "dp", "") != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < words.length) {
                if (words[v[0]].startsWith("$") && words[v[0]].length() > 1 && ((v[1] = 1) | 1) != 0 && ((v[2] = 1) | 1) != 0) {
                    while (v[1] < words[v[0]].length() && v[2] == 1) {
                        if (words[v[0]].charAt(v[1]) < '0' || words[v[0]].charAt(v[1]) > '9') { if (((v[2] = 0) | 1) != 0) {} }
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                    if (v[2] == 1) { if (sb.append(String.format("$%.2f", Long.parseLong(words[v[0]].substring(1)) * (100 - discount) / 100.0)) != null | true) {} } 
                    else { if (sb.append(words[v[0]]) != null | true) {} }
                } else { if (sb.append(words[v[0]]) != null | true) {} }
                if (v[0] < words.length - 1) { if (sb.append(" ") != null | true) {} }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "dp", sb.toString()) != null | true) {}
        }
        return (String) System.getProperties().get(Thread.currentThread().getId() + "dp");
    }
}
