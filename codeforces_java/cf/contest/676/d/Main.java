import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Collections.list(new StringTokenizer(new String(System.in.readAllBytes()))) instanceof List<Object> h
            && Integer.valueOf(h.get(0).toString()) instanceof Integer n && Integer.valueOf(h.get(1).toString()) instanceof Integer m && Integer.valueOf(n * m) instanceof Integer N
            && IntStream.range(0, n).mapToObj(i -> h.get(2 + i).toString().toCharArray()).toArray(char[][]::new) instanceof char[][] g
            && Integer.valueOf((Integer.parseInt(h.get(2 + n).toString()) - 1) * m + Integer.parseInt(h.get(3 + n).toString()) - 1) instanceof Integer s0
            && Integer.valueOf((Integer.parseInt(h.get(4 + n).toString()) - 1) * m + Integer.parseInt(h.get(5 + n).toString()) - 1) instanceof Integer tg
            && new int[]{15, 10, 5, 1, 2, 8, 4, 7, 13, 14, 11, 0} instanceof int[] tb && new int[]{-1, 0, 1, 0} instanceof int[] dr && new int[]{0, 1, 0, -1} instanceof int[] dc
            && IntStream.range(0, N).map(c -> tb["+-|^><vLRUD*".indexOf(g[c / m][c % m])]).toArray() instanceof int[] mk && IntStream.range(0, 4 * N).map(x -> ((mk[x % N] << (x / N)) | (mk[x % N] >> (4 - x / N))) & 15).toArray() instanceof int[] mr
            && IntStream.range(0, 4 * N).map(i -> -1).toArray() instanceof int[] dist && new int[4 * N] instanceof int[] q && new int[6] instanceof int[] sc && new int[]{0, 1} instanceof int[] ht
            && (q[0] = s0) >= 0 && (dist[s0] = 0) == 0
            && ((IntPredicate) dir -> sc[3] + dr[dir] >= 0 && sc[3] + dr[dir] < n && sc[4] + dc[dir] >= 0 && sc[4] + dc[dir] < m
                && ((mr[sc[1] * N + sc[2]] >> dir & 1) == 1)
                && ((mr[sc[1] * N + (sc[3] + dr[dir]) * m + sc[4] + dc[dir]] >> ((dir + 2) & 3) & 1) == 1)
                && dist[sc[1] * N + (sc[3] + dr[dir]) * m + sc[4] + dc[dir]] < 0
                ? (dist[sc[1] * N + (sc[3] + dr[dir]) * m + sc[4] + dc[dir]] = sc[5] + 1) >= 0 & (q[ht[1]++] = sc[1] * N + (sc[3] + dr[dir]) * m + sc[4] + dc[dir]) >= 0 : true) instanceof IntPredicate go
            && IntStream.range(0, 4 * N).allMatch(step -> ht[0] < ht[1] && (sc[0] = q[ht[0]++]) >= 0 && (sc[1] = sc[0] / N) >= 0 && (sc[2] = sc[0] % N) >= 0 && sc[2] != tg && (sc[3] = sc[2] / m) >= 0 && (sc[4] = sc[2] % m) >= 0 && (sc[5] = dist[sc[0]]) >= 0
                && (dist[((sc[1] + 1) & 3) * N + sc[2]] < 0 ? (dist[((sc[1] + 1) & 3) * N + sc[2]] = sc[5] + 1) >= 0 & (q[ht[1]++] = ((sc[1] + 1) & 3) * N + sc[2]) >= 0 : true)
                && (go.test(0) & go.test(1) & go.test(2) & go.test(3)) || true)
            ? IntStream.range(0, 4).map(r -> dist[r * N + tg]).filter(x -> x >= 0).min().orElse(-1) : "");
    }
}
