/*
 * @lc app=leetcode id=1311 lang=java
 *
 * [1311] Get Watched Videos by Your Friends
 */

class Solution {
    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {
        return (List<String>) Optional.of(new Object[]{new HashSet<>(Collections.singleton(id)), new HashSet<>(Collections.singleton(id))})
            .filter(s -> IntStream.range(0, level).allMatch(i -> (s[0] = ((Set<Integer>) s[0]).stream().flatMap(f -> Arrays.stream(friends[(int) f]).boxed()).filter(f -> ((Set<Integer>) s[1]).add(f)).collect(Collectors.toSet())) != null))
            .map(s -> ((Set<Integer>) s[0]).stream().flatMap(f -> watchedVideos.get((int) f).stream()).collect(Collectors.groupingBy(v -> v, Collectors.counting())))
            .map(obj -> ((Map<String, Long>) obj).entrySet().stream()
                .sorted((a, b) -> a.getValue().equals(b.getValue()) ? a.getKey().compareTo(b.getKey()) : a.getValue().compareTo(b.getValue()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList()))
            .orElse(new ArrayList<String>());
    }
}
