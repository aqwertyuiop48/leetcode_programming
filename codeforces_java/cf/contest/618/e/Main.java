import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] t && new int[3] instanceof int[] cur
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] >= 48
                ? (cur[0] = cur[0] * 10 + raw[i] - 48) >= 0 && (cur[1] = 1) == 1
                : cur[1] == 0 || ((t[cur[2]++] = cur[0]) >= 0 && (cur[0] = 0) == 0 && (cur[1] = 0) == 0)) || true)
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m
            && Integer.valueOf(19) instanceof Integer LOG && Integer.valueOf(1 << LOG) instanceof Integer N
            && new double[2 * N] instanceof double[] sx && new double[2 * N] instanceof double[] sy && new double[2 * N] instanceof double[] tc && new double[2 * N] instanceof double[] ts
            && new double[2] instanceof double[] cs && new int[1] instanceof int[] ip
            && Arrays.stream(new int[0]).sum() == 0
            && IntStream.range(0, 2 * N).allMatch(i -> (tc[i] = 1) > 0 && (i < N + n && i >= N ? (sx[i] = 1) > 0 : true))
            && IntStream.iterate(N - 1, p -> p >= 1, p -> p - 1).allMatch(p -> (sx[p] = sx[2 * p] + sx[2 * p + 1]) >= 0)
            && new double[4] instanceof double[] w
            && ((IntPredicate) q -> (w[0] = sx[q] * cs[0] - sy[q] * cs[1]) == w[0] && (w[1] = sx[q] * cs[1] + sy[q] * cs[0]) == w[1]
                && (w[2] = tc[q] * cs[0] - ts[q] * cs[1]) == w[2] && (w[3] = tc[q] * cs[1] + ts[q] * cs[0]) == w[3]
                && (sx[q] = w[0]) == w[0] && (sy[q] = w[1]) == w[1] && (tc[q] = w[2]) == w[2] && (ts[q] = w[3]) == w[3]) instanceof IntPredicate rot
            && ((IntPredicate) p -> (w[0] = sx[2 * p] + sx[2 * p + 1]) == w[0] && (w[1] = sy[2 * p] + sy[2 * p + 1]) == w[1]
                && (sx[p] = w[0] * tc[p] - w[1] * ts[p]) == sx[p] && (sy[p] = w[0] * ts[p] + w[1] * tc[p]) == sy[p]) instanceof IntPredicate rc
            && ((DoubleFunction<String>) v -> Long.valueOf(Math.round(Math.abs(v) * 1e6)) instanceof Long r
                ? (v < 0 && r > 0 ? "-" : "") + r / 1000000 + "." + String.valueOf(1000000 + r % 1000000).substring(1) : "") instanceof DoubleFunction<String> fmt
            && ((IntPredicate) z -> (ip[0] >>= 1) > 0 && rc.test(ip[0])) instanceof IntPredicate up1
            && ((IntPredicate) z -> ((ip[0] & 1) == 0 ? rot.test(ip[0] + 1) : true) && (ip[0] >>= 1) > 0 && rc.test(ip[0])) instanceof IntPredicate up2
            ? IntStream.range(0, m).mapToObj(q -> (t[2 + 3 * q] == 1
                    ? (ip[0] = N + t[3 + 3 * q] - 1) > 0 && (sx[ip[0]] += t[4 + 3 * q] * tc[ip[0]]) == sx[ip[0]] && (sy[ip[0]] += t[4 + 3 * q] * ts[ip[0]]) == sy[ip[0]]
                        && up1.test(0) && up1.test(0) && up1.test(0) && up1.test(0) && up1.test(0) && up1.test(0) && up1.test(0) && up1.test(0) && up1.test(0) && up1.test(0) && up1.test(0) && up1.test(0) && up1.test(0) && up1.test(0) && up1.test(0) && up1.test(0) && up1.test(0) && up1.test(0) && up1.test(0)
                    : (ip[0] = N + t[3 + 3 * q] - 1) > 0 && (cs[0] = Math.cos(Math.toRadians(t[4 + 3 * q]))) == cs[0] && (cs[1] = -Math.sin(Math.toRadians(t[4 + 3 * q]))) == cs[1]
                        && rot.test(ip[0])
                        && up2.test(0) && up2.test(0) && up2.test(0) && up2.test(0) && up2.test(0) && up2.test(0) && up2.test(0) && up2.test(0) && up2.test(0) && up2.test(0) && up2.test(0) && up2.test(0) && up2.test(0) && up2.test(0) && up2.test(0) && up2.test(0) && up2.test(0) && up2.test(0) && up2.test(0))
                    ? fmt.apply(sx[1]) + " " + fmt.apply(sy[1]) : "").collect(Collectors.joining("\n")) : "");
    }
}
