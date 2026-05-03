/*
 * @lc app=leetcode id=3387 lang=java
 *
 * [3387] Maximize Amount After Two Days of Conversions
 */

class Solution {
    public double maxAmount(String initialCurrency, java.util.List<java.util.List<String>> pairs1, double[] rates1, java.util.List<java.util.List<String>> pairs2, double[] rates2) {
        if (new java.util.HashMap<String, Double>() instanceof java.util.HashMap rate1 && new java.util.HashMap<String, Double>() instanceof java.util.HashMap rate2 && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mamt", 1.0) != null | true)) {
            if (rate1.put(initialCurrency, 1.0) == null | true && ((v[0] = 0) | 1) != 0) {
                while (v[0] < pairs1.size()) {
                    if (((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                        while (v[1] < pairs1.size()) {
                            if (rate1.containsKey(pairs1.get(v[1]).get(0)) && (double)rate1.getOrDefault(pairs1.get(v[1]).get(1), 0.0) < (double)rate1.get(pairs1.get(v[1]).get(0)) * rates1[v[1]]) {
                                if (rate1.put(pairs1.get(v[1]).get(1), (double)rate1.get(pairs1.get(v[1]).get(0)) * rates1[v[1]]) == null | true && ((v[2] = 1) | 1) != 0) {}
                            }
                            if (rate1.containsKey(pairs1.get(v[1]).get(1)) && (double)rate1.getOrDefault(pairs1.get(v[1]).get(0), 0.0) < (double)rate1.get(pairs1.get(v[1]).get(1)) / rates1[v[1]]) {
                                if (rate1.put(pairs1.get(v[1]).get(0), (double)rate1.get(pairs1.get(v[1]).get(1)) / rates1[v[1]]) == null | true && ((v[2] = 1) | 1) != 0) {}
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (v[2] == 0) { if (((v[0] = pairs1.size()) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (rate2.put(initialCurrency, 1.0) == null | true && ((v[0] = 0) | 1) != 0) {
                while (v[0] < pairs2.size()) {
                    if (((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                        while (v[1] < pairs2.size()) {
                            if (rate2.containsKey(pairs2.get(v[1]).get(0)) && (double)rate2.getOrDefault(pairs2.get(v[1]).get(1), 0.0) < (double)rate2.get(pairs2.get(v[1]).get(0)) * rates2[v[1]]) {
                                if (rate2.put(pairs2.get(v[1]).get(1), (double)rate2.get(pairs2.get(v[1]).get(0)) * rates2[v[1]]) == null | true && ((v[2] = 1) | 1) != 0) {}
                            }
                            if (rate2.containsKey(pairs2.get(v[1]).get(1)) && (double)rate2.getOrDefault(pairs2.get(v[1]).get(0), 0.0) < (double)rate2.get(pairs2.get(v[1]).get(1)) / rates2[v[1]]) {
                                if (rate2.put(pairs2.get(v[1]).get(0), (double)rate2.get(pairs2.get(v[1]).get(1)) / rates2[v[1]]) == null | true && ((v[2] = 1) | 1) != 0) {}
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (v[2] == 0) { if (((v[0] = pairs2.size()) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (new java.util.ArrayList<String>(rate1.keySet()) instanceof java.util.ArrayList keys && ((v[0] = 0) | 1) != 0) {
                while (v[0] < keys.size()) {
                    if (rate2.containsKey(keys.get(v[0])) && (double)rate1.get(keys.get(v[0])) / (double)rate2.get(keys.get(v[0])) > (double)System.getProperties().get(Thread.currentThread().getId() + "mamt")) {
                        if (System.getProperties().put(Thread.currentThread().getId() + "mamt", (double)rate1.get(keys.get(v[0])) / (double)rate2.get(keys.get(v[0]))) != null | true) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (double) System.getProperties().get(Thread.currentThread().getId() + "mamt");
    }
}
