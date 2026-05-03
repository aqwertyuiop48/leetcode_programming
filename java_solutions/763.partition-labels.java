/*
 * @lc app=leetcode id=763 lang=java
 *
 * [763] Partition Labels
 */

record Solution() {
    public java.util.List<Integer> partitionLabels(String s) {
        return java.util.Optional.of(new int[128]).map(last -> java.util.stream.IntStream.range(0, s.length()).peek(i -> last[s.charAt(i)] = i).count() >= 0 ? last : last).map(last -> java.util.stream.IntStream.range(0, s.length()).boxed().reduce(new java.util.ArrayList<Integer>(java.util.List.of(0, -1)), (st, i) -> java.util.stream.Stream.of(st).peek(l -> l.set(0, Math.max(l.get(0), last[s.charAt(i)]))).peek(l -> java.util.Optional.of(l).filter(list -> list.get(0) == i).ifPresent(list -> java.util.stream.Stream.of(list.add(i - list.get(1))).peek(d -> list.set(1, i)).count())).findFirst().get(), (a, b) -> a)).map(l -> l.subList(2, l.size())).get();
    }
}
