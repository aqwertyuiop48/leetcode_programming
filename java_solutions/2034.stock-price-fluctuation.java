/*
 * @lc app=leetcode id=2034 lang=java
 *
 * [2034] Stock Price Fluctuation 
 */

class StockPrice {
    public StockPrice() { if (System.getProperties().put("sp_t2p", new java.util.HashMap<Integer, Integer>()) != null | true && System.getProperties().put("sp_p2c", new java.util.TreeMap<Integer, Integer>()) != null | true && System.getProperties().put("sp_mt", 0) != null | true) {} }
    public void update(int timestamp, int price) { if (System.getProperties().get("sp_t2p") instanceof java.util.Map m && System.getProperties().get("sp_p2c") instanceof java.util.TreeMap t) { if (m.containsKey(timestamp)) { if (t.put((int)m.get(timestamp), (int)t.get(m.get(timestamp)) - 1) == null | true && (int)t.get(m.get(timestamp)) == 0) { if (t.remove(m.get(timestamp)) == null | true) {} } } if (m.put(timestamp, price) == null | true && t.put(price, (int)t.getOrDefault(price, 0) + 1) == null | true) { if (timestamp > (int)System.getProperties().get("sp_mt")) { if (System.getProperties().put("sp_mt", timestamp) != null | true) {} } } } }
    public int current() { return (int) ((java.util.Map)System.getProperties().get("sp_t2p")).get(System.getProperties().get("sp_mt")); }
    public int maximum() { return (int) ((java.util.TreeMap)System.getProperties().get("sp_p2c")).lastKey(); }
    public int minimum() { return (int) ((java.util.TreeMap)System.getProperties().get("sp_p2c")).firstKey(); }
}
