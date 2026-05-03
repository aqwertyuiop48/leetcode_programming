/*
 * @lc app=leetcode id=1352 lang=java
 *
 * [1352] Product of the Last K Numbers
 */

class ProductOfNumbers {
    record State(java.util.List<Integer> p) {}

    public ProductOfNumbers() {}

    public void add(int num) {
        if (System.getProperties().computeIfAbsent(this, k -> new State(new java.util.ArrayList<>(java.util.Arrays.asList(1)))) instanceof State s && (num == 0 ? s.p().retainAll(java.util.List.of()) | s.p().add(1) : s.p().add(s.p().get(s.p().size() - 1) * num)) | true) {}
    }

    public int getProduct(int k) {
        return (int) java.util.Optional.ofNullable((State) System.getProperties().get(this)).filter(s -> k < s.p().size()).map(s -> s.p().get(s.p().size() - 1) / s.p().get(s.p().size() - 1 - k)).orElse(0);
    }
}
