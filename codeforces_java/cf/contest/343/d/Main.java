import java.util.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).iterator() instanceof Iterator<String> it && Integer.valueOf(it.next()) instanceof Integer n && IntStream.range(0, n - 1).mapToObj(i -> new int[]{Integer.parseInt(it.next()), Integer.parseInt(it.next())}).toArray(int[][]::new) instanceof int[][] ed
            && new int[n + 2] instanceof int[] st && Arrays.stream(ed).allMatch(x -> st[x[0] + 1]++ >= 0 & st[x[1] + 1]++ >= 0) && IntStream.rangeClosed(1, n + 1).allMatch(v -> (st[v] += st[v - 1]) >= 0)
            && st.clone() instanceof int[] pos && new int[2 * n] instanceof int[] adj && Arrays.stream(ed).allMatch(x -> (adj[pos[x[0]]++] = x[1]) > 0 & (adj[pos[x[1]]++] = x[0]) > 0)
            && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] tin && new int[n] instanceof int[] ord && new int[n + 1] instanceof int[] stk && new int[]{1, 0} instanceof int[] sc && (stk[0] = 1) == 1
            && IntStream.generate(() -> 0).takeWhile(z -> sc[0] > 0).allMatch(z -> Integer.valueOf(stk[--sc[0]]) instanceof Integer v && (tin[v] = sc[1]) >= 0 && (ord[sc[1]++] = v) > 0
                && IntStream.range(st[v], st[v + 1]).filter(k -> adj[k] != par[v]).allMatch(k -> (par[adj[k]] = v) > 0 && (stk[sc[0]++] = adj[k]) > 0))
            && new int[n + 1] instanceof int[] sz && IntStream.rangeClosed(1, n).allMatch(v -> (sz[v] = 1) > 0)
            && IntStream.iterate(n - 1, i -> i > 0, i -> i - 1).allMatch(i -> (sz[par[ord[i]]] += sz[ord[i]]) > 0)
            && new int[2 * n] instanceof int[] F && new int[2 * n] instanceof int[] E && Integer.valueOf(Integer.parseInt(it.next())) instanceof Integer m
            ? IntStream.rangeClosed(1, m).mapToObj(t -> Integer.valueOf(it.next()) instanceof Integer c && Integer.valueOf(it.next()) instanceof Integer v
                ? (c == 1 ? (new int[]{tin[v] + n, tin[v] + sz[v] + n} instanceof int[] lr && IntStream.generate(() -> 0).takeWhile(z -> lr[0] < lr[1]).allMatch(z -> ((lr[0] & 1) == 0 || (F[lr[0]++] = t) > 0) && ((lr[1] & 1) == 0 || (F[--lr[1]] = t) > 0) && (lr[0] >>= 1) >= 0 && (lr[1] >>= 1) >= 0) ? "" : "")
                    : c == 2 ? (IntStream.iterate(tin[v] + n, i -> i >= 1, i -> i >> 1).allMatch(i -> (E[i] = t) > 0) ? "" : "")
                    : (new int[]{tin[v] + n, tin[v] + sz[v] + n, 0} instanceof int[] lr && IntStream.generate(() -> 0).takeWhile(z -> lr[0] < lr[1]).allMatch(z -> ((lr[0] & 1) == 0 || (lr[2] = Math.max(lr[2], E[lr[0]++])) >= 0) && ((lr[1] & 1) == 0 || (lr[2] = Math.max(lr[2], E[--lr[1]])) >= 0) && (lr[0] >>= 1) >= 0 && (lr[1] >>= 1) >= 0)
                        && IntStream.iterate(tin[v] + n, i -> i >= 1, i -> i >> 1).map(i -> F[i]).max().getAsInt() > lr[2] ? "1" : "0")) : "").filter(s -> !s.isEmpty()).collect(Collectors.joining("\n")) : "");
    }
}
