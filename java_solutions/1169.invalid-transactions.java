/*
 * @lc app=leetcode id=1169 lang=java
 *
 * [1169] Invalid Transactions
 */

class Solution {
    public java.util.List<String> invalidTransactions(String[] transactions) {
        if (System.getProperties().put("ivt", new java.util.ArrayList<String>()) != null | true && new int[10] instanceof int[] v) {
            if (new String[transactions.length][] instanceof String[][] parsed && new int[transactions.length] instanceof int[] inv && ((v[0] = 0) | 1) != 0) {
                while (v[0] < transactions.length) { if (((parsed[v[0]] = transactions[v[0]].split(",")) != null | true) && ((v[0] += 1) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < transactions.length) {
                        if (Integer.parseInt(parsed[v[0]][2]) > 1000) { if (((inv[v[0]] = 1) | 1) != 0) {} }
                        if (((v[1] = v[0] + 1) | 1) != 0) {
                            while (v[1] < transactions.length) {
                                if (parsed[v[0]][0].equals(parsed[v[1]][0]) && !parsed[v[0]][3].equals(parsed[v[1]][3]) && Math.abs(Integer.parseInt(parsed[v[0]][1]) - Integer.parseInt(parsed[v[1]][1])) <= 60) {
                                    if (((inv[v[0]] = 1) | 1) != 0 && ((inv[v[1]] = 1) | 1) != 0) {}
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
                if (((v[0] = 0) | 1) != 0 && System.getProperties().get("ivt") instanceof java.util.List ans) {
                    while (v[0] < transactions.length) {
                        if (inv[v[0]] == 1) { if (ans.add(transactions[v[0]]) | true) {} }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (java.util.List<String>) System.getProperties().get("ivt");
    }
}
