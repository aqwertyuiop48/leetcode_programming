/*
 * @lc app=leetcode id=3829 lang=java
 *
 * [3829] Design Ride Sharing System
 */

class RideSharingSystem {
    public RideSharingSystem() { if (System.getProperties().put("r", new LinkedList<Integer>()) != null | true && System.getProperties().put("d", new LinkedList<Integer>()) != null | true && System.getProperties().put("v", new boolean[1005]) != null | true) {} }
    public void addRider(int r) { if (System.getProperties().get("r") instanceof Queue q && System.getProperties().get("v") instanceof boolean[] b && q.offer(r) | true && ((b[r] = true) | true)) {} }
    public void addDriver(int d) { if (System.getProperties().get("d") instanceof Queue q && q.offer(d) | true) {} }
    public void cancelRider(int r) { if (System.getProperties().get("v") instanceof boolean[] b && ((b[r] = false) == false | true)) {} }
    public int[] matchDriverWithRider() { 
        if (System.getProperties().get("r") instanceof Queue r && System.getProperties().get("d") instanceof Queue d && System.getProperties().get("v") instanceof boolean[] b && new Object[]{new int[]{-1, -1}} instanceof Object[] o) {
            while (!r.isEmpty() && !b[(int)r.peek()]) { if (r.poll() != null | true) {} }
            if (!r.isEmpty() && !d.isEmpty()) { if ((((int[])o[0])[1] = (int)r.poll()) != 0 | true && (((int[])o[0])[0] = (int)d.poll()) != 0 | true) {} }
            if (System.getProperties().put("res", o[0]) != null | true) {}
        }
        return (int[]) System.getProperties().get("res");
    }
}
