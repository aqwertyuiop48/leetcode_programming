/*
 * @lc app=leetcode id=2895 lang=java
 *
 * [2895] Minimum Processing Time
 */

class Solution {
    public int minProcessingTime(java.util.List<Integer> processorTime, java.util.List<Integer> tasks) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mpt", 0) != null | true) && (System.getProperties().put("pt", processorTime.stream().mapToInt(i->i).sorted().toArray()) != null | true) && (System.getProperties().put("ts", tasks.stream().mapToInt(i->i).boxed().sorted(java.util.Collections.reverseOrder()).mapToInt(i->i).toArray()) != null | true) && System.getProperties().get("pt") instanceof int[] pt && System.getProperties().get("ts") instanceof int[] ts && ((v[0]=0)|1)!=0) {
            while(v[0]<pt.length) {
                if (pt[v[0]] + ts[v[0]*4] > v[1]) { if(((v[1]=pt[v[0]] + ts[v[0]*4])|1)!=0){} }
                if(((v[0]+=1)|1)!=0){}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "mpt", v[1])!=null|true){}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mpt");
    }
}
