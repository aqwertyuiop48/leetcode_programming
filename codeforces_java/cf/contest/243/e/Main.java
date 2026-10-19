import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        new Thread(null, () -> System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(s -> !s.isEmpty()).toArray(String[]::new) instanceof String[] tk
            && Integer.valueOf(tk[0]) instanceof Integer n
            && new HashMap<Object, int[]>() instanceof HashMap<Object, int[]> info
            && new boolean[n] instanceof boolean[] inS && new int[1] instanceof int[] need && new Object[1] instanceof Object[] tree
            && new AtomicReference<Function<Object, int[]>>() instanceof AtomicReference<Function<Object, int[]>> compR
            && compR.compareAndSet(null, o -> (o instanceof Integer x
                    ? new int[]{1, inS[x] ? 1 : 0}
                    : ((List<Object>) ((Object[]) o)[1]).stream().map(k -> compR.get().apply(k)).toList() instanceof List<int[]> qs
                        ? new int[]{qs.stream().mapToInt(q -> q[0]).sum(), qs.stream().mapToInt(q -> q[1]).sum()} : null) instanceof int[] r
                && (info.put(o, r) == null || true) ? r : null)
            && (Function<Object, Integer>) (o -> info.get(o) instanceof int[] r ? (r[1] == 0 ? 0 : r[1] == r[0] ? 2 : 1) : -1) instanceof Function<Object, Integer> lab
            && (BiFunction<Integer, List<Object>, Object>) ((ty, l) -> l.size() == 1 ? l.get(0) : new Object[]{ty, l}) instanceof BiFunction<Integer, List<Object>, Object> mk
            && (Function<List<Object>, List<Object>>) (s -> s == null ? null : IntStream.range(0, s.size()).<Object>mapToObj(i -> s.get(s.size() - 1 - i)).collect(Collectors.toList())) instanceof Function<List<Object>, List<Object>> rv
            && (Function<List<Object>, Map<Integer, List<Object>>>) (kids -> kids.stream().collect(Collectors.groupingBy(k -> lab.apply(k)))) instanceof Function<List<Object>, Map<Integer, List<Object>>> grp
            && (Predicate<List<Object>>) (c -> c.stream().map(x -> lab.apply(x)).toList() instanceof List<Integer> lb && Integer.valueOf((int) lb.stream().takeWhile(x -> x == 0).count()) instanceof Integer i
                && Integer.valueOf(i + (i < lb.size() && lb.get(i) == 1 ? 1 : 0)) instanceof Integer j && lb.subList(j, lb.size()).stream().allMatch(x -> x == 2)) instanceof Predicate<List<Object>> valid
            && new AtomicReference<Function<Object, List<Object>>>() instanceof AtomicReference<Function<Object, List<Object>>> psR
            && psR.compareAndSet(null, o -> o instanceof Object[] a && (List<Object>) a[1] instanceof List<Object> kids && Integer.valueOf((Integer) a[0]) instanceof Integer ty && grp.apply(kids) instanceof Map<Integer, List<Object>> g
                ? (ty == 0
                    ? (g.getOrDefault(1, List.<Object>of()).size() > 1 ? null
                        : (g.containsKey(1) ? psR.get().apply(g.get(1).get(0)) : new ArrayList<Object>()) instanceof List<Object> pp
                            ? Stream.concat(Stream.concat(g.containsKey(0) ? Stream.of(mk.apply(0, g.get(0))) : Stream.<Object>empty(), pp.stream()), g.containsKey(2) ? Stream.of(mk.apply(0, g.get(2))) : Stream.<Object>empty()).collect(Collectors.toList()) : null)
                    : (valid.test(kids) ? kids : valid.test(rv.apply(kids)) ? rv.apply(kids) : null) instanceof List<Object> use
                        && use.stream().map(k -> lab.apply(k) == 1 ? psR.get().apply(k) : List.<Object>of(k)).toList() instanceof List<List<Object>> parts
                        && parts.stream().noneMatch(Objects::isNull)
                        ? parts.stream().flatMap(List::stream).collect(Collectors.toList()) : null) : null)
            && new AtomicReference<Function<Object, Object>>() instanceof AtomicReference<Function<Object, Object>> rtR
            && rtR.compareAndSet(null, o -> o instanceof Integer ? o
                : o instanceof Object[] a && (List<Object>) a[1] instanceof List<Object> kids && Integer.valueOf((Integer) a[0]) instanceof Integer ty
                    ? (IntStream.range(0, kids.size()).filter(i -> info.get(kids.get(i))[1] == need[0]).boxed().findFirst() instanceof Optional<Integer> idx && idx.isPresent()
                        ? (rtR.get().apply(kids.get(idx.get())) instanceof Object r
                            ? new Object[]{ty, IntStream.range(0, kids.size()).<Object>mapToObj(i -> i == idx.get() ? r : kids.get(i)).collect(Collectors.toList())} : null)
                        : lab.apply(o) == 2 ? o
                        : grp.apply(kids) instanceof Map<Integer, List<Object>> g
                            ? (ty == 0
                                ? (g.getOrDefault(1, List.<Object>of()).size() > 2 ? null
                                    : g.containsKey(1)
                                        ? (psR.get().apply(g.get(1).get(0)) instanceof List<Object> s1
                                            && (g.get(1).size() == 2 ? rv.apply(psR.get().apply(g.get(1).get(1))) : new ArrayList<Object>()) instanceof List<Object> s2
                                            && Stream.concat(Stream.concat(s1.stream(), g.containsKey(2) ? Stream.of(mk.apply(0, g.get(2))) : Stream.<Object>empty()), s2.stream()).collect(Collectors.toList()) instanceof List<Object> seq
                                            ? (g.containsKey(0) ? mk.apply(0, Stream.concat(g.get(0).stream(), Stream.<Object>of((Object) new Object[]{1, seq})).collect(Collectors.toList())) : new Object[]{1, seq}) : null)
                                        : mk.apply(0, Stream.concat(g.getOrDefault(0, List.<Object>of()).stream(), Stream.of(mk.apply(0, g.get(2)))).collect(Collectors.toList())))
                                : (kids.stream().map(k -> lab.apply(k)).toList() instanceof List<Integer> lb
                                    && Integer.valueOf(IntStream.range(0, kids.size()).filter(i -> lb.get(i) != 0).min().getAsInt()) instanceof Integer a0
                                    && Integer.valueOf(IntStream.range(0, kids.size()).filter(i -> lb.get(i) != 0).max().getAsInt()) instanceof Integer b0
                                    && IntStream.range(a0 + 1, b0).allMatch(i -> lb.get(i) == 2)
                                    && IntStream.range(0, kids.size()).mapToObj(i -> lb.get(i) == 1 ? (i == a0 ? psR.get().apply(kids.get(i)) : rv.apply(psR.get().apply(kids.get(i)))) : List.<Object>of(kids.get(i))).toList() instanceof List<List<Object>> parts
                                    && parts.stream().noneMatch(Objects::isNull)
                                    ? (Object) new Object[]{1, parts.stream().flatMap(List::stream).collect(Collectors.toList())} : null)) : null)
                    : null)
            && (tree[0] = mk.apply(0, IntStream.range(0, n).<Object>mapToObj(i -> i).collect(Collectors.toList()))) != null
            && IntStream.range(0, n).allMatch(r -> tree[0] == null || IntStream.range(0, n).allMatch(c -> (inS[c] = tk[1 + r].charAt(c) == '1') || true)
                && Integer.valueOf((int) IntStream.range(0, n).filter(c -> inS[c]).count()) instanceof Integer cnt
                && (cnt <= 1 || ((info.keySet().removeIf(k -> true) || true) && compR.get().apply(tree[0]) != null && (need[0] = cnt) >= 0 && ((tree[0] = rtR.get().apply(tree[0])) == null || true))))
            ? tree[0] == null ? "NO" : new AtomicReference<Function<Object, Stream<Integer>>>() instanceof AtomicReference<Function<Object, Stream<Integer>>> frR
                && frR.compareAndSet(null, o -> o instanceof Integer x ? Stream.of(x) : ((List<Object>) ((Object[]) o)[1]).stream().flatMap(k -> frR.get().apply(k)))
                && frR.get().apply(tree[0]).toList() instanceof List<Integer> ord
                ? "YES\n" + IntStream.range(0, n).mapToObj(i -> ord.stream().map(c -> String.valueOf(tk[1 + i].charAt(c))).collect(Collectors.joining())).collect(Collectors.joining("\n")) : "" : ""), "", 1 << 28).start();
    }
}
