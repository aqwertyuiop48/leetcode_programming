import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 4] instanceof long[] tk && new long[4] instanceof long[] cur
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && (raw[i] >= 48 || raw[i] == 45)
                ? (raw[i] == 45 ? (cur[1] = 1) == 1 : (cur[0] = cur[0] * 10 + raw[i] - 48) >= 0) && (cur[2] = 1) == 1
                : cur[2] == 0 || ((tk[(int) cur[3]++] = cur[1] == 1 ? -cur[0] : cur[0]) >= Long.MIN_VALUE && (cur[0] = 0) == 0 && (cur[1] = 0) == 0 && (cur[2] = 0) == 0)) || true)
            && Integer.valueOf((int) tk[0]) instanceof Integer n && Integer.valueOf((int) tk[1]) instanceof Integer l && Integer.valueOf(n + 2) instanceof Integer m
            && new int[m] instanceof int[] R && new long[m] instanceof long[] K && new long[2][m] instanceof long[][] V
            && (R[n + 1] = l) == l && (K[n + 1] = -1) == -1
            && IntStream.rangeClosed(1, n).allMatch(i -> Long.valueOf(tk[2 + 3 * (i - 1)]) instanceof Long t && Long.valueOf(tk[3 + 3 * (i - 1)]) instanceof Long x && Long.valueOf(tk[4 + 3 * (i - 1)]) instanceof Long y
                && ((t + x + y) & 1) == 0 && (R[i] = (int) (t % l)) >= 0 && (K[i] = t / l) >= 0 && (V[0][i] = (x + y + t) / 2) >= Long.MIN_VALUE && (V[1][i] = (x - y + t) / 2) >= Long.MIN_VALUE)
            && IntStream.range(0, m).boxed().sorted((a, b) -> R[a] - R[b]).mapToInt(i -> i).toArray() instanceof int[] ord
            && new long[]{0, 0} instanceof long[] lo && new long[]{l, l} instanceof long[] hi
            && IntStream.range(0, m - 1).allMatch(j -> IntStream.range(0, 2).allMatch(c -> Integer.valueOf(ord[j]) instanceof Integer a && Integer.valueOf(ord[j + 1]) instanceof Integer b
                && Long.valueOf(K[b] - K[a]) instanceof Long dk && Long.valueOf(V[c][b] - V[c][a]) instanceof Long dv && Long.valueOf(R[b] - R[a]) instanceof Long dr
                && (dk == 0 ? dv >= 0 && dv <= dr
                    : dk > 0 ? (hi[c] = Math.min(hi[c], Math.floorDiv(dv, dk))) >= Long.MIN_VALUE && (lo[c] = Math.max(lo[c], -Math.floorDiv(dr - dv, dk))) >= Long.MIN_VALUE
                    : (lo[c] = Math.max(lo[c], -Math.floorDiv(dv, -dk))) >= Long.MIN_VALUE && (hi[c] = Math.min(hi[c], Math.floorDiv(dr - dv, -dk))) >= Long.MIN_VALUE)))
            && lo[0] <= hi[0] && lo[1] <= hi[1]
            && new byte[2][l] instanceof byte[][] bits
            && IntStream.range(0, m - 1).allMatch(j -> IntStream.range(0, 2).allMatch(c -> Integer.valueOf(ord[j]) instanceof Integer a && Integer.valueOf(ord[j + 1]) instanceof Integer b
                && IntStream.range(R[a], R[a] + (int) (V[c][b] - K[b] * lo[c] - (V[c][a] - K[a] * lo[c]))).allMatch(p -> (bits[c][p] = 1) == 1)))
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, l).allMatch(i -> sb.append(bits[0][i] == 1 ? (bits[1][i] == 1 ? 'R' : 'U') : (bits[1][i] == 1 ? 'D' : 'L')) != null)
            ? sb.toString() : "NO");
    }
}
