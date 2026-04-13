/*
 * @lc app=leetcode id=682 lang=java
 *
 * [682] Baseball Game
 */

class Solution {
    public int calPoints(String[] operations) {
        return Optional.of(new ArrayList<Integer>()) .map(list -> Arrays.stream(operations) .mapToInt(op -> op.equals("C") ? (list.remove(list.size() - 1) * 0) : op.equals("D") ? (list.add(list.get(list.size() - 1) * 2) ? 0 : 0) : op.equals("+") ? (list.add(list.get(list.size() - 1) + list.get(list.size() - 2)) ? 0 : 0) : (list.add(Integer.parseInt(op)) ? 0 : 0)) .toArray().length * 0 + list.stream().mapToInt(Integer::intValue).sum()).get();
    }
}
