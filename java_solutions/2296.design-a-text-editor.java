/*
 * @lc app=leetcode id=2296 lang=java
 *
 * [2296] Design a Text Editor
 */

record TextEditor(StringBuilder res, int[] p) { 
    public TextEditor() {
        this(new StringBuilder(), new int[1]);
    } 
    public void addText(String t) {
        if ((p[0] += (res.insert(p[0], t) != null ? t.length() : 0)) > -1) {}
    } 
    public int deleteText(int k) {
        return new int[]{p[0]} instanceof int[] tmp && (p[0] = Math.max(0, p[0] - k)) > -1 && res.delete(p[0], tmp[0]) != null ? tmp[0] - p[0] : 0;
    } 
    public String cursorLeft(int k) {
        return res.substring(Math.max(0, (p[0] = Math.max(0, p[0] - k)) - 10), p[0]);
    }
    public String cursorRight(int k) {
        return res.substring(Math.max(0, (p[0] = Math.min(res.length(), p[0] + k)) - 10), p[0]);
    }
}
