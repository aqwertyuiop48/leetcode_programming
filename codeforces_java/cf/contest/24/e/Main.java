import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] t
            && new int[4] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                (Integer) (i < raw.length ? (int) raw[i] : 32) instanceof Integer c
                && (c >= '0' && c <= '9'
                    ? (st[0] = st[0] * 10 + c - '0') >= 0 && (st[2] = 1) > 0
                    : c == '-'
                        ? (st[3] = 1) > 0
                        : st[2] == 0 || ((t[st[1]++] = st[3] == 1 ? -st[0] : st[0]) != Integer.MIN_VALUE && (st[0] = 0) == 0 && (st[2] = 0) == 0 && (st[3] = 0) == 0)))
            && Integer.valueOf(t[0]) instanceof Integer n
            && IntStream.range(0, n).mapToDouble(i -> t[1 + 2 * i]).toArray() instanceof double[] x
            && IntStream.range(0, n).mapToDouble(i -> t[2 + 2 * i]).toArray() instanceof double[] v
            && new double[1] instanceof double[] mx
            && ((DoublePredicate) q -> (mx[0] = Double.NEGATIVE_INFINITY) < 0
                && IntStream.range(0, n).filter(i -> v[i] >= 0
                    ? (mx[0] = Math.max(mx[0], x[i] + v[i] * q)) > Double.MAX_VALUE
                    : x[i] + v[i] * q <= mx[0]).count() > 0) instanceof DoublePredicate hit
            ? hit.test(1e10)
                ? String.format(Locale.ROOT, "%.12f", Stream.iterate(new double[]{0, 1e10}, b -> hit.test((b[0] + b[1]) / 2) ? new double[]{b[0], (b[0] + b[1]) / 2} : new double[]{(b[0] + b[1]) / 2, b[1]})
                    .limit(68).reduce((p, q) -> q).get()[1])
                : "-1"
            : "");
    }
}


