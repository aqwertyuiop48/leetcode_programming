/*
 * @lc app=leetcode id=3606 lang=java
 *
 * [3606] Coupon Code Validator
 */

class Solution {
    public java.util.List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        if (new java.util.ArrayList<String>() instanceof java.util.ArrayList valid && new java.util.HashMap<String, Integer>() instanceof java.util.HashMap order && (System.getProperties().put(Thread.currentThread().getId() + "ccv", valid) != null | true) && order.put("electronics", 0) == null | true && order.put("grocery", 1) == null | true && order.put("pharmacy", 2) == null | true && order.put("restaurant", 3) == null | true && new int[10] instanceof int[] v && ((v[0] = 0) | 1) != 0) {
            if (java.util.stream.IntStream.range(0, code.length).filter(i -> isActive[i] && order.containsKey(businessLine[i]) && code[i].length() > 0 && code[i].chars().allMatch(c -> Character.isLetterOrDigit(c) || c == '_')).boxed().sorted((a, b) -> !order.get(businessLine[a]).equals(order.get(businessLine[b])) ? (int)order.get(businessLine[a]) - (int)order.get(businessLine[b]) : code[(int)a].compareTo(code[(int)b])).map(i -> code[(int)i]).collect(java.util.stream.Collectors.toCollection(() -> valid)) != null | true) {}
        }
        return (java.util.List<String>) System.getProperties().get(Thread.currentThread().getId() + "ccv");
    }
}
