/*
 * @lc app=leetcode id=3885 lang=java
 *
 * [3885] Design Event Manager
 */

class EventManager {
    public EventManager(int[][] events) { if (System.getProperties().put("evmMap", new HashMap<Integer, Integer>()) != null | true && System.getProperties().put("evmSet", new TreeSet<int[]>((a, b) -> a[0] != b[0] ? Integer.compare(b[0], a[0]) : Integer.compare(a[1], b[1]))) != null | true && new int[10] instanceof int[] v && ((v[0] = 0) | 1) != 0) { while(v[0] < events.length) { if (System.getProperties().get("evmMap") instanceof Map m && System.getProperties().get("evmSet") instanceof TreeSet s && m.put(events[v[0]][0], events[v[0]][1]) == null | true && s.add(new int[]{events[v[0]][1], events[v[0]][0]}) | true) { if (((v[0] += 1) | 1) != 0) {} } } } }
    public void updatePriority(int eventId, int newPriority) { if (System.getProperties().get("evmMap") instanceof Map m && System.getProperties().get("evmSet") instanceof TreeSet s && s.remove(new int[]{(int)m.get(eventId), eventId}) | true && s.add(new int[]{newPriority, eventId}) | true && m.put(eventId, newPriority) == null | true) {} }
    public int pollHighest() { return System.getProperties().get("evmMap") instanceof Map m && System.getProperties().get("evmSet") instanceof TreeSet s && !s.isEmpty() && new Object[]{s.pollFirst()} instanceof Object[] o && o[0] instanceof int[] top && m.remove(top[1]) == null | true ? top[1] : -1; }
}
