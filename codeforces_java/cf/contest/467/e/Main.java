import java.util.Arrays;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g
            && new int[4] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g[0]) instanceof Integer n
            && Arrays.stream(g, 1, n + 1).sorted().distinct().toArray() instanceof int[] u
            && IntStream.rangeClosed(1, n).map(i -> Arrays.binarySearch(u, g[i])).toArray() instanceof int[] id
            && new int[u.length] instanceof int[] cs
            && new int[u.length] instanceof int[] csE
            && new int[u.length] instanceof int[] pr
            && new int[u.length] instanceof int[] prE
            && new int[n + 1] instanceof int[] st
            && new int[] {1, 0, 0} instanceof int[] ep
            && new StringBuilder() instanceof StringBuilder sb
            && ((IntBinaryOperator) (a, b) ->
                sb.append(u[a]).append(' ').append(u[b]).append(' ').append(u[a]).append(' ').append(u[b]).append(' ') != null
                && (++ep[0]) > 0 && (ep[1] = 0) == 0 && ++ep[2] > 0 ? 0 : 1) instanceof IntBinaryOperator emit
            && IntStream.range(0, n).allMatch(i ->
                (Integer) id[i] instanceof Integer x
                && (prE[x] == ep[0]
                    ? emit.applyAsInt(pr[x], x) == 0
                    : (csE[x] != ep[0] && (csE[x] = ep[0]) > 0 && (cs[x] = 0) == 0 || true)
                        && (cs[x] == 0
                            || IntStream.generate(() -> 0).takeWhile(z -> st[ep[1] - 1] != x).allMatch(z ->
                                (Integer) st[--ep[1]] instanceof Integer y
                                && --cs[y] >= 0
                                && (pr[y] = x) >= 0
                                && (prE[y] = ep[0]) > 0))
                        && (st[ep[1]++] = x) >= 0
                        && ++cs[x] > 0
                        && (cs[x] != 4 || emit.applyAsInt(x, x) == 0)))
            ? 4 * ep[2] + "\n" + sb.toString().trim()
            : "");
    }
}
