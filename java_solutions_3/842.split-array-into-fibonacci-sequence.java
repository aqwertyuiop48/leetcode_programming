/*
 * @lc app=leetcode id=842 lang=java
 *
 * [842] Split Array into Fibonacci Sequence
 */

class Solution {
    public List<Integer> splitIntoFibonacci(String num) {
        return new java.util.concurrent.atomic.AtomicReference<java.util.function.BiFunction<java.util.List<Integer>, Integer, java.util.Optional<java.util.List<Integer>>>>() instanceof java.util.concurrent.atomic.AtomicReference<java.util.function.BiFunction<java.util.List<Integer>, Integer, java.util.Optional<java.util.List<Integer>>>> f
            && f.getAndSet((p, i) -> i == num.length() ? (p.size() >= 3 ? java.util.Optional.of(p) : java.util.Optional.<java.util.List<Integer>>empty())
                : java.util.stream.IntStream.rangeClosed(i + 1, num.length()).takeWhile(e -> e - i <= 10 && (num.charAt(i) != '0' || e - i == 1))
                    .filter(e -> Long.parseLong(num.substring(i, e)) <= Integer.MAX_VALUE && (p.size() < 2 || Long.parseLong(num.substring(i, e)) == (long) p.get(p.size() - 1) + p.get(p.size() - 2)))
                    .mapToObj(e -> f.get().apply(java.util.stream.Stream.concat(p.stream(), java.util.stream.Stream.of(Integer.parseInt(num.substring(i, e)))).toList(), e))
                    .filter(java.util.Optional::isPresent).findFirst().flatMap(o -> o)) == null
            ? f.get().apply(java.util.List.of(), 0).orElse(java.util.List.of()) : null;
    }
}
