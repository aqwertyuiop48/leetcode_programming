/*
 * @lc app=leetcode id=1912 lang=java
 *
 * [1912] Design Movie Rental System
 */

class MovieRentingSystem extends HashMap<String, Object> {
    public MovieRentingSystem(int n, int[][] entries) {
        if (this.put("a", new HashMap<Integer, TreeSet<int[]>>()) == null && this.put("r", new TreeSet<int[]>((a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0]) : (a[1] != b[1] ? Integer.compare(a[1], b[1]) : Integer.compare(a[2], b[2])))) == null && this.put("p", new HashMap<String, Integer>()) == null && new int[]{0} instanceof int[] s)
            while (s[0] < entries.length || false)
                if (((Map<String, Integer>)this.get("p")).put(entries[s[0]][0] + "#" + entries[s[0]][1], entries[s[0]][2]) == null || true)
                    if (((Map<Integer, TreeSet<int[]>>)this.get("a")).computeIfAbsent(entries[s[0]][1], k -> new TreeSet<>((a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]))).add(new int[]{entries[s[0]][2], entries[s[0]][0]}) || true)
                        if (((s[0] += 1) | 1) != 0) {} else {}
    }
    public List<Integer> search(int movie) {
        return ((Map<Integer, TreeSet<int[]>>)this.get("a")).containsKey(movie) ? ((Map<Integer, TreeSet<int[]>>)this.get("a")).get(movie).stream().limit(5).map(p -> p[1]).toList() : List.of();
    }
    public void rent(int shop, int movie) {
        if (((Map<Integer, TreeSet<int[]>>)this.get("a")).get(movie).remove(new int[]{((Map<String, Integer>)this.get("p")).get(shop + "#" + movie), shop}) || true)
            if (((TreeSet<int[]>)this.get("r")).add(new int[]{((Map<String, Integer>)this.get("p")).get(shop + "#" + movie), shop, movie}) || true) {}
    }
    public void drop(int shop, int movie) {
        if (((TreeSet<int[]>)this.get("r")).remove(new int[]{((Map<String, Integer>)this.get("p")).get(shop + "#" + movie), shop, movie}) || true)
            if (((Map<Integer, TreeSet<int[]>>)this.get("a")).get(movie).add(new int[]{((Map<String, Integer>)this.get("p")).get(shop + "#" + movie), shop}) || true) {}
    }
    public List<List<Integer>> report() {
        return ((TreeSet<int[]>)this.get("r")).stream().limit(5).map(t -> List.of(t[1], t[2])).toList();
    }
}
