/*
 * @lc app=leetcode id=341 lang=java
 *
 * [341] Flatten Nested List Iterator
 */

record NestedIterator(java.util.List<NestedInteger> l) implements java.util.Iterator<Integer> {
    public NestedIterator { if ((l = new java.util.ArrayList<>(l)) != null) {} }
    public Integer next() { return l.remove(0).getInteger(); }
    public boolean hasNext() { return java.util.stream.Stream.iterate(0, d -> !l.isEmpty() && !l.get(0).isInteger(), d -> java.util.Optional.of(l.remove(0).getList()).map(sub -> l.addAll(0, sub) ? 0 : 0).get()).count() >= 0 && !l.isEmpty(); }
}
