import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] nums
            && new long[4] instanceof long[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                (Integer) (i == raw.length ? 32 : (int) raw[i]) instanceof Integer c
                && (c >= '0' && c <= '9'
                    ? (st[0] = st[0] * 10 + c - '0') >= 0 && (st[2] = 1) > 0
                    : c == '-'
                        ? (st[3] = 1) > 0
                        : st[2] == 0 || ((nums[(int) st[1]++] = st[3] == 1 ? -st[0] : st[0]) != Long.MIN_VALUE && (st[0] = 0) == 0 && (st[2] = 0) == 0 && (st[3] = 0) == 0)))
            && Integer.valueOf((int) nums[0]) instanceof Integer n
            && Integer.valueOf(n + 2) instanceof Integer N
            && new int[N * N * N * N] instanceof int[] D
            && IntStream.rangeClosed(1, n).allMatch(k ->
                (Integer) (int) nums[k] instanceof Integer a
                && (Integer) (int) nums[n + k] instanceof Integer w
                && IntStream.rangeClosed(1, n).allMatch(l -> IntStream.rangeClosed(l, n).allMatch(r ->
                    (D[((N + k) * N + l) * N + r] = l <= k && k <= r && a >= w ? a : 0) >= 0)))
            && IntStream.rangeClosed(2, n).allMatch(i ->
                IntStream.rangeClosed(1, n - i + 1).allMatch(k ->
                    (Integer) (int) nums[n + 1 + (i - 1) * (n + 1) - (i - 1) * i / 2 + k - 1] instanceof Integer w
                    && Integer.valueOf(((i - 1) * N + k) * N * N) instanceof Integer bl
                    && Integer.valueOf(((i - 1) * N + k + 1) * N * N) instanceof Integer br
                    && IntStream.rangeClosed(1, n).allMatch(l -> IntStream.rangeClosed(l, n).allMatch(r ->
                        (Integer) Math.max(Math.max(D[bl + l * N + r], D[br + l * N + r]),
                            IntStream.range(l, r).filter(m -> D[bl + l * N + m] > 0 && D[br + (m + 1) * N + r] > 0)
                                .map(m -> D[bl + l * N + m] + D[br + (m + 1) * N + r]).max().orElse(0)) instanceof Integer v
                        && (D[(i * N + k) * N * N + l * N + r] = v >= w ? v : 0) >= 0))))
            ? (D[((n * N + 1) * N + 1) * N + n] > 0 ? "Cerealguy" : "Fat Rat")
            : "");
    }
}
