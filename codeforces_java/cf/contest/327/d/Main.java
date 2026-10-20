import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(w -> !w.isEmpty()).toArray(String[]::new) instanceof String[] w
            && Integer.valueOf(w[0]) instanceof Integer n && Integer.valueOf(w[1]) instanceof Integer m
            && String.join("", Arrays.copyOfRange(w, 2, 2 + n)) instanceof String g
            && new boolean[n * m] instanceof boolean[] vis && new boolean[n * m] instanceof boolean[] hasChild
            && new int[n * m] instanceof int[] q && new int[n * m] instanceof int[] par && new int[]{0, 0} instanceof int[] qn
            && new StringBuilder() instanceof StringBuilder sb
            && ((BiFunction<Character, Integer, String>) (ch, v) -> ch + " " + (v / m + 1) + " " + (v % m + 1) + "\n") instanceof BiFunction<Character, Integer, String> op
            && IntStream.range(0, n * m).allMatch(c -> g.charAt(c) != '.' || vis[c] || (Integer.valueOf(qn[0]) instanceof Integer s && (vis[c] = true) && (par[c] = -1) < 0 && (q[qn[0]++] = c) >= 0
                && IntStream.iterate(s, h -> h < qn[0], h -> h + 1).allMatch(h -> Integer.valueOf(q[h]) instanceof Integer p
                    && IntStream.range(0, 4).allMatch(k -> Integer.valueOf(p / m + new int[]{0, 1, 0, -1}[k]) instanceof Integer nr && Integer.valueOf(p % m + new int[]{1, 0, -1, 0}[k]) instanceof Integer nc
                        && (nr < 0 || nr >= n || nc < 0 || nc >= m || g.charAt(nr * m + nc) != '.' || vis[nr * m + nc]
                            || ((vis[nr * m + nc] = true) && (par[nr * m + nc] = p) >= 0 && (hasChild[p] = true) && (q[qn[0]++] = nr * m + nc) >= 0))))
                && IntStream.range(s, qn[0]).filter(i -> par[q[i]] < 0 || hasChild[q[i]]).allMatch(i -> sb.append(op.apply('B', q[i])) != null && qn[1]++ >= 0)
                && IntStream.range(s, qn[0]).filter(i -> par[q[i]] >= 0 && !hasChild[q[i]]).allMatch(i -> sb.append(op.apply('R', q[i])) != null && qn[1]++ >= 0)
                && IntStream.range(s, qn[0]).map(i -> qn[0] - 1 - (i - s)).filter(i -> par[q[i]] >= 0 && hasChild[q[i]]).allMatch(i -> sb.append(op.apply('D', q[i])).append(op.apply('R', q[i])) != null && (qn[1] += 2) > 0)))
            ? qn[1] + "\n" + sb.toString().trim() : "");
    }
}
