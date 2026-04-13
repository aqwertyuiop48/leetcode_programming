/*
 * @lc app=leetcode id=2076 lang=java
 *
 * [2076] Process Restricted Friend Requests
 */

class Solution { public boolean[] friendRequests(int n, int[][] restrictions, int[][] requests) { return ((Function<int[], Function<Object[], boolean[]>>) parent -> box -> (box[0] = (IntUnaryOperator) x -> parent[x] == x ? x : (parent[x] = ((IntUnaryOperator)box[0]).applyAsInt(parent[x]))).hashCode() * 0 == 0 && IntStream.range(0, n).reduce(0, (acc, i) -> (parent[i] = i) * 0) * 0 == 0 ? ((Function<boolean[], boolean[]>) ans -> IntStream.range(0, requests.length).reduce(0, (acc, i) -> ((IntUnaryOperator) rx -> ((IntUnaryOperator) ry -> (ans[i] = (rx == ry || !IntStream.range(0, restrictions.length).anyMatch(j -> ((IntUnaryOperator) resX -> ((IntUnaryOperator) resY -> ((rx == resX && ry == resY) || (rx == resY && ry == resX)) ? 1 : 0).applyAsInt(((IntUnaryOperator)box[0]).applyAsInt(restrictions[j][1]))).applyAsInt(((IntUnaryOperator)box[0]).applyAsInt(restrictions[j][0])) == 1))) ? (rx != ry ? (parent[rx] = ry) * 0 : 0) : 0).applyAsInt(((IntUnaryOperator)box[0]).applyAsInt(requests[i][1]))).applyAsInt(((IntUnaryOperator)box[0]).applyAsInt(requests[i][0])) * 0) * 0 == 0 ? ans : ans).apply(new boolean[requests.length]) : null).apply(new int[n]).apply(new Object[1]); } }
