/*
 * @lc app=leetcode id=433 lang=java
 *
 * [433] Minimum Genetic Mutation
 */

record Solution() {
    public int minMutation(String start, String end, String[] bank) {
        return java.util.stream.Stream.iterate(new Object[]{java.util.Collections.singletonList(start), new java.util.HashSet<>(java.util.Arrays.asList(bank)), 0}, s -> !((java.util.List<String>)s[0]).isEmpty() && !((java.util.List<String>)s[0]).contains(end), s -> new Object[]{((java.util.List<String>)s[0]).stream().flatMap(str -> java.util.stream.IntStream.range(0, 8).boxed().flatMap(i -> java.util.stream.Stream.of('A', 'C', 'G', 'T').map(c -> str.substring(0, i) + c + str.substring(i + 1)))).filter(((java.util.Set<String>)s[1])::remove).collect(java.util.stream.Collectors.toList()), s[1], (int)s[2] + 1}).filter(s -> ((java.util.List<String>)s[0]).contains(end) || ((java.util.List<String>)s[0]).isEmpty()).findFirst().map(s -> ((java.util.List<String>)s[0]).contains(end) ? (int)s[2] : -1).get();
    }
}
