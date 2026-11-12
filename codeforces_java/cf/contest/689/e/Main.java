import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n
            && Integer.valueOf(st.nextToken()) instanceof Integer k
            && new long[2 * n] instanceof long[] ev
            && IntStream.range(0, n).allMatch(i -> (ev[2 * i] = 2L * Long.parseLong(st.nextToken()) + 1) > 0
                && (ev[2 * i + 1] = 2L * (Long.parseLong(st.nextToken()) + 1)) > 0)
            && Arrays.stream(ev).sorted().toArray() instanceof long[] so
            && new long[n + 1] instanceof long[] fact
            && new long[n + 1] instanceof long[] ifact
            && (fact[0] = 1) == 1
            && IntStream.rangeClosed(1, n).allMatch(i -> (fact[i] = fact[i - 1] * i % 1000000007L) >= 0)
            && new long[]{1, fact[n]} instanceof long[] pw
            && IntStream.range(0, 30).allMatch(b -> (pw[0] = ((1000000005L >> b) & 1) == 1 ? pw[0] * pw[1] % 1000000007L : pw[0]) > 0
                && (pw[1] = pw[1] * pw[1] % 1000000007L) > 0)
            && (ifact[n] = pw[0]) > 0
            && IntStream.range(0, n).allMatch(t -> (ifact[n - 1 - t] = ifact[n - t] * (n - t) % 1000000007L) > 0)
            && new long[3] instanceof long[] s
            && IntStream.range(0, 2 * n).allMatch(i -> Long.valueOf(so[i] >> 1) instanceof Long pos
                && (s[2] = (s[2] + (s[1] >= k
                    ? fact[(int) s[1]] * ifact[k] % 1000000007L * ifact[(int) s[1] - k] % 1000000007L * ((pos - s[0]) % 1000000007L) % 1000000007L
                    : 0)) % 1000000007L) >= 0
                && (s[0] = pos) >= 0
                && (s[1] += (so[i] & 1) == 1 ? 1 : -1) >= 0)
            ? s[2] : "");
    }
}
