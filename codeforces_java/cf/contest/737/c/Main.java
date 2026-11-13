import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] nm && new long[]{0, 0, 0, 1} instanceof long[] st
            && IntStream.range(0, raw.length + 1).allMatch(k -> (k < raw.length && raw[k] > 44 ? raw[k] == 45 ? (st[3] = -1) : (st[1] = st[1] * 10 + raw[k] - 48) + (st[2] = 1) : st[2] == 1 ? (nm[(int) st[0]++] = st[1] * st[3]) + (st[1] = 0) + (st[2] = 0) + (st[3] = 1) : 0) != Long.MIN_VALUE)
            && Integer.valueOf((int) nm[0]) instanceof Integer n && Integer.valueOf((int) nm[1]) instanceof Integer s
            && Integer.valueOf(nm[1 + s] != 0 ? 1 : 0) instanceof Integer bad
            && new int[n + 2] instanceof int[] cnt
            && Long.valueOf(IntStream.rangeClosed(1, n).filter(i -> i != s && nm[1 + i] == 0).count()) instanceof Long z
            && Long.valueOf(IntStream.rangeClosed(1, n).filter(i -> i != s && nm[1 + i] > 0).filter(i -> ++cnt[(int) Math.min(nm[1 + i], n + 1)] > 0).count()) instanceof Long nz
            && new long[]{0, 0} instanceof long[] r
            ? bad + (n == 1 ? 0 : IntStream.rangeClosed(1, n - 1).mapToLong(d -> Math.max(r[0] += cnt[d] == 0 ? 1 : 0, z + nz - (r[1] += cnt[d]))).min().getAsLong()) : "");
    }
}
