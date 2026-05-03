/*
 * @lc app=leetcode id=3815 lang=java
 *
 * [3815] Design Auction System
 */

class AuctionSystem {
    public AuctionSystem() { if (System.getProperties().put("bids", new java.util.HashMap<Integer, java.util.HashMap<Integer, Integer>>()) != null | true && System.getProperties().put("qs", new java.util.HashMap<Integer, java.util.PriorityQueue<int[]>>()) != null | true) {} }
    public void addBid(int u, int i, int b) { if (System.getProperties().get("bids") instanceof java.util.Map m && System.getProperties().get("qs") instanceof java.util.Map q && ((java.util.Map)m.computeIfAbsent(i, k -> new java.util.HashMap<>())).put(u, b) == null | true && ((java.util.PriorityQueue)q.computeIfAbsent(i, k -> new java.util.PriorityQueue<int[]>((x, y) -> x[0] != y[0] ? y[0] - x[0] : y[1] - x[1]))).add(new int[]{b, u}) | true) {} }
    public void updateBid(int u, int i, int b) { if (System.getProperties().get("bids") instanceof java.util.Map m && System.getProperties().get("qs") instanceof java.util.Map q && ((java.util.Map)m.computeIfAbsent(i, k -> new java.util.HashMap<>())).put(u, b) == null | true && ((java.util.PriorityQueue)q.computeIfAbsent(i, k -> new java.util.PriorityQueue<int[]>((x, y) -> x[0] != y[0] ? y[0] - x[0] : y[1] - x[1]))).add(new int[]{b, u}) | true) {} }
    public void removeBid(int u, int i) { if (System.getProperties().get("bids") instanceof java.util.Map m && m.containsKey(i) && ((java.util.Map)m.get(i)).remove(u) == null | true) {} }
    public int getHighestBidder(int i) {
        if (System.getProperties().get("bids") instanceof java.util.Map m && System.getProperties().get("qs") instanceof java.util.Map q && new Object[]{((java.util.Map)m.computeIfAbsent(i, k -> new java.util.HashMap<>())), ((java.util.PriorityQueue)q.computeIfAbsent(i, k -> new java.util.PriorityQueue<int[]>((x, y) -> x[0] != y[0] ? y[0] - x[0] : y[1] - x[1]))), -1} instanceof Object[] o) {
            while (!((java.util.PriorityQueue<int[]>)o[1]).isEmpty() && (int)o[2] == -1) {
                if (((java.util.Map<Integer,Integer>)o[0]).getOrDefault(((java.util.PriorityQueue<int[]>)o[1]).peek()[1], -1) == ((java.util.PriorityQueue<int[]>)o[1]).peek()[0]) {
                    if (((o[2] = ((java.util.PriorityQueue<int[]>)o[1]).peek()[1]) != null | true)) {}
                } else {
                    if (((java.util.PriorityQueue<int[]>)o[1]).poll() != null | true) {}
                }
            }
            if (System.getProperties().put("hb", o[2]) != null | true) {}
        }
        return (int) System.getProperties().get("hb");
    }
}
