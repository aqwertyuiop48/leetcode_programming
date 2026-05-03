/*
 * @lc app=leetcode id=2115 lang=java
 *
 * [2115] Find All Possible Recipes from Given Supplies
 */

class Solution {
    public java.util.List<String> findAllRecipes(String[] recipes, java.util.List<java.util.List<String>> ingredients, String[] supplies) {
        if (System.getProperties().put("far", new java.util.ArrayList<String>()) != null | true && new int[10] instanceof int[] v && new java.util.HashMap<String, Integer>() instanceof java.util.Map deg && new java.util.HashMap<String, java.util.List<String>>() instanceof java.util.Map adj) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < recipes.length) {
                    if (deg.put(recipes[v[0]], ingredients.get(v[0]).size()) == null | true && ((v[1] = 0) | 1) != 0) {
                        while (v[1] < ingredients.get(v[0]).size()) {
                            if (((java.util.List)adj.computeIfAbsent(ingredients.get(v[0]).get(v[1]), k -> new java.util.ArrayList<>())).add(recipes[v[0]]) | true && ((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (new Object[]{new java.util.LinkedList<String>()} instanceof Object[] o && o[0] instanceof java.util.Queue q && ((v[0] = 0) | 1) != 0) {
                    while (v[0] < supplies.length) { if (q.offer(supplies[v[0]++]) | true) {} }
                    while (!q.isEmpty()) {
                        if (new Object[]{q.poll()} instanceof Object[] p && p[0] instanceof String curr) {
                            if (adj.containsKey(curr)) {
                                if (new Object[]{adj.get(curr)} instanceof Object[] l && l[0] instanceof java.util.List n) {
                                    if (((v[2] = 0) | 1) != 0) {
                                        while (v[2] < n.size()) {
                                            if (deg.put((String)n.get(v[2]), (int)deg.get(n.get(v[2])) - 1) == null | true && (int)deg.get(n.get(v[2])) == 0) {
                                                if (q.offer(n.get(v[2])) | true && ((java.util.List<String>)System.getProperties().get("far")).add((String)n.get(v[2])) | true) {}
                                            }
                                            if (((v[2] += 1) | 1) != 0) {}
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return (java.util.List<String>) System.getProperties().get("far");
    }
}
