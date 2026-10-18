import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            Arrays.stream(new String(System.in.readAllBytes()).trim().split("[ \r\n]+")).mapToLong(Long::parseLong).toArray() instanceof long[] in
            && Integer.valueOf((int) in[0]) instanceof Integer n
            && Integer.valueOf((int) in[1]) instanceof Integer k
            ? n <= k ? "-1"
                : IntStream.range(0, n).mapToLong(i -> (in[2 + 2 * i] + 500000000L) * 1000000001L + in[3 + 2 * i] + 500000000L).sorted().toArray() instanceof long[] key
                    && Arrays.stream(key).map(v -> v / 1000000001L - 500000000L).toArray() instanceof long[] px
                    && Arrays.stream(key).map(v -> v % 1000000001L - 500000000L).toArray() instanceof long[] py
                    && Integer.valueOf(Math.min(n, k + 1)) instanceof Integer w
                    && IntStream.range(0, w).boxed().flatMap(a -> IntStream.range(0, w).mapToObj(b -> new long[]{px[a] + px[n - 1 - b], py[a] + py[n - 1 - b]}))
                        .mapToLong(sum -> (sum[0] + 1000000000L) * 2000000001L + sum[1] + 1000000000L).distinct().sorted().toArray() instanceof long[] cand
                    && Arrays.stream(cand).filter(c -> Long.valueOf(c / 2000000001L - 1000000000L) instanceof Long sx
                        && Long.valueOf(c % 2000000001L - 1000000000L) instanceof Long sy
                        && new int[]{0, n - 1, 0} instanceof int[] st
                        && (IntStream.range(0, n).anyMatch(step -> st[0] > st[1]
                            || (st[0] == st[1]
                                ? ((2 * px[st[0]] != sx || 2 * py[st[0]] != sy ? ++st[2] : st[2]) > k | ++st[0] < 0)
                                : px[st[0]] + px[st[1]] == sx && py[st[0]] + py[st[1]] == sy
                                    ? ++st[0] + --st[1] < 0
                                    : px[st[0]] + px[st[1]] < sx || (px[st[0]] + px[st[1]] == sx && py[st[0]] + py[st[1]] < sy)
                                        ? ++st[0] < 0 || ++st[2] > k
                                        : --st[1] < -5 || ++st[2] > k)) || true)
                        && st[2] <= k).toArray() instanceof long[] ok
                    ? ok.length + Arrays.stream(ok).mapToObj(c -> String.format(Locale.ROOT, "\n%.1f %.1f", (c / 2000000001L - 1000000000L) / 2.0, (c % 2000000001L - 1000000000L) / 2.0)).collect(Collectors.joining())
                    : ""
            : "");
    }
}
