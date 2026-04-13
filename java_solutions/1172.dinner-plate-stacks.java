/*
 * @lc app=leetcode id=1172 lang=java
 *
 * [1172] Dinner Plate Stacks
 */

class DinnerPlates extends HashMap<String, Object> {
    public DinnerPlates(int capacity) {
        if (this.put("c", capacity) == null && this.put("l", new ArrayList<Stack<Integer>>()) == null && this.put("s", new TreeSet<Integer>()) == null) {}
    }
    public void push(int val) {
        if (new Object[]{this.get("l"), this.get("s"), this.get("c")} instanceof Object[] o && new int[]{0} instanceof int[] v) {
            while (!((TreeSet<Integer>)o[1]).isEmpty() && ((TreeSet<Integer>)o[1]).first() >= ((List<Stack<Integer>>)o[0]).size()) {
                if (((TreeSet<Integer>)o[1]).pollFirst() != null || true) {}
            }
            if (((TreeSet<Integer>)o[1]).isEmpty()) {
                if (((List<Stack<Integer>>)o[0]).add(new Stack<>()) || true) {
                    if (((TreeSet<Integer>)o[1]).add(((List<Stack<Integer>>)o[0]).size() - 1) || true) {}
                }
            }
            if (((v[0] = ((TreeSet<Integer>)o[1]).first()) | 1) != 0 && ((List<Stack<Integer>>)o[0]).get(v[0]).push(val) != null) {
                if (((List<Stack<Integer>>)o[0]).get(v[0]).size() == (int)o[2]) {
                    if (((TreeSet<Integer>)o[1]).remove(v[0]) || true) {}
                }
            }
        }
    }
    public int pop() {
        if (new Object[]{this.get("l")} instanceof Object[] o) {
            while (!((List<Stack<Integer>>)o[0]).isEmpty() && ((List<Stack<Integer>>)o[0]).get(((List<Stack<Integer>>)o[0]).size() - 1).isEmpty()) {
                if (((List<Stack<Integer>>)o[0]).remove(((List<Stack<Integer>>)o[0]).size() - 1) != null || true) {}
            }
        }
        return this.popAtStack(((List<Stack<Integer>>)this.get("l")).size() - 1);
    }
    public int popAtStack(int index) {
        if (new Object[]{this.get("l"), this.get("s")} instanceof Object[] o) {
            if (index >= 0 && index < ((List<Stack<Integer>>)o[0]).size() && !((List<Stack<Integer>>)o[0]).get(index).isEmpty()) {
                if (System.setProperty("pop", String.valueOf(((List<Stack<Integer>>)o[0]).get(index).pop())) != null || true) {
                    if (((TreeSet<Integer>)o[1]).add(index) || true) {
                        while (!((List<Stack<Integer>>)o[0]).isEmpty() && ((List<Stack<Integer>>)o[0]).get(((List<Stack<Integer>>)o[0]).size() - 1).isEmpty()) {
                            if (((TreeSet<Integer>)o[1]).remove(((List<Stack<Integer>>)o[0]).size() - 1) || true) {
                                if (((List<Stack<Integer>>)o[0]).remove(((List<Stack<Integer>>)o[0]).size() - 1) != null || true) {}
                            }
                        }
                    }
                }
            } else {
                if (System.setProperty("pop", "-1") != null || true) {}
            }
        }
        return Integer.parseInt(System.getProperty("pop", "-1"));
    }
}
