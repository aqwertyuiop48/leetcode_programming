import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] a
            && new int[4] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).map(i -> i < raw.length ? raw[i] : 32).map(c -> (c > 47 && c < 58 ? (st[1] = st[1] * 10 + c - 48) + (st[3] = 1) : c == 45 ? (st[2] = 1) : st[3] == 0 ? 0 : (a[st[0]++] = st[2] == 1 ? -st[1] : st[1]) + (st[1] = 0) + (st[2] = 0) + (st[3] = 0)) * 0).sum() == 0
            && (Integer) a[0] instanceof Integer n && (Integer) a[1] instanceof Integer bx
            && (Integer) a[2 + n] instanceof Integer m && (Integer) a[3 + n] instanceof Integer by
            && (Long) IntStream.range(0, n).mapToLong(i -> a[2 + i]).reduce(0L, (r, v) -> r * bx + v) instanceof Long x
            && (Long) IntStream.range(0, m).mapToLong(i -> a[4 + n + i]).reduce(0L, (r, v) -> r * by + v) instanceof Long y
            ? "<=>".charAt(Long.compare(x, y) + 1) : "");
    }
}
