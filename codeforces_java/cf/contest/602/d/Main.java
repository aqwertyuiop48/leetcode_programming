import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] a
            && new int[4] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).map(i -> i < raw.length ? raw[i] : 32).map(c -> (c > 47 && c < 58 ? (st[1] = st[1] * 10 + c - 48) + (st[3] = 1) : c == 45 ? (st[2] = 1) : st[3] == 0 ? 0 : (a[st[0]++] = st[2] == 1 ? -st[1] : st[1]) + (st[1] = 0) + (st[2] = 0) + (st[3] = 0)) * 0).sum() == 0
            && (Integer) a[0] instanceof Integer n
            && new int[n] instanceof int[] d
            && new int[n] instanceof int[] pg
            && new long[n] instanceof long[] f
            && IntStream.range(0, n - 1).allMatch(i -> (d[i] = Math.abs(a[3 + i] - a[2 + i])) >= 0)
            && IntStream.range(0, n - 1).allMatch(i -> (pg[i] = IntStream.iterate(i - 1, p -> pg[p]).filter(p -> p < 0 || d[p] >= d[i]).findFirst().getAsInt()) > -5)
            ? IntStream.range(0, a[1]).mapToObj(qi -> (Integer) (a[n + 2 + 2 * qi] - 1) instanceof Integer lo && (Integer) (a[n + 3 + 2 * qi] - 2) instanceof Integer hi
                ? String.valueOf(IntStream.rangeClosed(lo, hi).mapToLong(i -> f[i] = d[i] * (long) (i - Math.max(pg[i], lo - 1)) + (pg[i] >= lo ? f[pg[i]] : 0)).sum()) : "").collect(Collectors.joining("\n")) : "");
    }
}
