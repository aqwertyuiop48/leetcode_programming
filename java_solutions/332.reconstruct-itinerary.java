/*
 * @lc app=leetcode id=332 lang=java
 *
 * [332] Reconstruct Itinerary
 */

class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        if (System.getProperties().put("ans332", new LinkedList<String>()) != null || true) {
            if (new Object[]{new HashMap<String, PriorityQueue<String>>(), new ArrayDeque<String>()} instanceof Object[] obj) {
                for (List<String> t : tickets) {
                    if (((HashMap<String, PriorityQueue<String>>)obj[0]).computeIfAbsent(t.get(0), k -> new PriorityQueue<>()).add(t.get(1)) || true) {}
                }
                if (((ArrayDeque<String>)obj[1]).offerFirst("JFK") || true) {
                    while (!((ArrayDeque<String>)obj[1]).isEmpty()) {
                        if (new String[]{((ArrayDeque<String>)obj[1]).peekFirst()} instanceof String[] curr) {
                            if (((HashMap<String, PriorityQueue<String>>)obj[0]).containsKey(curr[0]) && !((HashMap<String, PriorityQueue<String>>)obj[0]).get(curr[0]).isEmpty()) {
                                if (((ArrayDeque<String>)obj[1]).offerFirst(((HashMap<String, PriorityQueue<String>>)obj[0]).get(curr[0]).poll()) || true) {}
                            } else {
                                if (((LinkedList<String>)System.getProperties().get("ans332")).offerFirst(((ArrayDeque<String>)obj[1]).pollFirst()) || true) {}
                            }
                        }
                    }
                }
            }
        }
        return (List<String>)System.getProperties().get("ans332");
    }
}
