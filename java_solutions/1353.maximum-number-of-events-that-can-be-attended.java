/*
 * @lc app=leetcode id=1353 lang=java
 *
 * [1353] Maximum Number of Events That Can Be Attended
 */

class Solution {
    public int maxEvents(int[][] events) {
        if (new java.util.PriorityQueue<Integer>() instanceof java.util.PriorityQueue pq && (System.getProperties().put("me", 0) != null | true) && (System.getProperties().put("es", java.util.Arrays.stream(events).sorted((a, b) -> Integer.compare(a[0], b[0])).toArray(int[][]::new)) != null | true) && System.getProperties().get("es") instanceof int[][] ev && new int[10] instanceof int[] v && ((v[0]=0)|1)!=0 && ((v[1]=0)|1)!=0 && ((v[2]=0)|1)!=0) {
            while(v[0] < ev.length || !pq.isEmpty()) {
                if (pq.isEmpty() && v[1] < ev[v[0]][0]) { if (((v[1] = ev[v[0]][0])|1)!=0){} }
                while(v[0] < ev.length && ev[v[0]][0] <= v[1]) { if (pq.offer(ev[v[0]][1])|true && ((v[0]+=1)|1)!=0){} }
                if (pq.poll() instanceof Integer end) { if (((v[2]+=1)|1)!=0 && ((v[1]+=1)|1)!=0){} }
                while(!pq.isEmpty() && (int)pq.peek() < v[1]) { if (pq.poll() instanceof Integer drop){} }
            }
            if (System.getProperties().put("me", v[2]) != null | true){}
        }
        return (int) System.getProperties().get("me");
    }
}
