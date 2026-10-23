import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).filter(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0).count() >= 0
            && Integer.valueOf(g[0]) instanceof Integer n
            && Integer.valueOf(g[n + 1]) instanceof Integer m
            && IntStream.range(0, n).mapToLong(i -> (long) g[1 + i] << 17 | i).sorted().toArray() instanceof long[] keys
            && IntStream.range(0, n).map(k -> (int) (keys[n - 1 - k] & 131071)).toArray() instanceof int[] ord
            && IntStream.range(0, n).map(k -> (int) (keys[n - 1 - k] >> 17)).toArray() instanceof int[] hv
            && Integer.valueOf(n <= 1 ? 1 : Integer.highestOneBit(n - 1) << 1) instanceof Integer N
            && Integer.valueOf(Integer.numberOfTrailingZeros(N)) instanceof Integer lg
            && Integer.valueOf(n <= 1 ? 0 : 32 - Integer.numberOfLeadingZeros(n - 1)) instanceof Integer rounds
            && new long[2 * N] instanceof long[] t
            && new long[8] instanceof long[] sc
            && new int[n + 2] instanceof int[] hd
            && new int[m] instanceof int[] nx
            && IntStream.range(0, m).map(j -> g[n + 2 + 3 * j] - 1).toArray() instanceof int[] ql
            && IntStream.range(0, m).map(j -> g[n + 3 + 3 * j] - 1).toArray() instanceof int[] qr
            && IntStream.range(0, m).map(j -> g[n + 4 + 3 * j]).toArray() instanceof int[] qw
            && new int[m] instanceof int[] lo
            && new int[m] instanceof int[] hi
            && IntStream.range(0, m).filter(j -> (lo[j] = 1) > 0 && (hi[j] = n) > 0).count() >= 0
            && new int[16] instanceof int[] S
            && IntStream.range(0, rounds).filter(rd ->
                IntStream.range(0, 2 * N).filter(i -> (t[i] = 0) == 0).count() >= 0
                && IntStream.range(0, n + 2).filter(i -> (hd[i] = -1) < 0).count() >= 0
                && IntStream.range(0, m).filter(j -> lo[j] >= hi[j]
                    || ((nx[j] = hd[(lo[j] + hi[j]) >> 1]) >= -1 && (hd[(lo[j] + hi[j]) >> 1] = j) >= 0)).count() >= 0
                && IntStream.range(0, n).filter(k ->
                    Integer.valueOf(N + ord[k]) instanceof Integer leaf
                    && (t[leaf] = 68719738881L) > 0
                    && IntStream.range(0, lg).filter(d ->
                        (S[10] = leaf >> (d + 1)) > 0
                        && (sc[0] = t[2 * S[10]]) >= 0 && (sc[1] = t[2 * S[10] + 1]) >= 0
                        && (t[S[10]] =
                            (((sc[0] & 262143) == (1L << d)) ? (1L << d) + (sc[1] & 262143) : (sc[0] & 262143))
                            | ((((sc[1] >> 18) & 262143) == (1L << d)) ? (1L << d) + ((sc[0] >> 18) & 262143) : ((sc[1] >> 18) & 262143)) << 18
                            | Math.max(Math.max(sc[0] >>> 36, sc[1] >>> 36), ((sc[0] >> 18) & 262143) + (sc[1] & 262143)) << 36) >= 0).count() >= 0
                    && IntStream.iterate(hd[k + 1], j -> j >= 0, j -> nx[j]).filter(j ->
                        (S[0] = N + ql[j]) > 0 && (S[1] = N + qr[j] + 1) > 0 && (S[2] = 0) == 0 && (S[3] = 0) == 0 && (S[4] = 0) == 0 && (S[5] = 0) == 0
                        && IntStream.range(0, lg + 1).filter(d ->
                            S[0] < S[1]
                            && ((S[0] & 1) == 0
                                || ((sc[2] = t[S[0]++]) >= 0
                                    && (S[2] = Math.max(Math.max(S[2], (int) (sc[2] >>> 36)), S[3] + (int) (sc[2] & 262143))) >= 0
                                    && (S[3] = (int) ((sc[2] >> 18) & 262143) == (1 << d) ? S[3] + (1 << d) : (int) ((sc[2] >> 18) & 262143)) >= 0))
                            && ((S[1] & 1) == 0
                                || ((sc[2] = t[--S[1]]) >= 0
                                    && (S[4] = Math.max(Math.max(S[4], (int) (sc[2] >>> 36)), (int) ((sc[2] >> 18) & 262143) + S[5])) >= 0
                                    && (S[5] = (int) (sc[2] & 262143) == (1 << d) ? (1 << d) + S[5] : (int) (sc[2] & 262143)) >= 0))
                            && (S[0] >>= 1) >= 0 && (S[1] >>= 1) >= 0).count() >= 0
                        && (Math.max(Math.max(S[2], S[4]), S[3] + S[5]) >= qw[j] ? (hi[j] = k + 1) > 0 : (lo[j] = k + 2) > 0)).count() >= 0).count() >= 0).count() >= 0
            ? IntStream.range(0, m).mapToObj(j -> String.valueOf(hv[lo[j] - 1])).collect(Collectors.joining("\n"))
            : "");
    }
}
