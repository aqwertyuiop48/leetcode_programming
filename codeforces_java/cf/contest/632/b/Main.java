import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] b && Arrays.copyOf(b, b.length + 1) instanceof byte[] raw
            && new long[2] instanceof long[] st && new int[]{0, 0} instanceof int[] ix && new long[raw.length / 2 + 2] instanceof long[] v
            && new long[raw.length / 2 + 2] instanceof long[] pre && new long[1] instanceof long[] base
            && IntStream.range(0, raw.length).filter(k -> raw[k] > 47 && raw[k] < 58 ? (st[0] = st[0] * 10 + raw[k] - 48) < 0
                : raw[k] > 64 ? (pre[ix[1] + 1] = pre[ix[1]] + (raw[k] == 65 ? v[ix[1] + 1] : -v[ix[1] + 1])) + (base[0] += raw[k] == 66 ? v[ix[1] + 1] : 0) + ix[1]++ < 0
                : k > 0 && raw[k - 1] > 47 && raw[k - 1] < 58 && (v[ix[0]++] = st[0]) + (st[0] = 0) < 0).count() >= 0
            ? base[0] + IntStream.rangeClosed(0, (int) v[0]).mapToLong(q -> Math.max(pre[q], pre[(int) v[0]] - pre[q])).max().getAsLong() : "");
    }
}
