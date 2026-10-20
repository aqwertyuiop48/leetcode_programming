import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && ((IntSupplier) () -> Integer.parseInt(st.nextToken())) instanceof IntSupplier ni && Integer.valueOf(ni.getAsInt()) instanceof Integer n && Integer.valueOf(ni.getAsInt()) instanceof Integer m && IntStream.range(0, m).mapToObj(i -> new int[] {ni.getAsInt(), ni.getAsInt()}).toArray(int[][]::new) instanceof int[][] ed && Integer.valueOf(ni.getAsInt()) instanceof Integer s && Integer.valueOf(ni.getAsInt()) instanceof Integer t
            && new int[n + 1] instanceof int[] cnt && new int[m] instanceof int[] nxt && IntStream.generate(() -> 1 << 29).limit(n + 1).toArray() instanceof int[] d && new boolean[n + 1] instanceof boolean[] vis && new ArrayDeque<Integer>() instanceof ArrayDeque<Integer> dq
            && IntStream.generate(() -> -1).limit(n + 1).toArray() instanceof int[] hd
            && IntStream.range(0, m).map(i -> ++cnt[ed[i][0]] + (nxt[i] = hd[ed[i][1]]) + (hd[ed[i][1]] = i)).summaryStatistics() != null
            && (d[t] = 0) == 0 && dq.offerFirst(t)
            && Stream.generate(dq::pollFirst).takeWhile(Objects::nonNull).filter(u -> !vis[u] && (vis[u] = true)).map(u -> IntStream.iterate(hd[u], e -> e >= 0, e -> nxt[e]).filter(e -> Integer.valueOf(ed[e][0]) instanceof Integer v && Integer.valueOf(--cnt[v] == 0 ? d[u] : d[u] + 1) instanceof Integer c && c < d[v] && (d[v] = c) >= 0 && (cnt[v] == 0 ? dq.offerFirst(v) : dq.offerLast(v))).count()).count() >= 0)
            System.out.print(d[s] >= 1 << 29 ? -1 : d[s]);
    }
}
