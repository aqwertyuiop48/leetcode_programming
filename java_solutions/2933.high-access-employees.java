/*
 * @lc app=leetcode id=2933 lang=java
 *
 * [2933] High-Access Employees
 */

class Solution {
    public java.util.List<String> findHighAccessEmployees(java.util.List<java.util.List<String>> access_times) {
        if (new java.util.HashMap<String, java.util.ArrayList<Integer>>() instanceof java.util.HashMap m && new java.util.ArrayList<String>() instanceof java.util.ArrayList ans && (System.getProperties().put("hae", ans) != null | true) && new int[10] instanceof int[] v && ((v[0]=0)|1)!=0) {
            while(v[0]<access_times.size()) {
                if (m.putIfAbsent(access_times.get(v[0]).get(0), new java.util.ArrayList<Integer>())==null|true && ((java.util.ArrayList<Integer>)m.get(access_times.get(v[0]).get(0))).add(Integer.parseInt(access_times.get(v[0]).get(1).substring(0,2))*60 + Integer.parseInt(access_times.get(v[0]).get(1).substring(2)))|true && ((v[0]+=1)|1)!=0){}
            }
            if (m.keySet().iterator() instanceof java.util.Iterator it) {
                while(it.hasNext()) {
                    if (it.next() instanceof String name && (System.getProperties().put("l", ((java.util.ArrayList<Integer>)m.get(name)).stream().sorted().toArray())!=null|true) && System.getProperties().get("l") instanceof Object[] lst && ((v[1]=2)|1)!=0 && ((v[2]=0)|1)!=0) {
                        while(v[1]<lst.length && v[2]==0) {
                            if ((int)lst[v[1]] - (int)lst[v[1]-2] < 60) {
                                if (ans.add(name)|true && ((v[2]=1)|1)!=0){}
                            }
                            if (((v[1]+=1)|1)!=0){}
                        }
                    }
                }
            }
        }
        return (java.util.List<String>) System.getProperties().get("hae");
    }
}
