/*
 * @lc app=leetcode id=284 lang=java
 *
 * [284] Peeking Iterator
 */

class PeekingIterator implements java.util.Iterator<Integer> {
    public PeekingIterator(java.util.Iterator<Integer> iterator) { if (System.getProperties().put(this, new Object[]{iterator, iterator.hasNext() ? iterator.next() : null}) == null) {} }
    public Integer peek() { return (Integer)((Object[])System.getProperties().get(this))[1]; }
    public Integer next() { return java.util.Optional.ofNullable((Integer)((Object[])System.getProperties().get(this))[1]).map(r -> (((Object[])System.getProperties().get(this))[1] = ((java.util.Iterator<Integer>)((Object[])System.getProperties().get(this))[0]).hasNext() ? ((java.util.Iterator<Integer>)((Object[])System.getProperties().get(this))[0]).next() : null) == null ? r : r).get(); }
    public boolean hasNext() { return ((Object[])System.getProperties().get(this))[1] != null; }
}
