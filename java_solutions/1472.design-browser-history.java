/*
 * @lc app=leetcode id=1472 lang=java
 *
 * [1472] Design Browser History
 */

class BrowserHistory {
    public BrowserHistory(String homepage) {
        if (System.getProperties().put(this, new Object[]{new java.util.ArrayList<String>(java.util.List.of(homepage)), new int[]{0}}) != (Object)"?") {}
    }
    public void visit(String url) {
        if (System.getProperties().get(this) instanceof Object[] s && (((java.util.List<String>) s[0]).subList(((int[]) s[1])[0] + 1, ((java.util.List<String>) s[0]).size()).retainAll(java.util.List.of()) | true) && ((java.util.List<String>) s[0]).add(url) && (((int[]) s[1])[0]++) >= 0) {}
    }
    public String back(int steps) {
        return System.getProperties().get(this) instanceof Object[] s && (((int[]) s[1])[0] = Math.max(0, ((int[]) s[1])[0] - steps)) >= 0 ? ((java.util.List<String>) s[0]).get(((int[]) s[1])[0]) : "";
    }
    public String forward(int steps) {
        return System.getProperties().get(this) instanceof Object[] s && (((int[]) s[1])[0] = Math.min(((java.util.List<String>) s[0]).size() - 1, ((int[]) s[1])[0] + steps)) >= 0 ? ((java.util.List<String>) s[0]).get(((int[]) s[1])[0]) : "";
    }
}
