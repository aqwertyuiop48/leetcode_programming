import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(tk.nextToken()) instanceof Integer n && Integer.valueOf(tk.nextToken()) instanceof Integer m
            && IntStream.generate(() -> Integer.parseInt(tk.nextToken())).limit(2L * m + 4).toArray() instanceof int[] e
            && Integer.valueOf(e[2 * m]) instanceof Integer s && Integer.valueOf(e[2 * m + 1]) instanceof Integer t
            && Integer.valueOf(e[2 * m + 2]) instanceof Integer ds && Integer.valueOf(e[2 * m + 3]) instanceof Integer dt
            && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] sz && new int[n + 1] instanceof int[] sTo && new int[n + 1] instanceof int[] tTo
            && new boolean[1] instanceof boolean[] hasST && new int[2] instanceof int[] deg && new StringBuilder() instanceof StringBuilder sb
            && new ArrayList<Integer>() instanceof ArrayList<Integer> both
            && IntStream.rangeClosed(0, n).allMatch(i -> (par[i] = i) >= 0 && (sz[i] = 1) > 0)
            && ((IntUnaryOperator) x -> IntStream.iterate(x, y -> par[y]).filter(y -> par[y] == y).findFirst().getAsInt()) instanceof IntUnaryOperator root
            && IntStream.range(0, m).allMatch(i -> e[2 * i] == s || e[2 * i] == t || e[2 * i + 1] == s || e[2 * i + 1] == t
                || (Integer.valueOf(root.applyAsInt(e[2 * i])) instanceof Integer x && Integer.valueOf(root.applyAsInt(e[2 * i + 1])) instanceof Integer y
                    && (x.equals(y) || (Integer.valueOf(sz[x] >= sz[y] ? x : y) instanceof Integer big && Integer.valueOf(x + y - big) instanceof Integer sm
                        && (par[sm] = big) >= 0 && (sz[big] += sz[sm]) > 0 && sb.append(e[2 * i]).append(' ').append(e[2 * i + 1]).append('\n') != null))))
            && IntStream.range(0, m).allMatch(i -> (e[2 * i] == s && e[2 * i + 1] == t) || (e[2 * i] == t && e[2 * i + 1] == s) ? (hasST[0] = true)
                : e[2 * i] == s || e[2 * i + 1] == s ? (sTo[root.applyAsInt(e[2 * i] == s ? e[2 * i + 1] : e[2 * i])] = e[2 * i] == s ? e[2 * i + 1] : e[2 * i]) > 0
                : e[2 * i] == t || e[2 * i + 1] == t ? (tTo[root.applyAsInt(e[2 * i] == t ? e[2 * i + 1] : e[2 * i])] = e[2 * i] == t ? e[2 * i + 1] : e[2 * i]) > 0 : true)
            && IntStream.rangeClosed(1, n).filter(v -> v != s && v != t && root.applyAsInt(v) == v).allMatch(v -> sTo[v] > 0 && tTo[v] > 0 ? both.add(v)
                : sTo[v] > 0 ? sb.append(s).append(' ').append(sTo[v]).append('\n') != null && ++deg[0] > 0
                : tTo[v] > 0 && sb.append(t).append(' ').append(tTo[v]).append('\n') != null && ++deg[1] > 0)
            && (both.isEmpty() ? hasST[0] && sb.append(s).append(' ').append(t).append('\n') != null && ++deg[0] > 0 && ++deg[1] > 0
                : sb.append(s).append(' ').append(sTo[both.get(0)]).append('\n').append(t).append(' ').append(tTo[both.get(0)]).append('\n') != null && ++deg[0] > 0 && ++deg[1] > 0
                    && IntStream.range(1, both.size()).allMatch(i -> deg[0] < ds ? sb.append(s).append(' ').append(sTo[both.get(i)]).append('\n') != null && ++deg[0] > 0
                        : deg[1] < dt && sb.append(t).append(' ').append(tTo[both.get(i)]).append('\n') != null && ++deg[1] > 0))
            && deg[0] <= ds && deg[1] <= dt
            ? "Yes\n" + sb.toString().trim() : "No");
    }
}
