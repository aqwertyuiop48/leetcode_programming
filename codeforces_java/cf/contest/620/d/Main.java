import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] t && new int[4] instanceof int[] cur
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] >= 48
                ? (cur[0] = cur[0] * 10 + raw[i] - 48) >= 0 && (cur[1] = 1) == 1
                : i < raw.length && raw[i] == 45 ? (cur[3] = 1) == 1 : cur[1] == 0 || ((t[cur[2]++] = cur[3] == 1 ? -cur[0] : cur[0]) != Integer.MIN_VALUE && (cur[3] = 0) == 0 && (cur[0] = 0) == 0 && (cur[1] = 0) == 0)) || true)
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1 + n]) instanceof Integer m
            && Long.valueOf(IntStream.range(0, n).mapToLong(i -> t[1 + i]).sum() - IntStream.range(0, m).mapToLong(j -> t[2 + n + j]).sum()) instanceof Long d
            && Long.valueOf(LongStream.range(0, (long) n * m).map(x -> Math.abs(d - 2L * (t[1 + (int) (x / m)] - t[2 + n + (int) (x % m)])) << 22 | (x / m) << 11 | x % m).min().getAsLong()) instanceof Long k1
            && IntStream.range(0, n).boxed().flatMapToLong(i -> IntStream.range(i + 1, n).mapToLong(j -> ((long) t[1 + i] + t[1 + j] + (1L << 31)) << 22 | (long) i << 11 | j)).sorted().toArray() instanceof long[] PA
            && IntStream.range(0, m).boxed().flatMapToLong(i -> IntStream.range(i + 1, m).mapToLong(j -> ((long) t[2 + n + i] + t[2 + n + j] + (1L << 31)) << 22 | (long) i << 11 | j)).sorted().toArray() instanceof long[] PB
            && new int[2] instanceof int[] pt && new long[]{Long.MAX_VALUE, 0, 0} instanceof long[] best
            && ((IntPredicate) s -> pt[0] < PA.length && pt[1] < PB.length
                ? Long.valueOf(d - 2 * ((PA[pt[0]] >>> 22) - (1L << 31)) + 2 * ((PB[pt[1]] >>> 22) - (1L << 31))) instanceof Long D
                    && (Math.abs(D) < best[0] ? (best[0] = Math.abs(D)) >= 0 && (best[1] = PA[pt[0]]) >= 0 && (best[2] = PB[pt[1]]) >= 0 : true)
                    && (D > 0 ? ++pt[0] > 0 : ++pt[1] > 0)
                : true) instanceof IntPredicate stp
            && Stream.of(0).peek(z -> IntStream.range(0, PA.length + PB.length).forEach(s -> stp.test(s))).findFirst().isPresent()
            && Long.valueOf(Math.abs(d)) instanceof Long v0 && Long.valueOf(k1 >>> 22) instanceof Long v1
            ? (v0 <= v1 && v0 <= best[0] ? v0 + "\n0"
                : v1 <= best[0] ? v1 + "\n1\n" + (((k1 >> 11) & 2047) + 1) + " " + ((k1 & 2047) + 1)
                : best[0] + "\n2\n" + (((best[1] >> 11) & 2047) + 1) + " " + (((best[2] >> 11) & 2047) + 1) + "\n" + ((best[1] & 2047) + 1) + " " + ((best[2] & 2047) + 1)) : "");
    }
}
