/*
 * @lc app=leetcode id=706 lang=java
 *
 * [706] Design HashMap
 */

class MyHashMap {
    public MyHashMap() { if (System.getProperties().put(this, java.util.stream.IntStream.generate(() -> -1).limit(1000001).toArray()) == null) {} }
    public void put(int key, int value) { if ((((int[])System.getProperties().get(this))[key] = value) >= -1) {} }
    public int get(int key) { return ((int[])System.getProperties().get(this))[key]; }
    public void remove(int key) { if ((((int[])System.getProperties().get(this))[key] = -1) == -1) {} }
}
