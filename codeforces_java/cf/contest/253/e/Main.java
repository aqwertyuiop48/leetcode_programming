import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional.of(Map.entry((new File("input.txt").exists() ? new FileInputStream("input.txt") : System.in).readAllBytes(), new File("input.txt").exists() ? new PrintStream(new FileOutputStream("output.txt"), true) : System.out)).ifPresent(io -> io.getValue().println(io.getKey() instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] v
            && new long[4] instanceof long[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> i < raw.length && raw[i] >= 48 && raw[i] <= 57
                ? (st[0] = st[0] * 10 + raw[i] - 48) >= 0 && (st[1] = 1) > 0
                : i < raw.length && raw[i] == 45 ? (st[3] = 1) > 0
                : st[1] == 0 || (v[(int) st[2]++] = st[3] == 1 ? -st[0] : st[0]) != Long.MIN_VALUE && (st[0] = 0) == 0 && (st[1] = 0) == 0 && (st[3] = 0) == 0)
            && Integer.valueOf((int) v[0]) instanceof Integer n
            && IntStream.range(0, n).mapToLong(i -> v[1 + 3 * i]).toArray() instanceof long[] t
            && IntStream.range(0, n).mapToLong(i -> v[2 + 3 * i]).toArray() instanceof long[] s
            && IntStream.range(0, n).mapToLong(i -> v[3 + 3 * i]).toArray() instanceof long[] p
            && Long.valueOf(v[1 + 3 * n]) instanceof Long T
            && Integer.valueOf(IntStream.range(0, n).filter(i -> p[i] < 0).findFirst().getAsInt()) instanceof Integer u
            && IntStream.range(0, n).filter(i -> i != u).mapToLong(i -> p[i]).sorted().toArray() instanceof long[] qs
            && IntStream.range(0, n).mapToLong(i -> t[i] * 131072L + i).sorted().mapToInt(x -> (int) (x & 131071L)).toArray() instanceof int[] ord
            && new int[2 * n + 2] instanceof int[] tk
            && new int[n] instanceof int[] key
            && IntStream.range(0, n).filter(i -> i != u).allMatch(i -> (key[i] = 2 * Arrays.binarySearch(qs, p[i]) + 1) > 0 && (tk[key[i]] = i) >= 0)
            && ((IntFunction<long[]>) slot -> new long[n] instanceof long[] fin && s.clone() instanceof long[] rem
                && new long[(2 * n + 2) / 64 + 2] instanceof long[] L0 && new long[(2 * n + 2) / 4096 + 2] instanceof long[] L1 && new long[2] instanceof long[] L2
                && new long[2] instanceof long[] cp
                && (IntStream.range(0, 5 * n + 5).allMatch(z ->
                    cp[1] < n && t[ord[(int) cp[1]]] <= cp[0]
                        ? Integer.valueOf(ord[(int) cp[1]]) instanceof Integer i && Integer.valueOf(i == u ? 2 * slot : key[i]) instanceof Integer kk
                            && ((L0[kk >> 6] |= 1L << (kk & 63)) != 0 & (L1[kk >> 12] |= 1L << ((kk >> 6) & 63)) != 0 & (L2[kk >> 18] |= 1L << ((kk >> 12) & 63)) != 0)
                            && ++cp[1] > 0
                        : L2[0] == 0
                            ? cp[1] < n && (cp[0] = t[ord[(int) cp[1]]]) >= 0
                            : Integer.valueOf(63 - Long.numberOfLeadingZeros(L2[0])) instanceof Integer a
                                && Integer.valueOf(a * 64 + 63 - Long.numberOfLeadingZeros(L1[a])) instanceof Integer b
                                && Integer.valueOf(b * 64 + 63 - Long.numberOfLeadingZeros(L0[b])) instanceof Integer kk
                                && Integer.valueOf(kk % 2 == 1 ? tk[kk] : u) instanceof Integer i
                                && Long.valueOf(Math.min(rem[i], cp[1] < n ? t[ord[(int) cp[1]]] - cp[0] : Long.MAX_VALUE)) instanceof Long run
                                && (cp[0] += run) >= 0 && (rem[i] -= run) >= 0
                                && (rem[i] > 0 || (fin[i] = cp[0]) >= 0
                                    && ((L0[kk >> 6] &= ~(1L << (kk & 63))) != 0 || (L1[kk >> 12] &= ~(1L << ((kk >> 6) & 63))) != 0 || (L2[kk >> 18] &= ~(1L << ((kk >> 12) & 63))) >= 0 || true))) || true)
                ? fin : null) instanceof IntFunction<long[]> sim
            && new int[]{0, n - 1} instanceof int[] bs
            && IntStream.range(0, 20).allMatch(z -> bs[0] >= bs[1] || Integer.valueOf((bs[0] + bs[1]) / 2) instanceof Integer mid
                && (sim.apply(mid)[u] <= T ? (bs[1] = mid) >= 0 : (bs[0] = mid + 1) >= 0))
            && Integer.valueOf(IntStream.range(bs[0], n).filter(x -> (x == 0 ? 0L : qs[x - 1]) + 1 < (x == n - 1 ? 1000000001L : qs[x])).findFirst().orElse(bs[0])) instanceof Integer sl
            ? ((sl == 0 ? 0L : qs[sl - 1]) + 1) + "\n" + Arrays.stream(sim.apply(sl)).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : ""));
    }
}
