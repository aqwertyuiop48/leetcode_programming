import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new BufferedReader(new InputStreamReader(System.in)).lines().collect(Collectors.joining(" "))).ifPresent(txt -> System.out.println(
            new StringTokenizer(txt) instanceof StringTokenizer st
            && (Integer) Integer.parseInt(st.nextToken()) instanceof Integer n
            && (Integer) Integer.parseInt(st.nextToken()) instanceof Integer t
            && IntStream.generate(() -> Integer.parseInt(st.nextToken())).limit(n).toArray() instanceof int[] a
            && new int[t] instanceof int[] ql
            && new int[t] instanceof int[] qr
            && IntStream.range(0, t).allMatch(i -> (ql[i] = Integer.parseInt(st.nextToken()) - 1) * 0 == (qr[i] = Integer.parseInt(st.nextToken()) - 1) * 0)
            && (Integer) Math.max(1, (int) Math.sqrt(n)) instanceof Integer bs
            && IntStream.range(0, t).boxed().sorted(Comparator.<Integer>comparingInt(i -> ql[i] / bs).thenComparingInt(i -> ql[i] / bs % 2 == 0 ? qr[i] : -qr[i])).mapToInt(i -> i).toArray() instanceof int[] ord
            && new int[1000001] instanceof int[] cnt
            && new long[]{0} instanceof long[] sum
            && new int[]{0, -1} instanceof int[] lr
            && new long[t] instanceof long[] ans
            && Arrays.stream(ord).allMatch(qi ->
                IntStream.iterate(lr[0] - 1, i -> i >= ql[qi], i -> i - 1).allMatch(i -> (sum[0] += (2L * cnt[a[i]]++ + 1) * a[i]) >= 0)
                && IntStream.iterate(lr[1] + 1, i -> i <= qr[qi], i -> i + 1).allMatch(i -> (sum[0] += (2L * cnt[a[i]]++ + 1) * a[i]) >= 0)
                && IntStream.iterate(lr[0], i -> i < ql[qi], i -> i + 1).allMatch(i -> (sum[0] -= (2L * cnt[a[i]]-- - 1) * a[i]) >= 0)
                && IntStream.iterate(lr[1], i -> i > qr[qi], i -> i - 1).allMatch(i -> (sum[0] -= (2L * cnt[a[i]]-- - 1) * a[i]) >= 0)
                && (lr[0] = ql[qi]) >= 0 && (lr[1] = qr[qi]) >= 0 && (ans[qi] = sum[0]) >= 0)
            ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining("\n"))
            : ""));
    }
}



