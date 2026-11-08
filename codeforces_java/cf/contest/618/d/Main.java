import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] t && new int[3] instanceof int[] cur
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] >= 48
                ? (cur[0] = cur[0] * 10 + raw[i] - 48) >= 0 && (cur[1] = 1) == 1
                : cur[1] == 0 || ((t[cur[2]++] = cur[0]) >= 0 && (cur[0] = 0) == 0 && (cur[1] = 0) == 0)) || true)
            && Integer.valueOf(t[0]) instanceof Integer n && Long.valueOf(t[2]) instanceof Long x && Long.valueOf(t[1]) instanceof Long y
            && new int[n] instanceof int[] deg && new int[n] instanceof int[] xr && new int[n] instanceof int[] used && new int[n] instanceof int[] ord && new int[2] instanceof int[] st
            && IntStream.range(0, n - 1).allMatch(i -> ++deg[t[3 + 2 * i] - 1] > 0 && ++deg[t[4 + 2 * i] - 1] > 0
                && (xr[t[3 + 2 * i] - 1] ^= t[4 + 2 * i] - 1) >= 0 && (xr[t[4 + 2 * i] - 1] ^= t[3 + 2 * i] - 1) >= 0)
            && Boolean.valueOf(Arrays.stream(deg).anyMatch(d -> d == n - 1)) instanceof Boolean star
            && IntStream.range(0, n).filter(v -> deg[v] == 1).allMatch(v -> (ord[st[0]++] = v) >= 0)
            && IntStream.range(0, n - 1).allMatch(qi -> Integer.valueOf(ord[qi]) instanceof Integer v && Integer.valueOf(xr[v]) instanceof Integer p
                && (xr[p] ^= v) >= 0 && (--deg[p] == 1 ? (ord[st[0]++] = p) >= 0 : true)
                && (used[v] < 2 && used[p] < 2 ? st[1]++ >= 0 && ++used[v] > 0 && ++used[p] > 0 : true))
            ? (x < y ? (star ? (n - 2) * x + y : (n - 1) * x) : st[1] * y + (n - 1 - st[1]) * x) : "");
    }
}
