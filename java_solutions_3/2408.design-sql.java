/*
 * @lc app=leetcode id=2408 lang=java
 *
 * [2408] Design SQL
 */

class SQL extends java.util.concurrent.atomic.AtomicReference<SQL.St> {
    record St(java.util.Map<String, Integer> c, java.util.Map<String, Integer> nx, java.util.Map<String, java.util.TreeMap<Integer, java.util.List<String>>> r) {}

    public SQL(java.util.List<String> names, java.util.List<Integer> columns) {
        if (compareAndSet(null, new St(new java.util.HashMap<>(), new java.util.HashMap<>(), new java.util.HashMap<>())) && get() instanceof St(var c, var nx, var r)
            && java.util.stream.IntStream.range(0, names.size()).allMatch(i -> c.put(names.get(i), columns.get(i)) == null && nx.put(names.get(i), 1) == null && r.put(names.get(i), new java.util.TreeMap<>()) == null)) {}
    }

    public boolean ins(String name, java.util.List<String> row) {
        return get() instanceof St(var c, var nx, var r) && row.size() == c.get(name) && r.get(name).put(nx.merge(name, 1, Integer::sum) - 1, row) == null;
    }

    public void rmv(String name, int rowId) {
        if (get() instanceof St(var c, var nx, var r) && r.get(name).remove(rowId) != null) {}
    }

    public String sel(String name, int rowId, int columnId) {
        return get() instanceof St(var c, var nx, var r)
            ? java.util.Optional.ofNullable(r.get(name).get(rowId)).filter(x -> columnId >= 1 && columnId <= x.size()).map(x -> x.get(columnId - 1)).orElse("<null>") : "";
    }

    public java.util.List<String> exp(String name) {
        return get() instanceof St(var c, var nx, var r) ? r.get(name).entrySet().stream().map(e -> e.getKey() + "," + String.join(",", e.getValue())).toList() : null;
    }
}
