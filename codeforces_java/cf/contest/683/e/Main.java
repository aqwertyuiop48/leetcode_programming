import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new long[raw.length / 2 + 2] instanceof long[] t && new long[4] instanceof long[] st
            && IntStream.range(0, raw.length + 1).filter(i -> (i < raw.length && raw[i] > 47) ? (st[0] = st[0] * 10 + raw[i] - 48) * 0 + (st[1] = 1) > 0
                : (i < raw.length && raw[i] == 45) ? (st[3] = 1) > 0
                : st[1] == 1 && (t[(int) st[2]++] = st[3] == 1 ? -st[0] : st[0]) * 0 + (st[0] = 0) + (st[1] = 0) + (st[3] = 0) == 0).count() >= 0
            && Integer.valueOf((int) t[0]) instanceof Integer n && new int[n + 1] instanceof int[] bit && new int[n + 1] instanceof int[] res
            && IntStream.rangeClosed(1, n).filter(i -> (bit[i] = i & -i) > 0).count() >= 0
            && IntStream.rangeClosed(1, n).filter(i -> new int[]{0, (int) t[i] + 1} instanceof int[] s
                && IntStream.iterate(Integer.highestOneBit(n), b -> b > 0, b -> b >> 1).filter(b -> s[0] + b <= n && bit[s[0] + b] < s[1] && (s[0] += b) > 0 && (s[1] -= bit[s[0]]) >= 0).count() >= 0
                && (res[s[0] + 1] = i) > 0 && IntStream.iterate(s[0] + 1, p -> p <= n, p -> p + (p & -p)).filter(p -> --bit[p] >= -1).count() >= 0).count() >= 0
            ? IntStream.rangeClosed(1, n).mapToObj(i -> String.valueOf(res[i])).collect(Collectors.joining(" ")) : "");
    }
}
