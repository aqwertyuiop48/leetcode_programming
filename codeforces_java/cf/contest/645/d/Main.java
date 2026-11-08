import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new long[raw.length / 2 + 2] instanceof long[] tk && new long[]{0, 0, 0, 0} instanceof long[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] == 45 ? (st[3] = 1) > 0 : raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tk[(int) st[0]++] = st[3] > 0 ? -st[1] : st[1]) > Long.MIN_VALUE & (st[1] = 0) == 0 & (st[2] = 0) == 0 & (st[3] = 0) == 0).count() >= 0
            && Integer.valueOf((int) tk[0]) instanceof Integer n && Integer.valueOf((int) tk[1]) instanceof Integer m
            && new int[n + 2] instanceof int[] sx && new int[n] instanceof int[] indeg && new int[m] instanceof int[] adj && new int[n] instanceof int[] q && new int[]{0, 0} instanceof int[] qt && new int[n] instanceof int[] pos && new int[n] instanceof int[] cand
            && IntStream.range(0, m).filter(j -> ++sx[(int) tk[2 + 2 * j]] > 0 & ++indeg[(int) tk[3 + 2 * j] - 1] > 0).count() >= 0
            && IntStream.range(0, n).filter(i -> (sx[i + 1] += sx[i]) >= 0).count() >= 0
            && Arrays.copyOf(sx, n + 1) instanceof int[] fp
            && IntStream.range(0, m).filter(j -> (adj[fp[(int) tk[2 + 2 * j] - 1]++] = (int) tk[3 + 2 * j] - 1) >= 0).count() >= 0
            && IntStream.range(0, n).filter(i -> indeg[i] == 0 && (q[qt[1]++] = i) >= 0).count() >= 0
            ? IntStream.range(0, n).allMatch(s -> qt[1] - qt[0] == 1 && Integer.valueOf(q[qt[0]++]) instanceof Integer x && (pos[x] = s) >= 0
                && IntStream.range(sx[x], sx[x + 1]).filter(e -> --indeg[adj[e]] == 0 && (q[qt[1]++] = adj[e]) >= 0).count() >= 0)
                && IntStream.range(0, m).filter(j -> Integer.valueOf(pos[(int) tk[2 + 2 * j] - 1]) instanceof Integer pu && pos[(int) tk[3 + 2 * j] - 1] == pu + 1 && cand[pu] == 0 && (cand[pu] = j + 1) > 0).count() >= 0
                ? Arrays.stream(cand, 0, n - 1).max().orElse(0) : -1 : "");
    }
}
