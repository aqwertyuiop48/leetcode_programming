import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new StringTokenizer(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().collect(Collectors.joining(" "))) instanceof StringTokenizer st
            && Integer.valueOf(Integer.parseInt(st.nextToken())) instanceof Integer n
            && new int[n] instanceof int[] ot && new int[n] instanceof int[] ov && new int[n] instanceof int[] oc && new int[n] instanceof int[] nid
            && new int[]{0, 1, 1} instanceof int[] cnt && new int[3][n + 2] instanceof int[][] par && new int[3][n + 2] instanceof int[][] ch
            && IntStream.range(0, n).allMatch(i -> (ot[i] = Integer.parseInt(st.nextToken())) > 0 && (ov[i] = Integer.parseInt(st.nextToken())) > 0 && (oc[i] = st.nextToken().charAt(0)) > 0
                && (nid[i] = ++cnt[ot[i]]) > 0 && (par[ot[i]][nid[i]] = ov[i]) > 0 && (ch[ot[i]][nid[i]] = oc[i]) > 0)
            && Long.valueOf(1000000007L) instanceof Long M1 && Long.valueOf(998244353L) instanceof Long M2 && Long.valueOf(911382323L) instanceof Long B1 && Long.valueOf(972663749L) instanceof Long B2
            && new long[n + 3] instanceof long[] pw1 && new long[n + 3] instanceof long[] pw2 && (pw1[0] = 1) == 1 && (pw2[0] = 1) == 1
            && IntStream.range(1, n + 3).allMatch(i -> (pw1[i] = pw1[i - 1] * B1 % M1) > 0 && (pw2[i] = pw2[i - 1] * B2 % M2) > 0)
            && new int[n + 2] instanceof int[] np && new int[n + 2] instanceof int[] nd && new long[n + 2] instanceof long[] h1 && new long[n + 2] instanceof long[] h2
            && new HashMap<Long, Integer>() instanceof HashMap<Long, Integer> trie && new HashMap<Long, Integer>() instanceof HashMap<Long, Integer> hmap
            && new int[]{1} instanceof int[] nc && hmap.put(0L, 0) == null && new int[n + 2] instanceof int[] canon
            && IntStream.range(0, n).filter(i -> ot[i] == 1).allMatch(i -> Integer.valueOf(canon[ov[i]]) instanceof Integer p && Long.valueOf(oc[i]) instanceof Long c
                && (canon[nid[i]] = trie.computeIfAbsent(p * 256L + c, kk -> Integer.valueOf(nc[0]++) instanceof Integer z && (np[z] = p) >= 0 && (nd[z] = nd[p] + 1) >= 0
                    && (h1[z] = (h1[p] + c * pw1[nd[p]]) % M1) >= 0 && (h2[z] = (h2[p] + c * pw2[nd[p]]) % M2) >= 0 && (hmap.put(h1[z] * (1L << 30) + h2[z], z) == null || true) ? z : 0)) >= 0)
            && Integer.valueOf(nc[0]) instanceof Integer NN
            && new long[n + 2] instanceof long[] q1 && new long[n + 2] instanceof long[] q2 && new int[n + 2] instanceof int[] d2 && Integer.valueOf(20) instanceof Integer LOG && new int[LOG][n + 2] instanceof int[][] up
            && IntStream.range(0, LOG).allMatch(j -> (up[j][1] = 1) == 1)
            && IntStream.rangeClosed(2, cnt[2]).allMatch(id -> (d2[id] = d2[par[2][id]] + 1) > 0 && (q1[id] = (q1[par[2][id]] * B1 + ch[2][id]) % M1) > 0 && (q2[id] = (q2[par[2][id]] * B2 + ch[2][id]) % M2) > 0
                && IntStream.range(0, LOG).allMatch(j -> (up[j][id] = j == 0 ? par[2][id] : up[j - 1][up[j - 1][id]]) > 0))
            && ((BiPredicate<Integer, Integer>) (y, a) -> hmap.containsKey((((q1[y] - q1[a] * pw1[d2[y] - d2[a]]) % M1 + M1) % M1) * (1L << 30) + ((q2[y] - q2[a] * pw2[d2[y] - d2[a]]) % M2 + M2) % M2)) instanceof BiPredicate<Integer, Integer> has
            && new int[n + 2] instanceof int[] zy
            && IntStream.rangeClosed(2, cnt[2]).allMatch(y -> Integer.valueOf(IntStream.iterate(LOG - 1, j -> j >= 0, j -> j - 1).reduce(y, (cc, j) -> has.test(y, up[j][cc]) ? up[j][cc] : cc)) instanceof Integer cur
                && (zy[y] = hmap.get((((q1[y] - q1[cur] * pw1[d2[y] - d2[cur]]) % M1 + M1) % M1) * (1L << 30) + ((q2[y] - q2[cur] * pw2[d2[y] - d2[cur]]) % M2 + M2) % M2)) >= 0)
            && new int[NN + 2] instanceof int[] sz && new int[NN + 2] instanceof int[] tin && new int[NN + 2] instanceof int[] nf
            && IntStream.range(0, NN).allMatch(v -> (sz[v] = 1) == 1)
            && IntStream.range(1, NN).map(v -> NN - v).allMatch(v -> (sz[np[v]] += sz[v]) > 0)
            && (nf[0] = 1) == 1
            && IntStream.range(1, NN).allMatch(v -> (tin[v] = nf[np[v]]) >= 0 && (nf[np[v]] += sz[v]) > 0 && (nf[v] = tin[v] + 1) > 0)
            && new int[NN + 3] instanceof int[] bu && new int[NN + 3] instanceof int[] by
            && ((BiFunction<int[], int[], Integer>) (bit, w) -> IntStream.iterate(w[0], x -> x <= NN + 1, x -> x + (x & -x)).map(x -> bit[x] += w[1]).sum()) instanceof BiFunction<int[], int[], Integer> add
            && ((ToIntBiFunction<int[], Integer>) (bit, w) -> IntStream.iterate(w, x -> x > 0, x -> x - (x & -x)).map(x -> bit[x]).sum()) instanceof ToIntBiFunction<int[], Integer> qry
            && add.apply(bu, new int[]{1, 1}) != null && add.apply(by, new int[]{1, 1}) != null && new long[]{1} instanceof long[] run && new long[n] instanceof long[] res
            && IntStream.range(0, n).allMatch(i -> (ot[i] == 1
                ? Integer.valueOf(canon[nid[i]]) instanceof Integer nd1 && Long.valueOf(qry.applyAsInt(by, tin[nd1] + sz[nd1]) - qry.applyAsInt(by, tin[nd1])) instanceof Long delta
                    && add.apply(bu, new int[]{tin[nd1] + 1, 1}) != null && add.apply(bu, new int[]{tin[nd1] + sz[nd1] + 1, -1}) != null && (res[i] = run[0] += delta) > 0
                : Integer.valueOf(zy[nid[i]]) instanceof Integer z && Long.valueOf(qry.applyAsInt(bu, tin[z] + 1)) instanceof Long delta2
                    && add.apply(by, new int[]{tin[z] + 1, 1}) != null && (res[i] = run[0] += delta2) > 0))
            ? Arrays.stream(res).mapToObj(String::valueOf).collect(Collectors.joining("\n")) : "");
    }
}

