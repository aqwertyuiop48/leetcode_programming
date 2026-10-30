import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 4] instanceof int[] v && new long[3] instanceof long[] st
            && IntStream.rangeClosed(0, raw.length).filter(i -> i < raw.length && raw[i] >= '0' ? (st[0] = st[0] * 10 + raw[i] - '0') >= 0 && (st[2] = 1) > 0 : st[2] == 0 || (v[(int) st[1]++] = (int) st[0]) >= 0 && (st[0] = 0) == 0 && (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(v[0]) instanceof Integer n && Long.valueOf(v[1]) instanceof Long l && Long.valueOf(v[2]) instanceof Long t
            && Long.valueOf(2 * t / l) instanceof Long q && Long.valueOf(2 * t % l) instanceof Long r
            ? String.format(Locale.US, "%.10f", ((double) n * (n - 1) / 2 * 2 * q
                + IntStream.range(0, n).mapToLong(j -> j - (Integer.valueOf(Arrays.binarySearch(v, 3, 3 + n, (int) (v[3 + j] - r))) instanceof Integer b ? (b >= 3 ? b - 3 : -b - 1 - 3) : 0)).sum()
                + IntStream.range(0, n).mapToLong(j -> Integer.valueOf(Arrays.binarySearch(v, 3, 3 + n, (int) (v[3 + j] - (l - r) + 1))) instanceof Integer b ? (b >= 3 ? b - 3 : -b - 1 - 3) : 0).sum()) / 4) : "");
    }
}
