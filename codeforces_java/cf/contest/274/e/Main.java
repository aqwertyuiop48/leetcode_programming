import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(tk.nextToken()) instanceof Integer n && Integer.valueOf(tk.nextToken()) instanceof Integer m && Integer.valueOf(tk.nextToken()) instanceof Integer k
            && LongStream.concat(LongStream.concat(
                    IntStream.rangeClosed(0, n + 1).boxed().flatMapToLong(r -> LongStream.of((long) r << 20, ((long) r << 20) | (m + 1))),
                    IntStream.rangeClosed(1, m).boxed().flatMapToLong(c -> LongStream.of(c, ((long) (n + 1) << 20) | c))),
                IntStream.range(0, k).mapToLong(i -> ((long) Integer.parseInt(tk.nextToken()) << 20) | Integer.parseInt(tk.nextToken()))).toArray() instanceof long[] cells
            && Arrays.stream(cells).map(v -> ((((v >> 20) - (v & 1048575) + m + 1)) << 18) | (v >> 20)).sorted().toArray() instanceof long[] d1
            && Arrays.stream(cells).map(v -> ((((v >> 20) + (v & 1048575))) << 18) | (v >> 20)).sorted().toArray() instanceof long[] d2
            && ((IntBinaryOperator) (r, c) -> Arrays.binarySearch(d1, (((long) (r - c + m + 1)) << 18) | r) >= 0 ? 1 : 0) instanceof IntBinaryOperator blk
            && ((Function<int[], int[]>) q -> Integer.valueOf(-Arrays.binarySearch(q[2] == q[3] ? d1 : d2, (((long) (q[2] == q[3] ? q[0] - q[1] + m + 1 : q[0] + q[1])) << 18) | q[0]) - 1) instanceof Integer ins
                && Integer.valueOf((int) (((q[2] > 0 ? (q[2] == q[3] ? d1 : d2)[ins] : (q[2] == q[3] ? d1 : d2)[ins - 1])) & 262143)) instanceof Integer R
                ? new int[]{R, q[1] + (R - q[0]) * q[2] * q[3]} : null) instanceof Function<int[], int[]> far
            && Integer.valueOf(tk.nextToken()) instanceof Integer sr && Integer.valueOf(tk.nextToken()) instanceof Integer sc && tk.nextToken() instanceof String dir
            && Integer.valueOf(dir.charAt(0) == 'N' ? -1 : 1) instanceof Integer dr && Integer.valueOf(dir.charAt(1) == 'W' ? -1 : 1) instanceof Integer dc
            && far.apply(new int[]{sr, sc, -dr, -dc}) instanceof int[] e0
            && new int[]{e0[0] + dr, e0[1] + dc, dr, dc} instanceof int[] st && new int[]{e0[0] + dr, e0[1] + dc, dr, dc} instanceof int[] start
            && new long[]{0} instanceof long[] tot && new boolean[]{false} instanceof boolean[] fl
            && IntStream.iterate(0, z -> z + 1).anyMatch(z -> far.apply(st) instanceof int[] f
                && (tot[0] += Math.abs(f[0] - st[0])) >= 0
                && Integer.valueOf(blk.applyAsInt(f[0], f[1] - st[3])) instanceof Integer ab && Integer.valueOf(blk.applyAsInt(f[0] - st[2], f[1])) instanceof Integer bb
                && (ab.intValue() != bb.intValue() || (fl[0] = true))
                && (ab.intValue() == bb.intValue() ? new int[]{f[0] - st[2], f[1] - st[3], -st[2], -st[3]} : ab.intValue() == 1 ? new int[]{f[0] - st[2], f[1], -st[2], st[3]} : new int[]{f[0], f[1] - st[3], st[2], -st[3]}) instanceof int[] ns
                && (st[0] = ns[0]) != -99999999 && (st[1] = ns[1]) != -99999999 && (st[2] = ns[2]) != -99999999 && (st[3] = ns[3]) != -99999999
                && Arrays.equals(st, start))
            ? fl[0] ? tot[0] / 2 : tot[0] : "");
    }
}
