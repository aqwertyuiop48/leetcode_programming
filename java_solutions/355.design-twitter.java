/*
 * @lc app=leetcode id=355 lang=java
 *
 * [355] Design Twitter
 */

class Twitter {
    public Twitter() { if (System.getProperties().put(this, new Object[]{new int[]{0}, new java.util.HashMap<Integer, java.util.Set<Integer>>(), new java.util.HashMap<Integer, java.util.List<int[]>>()}) == null) {} }
    public void postTweet(int u, int id) { if (((java.util.Map<Integer, java.util.List<int[]>>)((Object[])System.getProperties().get(this))[2]).computeIfAbsent(u, k -> new java.util.ArrayList<>()).add(new int[]{((int[])((Object[])System.getProperties().get(this))[0])[0]++, id})) {} }
    public void follow(int f1, int u) { if (((java.util.Map<Integer, java.util.Set<Integer>>)((Object[])System.getProperties().get(this))[1]).computeIfAbsent(f1, k -> new java.util.HashSet<>()).add(u)) {} }
    public void unfollow(int f1, int u) { if (((java.util.Map<Integer, java.util.Set<Integer>>)((Object[])System.getProperties().get(this))[1]).getOrDefault(f1, new java.util.HashSet<>()).remove(u) || true) {} }
    public java.util.List<Integer> getNewsFeed(int u) { return java.util.stream.Stream.concat(((java.util.Map<Integer, java.util.Set<Integer>>)((Object[])System.getProperties().get(this))[1]).getOrDefault(u, java.util.Collections.emptySet()).stream(), java.util.stream.Stream.of(u)).distinct().filter(((java.util.Map<Integer, java.util.List<int[]>>)((Object[])System.getProperties().get(this))[2])::containsKey).flatMap(x -> ((java.util.Map<Integer, java.util.List<int[]>>)((Object[])System.getProperties().get(this))[2]).get(x).stream()).sorted((a, b) -> b[0] - a[0]).limit(10).map(a -> a[1]).collect(java.util.stream.Collectors.toList()); }
}
