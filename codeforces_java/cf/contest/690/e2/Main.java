import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] b
            && new short[b.length / 2 + 2] instanceof short[] v
            && new int[3] instanceof int[] s
            && IntStream.rangeClosed(0, b.length).map(i -> i < b.length ? b[i] : 10)
                .allMatch(c -> c >= 48 ? (s[0] = s[0] * 10 + c - 48) >= 0 && (s[1] = 1) > 0
                    : s[1] == 0 || ((v[s[2]++] = (short) s[0]) >= 0 && (s[0] = 0) == 0 && (s[1] = 0) == 0))
            && new int[]{1} instanceof int[] p
            ? IntStream.range(0, v[0]).mapToObj(t -> Integer.valueOf(v[p[0]]) instanceof Integer h
                && Integer.valueOf(v[p[0] + 1]) instanceof Integer w
                && Integer.valueOf(v[p[0] + 2]) instanceof Integer k
                && Integer.valueOf(p[0] + 3) instanceof Integer base
                && (p[0] += 3 + h * w) > 0
                && Integer.valueOf(h / k) instanceof Integer g
                && Integer.valueOf(Math.min(3, g)) instanceof Integer m
                && new long[k][k] instanceof long[][] c
                && IntStream.range(0, k * k).allMatch(ij -> (c[ij / k][ij % k] = ij / k == ij % k ? Long.MAX_VALUE / 4
                    : IntStream.range(0, w).mapToLong(x -> IntStream.range(0, m).map(rr -> v[base + ((ij / k) * g + g - 1 - rr) * w + x] - v[base + ((ij % k) * g + rr) * w + x]).sum())
                        .map(d -> d * d).sum()) >= 0)
                && IntStream.range(0, k * k).boxed().sorted(Comparator.comparingLong((Integer ij) -> c[ij / k][ij % k])).mapToInt(x -> x).toArray() instanceof int[] ids
                && new int[k] instanceof int[] nxt
                && new int[k] instanceof int[] prv
                && Arrays.stream(ids).filter(ij -> ij / k != ij % k && nxt[ij / k] == 0 && prv[ij % k] == 0 && IntStream.iterate(ij % k, x -> x >= 0, x -> nxt[x] - 1).reduce((q, x) -> x).getAsInt() != ij / k)
                    .allMatch(ij -> (nxt[ij / k] = ij % k + 1) > 0 && (prv[ij % k] = ij / k + 1) > 0)
                && IntStream.iterate(IntStream.range(0, k).filter(i -> prv[i] == 0).findFirst().getAsInt(), x -> x >= 0, x -> nxt[x] - 1).toArray() instanceof int[] ord
                ? IntStream.range(0, k).mapToObj(pp -> String.valueOf(IntStream.range(0, k).filter(r -> ord[r] == pp).findFirst().getAsInt() + 1))
                    .collect(Collectors.joining(" ")) : "").collect(Collectors.joining("\n")) : "");
    }
}
