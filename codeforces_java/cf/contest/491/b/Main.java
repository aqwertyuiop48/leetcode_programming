import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g0
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g0[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g0[2]) instanceof Integer c
            && LongStream.range(0, c).map(i -> (long) g0[3 + 2 * (int) i] + g0[4 + 2 * (int) i]).toArray() instanceof long[] cu
            && LongStream.range(0, c).map(i -> (long) g0[3 + 2 * (int) i] - g0[4 + 2 * (int) i]).toArray() instanceof long[] cv
            && Long.valueOf(Arrays.stream(cu).min().getAsLong()) instanceof Long minU
            && Long.valueOf(Arrays.stream(cu).max().getAsLong()) instanceof Long maxU
            && Long.valueOf(Arrays.stream(cv).min().getAsLong()) instanceof Long minV
            && Long.valueOf(Arrays.stream(cv).max().getAsLong()) instanceof Long maxV
            && Integer.valueOf(g0[3 + 2 * c]) instanceof Integer h
            && Long.valueOf(LongStream.range(0, h).map(j ->
                Math.max(Math.max((long) g0[4 + 2 * c + 2 * (int) j] + g0[5 + 2 * c + 2 * (int) j] - minU, maxU - g0[4 + 2 * c + 2 * (int) j] - g0[5 + 2 * c + 2 * (int) j]),
                         Math.max((long) g0[4 + 2 * c + 2 * (int) j] - g0[5 + 2 * c + 2 * (int) j] - minV, maxV - g0[4 + 2 * c + 2 * (int) j] + g0[5 + 2 * c + 2 * (int) j])) << 20 | j).min().getAsLong()) instanceof Long key
            ? (key >> 20) + "\n" + ((key & 1048575) + 1)
            : "");
    }
}
