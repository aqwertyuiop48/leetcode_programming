import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 4] instanceof int[] v && new int[3] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> i < raw.length && raw[i] >= '0' ? (st[0] = st[0] * 10 + raw[i] - '0') >= 0 && (st[2] = 1) > 0 : st[2] == 0 || (v[st[1]++] = st[0]) >= 0 && (st[0] = 0) == 0 && (st[2] = 0) == 0)
            && Integer.valueOf(v[0]) instanceof Integer n && Integer.valueOf((n + 2) / 3) instanceof Integer k
            && IntStream.range(0, n).mapToObj(i -> ((long) v[1 + i] << 20) | i).sorted().mapToLong(Long::longValue).toArray() instanceof long[] o
            && new int[n] instanceof int[] a && new int[n] instanceof int[] b
            && IntStream.range(0, n).allMatch(r -> Integer.valueOf((int) (o[r] & 1048575)) instanceof Integer id && Integer.valueOf(v[1 + id]) instanceof Integer s
                && (r < k ? (a[id] = r) >= 0 && (b[id] = s - r) >= 0 : r < 2 * k ? (b[id] = r) >= 0 && (a[id] = s - r) >= 0 : (b[id] = n - 1 - r) >= 0 && (a[id] = s - b[id]) >= 0))
            ? "YES\n" + Arrays.stream(a).mapToObj(String::valueOf).collect(Collectors.joining(" ")) + "\n" + Arrays.stream(b).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
