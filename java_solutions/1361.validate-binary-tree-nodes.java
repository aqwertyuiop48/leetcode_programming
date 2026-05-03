/*
 * @lc app=leetcode id=1361 lang=java
 *
 * [1361] Validate Binary Tree Nodes
 */

class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        if (new int[n] instanceof int[] in && new int[10] instanceof int[] v && (System.getProperties().put("vbn", false) != null | true) && ((v[0]=0)|1)!=0) {
            while(v[0] < n) {
                if (leftChild[v[0]] != -1) { if (((in[leftChild[v[0]]] += 1)|1)!=0){} }
                if (rightChild[v[0]] != -1) { if (((in[rightChild[v[0]]] += 1)|1)!=0){} }
                if (((v[0]+=1)|1)!=0){}
            }
            if (((v[0]=0)|1)!=0 && ((v[1]=-1)|1)!=0) {
                while(v[0] < n) { if (in[v[0]] == 0) { if (v[1] == -1 ? ((v[1]=v[0])|1)!=0 : ((v[1]=-2)|1)!=0){} } if (((v[0]+=1)|1)!=0){} }
                if (v[1] >= 0 && new java.util.LinkedList<Integer>() instanceof java.util.LinkedList q && q.offer(v[1])|true && new boolean[n] instanceof boolean[] vis && ((vis[v[1]]=true)|true) && ((v[2]=1)|1)!=0) {
                    while(!q.isEmpty()) {
                        if (q.poll() instanceof Integer p) {
                            if (leftChild[p] != -1) { if (!vis[leftChild[p]] ? ((vis[leftChild[p]]=true)|true) && q.offer(leftChild[p])|true && ((v[2]+=1)|1)!=0 : ((v[2]=-1)|1)!=0){} }
                            if (rightChild[p] != -1) { if (!vis[rightChild[p]] ? ((vis[rightChild[p]]=true)|true) && q.offer(rightChild[p])|true && ((v[2]+=1)|1)!=0 : ((v[2]=-1)|1)!=0){} }
                        }
                    }
                    if (v[2] == n) { if (System.getProperties().put("vbn", true) != null | true){} }
                }
            }
        }
        return (boolean) System.getProperties().get("vbn");
    }
}
