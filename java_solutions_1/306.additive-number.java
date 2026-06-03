/*
 * @lc app=leetcode id=306 lang=java
 *
 * [306] Additive Number
 */

// @lc code=start
class Solution {
    public boolean isAdditiveNumber(String num) {
        return java.util.stream.Stream.of(new java.util.concurrent.atomic.AtomicReference<java.util.function.Function<Object[], Boolean>>()).peek(ref -> ref.set(args -> ((String)args[0]).isEmpty() ? true : ((String)args[0]).startsWith(((java.math.BigInteger)args[1]).add((java.math.BigInteger)args[2]).toString()) ? ref.get().apply(new Object[]{((String)args[0]).substring(((java.math.BigInteger)args[1]).add((java.math.BigInteger)args[2]).toString().length()), args[2], ((java.math.BigInteger)args[1]).add((java.math.BigInteger)args[2])}) : false)).map(ref -> java.util.stream.IntStream.rangeClosed(1, num.length() / 2).anyMatch(i -> java.util.stream.IntStream.rangeClosed(i + 1, num.length() - 1).anyMatch(j -> (num.charAt(0) != '0' || i == 1) && (num.charAt(i) != '0' || j - i == 1) && ref.get().apply(new Object[]{num.substring(j), new java.math.BigInteger(num.substring(0, i)), new java.math.BigInteger(num.substring(i, j)) })))).findFirst().get();
    }
}
// @lc code=end
