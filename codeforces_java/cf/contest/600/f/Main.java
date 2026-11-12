import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] o && new int[4] instanceof int[] st
                && IntStream.rangeClosed(0, raw.length).map(i -> i < raw.length ? raw[i] : 32).filter(x -> x >= 48 ? ((st[1] = st[1] * 10 + x - 48) | (st[2] = 1)) < 0 : x == 45 ? (st[3] = 1) < 0 : st[2] == 1 && ((o[st[0]++] = st[3] == 1 ? -st[1] : st[1]) | (st[1] = 0) | (st[2] = 0) | (st[3] = 0)) < 0).count() >= 0
                && (Integer) o[0] instanceof Integer a && (Integer) o[1] instanceof Integer b && (Integer) o[2] instanceof Integer m
                && new int[a + b + 1] instanceof int[] deg
                && IntStream.range(0, m).filter(i -> deg[o[3 + 2 * i]]++ >= 0 && deg[a + o[4 + 2 * i]]++ >= 0).count() >= 0
                && (Integer) Arrays.stream(deg).max().getAsInt() instanceof Integer D
                && (Integer) Math.max(D, 1) instanceof Integer Dd
                && (Integer) ((Dd + 63) / 64) instanceof Integer W
                && new int[(a + b + 1) * Dd] instanceof int[] tbl && new long[(a + b + 1) * W] instanceof long[] bits
                && IntStream.range(0, m).filter(i -> (Integer) o[3 + 2 * i] instanceof Integer u && (Integer) (a + o[4 + 2 * i]) instanceof Integer v
                        && (Integer) IntStream.range(0, W).filter(x -> (bits[u * W + x] | bits[v * W + x]) != -1L).findFirst().orElse(-1) instanceof Integer wc
                        && (Integer) (wc < 0 ? -1 : wc * 64 + Long.numberOfTrailingZeros(~(bits[u * W + wc] | bits[v * W + wc]))) instanceof Integer cm
                        && (Integer) (cm >= 0 && cm < D ? cm
                                : (Integer) IntStream.range(0, W).filter(x -> bits[u * W + x] != -1L).findFirst().getAsInt() instanceof Integer w1
                                && (Integer) IntStream.range(0, W).filter(x -> bits[v * W + x] != -1L).findFirst().getAsInt() instanceof Integer w2
                                && (Integer) (w1 * 64 + Long.numberOfTrailingZeros(~bits[u * W + w1])) instanceof Integer c1
                                && (Integer) (w2 * 64 + Long.numberOfTrailingZeros(~bits[v * W + w2])) instanceof Integer c2
                                ? Arrays.stream(IntStream.iterate(v * 2, t -> t >= 2, t -> tbl[(t >> 1) * Dd + ((t & 1) == 0 ? c1 : c2)] * 2 + ((t & 1) ^ 1)).map(t -> t >> 1).toArray())
                                        .map(w -> (tbl[w * Dd + c1] = tbl[w * Dd + c1] + tbl[w * Dd + c2] - (tbl[w * Dd + c2] = tbl[w * Dd + c1])) * 0
                                                + (int) ((bits[w * W + (c1 >> 6)] = (bits[w * W + (c1 >> 6)] & ~(1L << c1)) | (tbl[w * Dd + c1] > 0 ? 1L << c1 : 0L)) & 0)
                                                + (int) ((bits[w * W + (c2 >> 6)] = (bits[w * W + (c2 >> 6)] & ~(1L << c2)) | (tbl[w * Dd + c2] > 0 ? 1L << c2 : 0L)) & 0)).sum() * 0 + c1 : -1) instanceof Integer k
                        && (tbl[u * Dd + k] = v) > 0 && (tbl[v * Dd + k] = u) > 0
                        && (bits[u * W + (k >> 6)] |= 1L << k) != 0 && (bits[v * W + (k >> 6)] |= 1L << k) != 0).count() >= 0
                && IntStream.range(0, m).mapToLong(i -> ((long) (o[3 + 2 * i] * 2048 + o[4 + 2 * i]) << 17) | i).toArray() instanceof long[] KE
                && IntStream.range(Dd, (a + 1) * Dd).filter(x -> tbl[x] != 0).mapToLong(x -> ((long) ((x / Dd) * 2048 + tbl[x] - a) << 10) | (x % Dd)).toArray() instanceof long[] KC
                && Stream.of(0).peek(z -> Arrays.sort(KE)).peek(z -> Arrays.sort(KC)).findFirst().isPresent()
                && new int[m] instanceof int[] col
                && IntStream.range(0, m).filter(j -> (col[(int) (KE[j] & 131071)] = (int) (KC[j] & 1023) + 1) < 0).count() == 0
                ? D + "\n" + IntStream.range(0, m).mapToObj(i -> String.valueOf(col[i])).collect(Collectors.joining(" ")) : "");
    }
}
