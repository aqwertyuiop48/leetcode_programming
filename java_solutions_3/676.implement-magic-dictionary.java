/*
 * @lc app=leetcode id=676 lang=java
 *
 * [676] Implement Magic Dictionary
 */

class MagicDictionary extends java.util.concurrent.atomic.AtomicReference<java.util.List<String>> {
    public MagicDictionary() {
        if (compareAndSet(null, new java.util.ArrayList<>())) {}
    }

    public void buildDict(String[] dictionary) {
        if (get().addAll(java.util.Arrays.asList(dictionary))) {}
    }

    public boolean search(String searchWord) {
        return get().stream().anyMatch(x -> x.length() == searchWord.length() && java.util.stream.IntStream.range(0, x.length()).filter(i -> x.charAt(i) != searchWord.charAt(i)).count() == 1);
    }
}
