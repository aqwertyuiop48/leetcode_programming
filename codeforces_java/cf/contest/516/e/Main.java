
import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new long[raw.length / 2 + 3] instanceof long[] a
            && new long[]{0, 0, 0} instanceof long[] ps
            && IntStream.range(0, raw.length).filter(i -> (raw[i] > 47 ? (ps[0] = ps[0] * 10 + raw[i] - 48) * 0 + (ps[1] = 1) : ps[1] == 1 ? (a[(int) ps[2]++] = ps[0]) * 0 + (ps[0] = 0) + (ps[1] = 0) : 0) >= 0).count() >= 0
            && (Long) a[0] instanceof Long n && (Long) a[1] instanceof Long m && (Integer) (int) a[2] instanceof Integer b
            && (Integer) (int) a[3 + b] instanceof Integer gc && (Integer) (b + gc) instanceof Integer K0
            && (Long) BigInteger.valueOf(n).gcd(BigInteger.valueOf(m)).longValue() instanceof Long gg
            && (Long) (n / gg) instanceof Long np && (Long) (m / gg) instanceof Long mp
            && IntStream.range(0, K0).mapToLong(s -> a[s < b ? 3 + s : 4 + s]).toArray() instanceof long[] sd
            && IntStream.range(0, K0).mapToLong(s -> sd[s] % gg).toArray() instanceof long[] rr
            && IntStream.range(0, K0).mapToLong(s -> sd[s] / gg).toArray() instanceof long[] u0
            ? (Arrays.stream(rr).distinct().count() != gg ? "-1"
                : ((ToLongFunction<long[]>) p -> IntStream.range(0, K0).mapToLong(s -> (u0[s] % p[0]) * p[2] % p[0]).toArray() instanceof long[] pos
                    && IntStream.range(0, K0).boxed().sorted(Comparator.comparingLong((Integer s) -> rr[s]).thenComparingLong(s -> pos[s]).thenComparingLong(s -> u0[s])).mapToInt(s -> s).toArray() instanceof int[] od
                    && IntStream.range(0, K0).map(k -> (od[k] < b) == (p[3] == 1) ? 1 : 0).toArray() instanceof int[] ff
                    && IntStream.range(0, K0).mapToObj(k -> k > 0 && rr[od[k]] == rr[od[k - 1]] && pos[od[k]] == pos[od[k - 1]]).toArray(Boolean[]::new) instanceof Boolean[] dup
                    && IntStream.range(0, K0 - 1).map(i -> K0 - 2 - i).filter(k -> dup[k + 1] ? (ff[k] |= ff[k + 1]) >= 0 : true).count() >= 0
                    && IntStream.range(0, K0).filter(k -> !dup[k]).toArray() instanceof int[] cp && (Integer) cp.length instanceof Integer Kc
                    && IntStream.range(0, Kc).mapToLong(j -> rr[od[cp[j]]]).toArray() instanceof long[] R2
                    && IntStream.range(0, Kc).mapToLong(j -> pos[od[cp[j]]]).toArray() instanceof long[] P2
                    && IntStream.range(0, Kc).mapToLong(j -> u0[od[cp[j]]]).toArray() instanceof long[] V2
                    && new int[Kc] instanceof int[] gs && new int[Kc] instanceof int[] ge
                    && IntStream.range(0, Kc).filter(j -> (gs[j] = j > 0 && R2[j] == R2[j - 1] ? gs[j - 1] : j) >= 0).count() >= 0
                    && IntStream.range(0, Kc).map(i -> Kc - 1 - i).filter(j -> (ge[j] = j < Kc - 1 && R2[j] == R2[j + 1] ? ge[j + 1] : j + 1) >= 0).count() >= 0
                    && IntStream.range(0, 2 * Kc).filter(t -> (Integer) (t % Kc) instanceof Integer j && (Integer) (j + 1 == ge[j] ? gs[j] : j + 1) instanceof Integer nx
                        && (V2[nx] = Math.min(V2[nx], V2[j] + p[1] * (nx == j ? p[0] : (P2[nx] - P2[j] + p[0]) % p[0]))) >= 0).count() >= 0
                    ? IntStream.range(0, Kc).mapToLong(j -> (Integer) (j + 1 == ge[j] ? gs[j] : j + 1) instanceof Integer nx && (Long) (nx == j ? p[0] : (P2[nx] - P2[j] + p[0]) % p[0]) instanceof Long G
                        ? Math.max(ff[cp[j]] == 0 ? R2[j] + gg * V2[j] : -1L, G >= 2 ? R2[j] + gg * (V2[j] + p[1] * (G - 1)) : -1L) : -1L).max().orElse(-1L) : -1L) instanceof ToLongFunction<long[]> cyc
                && (Long) BigInteger.valueOf(mp % np).modInverse(BigInteger.valueOf(np)).longValue() instanceof Long ib
                && (Long) BigInteger.valueOf(np % mp).modInverse(BigInteger.valueOf(mp)).longValue() instanceof Long ig
                ? String.valueOf(Math.max(0L, Math.max(cyc.applyAsLong(new long[]{np, mp, ib, 1}), cyc.applyAsLong(new long[]{mp, np, ig, 0})))) : "") : "");
    }
}



