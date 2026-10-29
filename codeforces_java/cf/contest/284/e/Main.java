import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer q && Integer.valueOf(it.next()) instanceof Integer w0
            && IntStream.range(0, n).map(i -> it.next()).toArray() instanceof int[] t
            && new int[n] instanceof int[] nxt && new boolean[n] instanceof boolean[] hasIn
            && IntStream.range(0, n).allMatch(i -> (nxt[i] = -1) < 0)
            && IntStream.range(0, q).allMatch(i -> Integer.valueOf(it.next() - 1) instanceof Integer u && Integer.valueOf(it.next() - 1) instanceof Integer v && (nxt[u] = v) >= 0 && (hasIn[v] = true))
            && new long[]{w0, 0, 0} instanceof long[] st && new ArrayList<Long>() instanceof ArrayList<Long> coins
            && IntStream.range(0, n).filter(h -> !hasIn[h]).allMatch(h -> (st[1] = 0) == 0
                && IntStream.iterate(h, c -> c >= 0, c -> nxt[c]).allMatch(c -> (st[1] += t[c]) > 0 && (st[2]++) >= 0 && (nxt[c] < 0 || (st[0] -= st[1]) > -1e18) && coins.add(st[1])))
            && st[2] == n && st[0] >= 0 && Integer.valueOf((int) st[0]) instanceof Integer w && new int[w + 1] instanceof int[] dp && (dp[0] = 1) == 1
            && coins.stream().filter(p -> p <= w).allMatch(p -> IntStream.rangeClosed(p.intValue(), w).allMatch(s -> (dp[s] = (dp[s] + dp[s - p.intValue()]) % 1000000007) >= 0))
            ? dp[w] : 0);
    }
}

