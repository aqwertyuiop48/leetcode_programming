
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && new int[m] instanceof int[] ea && new int[m] instanceof int[] eb && new int[n + 2] instanceof int[] start
            && IntStream.range(0, m).allMatch(i -> (ea[i] = Integer.parseInt(tk.nextToken()) - 1) >= 0 && (eb[i] = Integer.parseInt(tk.nextToken()) - 1) >= 0 && ++start[ea[i] + 1] > 0 && ++start[eb[i] + 1] > 0)
            && IntStream.range(0, n).allMatch(i -> (start[i + 1] += start[i]) >= 0) && new int[2 * m + n] instanceof int[] adj && IntStream.range(0, n + 1).map(i -> start[i] + i).toArray() instanceof int[] fill && fill.clone() instanceof int[] st0
            && IntStream.range(0, m).allMatch(i -> (adj[fill[ea[i]]++] = eb[i]) >= 0 && (adj[fill[eb[i]]++] = ea[i]) >= 0) && IntStream.range(0, n).filter(u -> (adj[st0[u + 1] - 1] = -1) < 0).count() >= 0
            && new short[n][n] instanceof short[][] d
            && IntStream.range(0, n).parallel().allMatch(v -> d[v] instanceof short[] r && new int[n] instanceof int[] q && new int[3] instanceof int[] st && IntStream.range(0, n).filter(i -> (r[i] = -1) < 0).count() >= 0 && (r[v] = 0) == 0 && (q[0] = v) >= 0 && (st[1] = 1) == 1 && (st[2] = st0[v]) >= 0
                && IntStream.range(0, 2 * m).filter(s -> st[0] < st[1] && (r[adj[st[2]]] >= 0 || (r[adj[st[2]]] = (short) (r[q[st[0]]] + 1)) > 0 && (q[st[1]++] = adj[st[2]]) >= 0)
                    && adj[++st[2]] < 0 && ++st[0] > 0 && (st[0] >= n || (st[2] = st0[q[st[0]]]) >= 0) || true).count() >= 0)
            && (Integer) (Integer.parseInt(tk.nextToken()) - 1) instanceof Integer s1 && (Integer) (Integer.parseInt(tk.nextToken()) - 1) instanceof Integer t1 && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer l1
            && (Integer) (Integer.parseInt(tk.nextToken()) - 1) instanceof Integer s2 && (Integer) (Integer.parseInt(tk.nextToken()) - 1) instanceof Integer t2 && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer l2
            && d[s1] instanceof short[] ds1 && d[t1] instanceof short[] dt1 && d[s2] instanceof short[] ds2 && d[t2] instanceof short[] dt2
            ? d[s1][t1] > l1 || d[s2][t2] > l2 ? "-1"
                : String.valueOf(m - IntStream.range(0, n).parallel().map(x -> d[x] instanceof short[] dx ? IntStream.range(0, n).map(y ->
                        ds1[x] + dx[y] + dt1[y] <= l1
                            ? Math.min(ds2[x] + dx[y] + dt2[y] <= l2 ? ds1[x] + dt1[y] + ds2[x] + dt2[y] + dx[y] : Integer.MAX_VALUE,
                                dt2[x] + dx[y] + ds2[y] <= l2 ? ds1[x] + dt1[y] + dt2[x] + ds2[y] + dx[y] : Integer.MAX_VALUE)
                            : Integer.MAX_VALUE).min().getAsInt() : 0)
                    .reduce(d[s1][t1] + d[s2][t2], Math::min)) : "");
    }
}



