import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && IntStream.range(0, raw.length).filter(i -> raw[i] == 10).toArray() instanceof int[] nl
            && Integer.valueOf(nl[0] > 0 && raw[nl[0] - 1] == 13 ? nl[0] - 1 : nl[0]) instanceof Integer pe
            && Arrays.copyOfRange(raw, 0, pe) instanceof byte[] p
            && Integer.valueOf(nl[1] > nl[0] + 1 && raw[nl[1] - 1] == 13 ? nl[1] - 1 : nl[1]) instanceof Integer se
            && Arrays.copyOfRange(raw, nl[0] + 1, se) instanceof byte[] s
            && Integer.valueOf(new String(raw, nl[1] + 1, raw.length - nl[1] - 1).trim()) instanceof Integer k
            && Integer.valueOf(p.length) instanceof Integer P && Integer.valueOf(s.length) instanceof Integer m
            && Integer.valueOf(P / k) instanceof Integer full && Integer.valueOf(P % k) instanceof Integer r
            && Integer.valueOf(k + 2) instanceof Integer W
            ? IntStream.rangeClosed(1, Math.min(m, k)).filter(cnt -> m - full * cnt >= 0 && (r == 0 ? m - full * cnt == 0 : m - full * cnt <= Math.min(cnt, r)))
                .mapToObj(cnt -> Integer.valueOf(m - full * cnt) instanceof Integer q
                    && new int[cnt + 1] instanceof int[] T && (T[cnt] = k) == k
                    && IntStream.range(0, cnt).allMatch(jj -> Integer.valueOf(cnt - 1 - jj) instanceof Integer j
                        && (T[j] = IntStream.range(0, T[j + 1]).map(z -> T[j + 1] - 1 - z)
                            .filter(o -> (j < q ? o < r && p[full * k + o] == s[full * cnt + j] : o >= r) && (full == 0 || p[o] == s[j])
                                && IntStream.range(1, full).allMatch(b -> p[b * k + o] == s[b * cnt + j])).findFirst().orElse(-1)) >= 0)
                    && new char[k] instanceof char[] key && IntStream.range(0, k).allMatch(o -> (key[o] = '0') == '0')
                    && IntStream.range(0, cnt).allMatch(j -> (key[T[j]] = '1') == '1')
                    ? new String(key) : null)
                .filter(Objects::nonNull).min(Comparator.naturalOrder()).orElse("0") : "");
    }
}
