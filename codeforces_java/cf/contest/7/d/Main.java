import java.util.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && (Integer) (int) (raw.length - IntStream.iterate(raw.length - 1, i -> i >= 0 && raw[i] <= 32, i -> i - 1).count()) instanceof Integer n
            && new byte[n + 1] instanceof byte[] degree
            && new long[]{0, 0, 1, 0, 0, 0, 0} instanceof long[] st
            && IntStream.range(0, n).filter(i ->
                ((st[3] = st[0] * 1000003931L) | 1) != 0
                && (st[4] = Math.multiplyHigh(st[0], 1000003931L)) >= 0
                && (st[5] = (st[3] & 2305843009213693951L) + (st[3] >>> 61 | st[4] << 3)) >= 0
                && (st[0] = (st[5] & 2305843009213693951L) + (st[5] >>> 61) + raw[i]) >= 0
                && ((st[3] = st[2] * raw[i]) | 1) != 0
                && (st[4] = Math.multiplyHigh(st[2], (long) raw[i])) >= 0
                && (st[5] = (st[3] & 2305843009213693951L) + (st[3] >>> 61 | st[4] << 3) + st[1]) >= 0
                && (st[1] = (st[5] & 2305843009213693951L) + (st[5] >>> 61)) >= 0
                && ((st[3] = st[2] * 1000003931L) | 1) != 0
                && (st[4] = Math.multiplyHigh(st[2], 1000003931L)) >= 0
                && (st[5] = (st[3] & 2305843009213693951L) + (st[3] >>> 61 | st[4] << 3)) >= 0
                && (st[2] = (st[5] & 2305843009213693951L) + (st[5] >>> 61)) >= 0
                && ((st[3] = st[0] - st[1]) == 0 || st[3] == 2305843009213693951L || st[3] == -2305843009213693951L)
                && (degree[i + 1] = (byte) (1 + degree[i + 1 >> 1])) > 0
                && (st[6] += degree[i + 1]) > 0).count() >= 0
            ? st[6]
            : 0L);
    }
}
