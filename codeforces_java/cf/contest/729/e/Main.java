import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Stream.generate(st::nextToken).limit(st.countTokens()).mapToInt(Integer::parseInt).toArray() instanceof int[] a
            && Integer.valueOf(a[0]) instanceof Integer n && Integer.valueOf(a[1]) instanceof Integer s
            && new int[n + 1] instanceof int[] cnt && new int[2] instanceof int[] acc
            && IntStream.range(0, n).filter(i -> i != s - 1).filter(i -> ++cnt[Math.min(n, a[2 + i])] > 0).count() >= 0
            ? (a[1 + s] != 0 ? 1 : 0) + (n == 1 ? 0
                : IntStream.rangeClosed(1, n - 1).map(d -> (acc[0] += cnt[d]) >= 0 && (acc[1] += cnt[d] == 0 ? 1 : 0) >= 0 ? Math.max(acc[1], n - 1 - acc[0]) : 0).min().getAsInt())
            : 0);
    }
}
