import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && new int[]{0, 0, 1} instanceof int[] EI
            && new int[]{1, 2, 2} instanceof int[] EJ
            && new int[]{2, 1, 0} instanceof int[] EK
            && IntStream.range(0, 4).mapToObj(t -> IntStream.range(0, 3).map(e ->
                (g[6 * t + 2 * EJ[e]] - g[6 * t + 2 * EI[e]]) * (g[6 * t + 2 * EJ[e]] - g[6 * t + 2 * EI[e]])
                + (g[6 * t + 2 * EJ[e] + 1] - g[6 * t + 2 * EI[e] + 1]) * (g[6 * t + 2 * EJ[e] + 1] - g[6 * t + 2 * EI[e] + 1])).toArray()).toArray(int[][]::new) instanceof int[][] S
            && IntStream.range(0, 4).mapToObj(t ->
                Integer.valueOf(g[6 * t + 2] - g[6 * t]) instanceof Integer ax
                && Integer.valueOf(g[6 * t + 3] - g[6 * t + 1]) instanceof Integer ay
                && Integer.valueOf(g[6 * t + 4] - g[6 * t]) instanceof Integer bx
                && Integer.valueOf(g[6 * t + 5] - g[6 * t + 1]) instanceof Integer by
                ? IntStream.range(0, 3721).filter(ia -> (ia / 61 - 30) * (ia / 61 - 30) + (ia % 61 - 30) * (ia % 61 - 30) == ax * ax + ay * ay).flatMap(ia ->
                    IntStream.range(0, 3721).filter(ib ->
                        (ib / 61 - 30) * (ib / 61 - 30) + (ib % 61 - 30) * (ib % 61 - 30) == bx * bx + by * by
                        && (ia / 61 - 30) * (ib / 61 - 30) + (ia % 61 - 30) * (ib % 61 - 30) == ax * bx + ay * by
                        && Math.abs((ia / 61 - 30) * (ib % 61 - 30) - (ia % 61 - 30) * (ib / 61 - 30)) == Math.abs(ax * by - ay * bx))
                    .flatMap(ib -> IntStream.of(ia / 61 - 30, ia % 61 - 30, ib / 61 - 30, ib % 61 - 30))).toArray()
                : new int[0]).toArray(int[][]::new) instanceof int[][] O
            && IntStream.range(0, O[0].length / 4).filter(o ->
                ((java.util.function.IntFunction<int[]>) m -> IntStream.range(0, 4).map(w ->
                    w % 2 == 0
                        ? (m > 3 ? -1 : 1) * (new int[]{1, 0, -1, 0}[m & 3] * O[0][4 * o + 2 * (w / 2)] - new int[]{0, 1, 0, -1}[m & 3] * O[0][4 * o + 2 * (w / 2) + 1])
                        : new int[]{0, 1, 0, -1}[m & 3] * O[0][4 * o + 2 * (w / 2)] + new int[]{1, 0, -1, 0}[m & 3] * O[0][4 * o + 2 * (w / 2) + 1]).toArray()) instanceof java.util.function.IntFunction<int[]> tf
                && IntStream.range(0, 8).allMatch(m2 -> Arrays.compare(tf.apply(m2), tf.apply(0)) >= 0)).toArray() instanceof int[] roots
            && new int[]{9} instanceof int[] best
            && new int[512 * 512] instanceof int[] mark
            && new int[]{0} instanceof int[] st
            && new int[24] instanceof int[] A1
            && new int[24] instanceof int[] A2
            && new int[3] instanceof int[] cn
            && new int[][]{{1, 2, 3}, {1, 3, 2}, {2, 1, 3}, {2, 3, 1}, {3, 1, 2}, {3, 2, 1}} instanceof int[][] PM
            && (IntStream.of(roots).allMatch(ro ->
                new int[]{0, 0, O[0][4 * ro], O[0][4 * ro + 1], O[0][4 * ro + 2], O[0][4 * ro + 3]} instanceof int[] A0
                && (IntStream.range(0, 6).allMatch(pm ->
                    Integer.valueOf(PM[pm][0]) instanceof Integer t2
                    && Integer.valueOf(PM[pm][1]) instanceof Integer t3
                    && Integer.valueOf(PM[pm][2]) instanceof Integer t4
                    && O[t2] instanceof int[] ot2
                    && O[t3] instanceof int[] ot3
                    && Integer.valueOf(ot2.length / 4) instanceof Integer k2
                    && Integer.valueOf(ot3.length / 4) instanceof Integer k3
                    && (IntStream.range(0, 9 * k2).allMatch(c2 ->
                        Integer.valueOf(c2 % k2) instanceof Integer o2
                        && Integer.valueOf(c2 / k2 % 3) instanceof Integer v2
                        && Integer.valueOf(c2 / k2 / 3) instanceof Integer p2
                        && new int[]{0, ot2[4 * o2], ot2[4 * o2 + 2]} instanceof int[] ux
                        && new int[]{0, ot2[4 * o2 + 1], ot2[4 * o2 + 3]} instanceof int[] uy
                        && Integer.valueOf(++st[0]) instanceof Integer s1
                        && IntStream.range(0, 6).allMatch(i1 -> (A1[i1] = A0[i1]) > Integer.MIN_VALUE)
                        && IntStream.range(0, 3).allMatch(i1 -> (mark[(A0[2 * i1] + 256) * 512 + A0[2 * i1 + 1] + 256] = s1) > 0)
                        && (cn[1] = 3) == 3
                        && IntStream.range(0, 3).allMatch(k1 ->
                            Integer.valueOf((A0[2 * p2] + ux[k1] - ux[v2] + 256) * 512 + A0[2 * p2 + 1] + uy[k1] - uy[v2] + 256) instanceof Integer key1
                            && (mark[key1] == s1
                                || ((mark[key1] = s1) > 0
                                    && (A1[2 * cn[1]] = A0[2 * p2] + ux[k1] - ux[v2]) > Integer.MIN_VALUE
                                    && (A1[2 * cn[1] + 1] = A0[2 * p2 + 1] + uy[k1] - uy[v2]) > Integer.MIN_VALUE
                                    && ++cn[1] > 0)))
                        && cn[1] < best[0]
                        && (IntStream.range(0, 3 * cn[1] * k3).allMatch(c3 ->
                            Integer.valueOf(c3 % k3) instanceof Integer o3
                            && Integer.valueOf(c3 / k3 % 3) instanceof Integer v3
                            && Integer.valueOf(c3 / k3 / 3) instanceof Integer p3
                            && new int[]{0, ot3[4 * o3], ot3[4 * o3 + 2]} instanceof int[] vx
                            && new int[]{0, ot3[4 * o3 + 1], ot3[4 * o3 + 3]} instanceof int[] vy
                            && Integer.valueOf(++st[0]) instanceof Integer s2
                            && IntStream.range(0, 2 * cn[1]).allMatch(i2 -> (A2[i2] = A1[i2]) > Integer.MIN_VALUE)
                            && IntStream.range(0, cn[1]).allMatch(i2 -> (mark[(A1[2 * i2] + 256) * 512 + A1[2 * i2 + 1] + 256] = s2) > 0)
                            && (cn[2] = cn[1]) > 0
                            && IntStream.range(0, 3).allMatch(k2b ->
                                Integer.valueOf((A1[2 * p3] + vx[k2b] - vx[v3] + 256) * 512 + A1[2 * p3 + 1] + vy[k2b] - vy[v3] + 256) instanceof Integer key2
                                && (mark[key2] == s2
                                    || ((mark[key2] = s2) > 0
                                        && (A2[2 * cn[2]] = A1[2 * p3] + vx[k2b] - vx[v3]) > Integer.MIN_VALUE
                                        && (A2[2 * cn[2] + 1] = A1[2 * p3 + 1] + vy[k2b] - vy[v3]) > Integer.MIN_VALUE
                                        && ++cn[2] > 0)))
                            && cn[2] < best[0]
                            && (best[0] = Math.min(best[0], Math.min(cn[2] + 2, IntStream.range(0, cn[2] * cn[2]).filter(pr ->
                                pr / cn[2] != pr % cn[2]
                                && Integer.valueOf(((A2[2 * (pr % cn[2])] - A2[2 * (pr / cn[2])]) * (A2[2 * (pr % cn[2])] - A2[2 * (pr / cn[2])]) + (A2[2 * (pr % cn[2]) + 1] - A2[2 * (pr / cn[2]) + 1]) * (A2[2 * (pr % cn[2]) + 1] - A2[2 * (pr / cn[2]) + 1]))) instanceof Integer L0
                                && (S[t4][0] == L0 || S[t4][1] == L0 || S[t4][2] == L0)).flatMap(pr ->
                                Integer.valueOf(((A2[2 * (pr % cn[2])] - A2[2 * (pr / cn[2])]) * (A2[2 * (pr % cn[2])] - A2[2 * (pr / cn[2])]) + (A2[2 * (pr % cn[2]) + 1] - A2[2 * (pr / cn[2]) + 1]) * (A2[2 * (pr % cn[2]) + 1] - A2[2 * (pr / cn[2]) + 1]))) instanceof Integer L4
                                ? IntStream.range(0, 6).filter(q4 -> S[t4][q4 >> 1] == L4).map(q4 ->
                                    Integer.valueOf(g[6 * t4 + 2 * EJ[q4 >> 1]] - g[6 * t4 + 2 * EI[q4 >> 1]]) instanceof Integer dx
                                    && Integer.valueOf(g[6 * t4 + 2 * EJ[q4 >> 1] + 1] - g[6 * t4 + 2 * EI[q4 >> 1] + 1]) instanceof Integer dy
                                    && Integer.valueOf(g[6 * t4 + 2 * EK[q4 >> 1]] - g[6 * t4 + 2 * EI[q4 >> 1]]) instanceof Integer wx
                                    && Integer.valueOf(g[6 * t4 + 2 * EK[q4 >> 1] + 1] - g[6 * t4 + 2 * EI[q4 >> 1] + 1]) instanceof Integer wy
                                    && Integer.valueOf(A2[2 * (pr % cn[2])] - A2[2 * (pr / cn[2])]) instanceof Integer ex
                                    && Integer.valueOf(A2[2 * (pr % cn[2]) + 1] - A2[2 * (pr / cn[2]) + 1]) instanceof Integer ey
                                    && Integer.valueOf((q4 & 1) == 0 ? (wx * ex - wy * ey) * dx + (wx * ey + wy * ex) * dy : (ex * dx - ey * dy) * wx + (ex * dy + ey * dx) * wy) instanceof Integer rx
                                    && Integer.valueOf((q4 & 1) == 0 ? (wx * ey + wy * ex) * dx - (wx * ex - wy * ey) * dy : (ex * dy + ey * dx) * wx - (ex * dx - ey * dy) * wy) instanceof Integer ry
                                    && rx % L4 == 0 && ry % L4 == 0
                                    ? cn[2] + (mark[(A2[2 * (pr / cn[2])] + rx / L4 + 256) * 512 + A2[2 * (pr / cn[2]) + 1] + ry / L4 + 256] == s2 ? 0 : 1)
                                    : 99)
                                : IntStream.empty()).min().orElse(99)))) > 0 || true) || true) || true) || true) || true) || true) || true) || true)
            ? best[0]
            : -1);
    }
}
