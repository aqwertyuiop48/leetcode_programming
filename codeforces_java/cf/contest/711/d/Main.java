import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] tok && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[1]) >= 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n
            && new long[n + 1] instanceof long[] p2 && (p2[0] = 1) == 1
            && IntStream.rangeClosed(1, n).filter(i -> (p2[i] = p2[i - 1] * 2 % 1000000007L) > 0).count() >= 0
            && new int[n] instanceof int[] vis && new int[n] instanceof int[] pos && new long[]{1, 0} instanceof long[] res && new int[]{0, 0} instanceof int[] w
            && IntStream.range(0, n).filter(i -> vis[i] == 0 && (w[0] = 0) == 0
                && IntStream.iterate(i, v -> vis[v] == 0, v -> tok[1 + v] - 1).filter(v -> (vis[v] = i + 1) > 0 & (pos[v] = w[0]++) >= 0 & (w[1] = v) >= 0).count() >= 0
                && vis[tok[1 + w[1]] - 1] == i + 1
                && Integer.valueOf(w[0] - pos[tok[1 + w[1]] - 1]) instanceof Integer len
                && (res[0] = res[0] * (p2[len] - 2 + 1000000007L) % 1000000007L) >= 0 & (res[1] += len) > 0).count() >= 0
            ? res[0] * p2[(int) (n - res[1])] % 1000000007L : "");
    }
}
