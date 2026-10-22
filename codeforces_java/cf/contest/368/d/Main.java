import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m && Integer.valueOf(it.next()) instanceof Integer p
            && IntStream.range(0, n).map(i -> it.next()).toArray() instanceof int[] a
            && new HashMap<Integer, Integer>() instanceof HashMap<Integer, Integer> id
            && IntStream.range(0, m).map(i -> it.next()).toArray() instanceof int[] b
            && Arrays.stream(b).allMatch(x -> id.putIfAbsent(x, id.size()) == null || true)
            && Integer.valueOf(id.size()) instanceof Integer d && new int[d] instanceof int[] need && new int[d] instanceof int[] cur
            && Arrays.stream(b).allMatch(x -> ++need[id.get(x)] > 0)
            && Arrays.stream(a).map(x -> id.getOrDefault(x, -1)).toArray() instanceof int[] aid
            && new int[]{d, 0} instanceof int[] st
            && ((IntUnaryOperator) c -> c < 0 ? st[1]++ : (st[0] += (cur[c]++ == need[c] ? 1 : 0) + (cur[c] == need[c] ? -1 : 0))) instanceof IntUnaryOperator add
            && ((IntUnaryOperator) c -> c < 0 ? st[1]-- : (st[0] += (cur[c]-- == need[c] ? 1 : 0) + (cur[c] == need[c] ? -1 : 0))) instanceof IntUnaryOperator rem
            && new ArrayList<Integer>() instanceof ArrayList<Integer> res
            && IntStream.range(0, Math.min(p, n)).allMatch(r -> Integer.valueOf((n - 1 - r) / p + 1) instanceof Integer len
                && IntStream.range(0, len).allMatch(k -> add.applyAsInt(aid[r + k * p]) >= 0
                    && (k < m || rem.applyAsInt(aid[r + (k - m) * p]) >= 0)
                    && (k < m - 1 || st[1] > 0 || st[0] > 0 || res.add(r + (k - m + 1) * p + 1)))
                && IntStream.range(Math.max(0, len - m), len).allMatch(k -> rem.applyAsInt(aid[r + k * p]) >= 0))
            ? res.size() + "\n" + res.stream().sorted().map(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
