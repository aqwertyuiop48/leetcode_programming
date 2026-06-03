/*
 * @lc app=leetcode id=211 lang=java
 *
 * [211] Design Add and Search Words Data Structure
 */

// @lc code=start
class WordDictionary extends java.util.HashMap<Character, WordDictionary> {
    public void addWord(String w) {
        if (w.chars().mapToObj(c -> (char) c).reduce(this, (WordDictionary n, Character c) -> n.computeIfAbsent(c, k -> new WordDictionary()), (a, b) -> b).put('\0', null) == null || true) {}
    }

    public boolean search(String w) {
        // 1 Semicolon: Using AtomicReference retains full generic type-safety for the lambda
        return java.util.stream.Stream.of(new java.util.concurrent.atomic.AtomicReference<java.util.function.BiFunction<WordDictionary, Integer, Boolean>>())
            .peek(ref -> ref.set((n, i) -> n != null && (i == w.length() ? n.containsKey('\0') : w.charAt(i) == '.' ? n.values().stream().anyMatch(child -> ref.get().apply(child, i + 1)) : ref.get().apply(n.get(w.charAt(i)), i + 1))))
            .map(ref -> ref.get().apply(this, 0))
            .findFirst()
            .get();
    }
}

// @lc code=end

