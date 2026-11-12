import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m
            && IntStream.range(0, m).flatMap(i -> IntStream.of(sc.nextInt() - 1, sc.nextInt() - 1)).toArray() instanceof int[] ed
            && new int[n + 2] instanceof int[] st
            && IntStream.range(0, m).filter(i -> ++st[ed[2 * i] + 1] > 0).count() >= 0
            && IntStream.rangeClosed(1, n + 1).filter(v -> (st[v] += st[v - 1]) >= 0).count() >= 0
            && st.clone() instanceof int[] cur && new int[m] instanceof int[] adj
            && IntStream.range(0, m).filter(i -> (adj[cur[ed[2 * i]]++] = ed[2 * i + 1]) >= 0).count() >= 0
            && IntStream.generate(() -> -1).limit((long) n * n).toArray() instanceof int[] d
            && new int[n + 1] instanceof int[] q && new int[3] instanceof int[] bs
            && IntStream.range(0, n).filter(s -> (bs[0] = 1) == 1 && (bs[1] = 0) == 0 && (bs[2] = st[s]) >= 0 && (q[0] = s) >= 0 && (d[s * n + s] = 0) == 0
                && (IntStream.range(0, n + m + 2).allMatch(t -> (bs[2] < st[q[bs[1]] + 1] || (++bs[1] < bs[0] && (bs[2] = st[q[bs[1]]]) >= 0))
                    && (bs[2] >= st[q[bs[1]] + 1] || (d[s * n + adj[bs[2]]] < 0
                        ? (d[s * n + adj[bs[2]]] = d[s * n + q[bs[1]]] + 1) > 0 & (q[bs[0]++] = adj[bs[2]]) >= 0 & ++bs[2] > 0
                        : ++bs[2] > 0))) || true)).count() >= 0
            && IntStream.generate(() -> -1).limit(3L * n).toArray() instanceof int[] inD && IntStream.generate(() -> -1).limit(3L * n).toArray() instanceof int[] outD
            && new int[3 * n] instanceof int[] inV && new int[3 * n] instanceof int[] outV && new int[2] instanceof int[] w
            && ((IntUnaryOperator) b -> outD[b] <= outD[b + 1] ? (outD[b] <= outD[b + 2] ? 0 : 2) : (outD[b + 1] <= outD[b + 2] ? 1 : 2)) instanceof IntUnaryOperator mo
            && ((IntUnaryOperator) b -> inD[b] <= inD[b + 1] ? (inD[b] <= inD[b + 2] ? 0 : 2) : (inD[b + 1] <= inD[b + 2] ? 1 : 2)) instanceof IntUnaryOperator mi
            && IntStream.range(0, n).filter(s -> IntStream.range(0, n).filter(t -> d[s * n + t] > 0
                && (w[0] = 3 * s + mo.applyAsInt(3 * s)) >= 0 && (d[s * n + t] > outD[w[0]] ? (outD[w[0]] = d[s * n + t]) + (outV[w[0]] = t) : 0) >= 0
                && (w[1] = 3 * t + mi.applyAsInt(3 * t)) >= 0 && (d[s * n + t] > inD[w[1]] ? (inD[w[1]] = d[s * n + t]) + (inV[w[1]] = s) : 0) >= 0).count() >= 0).count() >= 0
            && ((IntBinaryOperator) (p, ij) -> inD[3 * (p >> 12) + ij / 3] >= 0 && outD[3 * (p & 4095) + ij % 3] >= 0
                && inV[3 * (p >> 12) + ij / 3] != (p & 4095) && outV[3 * (p & 4095) + ij % 3] != (p >> 12) && outV[3 * (p & 4095) + ij % 3] != inV[3 * (p >> 12) + ij / 3]
                ? ((inD[3 * (p >> 12) + ij / 3] + d[(p >> 12) * n + (p & 4095)] + outD[3 * (p & 4095) + ij % 3]) << 4) | ij : -1) instanceof IntBinaryOperator scr
            && new int[]{-1, 0} instanceof int[] best
            && IntStream.range(0, n).filter(b -> IntStream.range(0, n).filter(c -> d[b * n + c] > 0
                && Integer.valueOf(Math.max(Math.max(Math.max(scr.applyAsInt((b << 12) | c, 0), scr.applyAsInt((b << 12) | c, 1)), Math.max(scr.applyAsInt((b << 12) | c, 2), scr.applyAsInt((b << 12) | c, 3))),
                    Math.max(Math.max(Math.max(scr.applyAsInt((b << 12) | c, 4), scr.applyAsInt((b << 12) | c, 5)), Math.max(scr.applyAsInt((b << 12) | c, 6), scr.applyAsInt((b << 12) | c, 7))), scr.applyAsInt((b << 12) | c, 8)))) instanceof Integer v
                && v > best[0] && (best[0] = v) > 0 && (best[1] = (b << 12) | c) > 0).count() >= 0).count() >= 0
            ? inV[3 * (best[1] >> 12) + (best[0] & 15) / 3] + 1 + " " + ((best[1] >> 12) + 1) + " " + ((best[1] & 4095) + 1) + " " + (outV[3 * (best[1] & 4095) + (best[0] & 15) % 3] + 1) : "");
    }
}
