import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new long[raw.length / 2 + 2] instanceof long[] t && new long[4] instanceof long[] st
            && IntStream.range(0, raw.length + 1).filter(i -> (i < raw.length && raw[i] > 47) ? (st[0] = st[0] * 10 + raw[i] - 48) * 0 + (st[1] = 1) > 0
                : (i < raw.length && raw[i] == 45) ? (st[3] = 1) > 0
                : st[1] == 1 && (t[(int) st[2]++] = st[3] == 1 ? -st[0] : st[0]) * 0 + (st[0] = 0) + (st[1] = 0) + (st[3] = 0) == 0).count() >= 0
            && Integer.valueOf((int) t[0]) instanceof Integer n && new int[n + 1] instanceof int[] q && new boolean[n + 1] instanceof boolean[] vis && new int[n + 1] instanceof int[] ord && new int[n + 1] instanceof int[] res && new int[]{0} instanceof int[] cnt
            && IntStream.rangeClosed(1, n).filter(i -> (q[(int) t[1 + i]] = i) > 0).count() >= 0
            && IntStream.rangeClosed(1, n).filter(i -> !vis[i] && Integer.valueOf(cnt[0]) instanceof Integer s0
                && IntStream.iterate(i, x -> !vis[x], x -> q[x]).filter(x -> (vis[x] = true) && (ord[cnt[0]++] = x) > 0).count() >= 0
                && IntStream.range(0, cnt[0] - s0).filter(j -> (res[ord[s0 + j]] = ord[s0 + (int) ((j + t[1] % (cnt[0] - s0)) % (cnt[0] - s0))]) > 0).count() >= 0).count() >= 0
            ? IntStream.rangeClosed(1, n).mapToObj(i -> String.valueOf(res[i])).collect(Collectors.joining(" ")) : "");
    }
}
