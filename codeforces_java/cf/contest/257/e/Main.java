import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m
            && new int[n] instanceof int[] t && new int[n] instanceof int[] s && new int[n] instanceof int[] fi
            && IntStream.range(0, n).allMatch(i -> (t[i] = it.next()) >= 0 && (s[i] = it.next()) > 0 && (fi[i] = it.next()) > 0)
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingInt(i -> t[i])).mapToInt(i -> i).toArray() instanceof int[] ord
            && new int[m + 2] instanceof int[] bit && new int[m + 2] instanceof int[] cnt && new TreeSet<Integer>() instanceof TreeSet<Integer> fl
            && IntStream.rangeClosed(0, m + 1).mapToObj(i -> new ArrayDeque<Integer>()).toList() instanceof List<ArrayDeque<Integer>> waitAt
            && IntStream.rangeClosed(0, m + 1).mapToObj(i -> new ArrayDeque<Integer>()).toList() instanceof List<ArrayDeque<Integer>> insideAt
            && ((IntBinaryOperator) (a, d) -> (cnt[a] += d) >= 0 && (d > 0 ? cnt[a] != 1 || fl.add(a) : cnt[a] != 0 || fl.remove(a))
                && IntStream.iterate(a, x -> x <= m, x -> x + (x & -x)).allMatch(x -> (bit[x] += d) > Integer.MIN_VALUE) ? 0 : 1) instanceof IntBinaryOperator add
            && ((IntUnaryOperator) i -> IntStream.iterate(i, x -> x > 0, x -> x - (x & -x)).map(x -> bit[x]).sum()) instanceof IntUnaryOperator sum
            && new long[n] instanceof long[] ans && new long[]{1, 0, 0, 0} instanceof long[] st
            && IntStream.iterate(0, z -> st[3] == 0, z -> z + 1).allMatch(z -> Integer.valueOf((int) st[0]) instanceof Integer f
                && IntStream.iterate(0, y -> st[2] < n && t[ord[(int) st[2]]] <= st[1], y -> y + 1).allMatch(y -> Integer.valueOf(ord[(int) st[2]++]) instanceof Integer i && waitAt.get(s[i]).add(i) && add.applyAsInt(s[i], 1) == 0)
                && Stream.generate(insideAt.get(f)::poll).takeWhile(Objects::nonNull).allMatch(i -> (ans[i] = st[1]) >= 0 && add.applyAsInt(f, -1) == 0)
                && Stream.generate(waitAt.get(f)::poll).takeWhile(Objects::nonNull).allMatch(i -> add.applyAsInt(f, -1) == 0 && insideAt.get(fi[i]).add(i) && add.applyAsInt(fi[i], 1) == 0)
                && (sum.applyAsInt(m) == 0 ? st[2] < n ? (st[1] = t[ord[(int) st[2]]]) >= 0 : (st[3] = 1) > 0
                    : Integer.valueOf(sum.applyAsInt(m) - sum.applyAsInt(f)) instanceof Integer up && Integer.valueOf(sum.applyAsInt(f - 1)) instanceof Integer down
                        && Integer.valueOf(up >= down ? fl.higher(f) - f : f - fl.lower(f)) instanceof Integer d
                        && Long.valueOf(Math.min(d, st[2] < n ? t[ord[(int) st[2]]] - st[1] : Long.MAX_VALUE)) instanceof Long k
                        && (st[0] += up >= down ? k : -k) > 0 && (st[1] += k) > 0))
            ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining("\n")) : "");
    }
}
