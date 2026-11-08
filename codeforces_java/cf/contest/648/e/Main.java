import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new long[raw.length / 2 + 2] instanceof long[] tk && new long[]{0, 0, 0, 0} instanceof long[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] == 45 ? (st[3] = 1) > 0 : raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tk[(int) st[0]++] = st[3] > 0 ? -st[1] : st[1]) > Long.MIN_VALUE & (st[1] = 0) == 0 & (st[2] = 0) == 0 & (st[3] = 0) == 0).count() >= 0
            && Integer.valueOf((int) tk[0]) instanceof Integer n && Integer.valueOf((int) tk[1]) instanceof Integer K
            && new long[11 * K] instanceof long[] val1 && new int[]{0} instanceof int[] hz
            && IntStream.range(0, n).filter(i -> Long.valueOf(tk[2 + i]) instanceof Long a && Integer.valueOf(Long.toString(a).length() * K + (int) (a % K)) instanceof Integer c
                && (a > 0 ? val1[c] <= 1 && (val1[c] = a + 1) > 0 : (hz[0] = 1) > 0 & (val1[c] != 0 || (val1[c] = 1) > 0))).count() >= 0
            && IntStream.range(0, 11 * K).filter(c -> val1[c] > 0).toArray() instanceof int[] ci
            && new int[11] instanceof int[] p10 && (p10[0] = 1 % K) >= 0 && IntStream.rangeClosed(1, 10).filter(l -> (p10[l] = p10[l - 1] * 10 % K) >= 0).count() >= 0
            && new int[K] instanceof int[] dist && new int[K] instanceof int[] par && new int[K] instanceof int[] pt && new boolean[K] instanceof boolean[] done
            && IntStream.range(0, K).filter(v -> (dist[v] = 1 << 29) > 0).count() >= 0
            && IntStream.of(ci).filter(c -> val1[c] > 1 && c / K < dist[c % K] && (dist[c % K] = c / K) > 0 && (par[c % K] = -1) < 0 && (pt[c % K] = c) >= 0).count() >= 0
            && IntStream.range(0, K).allMatch(z -> IntStream.range(0, K).filter(v -> !done[v] && dist[v] < (1 << 29)).reduce((x, y) -> dist[y] < dist[x] ? y : x) instanceof OptionalInt o
                ? !o.isPresent() || Integer.valueOf(o.getAsInt()) instanceof Integer u && (done[u] = true)
                    && IntStream.of(ci).filter(c -> Integer.valueOf((int) (((long) u * p10[c / K] + c % K) % K)) instanceof Integer nv && dist[u] + c / K < dist[nv] && (dist[nv] = dist[u] + c / K) > 0 && (par[nv] = u) >= 0 && (pt[nv] = c) >= 0).count() >= 0
                : true)
            ? dist[0] < (1 << 29) && (dist[0] <= 1 || hz[0] == 0)
                ? (IntStream.iterate(0, v -> v >= 0, v -> par[v]).mapToObj(v -> String.valueOf(val1[pt[v]] - 1)).toList() instanceof List<String> L ? "YES\n" + IntStream.range(0, L.size()).mapToObj(i -> L.get(L.size() - 1 - i)).collect(Collectors.joining()) : "")
                : (hz[0] == 1 ? "YES\n0" : "NO") : "");
    }
}
