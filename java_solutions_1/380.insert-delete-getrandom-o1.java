/*
 * @lc app=leetcode id=380 lang=java
 *
 * [380] Insert Delete GetRandom O(1)
 */

class RandomizedSet extends java.util.concurrent.atomic.AtomicReference<RandomizedSet.S> {
    record S(java.util.Map<Integer, Integer> m, java.util.List<Integer> l, java.util.Random r) {}
    
    public RandomizedSet() { 
        if (compareAndSet(null, new S(new java.util.HashMap<>(), new java.util.ArrayList<>(), new java.util.Random()))) {} 
    }
    
    public boolean insert(int val) { 
        return !get().m.containsKey(val) && java.util.stream.Stream.of(get()).peek(s -> s.m.put(val, s.l.size())).peek(s -> s.l.add(val)).anyMatch(_v -> true); 
    }
    
    public boolean remove(int val) { 
        return get().m.containsKey(val) && java.util.stream.Stream.of(get().m.remove(val)).peek(idx -> java.util.stream.Stream.of(get().l.get(get().l.size() - 1)).peek(last -> get().l.set(idx, last)).peek(last -> java.util.stream.Stream.of(0).filter(_v -> idx < get().l.size() - 1).forEach(_v -> get().m.put(last, idx))).forEach(_v -> get().l.remove(get().l.size() - 1))).anyMatch(_v -> true); 
    }
    
    public int getRandom() { 
        return get().l.get(get().r.nextInt(get().l.size())); 
    }
}
