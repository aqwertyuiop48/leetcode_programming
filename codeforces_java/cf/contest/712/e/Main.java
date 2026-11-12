import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] tok && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[1]) >= 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n && Integer.valueOf(tok[1]) instanceof Integer q
            && Integer.valueOf(Integer.highestOneBit(Math.max(1, n - 1)) * 2) instanceof Integer N
            && ((BinaryOperator<double[]>) (x, y) -> Double.valueOf(y[0] / Math.max(1e-300, 1 - (1 - y[0]) * x[1])) instanceof Double qq
                ? new double[]{x[0] * qq, y[1] + (1 - y[1]) * x[1] * qq} : null) instanceof BinaryOperator<double[]> mg
            && new double[2 * N][] instanceof double[][] T
            && IntStream.range(0, N).filter(i -> (T[N + i] = i < n ? new double[]{(double) tok[2 + 2 * i] / tok[3 + 2 * i], (double) tok[2 + 2 * i] / tok[3 + 2 * i]} : new double[]{1, 0}) != null).count() >= 0
            && IntStream.range(1, N).map(i -> N - i).filter(i -> (T[i] = mg.apply(T[2 * i], T[2 * i + 1])) != null).count() >= 0
            && new int[]{2 + 2 * n} instanceof int[] ptr && new double[][]{{1, 0}, {1, 0}} instanceof double[][] rs && new int[2] instanceof int[] sl
            ? IntStream.range(0, q).filter(qi -> tok[ptr[0]] == 1
                    ? (T[N + tok[ptr[0] + 1] - 1] = new double[]{(double) tok[ptr[0] + 2] / tok[ptr[0] + 3], (double) tok[ptr[0] + 2] / tok[ptr[0] + 3]}) != null
                        & (ptr[0] += 4) > 0
                        & IntStream.iterate((N + tok[ptr[0] - 3] - 1) / 2, i -> i >= 1, i -> i / 2).filter(i -> (T[i] = mg.apply(T[2 * i], T[2 * i + 1])) != null).count() >= 0
                    : (sl[0] = N + tok[ptr[0] + 1] - 1) > 0 & (sl[1] = N + tok[ptr[0] + 2]) > 0 & (ptr[0] += 3) > 0
                        & (rs[0] = new double[]{1, 0}) != null & (rs[1] = new double[]{1, 0}) != null
                        & IntStream.iterate(0, z -> sl[0] < sl[1], z -> z + 1).filter(z -> ((sl[0] & 1) == 0 || (rs[0] = mg.apply(rs[0], T[sl[0]++])) != null) & ((sl[1] & 1) == 0 || (rs[1] = mg.apply(T[--sl[1]], rs[1])) != null) & (sl[0] >>= 1) >= 0 & (sl[1] >>= 1) >= 0).count() >= 0
                        & (rs[0] = mg.apply(rs[0], rs[1])) != null & System.out.append(String.format(Locale.US, "%.10f\n", rs[0][0])) != null).count() >= 0 ? "" : "" : "");
    }
}
