import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 4] instanceof int[] v && new int[3] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> i < raw.length && raw[i] >= '0' ? (st[0] = st[0] * 10 + raw[i] - '0') >= 0 && (st[2] = 1) > 0 : st[2] == 0 || (v[st[1]++] = st[0]) >= 0 && (st[0] = 0) == 0 && (st[2] = 0) == 0)
            && Integer.valueOf(v[0]) instanceof Integer n
            && IntStream.range(0, n).map(i -> v[n * n + n - i] - 1).toArray() instanceof int[] r
            && IntStream.range(0, n).mapToObj(a -> IntStream.range(0, n).map(b -> v[1 + r[a] * n + r[b]]).toArray()).toArray(int[][]::new) instanceof int[][] d
            && new long[n] instanceof long[] rs && new long[n] instanceof long[] ans
            && IntStream.range(0, n).allMatch(t -> d[t] instanceof int[] dw
                && IntStream.range(0, n).parallel().allMatch(i -> d[i] instanceof int[] row && Stream.of(row[t]).peek(c -> Arrays.setAll(row, j -> Math.min(row[j], c + dw[j]))).findFirst().isPresent()
                    && (rs[i] = i <= t ? Arrays.stream(row, 0, t + 1).asLongStream().sum() : 0L) >= 0)
                && (ans[n - 1 - t] = Arrays.stream(rs).sum()) >= 0)
            ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
