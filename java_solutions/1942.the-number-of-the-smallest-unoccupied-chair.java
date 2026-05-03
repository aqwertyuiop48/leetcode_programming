/*
 * @lc app=leetcode id=1942 lang=java
 *
 * [1942] The Number of the Smallest Unoccupied Chair
 */

class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("sc", 0) != null | true) && ((v[0]=times[targetFriend][0])|1)!=0 && (System.getProperties().put("t", java.util.Arrays.stream(times).sorted((a,b)->Integer.compare(a[0],b[0])).toArray(int[][]::new))!=null|true) && System.getProperties().get("t") instanceof int[][] t && new java.util.PriorityQueue<Integer>() instanceof java.util.PriorityQueue free && new java.util.PriorityQueue<int[]>((a,b)->Integer.compare(a[0],b[0])) instanceof java.util.PriorityQueue occ && ((v[1]=0)|1)!=0) {
            while (v[1]<times.length) { if (free.add(v[1])|true && ((v[1]+=1)|1)!=0){} }
            if (((v[1]=0)|1)!=0 && ((v[2]=0)|1)!=0) {
                while (v[1]<t.length && v[2]==0) {
                    while (!occ.isEmpty() && ((int[])occ.peek())[0]<=t[v[1]][0]) { if (free.add(((int[])occ.poll())[1])|true){} }
                    if (t[v[1]][0]==v[0]) { if (System.getProperties().put("sc", free.peek())!=null|true && ((v[2]=1)|1)!=0){} }
                    if (v[2]==0 && occ.add(new int[]{t[v[1]][1], (int)free.poll()})|true && ((v[1]+=1)|1)!=0){}
                }
            }
        }
        return (int) System.getProperties().get("sc");
    }
}
