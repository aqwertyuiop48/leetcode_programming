import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && IntStream.range(0, tk.countTokens()).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] t
            && (Integer) t[0] instanceof Integer n && (Integer) t[1] instanceof Integer m
            && new int[n] instanceof int[] st && new int[]{2} instanceof int[] ps
            && IntStream.range(0, n).filter(c -> (st[c] = ps[0]) >= 0 && (ps[0] += t[ps[0]] + 1) >= 0 && false).count() >= 0
            && IntStream.rangeClosed(0, m).map(i -> -1).toArray() instanceof int[] oc1 && IntStream.rangeClosed(0, m).map(i -> -1).toArray() instanceof int[] oc2
            && new int[m + 1] instanceof int[] os1 && new int[m + 1] instanceof int[] os2 && new int[m + 1] instanceof int[] val && new boolean[m + 1] instanceof boolean[] asg && new boolean[n] instanceof boolean[] sat
            && IntStream.range(0, n).filter(c -> IntStream.rangeClosed(st[c] + 1, st[c] + t[st[c]]).filter(j -> (Integer) Math.abs(t[j]) instanceof Integer v
                && (oc1[v] < 0 ? (oc1[v] = c) >= 0 && (os1[v] = t[j] > 0 ? 1 : -1) != 0 : (oc2[v] = c) >= 0 && (os2[v] = t[j] > 0 ? 1 : -1) != 0) && false).count() >= 0 && false).count() >= 0
            && IntStream.rangeClosed(1, m).filter(v -> oc1[v] >= 0 && (oc2[v] < 0 || oc1[v] == oc2[v] || os1[v] == os2[v])
                && ((val[v] = os1[v] > 0 ? 1 : 0) | 1) != 0 && (asg[v] = true) && (sat[oc1[v]] = true) && (oc2[v] < 0 || (sat[oc2[v]] = true)) && false).count() >= 0
            && IntStream.range(0, n).toArray() instanceof int[] par && IntStream.range(0, n).map(i -> 1).toArray() instanceof int[] sz
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] fh && (fh[0] = x -> par[x] == x ? x : fh[0].applyAsInt(par[x])) != null && fh[0] instanceof IntUnaryOperator find
            && IntStream.rangeClosed(1, m).filter(v -> !asg[v] && oc1[v] >= 0 && oc2[v] >= 0 && (Integer) find.applyAsInt(oc1[v]) instanceof Integer ra && (Integer) find.applyAsInt(oc2[v]) instanceof Integer rb
                && (ra - rb == 0 ? !sat[oc1[v]] && (val[v] = os1[v] > 0 ? 1 : 0) >= 0 && (asg[v] = true) && (sat[oc1[v]] = true)
                    : sz[ra] >= sz[rb] ? (par[rb] = ra) >= 0 && (sz[ra] += sz[rb]) > 0 : (par[ra] = rb) >= 0 && (sz[rb] += sz[ra]) > 0) && false).count() >= 0
            && new int[n] instanceof int[] q && new int[1] instanceof int[] tail
            && IntStream.range(0, n).filter(c -> sat[c] && (q[tail[0]++] = c) < 0).count() >= 0
            && IntStream.iterate(0, h -> h < tail[0], h -> h + 1).filter(h -> (Integer) q[h] instanceof Integer c && IntStream.rangeClosed(st[c] + 1, st[c] + t[st[c]]).filter(j -> (Integer) Math.abs(t[j]) instanceof Integer v
                && !asg[v] && (Integer) (oc1[v] + oc2[v] - c) instanceof Integer d && !sat[d] && ((val[v] = t[j] < 0 ? 1 : 0) | 1) != 0 && (asg[v] = true) && (sat[d] = true) && (q[tail[0]++] = d) >= 0 && false).count() >= 0 && false).count() >= 0
            ? IntStream.range(0, n).allMatch(c -> sat[c]) ? "YES\n" + IntStream.rangeClosed(1, m).mapToObj(v -> "" + val[v]).collect(Collectors.joining()) : "NO"
            : "");
    }
}
