import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] tokStart
            && new byte[raw.length / 2 + 8] instanceof byte[] tokFirst
            && new int[raw.length / 2 + 8] instanceof int[] tokVal
            && new int[] {-1} instanceof int[] tc
            && IntStream.range(0, raw.length).allMatch(i ->
                (raw[i] <= ' '
                    || ((i > 0 && raw[i - 1] > ' ')
                        || ((++tc[0]) >= 0 && (tokStart[tc[0]] = i) >= 0 && (tokFirst[tc[0]] = raw[i]) > 0))
                    && (raw[i] < '0' || raw[i] > '9' || (tokVal[tc[0]] = tokVal[tc[0]] * 10 + raw[i] - '0') >= 0)))
            && Integer.valueOf(tokVal[0]) instanceof Integer n
            && Integer.valueOf(tokVal[1]) instanceof Integer m
            && Integer.valueOf(tokVal[2]) instanceof Integer q
            && Integer.valueOf(m + 2) instanceof Integer w
            && new byte[n * m] instanceof byte[] g
            && new int[n * m] instanceof int[] res
            && new int[4] instanceof int[] rs
            && IntStream.range(0, n * m).allMatch(i -> (g[i] = raw[tokStart[3 + i / m] + i % m]) > 0)
            && ((IntPredicate) x0 ->
                Integer.valueOf(((x0 - 1) >> 8 << 8) + 1) instanceof Integer bs
                && (rs[0] = x0) > 0 && (rs[1] = 0) == 0
                && IntStream.range(0, (Math.min(n, bs + 255) - x0 + 1) * 2 * m).allMatch(t ->
                    (rs[2] = rs[1] < m ? rs[1] + 1 : 2 * m - rs[1]) > 0
                    && (rs[3] = (rs[0] - 1) * m + rs[2] - 1) >= 0
                    && (rs[1] < m
                        ? (g[rs[3]] == '^'
                            ? (res[rs[3]] = rs[0] == bs ? (bs == 1 ? -rs[2] - 2 : rs[3] - m) : res[rs[3] - m]) < Integer.MAX_VALUE
                            : g[rs[3]] != '<' || (res[rs[3]] = rs[2] == 1 ? -rs[0] * w - 2 : g[rs[3] - 1] == '>' ? -1 : res[rs[3] - 1]) < Integer.MAX_VALUE)
                        : (g[rs[3]] != '>' || (res[rs[3]] = rs[2] == m ? -(rs[0] * w + m + 1) - 2 : g[rs[3] + 1] == '<' ? -1 : res[rs[3] + 1]) < Integer.MAX_VALUE))
                    && (++rs[1] < 2 * m || ((rs[1] = 0) == 0 && ++rs[0] > 0))))
                instanceof IntPredicate rb
            && IntStream.range(0, (n + 255) / 256).allMatch(b -> rb.test(b * 256 + 1))
            && new int[] {3 + n} instanceof int[] pt
            && new int[1] instanceof int[] z
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, q).allMatch(e ->
                Integer.valueOf(pt[0]) instanceof Integer p
                && Integer.valueOf(tokVal[p + 1]) instanceof Integer x
                && Integer.valueOf(tokVal[p + 2]) instanceof Integer y
                && (tokFirst[p] == 'A'
                    ? (z[0] = (x - 1) * m + y - 1) >= 0
                        && IntStream.range(0, n / 256 + 3).anyMatch(i -> z[0] < 0 || (z[0] = res[z[0]]) < 0)
                        && sb.append(z[0] == -1 ? "-1 -1" : (-z[0] - 2) / w + " " + (-z[0] - 2) % w).append('\n') != null
                        && (pt[0] += 3) > 0
                    : (g[(x - 1) * m + y - 1] = tokFirst[p + 3]) > 0
                        && rb.test(x)
                        && (pt[0] += 4) > 0))
            ? sb.toString()
            : "");
    }
}
