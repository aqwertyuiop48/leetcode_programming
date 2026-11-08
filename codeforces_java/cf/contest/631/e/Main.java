import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] tk && new int[]{0, 0, 0, 0} instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length ? raw[i] : 32) >= 48
                ? (ps[1] = ps[1] * 10 + raw[i] - 48) >= 0 && (ps[2] = 1) > 0
                : (i < raw.length && raw[i] == 45 ? (ps[3] = 1) > 0 : ps[2] == 0 || ((tk[ps[0]++] = ps[3] == 1 ? -ps[1] : ps[1]) > Integer.MIN_VALUE && (ps[1] = 0) == 0 && (ps[2] = 0) == 0 && (ps[3] = 0) == 0)))
            && Integer.valueOf(tk[0]) instanceof Integer n
            && IntStream.range(0, n).map(i -> tk[1 + i]).toArray() instanceof int[] a
            && new long[n + 2] instanceof long[] pf
            && IntStream.rangeClosed(1, n).allMatch(i -> (pf[i] = pf[i - 1] + a[i - 1]) > Long.MIN_VALUE)
            && new int[n + 2] instanceof int[] hj && new int[]{0} instanceof int[] hs && new int[]{0} instanceof int[] hp
            && IntStream.rangeClosed(1, n + 1).allMatch(j -> IntStream.iterate(hs[0], s -> s >= 2
                    && (pf[j - 1] - pf[hj[s - 2] - 1]) * (hj[s - 1] - hj[s - 2]) <= (pf[hj[s - 1] - 1] - pf[hj[s - 2] - 1]) * (j - hj[s - 2]), s -> s - 1).reduce((p, q) -> q) instanceof OptionalInt op
                && (hs[0] = (op.isPresent() ? op.getAsInt() - 1 : hs[0]) + 1) > 0 && (hj[hs[0] - 1] = j) > 0)
            ? IntStream.range(0, n).mapToLong(i -> (long) a[i] * (i + 1)).sum()
                + IntStream.range(0, n).boxed().sorted(Comparator.comparingInt(i -> a[i])).mapToLong(i -> IntStream.iterate(hp[0], q -> q + 1 < hs[0]
                        && (long) a[i] * hj[q + 1] - pf[hj[q + 1] - 1] >= (long) a[i] * hj[q] - pf[hj[q] - 1], q -> q + 1).reduce((p, q) -> q) instanceof OptionalInt o
                    && (hp[0] = o.isPresent() ? o.getAsInt() + 1 : hp[0]) >= 0
                    ? (long) a[i] * hj[hp[0]] - pf[hj[hp[0]] - 1] + pf[i] - (long) a[i] * (i + 1) : 0L).max().getAsLong() : "");
    }
}
