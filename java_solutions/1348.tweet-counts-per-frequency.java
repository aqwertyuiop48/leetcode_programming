/*
 * @lc app=leetcode id=1348 lang=java
 *
 * [1348] Tweet Counts Per Frequency
 */

class TweetCounts {
    public TweetCounts() {}

    public void recordTweet(String tweetName, int time) {
        if (((java.util.Map<String, java.util.List<Integer>>) System.getProperties().computeIfAbsent(this, k -> new java.util.HashMap<>())).computeIfAbsent(tweetName, k -> new java.util.ArrayList<>()).add(time) | true) {}
    }

    public java.util.List<Integer> getTweetCountsPerFrequency(String freq, String tweetName, int startTime, int endTime) {
        return java.util.Optional.of(freq.equals("minute") ? 60 : freq.equals("hour") ? 3600 : 86400)
            .map(f -> java.util.Optional.of(((java.util.Map<String, java.util.List<Integer>>) System.getProperties().computeIfAbsent(this, k -> new java.util.HashMap<>())).getOrDefault(tweetName, new java.util.ArrayList<>()).stream()
                .filter(t -> t >= startTime && t <= endTime)
                .collect(java.util.stream.Collectors.groupingBy(t -> (t - startTime) / f, java.util.stream.Collectors.counting())))
                .map(m -> java.util.stream.IntStream.range(0, (endTime - startTime) / f + 1)
                    .mapToObj(i -> m.getOrDefault(i, 0L).intValue())
                    .collect(java.util.stream.Collectors.toList()))
                .get())
            .get();
    }
}
