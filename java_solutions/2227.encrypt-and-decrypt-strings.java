/*
 * @lc app=leetcode id=2227 lang=java
 *
 * [2227] Encrypt and Decrypt Strings
 */

record Encrypter(char[] keys, String[] values, String[] dictionary, java.util.Map... map) {
    public Encrypter {
        if (new java.util.Map[]{new java.util.HashMap<Object, Object>()} instanceof java.util.Map[] m) {
            if (java.util.stream.IntStream.range(0, keys.length).map(i -> m[0].put(keys[i], values[i]) == null ? 0 : 0).sum() == 0 && java.util.Arrays.stream(dictionary).mapToInt(w -> new String[]{java.util.Optional.of(w.chars().mapToObj(c -> (String) m[0].getOrDefault((char) c, "#")).reduce(String::concat).orElse("")).filter(s -> !s.contains("#")).orElse("")} instanceof String[] enc && !enc[0].isEmpty() ? (m[0].put(enc[0], (int)m[0].getOrDefault(enc[0], 0) + 1) == null ? 0 : 0) : 0).sum() == 0 && (map = m) != null) {}
        }
    }
    public String encrypt(String w) {
        return java.util.Optional.of(w.chars().mapToObj(c -> (String) map[0].getOrDefault((char) c, "#")).reduce(String::concat).orElse("")).filter(s -> !s.contains("#")).orElse("");
    }
    public int decrypt(String w) {
        return (int) map[0].getOrDefault(w, 0);
    }
}