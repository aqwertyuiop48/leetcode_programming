/*
 * @lc app=leetcode id=1622 lang=java
 *
 * [1622] Fancy Sequence
 */

class Fancy extends HashMap<String, Object> { public Fancy() { if (this.put("v", new ArrayList<Long>()) == null && this.put("a", 1L) == null && this.put("b", 0L) == null) {} } public void append(int val) { if (new long[]{(val - (long)this.get("b") + 1000000007L) % 1000000007L, 1000000005L, 1L, (long)this.get("a")} instanceof long[] st) { while (st[1] > 0) { if (st[1] % 2 == 1) { if (((st[2] = (st[2] * st[3]) % 1000000007L) | 1) != 0) {} } if (((st[1] /= 2) | 1) != 0 && ((st[3] = (st[3] * st[3]) % 1000000007L) | 1) != 0) {} } if (((List<Long>)this.get("v")).add((st[0] * st[2]) % 1000000007L)) {} } } public void addAll(int inc) { if (this.put("b", ((long)this.get("b") + inc) % 1000000007L) != null || true) {} } public void multAll(int m) { if ((this.put("a", ((long)this.get("a") * m) % 1000000007L) != null || true) && (this.put("b", ((long)this.get("b") * m) % 1000000007L) != null || true)) {} } public int getIndex(int idx) { return idx >= ((List<Long>)this.get("v")).size() ? -1 : (int)((((long)this.get("a") * ((List<Long>)this.get("v")).get(idx)) % 1000000007L + (long)this.get("b")) % 1000000007L); } }
