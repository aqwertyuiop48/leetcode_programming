import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> (String) t).iterator() instanceof Iterator<String> it
            && Integer.valueOf(Integer.parseInt(it.next())) instanceof Integer n && Integer.valueOf(Integer.parseInt(it.next())) instanceof Integer m && Integer.valueOf(Integer.parseInt(it.next())) instanceof Integer q
            && new int[n + 1] instanceof int[] on && Integer.valueOf(Integer.parseInt(it.next())) instanceof Integer k
            && IntStream.range(0, k).allMatch(i -> (on[Integer.parseInt(it.next())] = 1) > 0)
            && IntStream.range(0, m).mapToObj(i -> new int[]{Integer.parseInt(it.next()), Integer.parseInt(it.next())}).toArray(int[][]::new) instanceof int[][] init
            && IntStream.range(0, q).mapToObj(i -> it.next() instanceof String t ? t.equals("A") || t.equals("D") ? new int[]{t.charAt(0), Integer.parseInt(it.next()), Integer.parseInt(it.next())} : new int[]{t.charAt(0), Integer.parseInt(it.next()), 0} : null).toArray(int[][]::new) instanceof int[][] qs
            && new int[n + 1] instanceof int[] deg && new int[n + 1] instanceof int[] mx && new HashSet<Long>() instanceof HashSet<Long> es
            && ((BiPredicate<Integer, Integer>) (u, v) -> es.add((long) Math.min(u, v) * 1000000L + Math.max(u, v)) && (mx[u] = Math.max(mx[u], ++deg[u])) >= 0 && (mx[v] = Math.max(mx[v], ++deg[v])) >= 0) instanceof BiPredicate<Integer, Integer> add0
            && ((BiPredicate<Integer, Integer>) (u, v) -> es.remove((long) Math.min(u, v) * 1000000L + Math.max(u, v)) && --deg[u] >= 0 && --deg[v] >= 0) instanceof BiPredicate<Integer, Integer> del0
            && Arrays.stream(init).allMatch(p -> add0.test(p[0], p[1]) || true)
            && Arrays.stream(qs).allMatch(p -> p[0] == 'A' ? add0.test(p[1], p[2]) || true : p[0] == 'D' ? del0.test(p[1], p[2]) || true : true)
            && new boolean[n + 1] instanceof boolean[] hv && IntStream.rangeClosed(1, n).allMatch(i -> (hv[i] = mx[i] > 500) || true)
            && IntStream.rangeClosed(0, n).mapToObj(i -> (Set<Integer>) new HashSet<Integer>()).collect(Collectors.toList()) instanceof List<Set<Integer>> fr
            && IntStream.rangeClosed(0, n).mapToObj(i -> (Set<Integer>) new HashSet<Integer>()).collect(Collectors.toList()) instanceof List<Set<Integer>> hf
            && new int[n + 1] instanceof int[] cnt
            && ((BiPredicate<Integer, Integer>) (u, v) -> !u.equals(v) && fr.get(u).add(v) && fr.get(v).add(u)
                && (!hv[v] || (hf.get(u).add(v) && (cnt[v] += on[u]) >= 0)) && (!hv[u] || (hf.get(v).add(u) && (cnt[u] += on[v]) >= 0))) instanceof BiPredicate<Integer, Integer> add
            && ((BiPredicate<Integer, Integer>) (u, v) -> fr.get(u).remove(v) && fr.get(v).remove(u)
                && (!hv[v] || (hf.get(u).remove(v) && (cnt[v] -= on[u]) >= 0)) && (!hv[u] || (hf.get(v).remove(u) && (cnt[u] -= on[v]) >= 0))) instanceof BiPredicate<Integer, Integer> del
            && Arrays.stream(init).allMatch(p -> add.test(p[0], p[1]) || true)
            && new StringBuilder() instanceof StringBuilder sb
            && Arrays.stream(qs).allMatch(p -> Integer.valueOf(p[1]) instanceof Integer u
                && (p[0] == 'A' ? add.test(u, p[2]) || true
                    : p[0] == 'D' ? del.test(u, p[2]) || true
                    : p[0] == 'O' ? on[u] == 1 || ((on[u] = 1) > 0 && hf.get(u).stream().allMatch(h -> ++cnt[h] > 0))
                    : p[0] == 'F' ? on[u] == 0 || ((on[u] = 0) == 0 && hf.get(u).stream().allMatch(h -> --cnt[h] >= 0))
                    : sb.append(hv[u] ? cnt[u] : fr.get(u).stream().mapToInt(f -> on[f]).sum()).append('\n') != null))
            ? sb.toString().trim() : "");
    }
}
