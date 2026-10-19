import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> (String) t).iterator() instanceof Iterator<String> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m
            && ((BiFunction<String, Integer, Integer>) (s, x) -> s.equals("L") ? 2 * (x - 1) : s.equals("R") ? 2 * (x - 1) + 1 : s.equals("T") ? 2 * (n + x - 1) : 2 * (n + x - 1) + 1) instanceof BiFunction<String, Integer, Integer> pid
            && IntStream.range(0, n + m).mapToObj(i -> new String[]{it.next(), it.next(), it.next(), it.next()}).toList() instanceof List<String[]> es
            && new int[2 * (n + m)] instanceof int[] partner
            && es.stream().allMatch(e -> (partner[pid.apply(e[0], Integer.parseInt(e[2]))] = pid.apply(e[1], Integer.parseInt(e[3]))) >= 0 && (partner[pid.apply(e[1], Integer.parseInt(e[3]))] = pid.apply(e[0], Integer.parseInt(e[2]))) >= 0)
            && ((BiFunction<String, String, Integer>) (x, y) -> (int) es.stream().filter(e -> e[0].equals(x) && e[1].equals(y) || e[0].equals(y) && e[1].equals(x)).count()) instanceof BiFunction<String, String, Integer> cnt
            && Integer.valueOf(cnt.apply("L", "T")) instanceof Integer a && Integer.valueOf(cnt.apply("T", "R")) instanceof Integer b && Integer.valueOf(cnt.apply("L", "B")) instanceof Integer c
            && Integer.valueOf(cnt.apply("B", "R")) instanceof Integer d && Integer.valueOf(cnt.apply("L", "R")) instanceof Integer e && Integer.valueOf(cnt.apply("T", "B")) instanceof Integer f
            && (e == 0 || f == 0)
            && new int[2 * (n + m)] instanceof int[] ideal
            && ((BiPredicate<Integer, Integer>) (p, q) -> (ideal[p] = q) >= 0 && (ideal[q] = p) >= 0) instanceof BiPredicate<Integer, Integer> link
            && IntStream.rangeClosed(1, a).allMatch(i -> link.test(pid.apply("L", i), pid.apply("T", i)))
            && IntStream.rangeClosed(1, b).allMatch(i -> link.test(pid.apply("R", i), pid.apply("T", m + 1 - i)))
            && IntStream.rangeClosed(1, c).allMatch(i -> link.test(pid.apply("L", n + 1 - i), pid.apply("B", i)))
            && IntStream.rangeClosed(1, d).allMatch(i -> link.test(pid.apply("R", n + 1 - i), pid.apply("B", m + 1 - i)))
            && IntStream.rangeClosed(1, e).allMatch(k -> link.test(pid.apply("L", a + k), pid.apply("R", b + k)))
            && IntStream.rangeClosed(1, f).allMatch(k -> link.test(pid.apply("T", a + k), pid.apply("B", c + k)))
            && ((Function<int[], Integer>) s -> new int[]{0, 1, 0} instanceof int[] st
                && IntStream.iterate(0, z -> st[0] < s.length && st[1] < s.length && st[2] < s.length, z -> z + 1).allMatch(z -> Integer.valueOf(s[(st[0] + st[2]) % s.length]) instanceof Integer x && Integer.valueOf(s[(st[1] + st[2]) % s.length]) instanceof Integer y
                    && (x.equals(y) ? ++st[2] > 0 : ((x > y ? (st[0] += st[2] + 1) : (st[1] += st[2] + 1)) > 0 && (st[0] != st[1] || ++st[1] > 0) && (st[2] = 0) == 0)))
                ? Math.min(st[0], st[1]) : 0) instanceof Function<int[], Integer> minRot
            && ((Function<int[], List<Object[]>>) pt -> new boolean[n + m] instanceof boolean[] vis && new ArrayList<Object[]>() instanceof ArrayList<Object[]> out
                && IntStream.range(0, n + m).filter(v -> !vis[v]).allMatch(v -> IntStream.concat(IntStream.of(2 * v), IntStream.iterate(pt[2 * v + 1], q -> q != 2 * v, q -> pt[q ^ 1])).toArray() instanceof int[] qs
                    && Integer.valueOf(qs.length) instanceof Integer len
                    && Arrays.stream(qs).allMatch(q -> (vis[q / 2] = true))
                    && IntStream.range(0, len).map(k -> (qs[k] / 2 >= n ? 2 : 0) + (qs[k] & 1)).toArray() instanceof int[] sf
                    && IntStream.range(0, len).map(k -> qs[len - 1 - k] ^ 1).toArray() instanceof int[] qr
                    && IntStream.range(0, len).map(k -> (qr[k] / 2 >= n ? 2 : 0) + (qr[k] & 1)).toArray() instanceof int[] sr
                    && Integer.valueOf(minRot.apply(sf)) instanceof Integer rf && Integer.valueOf(minRot.apply(sr)) instanceof Integer rr
                    && IntStream.range(0, len).mapToObj(k -> String.valueOf(sf[(rf + k) % len])).collect(Collectors.joining()) instanceof String wf
                    && IntStream.range(0, len).mapToObj(k -> String.valueOf(sr[(rr + k) % len])).collect(Collectors.joining()) instanceof String wr
                    && out.add(wf.compareTo(wr) <= 0 ? new Object[]{wf, IntStream.range(0, len).map(k -> qs[(rf + k) % len] / 2).toArray()} : new Object[]{wr, IntStream.range(0, len).map(k -> qr[(rr + k) % len] / 2).toArray()}))
                ? out : null) instanceof Function<int[], List<Object[]>> cyc
            && new HashMap<String, ArrayDeque<int[]>>() instanceof HashMap<String, ArrayDeque<int[]>> pool
            && cyc.apply(ideal).stream().allMatch(o -> pool.computeIfAbsent((String) o[0], k -> new ArrayDeque<int[]>()).add((int[]) o[1]))
            && new int[n] instanceof int[] resR && new int[m] instanceof int[] resC
            && cyc.apply(partner).stream().allMatch(o -> pool.get((String) o[0]) instanceof ArrayDeque<int[]> dq && !dq.isEmpty() && dq.poll() instanceof int[] yy && (int[]) o[1] instanceof int[] xx
                && IntStream.range(0, xx.length).allMatch(k -> xx[k] < n ? (resR[yy[k]] = xx[k] + 1) > 0 : (resC[yy[k] - n] = xx[k] - n + 1) > 0))
            ? Arrays.stream(resR).mapToObj(String::valueOf).collect(Collectors.joining(" ")) + "\n" + Arrays.stream(resC).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "No solution");
    }
}
