import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] t
            && new long[4] instanceof long[] st
            && IntStream.range(0, raw.length).filter(i -> (raw[i] > 47 ? (st[0] = st[0] * 10 + raw[i] - 48) + (st[1] = 1) : raw[i] == 45 ? (st[2] = 1) : st[1] == 1 ? (t[(int) st[3]++] = st[2] == 1 ? -st[0] : st[0]) + (st[0] = 0) + (st[1] = 0) + (st[2] = 0) : 0) < 0).count() >= 0
            && Integer.valueOf((int) t[0]) instanceof Integer n && Integer.valueOf((int) t[1]) instanceof Integer m
            && Arrays.copyOfRange(t, 2 + n, 2 + n + m) instanceof long[] tw
            ? IntStream.range(0, n).mapToLong(i -> Integer.valueOf(Arrays.binarySearch(tw, t[2 + i])) instanceof Integer q
                ? (q >= 0 ? 0 : Math.min(-q - 1 < m ? tw[-q - 1] - t[2 + i] : Long.MAX_VALUE, -q - 2 >= 0 ? t[2 + i] - tw[-q - 2] : Long.MAX_VALUE)) : 0).max().getAsLong() : "");
    }
}
