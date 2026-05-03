/*
 * @lc app=leetcode id=1604 lang=java
 *
 * [1604] Alert Using Same Key-Card Three or More Times in a One Hour Period
 */

class Solution {
    public java.util.List<String> alertNames(String[] keyName, String[] keyTime) {
        if (new java.util.HashMap<String, java.util.List<Integer>>() instanceof java.util.HashMap m && new java.util.ArrayList<String>() instanceof java.util.ArrayList ans && (System.getProperties().put("an", ans) != null | true) && new int[10] instanceof int[] v && ((v[0]=0)|1)!=0) {
            while (v[0] < keyName.length) {
                if (m.putIfAbsent(keyName[v[0]], new java.util.ArrayList<Integer>()) == null | true && ((java.util.List<Integer>)m.get(keyName[v[0]])).add(Integer.parseInt(keyTime[v[0]].substring(0,2)) * 60 + Integer.parseInt(keyTime[v[0]].substring(3))) | true && ((v[0]+=1)|1)!=0){}
            }
            if (m.keySet().iterator() instanceof java.util.Iterator it) {
                while (it.hasNext()) {
                    if (it.next() instanceof String name && (System.getProperties().put("lst", ((java.util.List<Integer>)m.get(name)).stream().sorted().toArray()) != null | true) && System.getProperties().get("lst") instanceof Object[] lst && ((v[1]=2)|1)!=0 && ((v[2]=0)|1)!=0) {
                        while (v[1] < lst.length && v[2] == 0) {
                            if ((int)lst[v[1]] - (int)lst[v[1]-2] <= 60) { if (ans.add(name) | true && ((v[2]=1)|1)!=0){} }
                            if (((v[1]+=1)|1)!=0){}
                        }
                    }
                }
                if (System.getProperties().put("an", ans.stream().sorted().collect(java.util.stream.Collectors.toList())) != null | true){}
            }
        }
        return (java.util.List<String>) System.getProperties().get("an");
    }
}
