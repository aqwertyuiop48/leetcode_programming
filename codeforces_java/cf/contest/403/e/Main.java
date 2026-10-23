import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk ? CompletableFuture.supplyAsync(() -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, 2).mapToObj(c -> IntStream.range(0, n - 1).map(i -> Integer.parseInt(tk.nextToken())).toArray()).toArray(int[][]::new) instanceof int[][] par0 && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer idx
            && new int[2][n + 1] instanceof int[][] tin && new int[2][n + 1] instanceof int[][] tout && new int[2][n + 1] instanceof int[][] dep
            && IntStream.range(0, 2).allMatch(c -> IntStream.range(0, n + 1).map(i -> -1).toArray() instanceof int[] head && new int[2 * n] instanceof int[] nxt && new int[2 * n] instanceof int[] to
                && IntStream.range(0, n - 1).allMatch(i -> (to[2 * i] = i + 2) > 0 && (nxt[2 * i] = head[par0[c][i]]) >= -1 && (head[par0[c][i]] = 2 * i) >= 0 && (to[2 * i + 1] = par0[c][i]) > 0 && (nxt[2 * i + 1] = head[i + 2]) >= -1 && (head[i + 2] = 2 * i + 1) >= 0)
                && new int[]{0} instanceof int[] timer && new Object[1] instanceof Object[] ref
                && (ref[0] = (IntBinaryOperator) (v, p) -> (tin[c][v] = timer[0]++) >= 0 && (dep[c][v] = p == 0 ? 0 : dep[c][p] + 1) >= 0
                    && IntStream.iterate(head[v], e -> e >= 0, e -> nxt[e]).allMatch(e -> to[e] == p || ((IntBinaryOperator) ref[0]).applyAsInt(to[e], v) >= 0) && (tout[c][v] = timer[0] - 1) >= 0 ? 0 : 0) != null
                && ((IntBinaryOperator) ref[0]).applyAsInt(1, 0) == 0)
            && new int[2][n] instanceof int[][] lo && new int[2][n] instanceof int[][] hi
            && IntStream.range(0, 2).allMatch(c -> IntStream.range(1, n).allMatch(j -> (lo[c][j] = Math.min(tin[c][par0[1 - c][j - 1]], tin[c][j + 1])) >= 0 && (hi[c][j] = Math.max(tin[c][par0[1 - c][j - 1]], tin[c][j + 1])) >= 0))
            && (Integer) Integer.highestOneBit(Math.max(1, n - 1) * 2 - 1) instanceof Integer SZ
            && IntStream.range(0, 4).mapToObj(s -> IntStream.range(1, n).boxed().sorted(Comparator.comparingInt((Integer j) -> s % 2 == 0 ? hi[s / 2][j] : lo[s / 2][j])).mapToInt(j -> j).toArray()).toArray(int[][]::new) instanceof int[][] ord
            && IntStream.range(0, 4).mapToObj(s -> IntStream.range(0, n - 1).map(i -> 2 * (s % 2 == 0 ? hi[s / 2][ord[s][i]] : lo[s / 2][ord[s][i]])).toArray()).toArray(int[][]::new) instanceof int[][] keys2
            && new int[4][n] instanceof int[][] posOf && IntStream.range(0, 4).allMatch(s -> IntStream.range(0, n - 1).allMatch(i -> (posOf[s][ord[s][i]] = i) >= 0))
            && new int[4][SZ] instanceof int[][] val && new int[4][2 * SZ] instanceof int[][] tr
            && IntStream.range(0, 4).allMatch(s -> IntStream.range(0, SZ).allMatch(i -> (val[s][i] = i >= n - 1 ? Integer.MAX_VALUE : s % 2 == 0 ? lo[s / 2][ord[s][i]] : -hi[s / 2][ord[s][i]]) == val[s][i] && (tr[s][SZ + i] = i) >= 0)
                && IntStream.range(1, SZ).map(i -> SZ - i).allMatch(i -> (tr[s][i] = val[s][tr[s][2 * i]] <= val[s][tr[s][2 * i + 1]] ? tr[s][2 * i] : tr[s][2 * i + 1]) >= 0))
            && ((IntBinaryOperator) (s, i) -> (val[s][i] = Integer.MAX_VALUE) == Integer.MAX_VALUE && IntStream.iterate((SZ + i) / 2, k -> k >= 1, k -> k / 2).allMatch(k -> (tr[s][k] = val[s][tr[s][2 * k]] <= val[s][tr[s][2 * k + 1]] ? tr[s][2 * k] : tr[s][2 * k + 1]) >= 0) ? 0 : 0) instanceof IntBinaryOperator kill
            && new Object[1] instanceof Object[] rf && new int[2][n] instanceof int[][] buf && new int[]{1, 0} instanceof int[] len && (buf[0][0] = idx) == idx && kill.applyAsInt(2, posOf[2][idx]) == 0 && kill.applyAsInt(3, posOf[3][idx]) == 0
            && new StringBuilder() instanceof StringBuilder sb && new int[4] instanceof int[] tmp
            && (rf[0] = (ToIntFunction<int[]>) q -> q[4] > q[3] || q[5] < q[2] || val[q[0]][tr[q[0]][q[1]]] >= q[6] ? 0
                : q[2] == q[3] ? ((buf[tmp[3]][len[tmp[3]]++] = ord[q[0]][q[2]]) > 0 && (val[q[0]][q[2]] = Integer.MAX_VALUE) == Integer.MAX_VALUE && kill.applyAsInt(q[0] ^ 1, posOf[q[0] ^ 1][ord[q[0]][q[2]]]) == 0 ? 0 : 0)
                : ((ToIntFunction<int[]>) rf[0]).applyAsInt(new int[]{q[0], 2 * q[1], q[2], (q[2] + q[3]) / 2, q[4], q[5], q[6]}) == 0 && ((ToIntFunction<int[]>) rf[0]).applyAsInt(new int[]{q[0], 2 * q[1] + 1, (q[2] + q[3]) / 2 + 1, q[3], q[4], q[5], q[6]}) == 0
                    && (tr[q[0]][q[1]] = val[q[0]][tr[q[0]][2 * q[1]]] <= val[q[0]][tr[q[0]][2 * q[1] + 1]] ? tr[q[0]][2 * q[1]] : tr[q[0]][2 * q[1] + 1]) >= 0 ? 0 : 0) != null
            && (IntStream.range(0, 2 * n).allMatch(k -> len[k & 1] > 0 && sb.append(k % 2 == 0 ? "Blue\n" : "Red\n").append(Arrays.stream(buf[k & 1], 0, len[k & 1]).sorted().mapToObj(String::valueOf).collect(Collectors.joining(" "))).append('\n') != null
                && (len[(k + 1) & 1] = 0) == 0 && (tmp[3] = (k + 1) & 1) >= 0
                && IntStream.range(0, len[k & 1]).allMatch(ei -> IntStream.range(0, 2).allMatch(ty ->
                    (Integer) (dep[k % 2][par0[k % 2][buf[k & 1][ei] - 1]] > dep[k % 2][buf[k & 1][ei] + 1] ? par0[k % 2][buf[k & 1][ei] - 1] : buf[k & 1][ei] + 1) instanceof Integer q
                    && (tmp[0] = -Arrays.binarySearch(keys2[k % 2 * 2 + ty], 2 * tin[k % 2][q] - 1) - 1) >= 0 && (tmp[1] = -Arrays.binarySearch(keys2[k % 2 * 2 + ty], 2 * tout[k % 2][q] + 1) - 2) > -10
                    && ((ToIntFunction<int[]>) rf[0]).applyAsInt(new int[]{k % 2 * 2 + ty, 1, 0, SZ - 1, tmp[0], tmp[1], ty == 0 ? tin[k % 2][q] : -tout[k % 2][q]}) == 0)))
                || true)
            ? sb.toString().trim() : "", r -> new Thread(null, r, "t", 1L << 29).start()).join() : "");
    }
}
