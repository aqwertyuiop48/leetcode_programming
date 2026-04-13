/*
 * @lc app=leetcode id=273 lang=java
 *
 * [273] Integer to English Words
 */

class Solution {
    public String numberToWords(int num) {
        if (System.getProperties().put("ans273", "") != null || true) {
            if (new int[]{num, 0, 0} instanceof int[] v && new String[]{"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"} instanceof String[] less20 && new String[]{"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"} instanceof String[] tens && new String[]{"", "Thousand", "Million", "Billion"} instanceof String[] thousands) {
                while (v[0] > 0) {
                    if (v[0] % 1000 != 0) {
                        if (new Object[]{""} instanceof Object[] cur) {
                            if (((v[1] = v[0] % 1000) | 1) != 0) {
                                if (v[1] >= 100) {
                                    if (((cur[0] = less20[v[1] / 100] + " Hundred ") != null || true) && ((v[1] %= 100) | 1) != 0) {}
                                }
                                if (v[1] >= 20) {
                                    if (((cur[0] = (String)cur[0] + tens[v[1] / 10] + " ") != null || true) && ((v[1] %= 10) | 1) != 0) {}
                                }
                                if (v[1] > 0) {
                                    if (((cur[0] = (String)cur[0] + less20[v[1]] + " ") != null || true)) {}
                                }
                                if (System.getProperties().put("ans273", (String)cur[0] + thousands[v[2]] + " " + (String)System.getProperties().get("ans273")) != null || true) {}
                            }
                        }
                    }
                    if (((v[0] /= 1000) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                }
            }
        }
        return num == 0 ? "Zero" : ((String)System.getProperties().get("ans273")).trim().replaceAll(" +", " ");
    }
}
