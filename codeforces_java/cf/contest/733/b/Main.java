import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] v
            && new long[]{0, 1, 0, 0} instanceof long[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(k -> Integer.valueOf(k < raw.length ? raw[k] : 32) instanceof Integer c
                && 0 * (c > 64 ? (v[(int) st[3]++] = c) : c > 47 ? (st[0] = st[0] * 10 + c - 48) + (st[2] = 1) : c == 45 ? (st[1] = -1) : st[2] == 1 ? (v[(int) st[3]++] = st[0] * st[1]) + (st[0] = 0) + (st[1] = 1) + (st[2] = 0) : 0) == 0)
            && Integer.valueOf((int) v[0]) instanceof Integer n
            && Long.valueOf(IntStream.range(0, n).mapToLong(i -> v[1 + 2 * i] - v[2 + 2 * i]).sum()) instanceof Long d
            && IntStream.range(0, n).boxed().max(Comparator.comparingLong((Integer i) -> Math.abs(d - 2 * (v[1 + 2 * i] - v[2 + 2 * i])))).get() instanceof Integer b
            ? (Math.abs(d - 2 * (v[1 + 2 * b] - v[2 + 2 * b])) > Math.abs(d) ? b + 1 : 0) : "");
    }
}
