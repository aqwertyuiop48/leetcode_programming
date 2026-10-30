import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] vals && new long[3] instanceof long[] pr
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] > 47)
                ? (pr[0] = pr[0] * 10 + raw[i] - 48) >= 0 && (pr[2] = 1) > 0
                : pr[2] == 0 || ((vals[(int) pr[1]++] = (int) pr[0]) >= 0 && (pr[0] = 0) == 0 && (pr[2] = 0) == 0))
            && Integer.valueOf(vals[0]) instanceof Integer n && Integer.valueOf(vals[1]) instanceof Integer m
            && new int[3 * (n + 1)] instanceof int[] adj && new int[n + 1] instanceof int[] deg && new int[n + 1] instanceof int[] col
            && IntStream.range(0, m).allMatch(i -> (adj[3 * vals[2 + 2 * i] + deg[vals[2 + 2 * i]]++] = vals[3 + 2 * i]) > 0
                && (adj[3 * vals[3 + 2 * i] + deg[vals[3 + 2 * i]]++] = vals[2 + 2 * i]) > 0)
            && new int[n + 3 * m + 8] instanceof int[] q && new int[]{0, n} instanceof int[] st
            && IntStream.rangeClosed(1, n).allMatch(i -> (q[i - 1] = i) > 0)
            && IntStream.iterate(0, i -> st[0] < st[1], i -> i + 1).allMatch(i -> Integer.valueOf(q[st[0]++]) instanceof Integer v
                && ((deg[v] > 0 && col[adj[3 * v]] == col[v] ? 1 : 0) + (deg[v] > 1 && col[adj[3 * v + 1]] == col[v] ? 1 : 0) + (deg[v] > 2 && col[adj[3 * v + 2]] == col[v] ? 1 : 0) < 2
                    || (col[v] ^= 1) >= 0
                        && (deg[v] < 1 || (q[st[1]++] = adj[3 * v]) > 0) && (deg[v] < 2 || (q[st[1]++] = adj[3 * v + 1]) > 0) && (deg[v] < 3 || (q[st[1]++] = adj[3 * v + 2]) > 0)))
            && new char[n] instanceof char[] out && IntStream.range(0, n).allMatch(i -> (out[i] = (char) (48 + col[i + 1])) > 0)
            ? new String(out) : "");
    }
}
