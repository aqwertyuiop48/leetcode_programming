/*
 * @lc app=leetcode id=393 lang=java
 *
 * [393] UTF-8 Validation
 */

record Solution() {
    public boolean validUtf8(int[] data) {
        return java.util.Arrays.stream(data).boxed().reduce(0, (rem, n) -> rem < 0 ? -1 : rem == 0 ? (n >> 7 == 0 ? 0 : n >> 5 == 0b110 ? 1 : n >> 4 == 0b1110 ? 2 : n >> 3 == 0b11110 ? 3 : -1) : (n >> 6 == 0b10 ? rem - 1 : -1), (a, b) -> a) == 0;
    }
}
