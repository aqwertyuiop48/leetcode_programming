import java.util.Arrays;
import java.util.function.BooleanSupplier;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g
            && new int[4] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g[0]) instanceof Integer n
            && new int[2000001] instanceof int[] spf
            && IntStream.rangeClosed(2, 1414).allMatch(i ->
                spf[i] != 0 || IntStream.range(0, (2000000 - i * i) / i + 1).allMatch(k ->
                    spf[i * i + k * i] != 0 || (spf[i * i + k * i] = i) > 0))
            && new int[n + 1] instanceof int[] head
            && new int[2 * n + 2] instanceof int[] nx
            && new int[2 * n + 2] instanceof int[] to
            && IntStream.range(0, n - 1).allMatch(e ->
                (to[2 * e + 1] = g[n + 3 + 2 * e]) > 0
                && (nx[2 * e + 1] = head[g[n + 2 + 2 * e]]) >= 0
                && (head[g[n + 2 + 2 * e]] = 2 * e + 1) > 0
                && (to[2 * e + 2] = g[n + 2 + 2 * e]) > 0
                && (nx[2 * e + 2] = head[g[n + 3 + 2 * e]]) >= 0
                && (head[g[n + 3 + 2 * e]] = 2 * e + 2) > 0)
            && new int[n + 1] instanceof int[] par
            && new int[n + 1] instanceof int[] depth
            && new int[n + 1] instanceof int[] stk
            && new int[2 * n + 1] instanceof int[] evN
            && new int[2 * n + 1] instanceof int[] evT
            && new int[] {1, 1} instanceof int[] sp
            && (stk[0] = 1) == 1
            && (depth[1] = 1) == 1
            && (evN[0] = 1) == 1
            && (evT[0] = 1) == 1
            && IntStream.generate(() -> 0).takeWhile(z -> sp[0] > 0).allMatch(z ->
                (Integer) stk[sp[0] - 1] instanceof Integer v
                && (head[v] == 0
                    ? (evN[sp[1]] = v) > 0 && (evT[sp[1]++] = 0) == 0 && --sp[0] >= 0
                    : (Integer) head[v] instanceof Integer e
                        && (head[v] = nx[e]) >= 0
                        && (to[e] == par[v]
                            || ((Integer) to[e] instanceof Integer w
                                && (par[w] = v) > 0
                                && (depth[w] = depth[v] + 1) > 0
                                && (stk[sp[0]++] = w) > 0
                                && (evN[sp[1]] = w) > 0
                                && (evT[sp[1]++] = 1) == 1))))
            && new int[8 * (n + 1)] instanceof int[] pr
            && new int[n + 1] instanceof int[] pc
            && new int[n + 1] instanceof int[] rem
            && new int[n + 1] instanceof int[] lastp
            && new int[2000001] instanceof int[] pid
            && new int[1] instanceof int[] idc
            && ((IntUnaryOperator) v ->
                rem[v] <= 1
                || ((Integer) (spf[rem[v]] == 0 ? rem[v] : spf[rem[v]]) instanceof Integer p
                    && (p == lastp[v]
                        || ((lastp[v] = p) > 0
                            && (pid[p] > 0 || (pid[p] = ++idc[0]) > 0)
                            && (pr[8 * v + pc[v]++] = pid[p]) > 0))
                    && (rem[v] /= p) > 0) ? 0 : 1) instanceof IntUnaryOperator step
            && IntStream.rangeClosed(1, n).allMatch(v -> (rem[v] = g[1 + v]) > 0)
            && new int[n + 1] instanceof int[] dm
            && IntStream.range(0, 21).allMatch(pass -> Stream.of(0).peek(x -> Arrays.setAll(dm, step)).findFirst().isPresent())
            && new int[7 * n + 400] instanceof int[] last
            && new int[8 * (n + 1)] instanceof int[] sv
            && new int[16 * n] instanceof int[] tmp
            && ((BooleanSupplier) () -> Stream.of(0).peek(x -> Arrays.setAll(tmp, u ->
                evT[u >> 3] == 1
                    ? (u & 7) >= pc[evN[u >> 3]]
                        || ((sv[8 * evN[u >> 3] + (u & 7)] = last[pr[8 * evN[u >> 3] + (u & 7)]]) >= 0
                            && (last[pr[8 * evN[u >> 3] + (u & 7)]] = evN[u >> 3]) > 0) ? 0 : 1
                    : (u & 7) >= pc[evN[u >> 3]]
                        || (last[pr[8 * evN[u >> 3] + (u & 7)]] = sv[8 * evN[u >> 3] + (u & 7)]) >= 0 ? 0 : 1)).findFirst().isPresent()) instanceof BooleanSupplier rc
            && rc.getAsBoolean()
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.iterate(3 * n, p -> p < ps[1], p -> p + (g[p] == 1 ? 2 : 3)).allMatch(p ->
                g[p] == 1
                    ? (Integer) IntStream.range(0, pc[g[p + 1]]).map(t -> sv[8 * g[p + 1] + t]).reduce(0, (x, y) -> depth[x] >= depth[y] ? x : y) instanceof Integer r
                        && sb.append(r == 0 ? -1 : r).append('\n') != null
                    : (pc[g[p + 1]] = 0) == 0 && (lastp[g[p + 1]] = 0) == 0 && (rem[g[p + 1]] = g[p + 2]) > 0
                        && IntStream.range(0, 21).allMatch(i -> step.applyAsInt(g[p + 1]) == 0)
                        && rc.getAsBoolean())
            ? sb.toString()
            : "");
    }
}
