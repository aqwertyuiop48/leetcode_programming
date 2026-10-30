import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer q
            && IntStream.range(0, n).mapToObj(i -> tk.nextToken()).collect(Collectors.joining()) instanceof String grid && (Integer) (n * m) instanceof Integer N
            && IntStream.range(0, 20).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] mv
            && IntStream.range(0, N).map(v -> grid.charAt(v) - '0').toArray() instanceof int[] dg
            && IntStream.range(0, N).map(v -> (Integer) (v / m + mv[2 * dg[v]]) instanceof Integer r && (Integer) (v % m + mv[2 * dg[v] + 1]) instanceof Integer c && r >= 0 && r < n && c >= 0 && c < m ? r * m + c : v).toArray() instanceof int[] nx
            && new int[N] instanceof int[] indeg && IntStream.range(0, N).allMatch(v -> ++indeg[nx[v]] > 0)
            && new int[N] instanceof int[] qu && new int[]{0} instanceof int[] tl
            && IntStream.range(0, N).filter(v -> indeg[v] == 0).allMatch(v -> (qu[tl[0]++] = v) >= 0)
            && IntStream.range(0, N).takeWhile(i -> i < tl[0]).allMatch(i -> --indeg[nx[qu[i]]] != 0 || (qu[tl[0]++] = nx[qu[i]]) >= 0)
            && IntStream.range(0, N).map(v -> -1).toArray() instanceof int[] comp && new int[N] instanceof int[] mask
            && IntStream.range(0, N).filter(v -> indeg[v] > 0 && comp[v] < 0).allMatch(v -> IntStream.iterate(v, u -> comp[u] < 0, u -> nx[u]).allMatch(u -> (comp[u] = v) >= 0 && (mask[v] |= 1 << dg[u]) > 0))
            && new int[10] instanceof int[] lo && new int[1024] instanceof int[] lm
            ? IntStream.range(0, q).mapToObj(qi -> tk.nextToken() instanceof String s && (Integer) s.length() instanceof Integer len
                && IntStream.range(0, 10).allMatch(d -> (lo[d] = -1) < 0) && IntStream.range(0, len).allMatch(i -> (lo[s.charAt(i) - '0'] = i) >= 0)
                && IntStream.range(0, 1024).allMatch(k -> (lm[k] = 1 + IntStream.range(0, 10).filter(d -> (k >> d & 1) == 0).map(d -> lo[d]).max().orElse(-1)) >= 0)
                && new int[N] instanceof int[] need
                && IntStream.range(0, N).filter(v -> indeg[v] > 0).allMatch(v -> (need[v] = lm[mask[comp[v]]]) >= 0)
                && IntStream.range(0, tl[0]).map(i -> tl[0] - 1 - i).allMatch(i -> (Integer) qu[i] instanceof Integer v && (Integer) need[nx[v]] instanceof Integer T
                    && (need[v] = T >= 1 && s.charAt(T - 1) - '0' == dg[v] ? T - 1 : T) >= 0)
                ? (IntStream.range(0, N).anyMatch(v -> need[v] == 0) ? "YES" : "NO") : "").collect(Collectors.joining("\n")) : "");
    }
}
