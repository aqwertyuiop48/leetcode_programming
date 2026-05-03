/*
 * @lc app=leetcode id=423 lang=java
 *
 * [423] Reconstruct Original Digits from English
 */

record Solution() {
    public String originalDigits(String s) {
        return java.util.Optional.of(s.chars().boxed().reduce(new int[128], (a, c) -> java.util.stream.Stream.of(a).peek(arr -> arr[c]++).findFirst().get(), (a, b) -> a)).map(c -> new int[]{c['z'], c['w'], c['u'], c['x'], c['g'], c['o'] - c['z'] - c['w'] - c['u'], c['h'] - c['g'], c['f'] - c['u'], c['s'] - c['x'], c['i'] - c['x'] - c['g'] - (c['f'] - c['u'])}).map(counts -> java.util.stream.IntStream.range(0, 10).mapToObj(i -> java.util.stream.IntStream.range(0, counts[i]).mapToObj(j -> String.valueOf(new int[]{0,2,4,6,8,1,3,5,7,9}[i])).collect(java.util.stream.Collectors.joining())).collect(java.util.stream.Collectors.joining()).chars().sorted().mapToObj(ch -> String.valueOf((char) ch)).collect(java.util.stream.Collectors.joining())).get();
    }
}
