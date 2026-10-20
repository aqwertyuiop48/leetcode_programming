import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> (String) t).toList() instanceof List<String> t
            && t.get(0) instanceof String p && t.get(1) instanceof String s && Integer.valueOf(t.get(2)) instanceof Integer k
            && Integer.valueOf(p.length()) instanceof Integer P && Integer.valueOf(s.length()) instanceof Integer m
            && Integer.valueOf(P / k) instanceof Integer full && Integer.valueOf(P % k) instanceof Integer r
            ? IntStream.rangeClosed(1, Math.min(m, k)).filter(cnt -> m - full * cnt >= 0 && (r == 0 ? m - full * cnt == 0 : m - full * cnt <= cnt))
                .mapToObj(cnt -> Integer.valueOf(m - full * cnt) instanceof Integer q
                    && IntStream.range(0, cnt).mapToObj(j -> IntStream.range(0, k).mapToObj(o -> IntStream.range(0, full).allMatch(b -> p.charAt(b * k + o) == s.charAt(b * cnt + j))
                        && (r == 0 || (j < q ? o < r && p.charAt(full * k + o) == s.charAt(full * cnt + j) : o >= r))).toArray(Boolean[]::new)).toArray(Boolean[][]::new) instanceof Boolean[][] ok
                    && new boolean[cnt + 1][k + 2] instanceof boolean[][] g
                    && IntStream.rangeClosed(0, k).allMatch(o -> (g[cnt][o] = true))
                    && IntStream.iterate(cnt - 1, j -> j >= 0, j -> j - 1).allMatch(j -> IntStream.iterate(k - 1, o -> o >= 0, o -> o - 1).allMatch(o -> (g[j][o] = g[j][o + 1] || ok[j][o] && g[j + 1][o + 1]) | true))
                    && g[0][0] && new char[k] instanceof char[] key && IntStream.range(0, k).allMatch(o -> (key[o] = '0') == '0') && new int[]{-1} instanceof int[] prev
                    && IntStream.range(0, cnt).allMatch(j -> Integer.valueOf(IntStream.iterate(k - 1, o -> o > prev[0], o -> o - 1).filter(o -> ok[j][o] && g[j + 1][o + 1]).findFirst().orElse(-1)) instanceof Integer o
                        && o >= 0 && (key[o] = '1') == '1' && (prev[0] = o) >= 0)
                    ? new String(key) : null)
                .filter(Objects::nonNull).min(Comparator.naturalOrder()).orElse("0") : "");
    }
}
