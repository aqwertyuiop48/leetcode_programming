/*
 * @lc app=leetcode id=2227 lang=java
 *
 * [2227] Encrypt and Decrypt Strings
 */

class Encrypter extends java.util.HashMap<Object, Object> {
    public Encrypter(char[] k, String[] v, String[] d) {
        if (IntStream.range(0, k.length).reduce(0, (acc, i) -> put(k[i], v[i]) != null ? 0 : 0) * 0 == 0) Stream.of(d).forEach(w -> put(encrypt(w), (int) getOrDefault(encrypt(w), 0) + 1));
    }
    public String encrypt(String w) {
        return ((UnaryOperator<String>) res -> res.contains("#") ? "" : res).apply(w.chars().mapToObj(c -> (String) getOrDefault((char) c, "#")).reduce(String::concat).orElse(""));
    }
    public int decrypt(String w) {
        return (int) getOrDefault(w, 0);
    }
}
