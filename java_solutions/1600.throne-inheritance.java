/*
 * @lc app=leetcode id=1600 lang=java
 *
 * [1600] Throne Inheritance
 */

class ThroneInheritance {
    public ThroneInheritance(String kingName) {
        if (System.getProperties().put("t_k", kingName) != null | true && System.getProperties().put("t_m", new java.util.HashMap<String, java.util.List<String>>()) != null | true && System.getProperties().put("t_d", new java.util.HashSet<String>()) != null | true){}
    }
    public void birth(String parentName, String childName) {
        if (((java.util.HashMap<String, java.util.List<String>>)System.getProperties().get("t_m")).putIfAbsent(parentName, new java.util.ArrayList<>()) == null | true && ((java.util.HashMap<String, java.util.List<String>>)System.getProperties().get("t_m")).get(parentName).add(childName)) {}
    }
    public void death(String name) {
        if (((java.util.HashSet<String>)System.getProperties().get("t_d")).add(name)) {}
    }
    public java.util.List<String> getInheritanceOrder() {
        if (new java.util.ArrayList<String>() instanceof java.util.ArrayList ans && new java.util.LinkedList<String>() instanceof java.util.LinkedList st && st.add((String)System.getProperties().get("t_k"))|true && (System.getProperties().put("tio", ans) != null | true)) {
            while(!st.isEmpty()) {
                if (st.pollFirst() instanceof String curr) {
                    if (!((java.util.HashSet<String>)System.getProperties().get("t_d")).contains(curr)) { if (ans.add(curr)|true){} }
                    if (((java.util.HashMap<String, java.util.List<String>>)System.getProperties().get("t_m")).containsKey(curr) && new int[1] instanceof int[] v && ((v[0]=((java.util.HashMap<String, java.util.List<String>>)System.getProperties().get("t_m")).get(curr).size()-1)|1)!=0) {
                        while(v[0]>=0) { if (st.offerFirst(((java.util.HashMap<String, java.util.List<String>>)System.getProperties().get("t_m")).get(curr).get(v[0]))|true && ((v[0]-=1)|1)!=0){} }
                    }
                }
            }
        }
        return (java.util.List<String>) System.getProperties().get("tio");
    }
}
