/*
 * @lc app=leetcode id=1286 lang=java
 *
 * [1286] Iterator for Combination
 */

class CombinationIterator {
    public CombinationIterator(String characters, int combinationLength) {
        if (System.getProperties().put("ci_i", 0) == null | true && System.getProperties().put("ci_l", 
            java.util.stream.IntStream.range(0, 1 << characters.length())
                .filter(i -> Integer.bitCount(i) == combinationLength)
                .mapToObj(i -> java.util.stream.IntStream.range(0, characters.length())
                    .filter(j -> (i & (1 << (characters.length() - 1 - j))) != 0)
                    .mapToObj(j -> String.valueOf(characters.charAt(j)))
                    .collect(java.util.stream.Collectors.joining()))
                .sorted()
                .collect(java.util.stream.Collectors.toList())) == null | true) {}
    }

    public String next() {
        return ((java.util.List<String>) System.getProperties().get("ci_l"))
            .get((int) System.getProperties().put("ci_i", (int) System.getProperties().get("ci_i") + 1));
    }

    public boolean hasNext() {
        return (int) System.getProperties().get("ci_i") < ((java.util.List<String>) System.getProperties().get("ci_l")).size();
    }
}
