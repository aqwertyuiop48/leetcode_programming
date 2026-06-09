/*
 * @lc app=leetcode id=592 lang=java
 *
 * [592] Fraction Addition and Subtraction
 */

class Solution {
    public String fractionAddition(String expression) {
        return java.util.stream.Stream.of(0).map(_v -> new Object[]{new java.util.Scanner(expression).useDelimiter("(?=[-+])"), new int[]{0, 1}}).peek(a -> java.util.stream.Stream.generate(() -> ((java.util.Scanner) a[0]).hasNext() ? ((java.util.Scanner) a[0]).next() : null).takeWhile(s -> s != null).map(s -> s.split("/")).forEach(parts -> java.util.stream.Stream.of(new int[]{Integer.parseInt(parts[0]), Integer.parseInt(parts[1])}).forEach(f -> java.util.stream.Stream.of(0).peek(_x -> ((int[]) a[1])[0] = ((int[]) a[1])[0] * f[1] + f[0] * ((int[]) a[1])[1]).forEach(_x -> ((int[]) a[1])[1] *= f[1])))).map(a -> java.util.stream.Stream.of(java.util.stream.Stream.iterate(new int[]{Math.abs(((int[]) a[1])[0]), Math.abs(((int[]) a[1])[1])}, gcd -> gcd[1] != 0, gcd -> new int[]{gcd[1], gcd[0] % gcd[1]}).dropWhile(gcd -> gcd[1] != 0).findFirst().get()[0]).map(gcd -> (((int[]) a[1])[0] / gcd) + "/" + (((int[]) a[1])[1] / gcd)).findFirst().get()).findFirst().get();
    }
}
