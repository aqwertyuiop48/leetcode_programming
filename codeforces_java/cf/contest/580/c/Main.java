import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && (Integer) Integer.parseInt(st.nextToken()) instanceof Integer n
            && (Integer) Integer.parseInt(st.nextToken()) instanceof Integer m
            && IntStream.range(0, n).map(i -> Integer.parseInt(st.nextToken())).toArray() instanceof int[] cat
            && IntStream.range(0, 2 * (n - 1)).map(i -> Integer.parseInt(st.nextToken()) - 1).toArray() instanceof int[] e
            && new int[n + 2] instanceof int[] sp && new int[n + 2] instanceof int[] pos && new int[2 * n] instanceof int[] adj
            && new int[n] instanceof int[] par && new int[n] instanceof int[] c && new int[n] instanceof int[] q && new int[] {0} instanceof int[] tail
            && IntStream.range(0, 2 * (n - 1)).filter(i -> ++sp[e[i] + 1] >= 0).count() >= 0
            && IntStream.range(0, n).filter(i -> (sp[i + 1] += sp[i]) >= 0 && (pos[i] = sp[i]) >= 0).count() >= 0
            && IntStream.range(0, n - 1).filter(i -> (adj[pos[e[2 * i]]++] = e[2 * i + 1]) >= 0 && (adj[pos[e[2 * i + 1]]++] = e[2 * i]) >= 0).count() >= 0
            && (par[0] = -1) < 0 && (c[0] = cat[0]) >= 0
            ? IntStream.range(0, n).filter(h -> h <= tail[0]).filter(h -> IntStream.range(sp[q[h]], sp[q[h] + 1]).map(x -> adj[x])
                .filter(v -> v != par[q[h]] && (par[v] = q[h]) >= 0 && (c[v] = cat[v] == 1 ? c[q[h]] + 1 : 0) <= m && (q[++tail[0]] = v) >= 0).count() >= 0
                && q[h] > 0 && sp[q[h] + 1] - sp[q[h]] == 1).count() : 0);
    }
}
