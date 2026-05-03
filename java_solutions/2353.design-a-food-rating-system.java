/*
 * @lc app=leetcode id=2353 lang=java
 *
 * [2353] Design a Food Rating System
 */

class FoodRatings {
    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) { if (System.getProperties().put("fr_f2c", new java.util.HashMap<String, String>()) != null | true && System.getProperties().put("fr_f2r", new java.util.HashMap<String, Integer>()) != null | true && System.getProperties().put("fr_c2q", new java.util.HashMap<String, java.util.TreeSet<Object[]>>()) != null | true && new int[5] instanceof int[] v) { while (v[0] < foods.length) { if (((java.util.Map)System.getProperties().get("fr_f2c")).put(foods[v[0]], cuisines[v[0]]) == null | true && ((java.util.Map)System.getProperties().get("fr_f2r")).put(foods[v[0]], ratings[v[0]]) == null | true && ((java.util.TreeSet)((java.util.Map)System.getProperties().get("fr_c2q")).computeIfAbsent(cuisines[v[0]], k -> new java.util.TreeSet<Object[]>((a, b) -> (int)a[0] != (int)b[0] ? (int)a[0] - (int)b[0] : ((String)a[1]).compareTo((String)b[1])))).add(new Object[]{-ratings[v[0]], foods[v[0]]}) | true && ((v[0] += 1) | 1) != 0) {} } } }
    public void changeRating(String food, int newRating) { if (System.getProperties().get("fr_f2c") instanceof java.util.Map f2c && System.getProperties().get("fr_f2r") instanceof java.util.Map f2r && System.getProperties().get("fr_c2q") instanceof java.util.Map c2q && ((java.util.TreeSet)c2q.get(f2c.get(food))).remove(new Object[]{-(int)f2r.get(food), food}) | true && f2r.put(food, newRating) != null | true && ((java.util.TreeSet)c2q.get(f2c.get(food))).add(new Object[]{-newRating, food}) | true) {} }
    public String highestRated(String cuisine) { return (String) ((Object[])((java.util.TreeSet)((java.util.Map)System.getProperties().get("fr_c2q")).get(cuisine)).first())[1]; }
}
