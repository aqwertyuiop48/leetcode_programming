import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] nm && new int[4] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] == 45 ? (st[3] = 1) > 0
                : i < raw.length && raw[i] > 47
                ? (st[0] = st[0] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0
                : st[2] == 0 || ((nm[st[1]++] = st[3] == 1 ? -st[0] : st[0]) != 0x7fffffff & (st[0] = 0) == 0 & (st[2] = 0) == 0 & (st[3] = 0) == 0)) || true)
            && Integer.valueOf(nm[0]) instanceof Integer n && Arrays.stream(nm, 1, n + 1).sorted().toArray() instanceof int[] a
            && new long[n + 1] instanceof long[] pre && IntStream.range(0, n).allMatch(i -> (pre[i + 1] = pre[i] + a[i]) > Long.MIN_VALUE)
            ? String.valueOf(IntStream.iterate(1, s -> s <= n, s -> s * 4).mapToLong(s -> pre[n] - pre[n - s]).sum()) : "");
    }
}
