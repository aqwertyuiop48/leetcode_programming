import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new int[raw.length / 2 + 3] instanceof int[] nums
            && new int[4] instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> (raw[i] > 47 && raw[i] < 58
                ? (st[0] = st[0] * 10 + raw[i] - 48) + (st[2] = 1)
                : raw[i] <= 32 && st[2] == 1 ? (nums[st[1]++] = st[0]) + (st[0] = 0) + (st[2] = 0) : 0) != Integer.MIN_VALUE || true).count() >= 0
            && (Integer) nums[0] instanceof Integer n
            && (Integer) nums[1] instanceof Integer m
            && (Integer) nums[2] instanceof Integer s
            && (Integer) nums[3] instanceof Integer t
            && IntStream.rangeClosed(0, m).map(e -> e == 0 ? 0 : nums[1 + 3 * e]).toArray() instanceof int[] eu
            && IntStream.rangeClosed(0, m).map(e -> e == 0 ? 0 : nums[2 + 3 * e]).toArray() instanceof int[] ev
            && IntStream.rangeClosed(0, m).map(e -> e == 0 ? 0 : nums[3 + 3 * e]).toArray() instanceof int[] ew
            && new int[n + 1] instanceof int[] hF
            && new int[n + 1] instanceof int[] hB
            && new int[m + 1] instanceof int[] nF
            && new int[m + 1] instanceof int[] nB
            && IntStream.rangeClosed(1, m).filter(e -> (nF[e] = hF[eu[e]]) >= 0 && (hF[eu[e]] = e) > 0 && (nB[e] = hB[ev[e]]) >= 0 && (hB[ev[e]] = e) > 0 || true).count() >= 0
            && ((Function<int[][], long[]>) p -> LongStream.generate(() -> Long.MAX_VALUE / 4).limit(n + 1).toArray() instanceof long[] d
                && new PriorityQueue<long[]>(Comparator.comparingLong((long[] x) -> x[0])) instanceof PriorityQueue<long[]> pq
                && (d[p[0][0]] = 0) == 0 && pq.add(new long[]{0, p[0][0]})
                && Stream.generate(pq::poll).takeWhile(Objects::nonNull).filter(x -> x[0] == d[(int) x[1]]
                    && IntStream.iterate(p[1][(int) x[1]], e -> e > 0, e -> p[2][e]).filter(e -> x[0] + ew[e] < d[p[3][e]]
                        && (d[p[3][e]] = x[0] + ew[e]) >= 0 && pq.add(new long[]{d[p[3][e]], p[3][e]}) || true).count() >= 0 || true).count() >= 0
                ? d : null) instanceof Function<int[][], long[]> dij
            && dij.apply(new int[][]{{s}, hF, nF, ev}) instanceof long[] d1
            && dij.apply(new int[][]{{t}, hB, nB, eu}) instanceof long[] d2
            && (Long) d1[t] instanceof Long dd
            && IntStream.rangeClosed(1, m).boxed().filter(e -> d1[eu[e]] < Long.MAX_VALUE / 4 && d2[ev[e]] < Long.MAX_VALUE / 4 && d1[eu[e]] + ew[e] + d2[ev[e]] == dd)
                .sorted(Comparator.comparingLong((Integer e) -> d1[eu[e]])).mapToInt(Integer::intValue).toArray() instanceof int[] ord
            && new boolean[m + 1] instanceof boolean[] uniq
            && new long[]{-1} instanceof long[] pm
            && IntStream.range(0, ord.length).filter(i -> (uniq[ord[i]] = pm[0] <= d1[eu[ord[i]]]
                    && (i + 1 < ord.length ? d1[eu[ord[i + 1]]] : Long.MAX_VALUE) >= d1[eu[ord[i]]] + ew[ord[i]])
                    | (pm[0] = Math.max(pm[0], d1[eu[ord[i]]] + ew[ord[i]])) < 0 || true).count() >= 0
            ? IntStream.rangeClosed(1, m).mapToObj(e -> uniq[e] ? "YES"
                : d1[eu[e]] < Long.MAX_VALUE / 4 && d2[ev[e]] < Long.MAX_VALUE / 4 && dd - 1 - d1[eu[e]] - d2[ev[e]] >= 1
                    ? "CAN " + (ew[e] - (dd - 1 - d1[eu[e]] - d2[ev[e]])) : "NO").collect(Collectors.joining("\n"))
            : "");
    }
}
