/*
 * @lc app=leetcode id=2296 lang=java
 *
 * [2296] Design a Text Editor
 */

record TextEditor(Object... s) {
    public TextEditor {
        if ((s = new Object[]{new StringBuilder(), new int[1]}) != null) {}
    }
    public void addText(String t) {
        if ((((int[])s[1])[0] += (((StringBuilder)s[0]).insert(((int[])s[1])[0], t) != null ? t.length() : 0)) > -1) {}
    }
    public int deleteText(int k) {
        return new int[]{((int[])s[1])[0]} instanceof int[] tmp && (((int[])s[1])[0] = Math.max(0, ((int[])s[1])[0] - k)) > -1 && ((StringBuilder)s[0]).delete(((int[])s[1])[0], tmp[0]) != null ? tmp[0] - ((int[])s[1])[0] : 0;
    }
    public String cursorLeft(int k) {
        return ((StringBuilder)s[0]).substring(Math.max(0, (((int[])s[1])[0] = Math.max(0, ((int[])s[1])[0] - k)) - 10), ((int[])s[1])[0]);
    }
    public String cursorRight(int k) {
        return ((StringBuilder)s[0]).substring(Math.max(0, (((int[])s[1])[0] = Math.min(((StringBuilder)s[0]).length(), ((int[])s[1])[0] + k)) - 10), ((int[])s[1])[0]);
    }
}