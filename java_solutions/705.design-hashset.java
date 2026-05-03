/*
 * @lc app=leetcode id=705 lang=java
 *
 * [705] Design HashSet
 */

class MyHashSet {
    public MyHashSet() { if (System.getProperties().put(this, new boolean[1000001]) == null) {} }
    public void add(int key) { if ((((boolean[])System.getProperties().get(this))[key] = true)) {} }
    public void remove(int key) { if (!(((boolean[])System.getProperties().get(this))[key] = false)) {} }
    public boolean contains(int key) { return ((boolean[])System.getProperties().get(this))[key]; }
}
