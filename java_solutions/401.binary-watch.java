/*
 * @lc app=leetcode id=401 lang=java
 *
 * [401] Binary Watch
 */

record Solution() {
    public java.util.List<String> readBinaryWatch(int turnedOn) {
        return java.util.stream.IntStream.range(0, 720).filter(i -> Integer.bitCount(i / 60) + Integer.bitCount(i % 60) == turnedOn).mapToObj(i -> String.format("%d:%02d", i / 60, i % 60)).collect(java.util.stream.Collectors.toList());
    }
}
