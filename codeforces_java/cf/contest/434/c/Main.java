import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k
            && ((Supplier<int[]>) () -> IntStream.range(0, Integer.parseInt(tk.nextToken())).map(i -> Integer.parseInt(tk.nextToken())).toArray()) instanceof Supplier<int[]> rd
            && rd.get() instanceof int[] lb && rd.get() instanceof int[] rb
            && IntStream.range(0, n).mapToObj(i -> new int[][]{rd.get(), {Integer.parseInt(tk.nextToken())}}).toArray(int[][][]::new) instanceof int[][][] pats
            && new int[203][m] instanceof int[][] nx && IntStream.range(0, 203).allMatch(i -> IntStream.range(0, m).allMatch(d -> (nx[i][d] = -1) == -1)) && new long[203] instanceof long[] wt && new int[]{1} instanceof int[] nc
            && Arrays.stream(pats).allMatch(p -> new int[]{0} instanceof int[] cur && IntStream.of(p[0]).allMatch(d -> (nx[cur[0]][d] != -1 || (nx[cur[0]][d] = nc[0]++) >= 0) && (cur[0] = nx[cur[0]][d]) >= 0) && (wt[cur[0]] += p[1][0]) > 0)
            && new int[203] instanceof int[] fail && new int[203] instanceof int[] q && new int[]{0, 0} instanceof int[] qp
            && IntStream.range(0, m).allMatch(d -> nx[0][d] == -1 ? (nx[0][d] = 0) == 0 : (fail[nx[0][d]] = 0) == 0 && (q[qp[1]++] = nx[0][d]) > 0)
            && IntStream.range(0, 203).allMatch(h -> h >= qp[1] || ((Integer) q[h] instanceof Integer u && (wt[u] += wt[fail[u]]) >= 0
                && IntStream.range(0, m).allMatch(d -> nx[u][d] == -1 ? (nx[u][d] = nx[fail[u]][d]) >= -1 : (fail[nx[u][d]] = nx[fail[u]][d]) >= 0 && (q[qp[1]++] = nx[u][d]) > 0)))
            && (Integer) nc[0] instanceof Integer N && LongStream.of(wt).mapToInt(w -> (int) Math.min(w, k + 1)).toArray() instanceof int[] wc
            && (Integer) Math.max(lb.length, rb.length) instanceof Integer Lm && new int[Lm + 1][N][] instanceof int[][][] cnt
            && IntStream.range(0, N).allMatch(v -> (cnt[0][v] = IntStream.range(0, k + 1).map(b -> 1).toArray()) != null)
            && IntStream.rangeClosed(1, Lm).allMatch(rem -> IntStream.range(0, N).allMatch(v -> new long[k + 1] instanceof long[] acc
                && IntStream.range(0, m).allMatch(d -> wc[nx[v][d]] > k || IntStream.rangeClosed(wc[nx[v][d]], k).allMatch(b -> (acc[b] += cnt[rem - 1][nx[v][d]][b - wc[nx[v][d]]]) >= 0))
                && (cnt[rem][v] = LongStream.of(acc).mapToInt(a -> (int) (a % 1000000007L)).toArray()) != null))
            && ((Function<int[], long[]>) bd -> new long[]{0, 0} instanceof long[] res && new int[]{0, 0} instanceof int[] st
                && IntStream.range(1, bd.length).allMatch(len -> IntStream.range(1, m).allMatch(d -> wc[nx[0][d]] > k || (res[0] += cnt[len - 1][nx[0][d]][k - wc[nx[0][d]]]) >= 0))
                && (IntStream.range(0, bd.length).allMatch(i -> IntStream.range(i == 0 ? 1 : 0, bd[i]).allMatch(d -> st[1] + wc[nx[st[0]][d]] > k || (res[0] += cnt[bd.length - 1 - i][nx[st[0]][d]][k - st[1] - wc[nx[st[0]][d]]]) >= 0)
                    && (st[0] = nx[st[0]][bd[i]]) >= 0 && (st[1] += wc[st[0]]) >= 0 && st[1] <= k) || true)
                && (res[1] = st[1] <= k ? 1 : 0) >= 0 && (res[0] += res[1]) >= 0 ? res : new long[2]) instanceof Function<int[], long[]> F
            ? ((F.apply(rb)[0] - F.apply(lb)[0] + F.apply(lb)[1]) % 1000000007L + 1000000007L) % 1000000007L : 0);
    }
}
