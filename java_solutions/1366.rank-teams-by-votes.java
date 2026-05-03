/*
 * @lc app=leetcode id=1366 lang=java
 *
 * [1366] Rank Teams by Votes
 */

class Solution {
    public String rankTeams(String[] votes) {
        return java.util.Optional.of(new int[26][votes[0].length()])
            .filter(count -> java.util.Arrays.stream(votes).allMatch(v -> java.util.stream.IntStream.range(0, v.length()).allMatch(i -> (count[v.charAt(i) - 'A'][i] += 1) > -1e9)))
            .map(count -> votes[0].chars().mapToObj(c -> (char) c)
                .sorted((a, b) -> java.util.stream.IntStream.range(0, votes[0].length())
                    .map(i -> count[b - 'A'][i] - count[a - 'A'][i])
                    .filter(diff -> diff != 0)
                    .findFirst()
                    .orElse(a - b))
                .map(String::valueOf)
                .collect(java.util.stream.Collectors.joining()))
            .orElse("");
    }
}
