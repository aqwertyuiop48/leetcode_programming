import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && Integer.valueOf(Integer.parseInt(tk.nextToken())) instanceof Integer n
            && tk.nextToken().getBytes() instanceof byte[] s
            && new int[n] instanceof int[] rk && new int[n] instanceof int[] nrk && new int[n] instanceof int[] tmp && new int[n + 2] instanceof int[] cnt && new int[n + 1] instanceof int[] lcp
            && IntStream.range(0, n).filter(i -> (rk[i] = s[i] == '(' ? 0 : 1) < 0).count() == 0
            && IntStream.concat(IntStream.range(0, n).filter(i -> s[i] == '('), IntStream.range(0, n).filter(i -> s[i] != '(')).toArray() instanceof int[] sa
            && new int[]{0, 0, (int) Math.min(2, IntStream.range(0, n).map(i -> rk[i]).distinct().count()), 2, 0} instanceof int[] st
            && IntStream.iterate(1, k -> k * 2).takeWhile(k -> st[2] < n)
                .filter(k -> IntStream.of(0)
                    .peek(z -> st[0] = 0)
                    .peek(z -> IntStream.range(Math.max(0, n - k), n).forEach(i -> tmp[st[0]++] = i))
                    .peek(z -> IntStream.range(0, n).filter(j -> sa[j] >= k).forEach(j -> tmp[st[0]++] = sa[j] - k))
                    .peek(z -> Arrays.fill(cnt, 0))
                    .peek(z -> IntStream.range(0, n).forEach(i -> cnt[rk[i]]++))
                    .peek(z -> IntStream.range(1, st[3]).forEach(r -> cnt[r] += cnt[r - 1]))
                    .peek(z -> IntStream.range(0, n).forEach(j -> sa[--cnt[rk[tmp[n - 1 - j]]]] = tmp[n - 1 - j]))
                    .peek(z -> nrk[sa[0]] = 0)
                    .peek(z -> st[1] = 0)
                    .peek(z -> IntStream.range(1, n).forEach(i -> nrk[sa[i]] = (st[1] += (rk[sa[i]] != rk[sa[i - 1]] || (sa[i] + k < n ? rk[sa[i] + k] : -1) != (sa[i - 1] + k < n ? rk[sa[i - 1] + k] : -1)) ? 1 : 0)))
                    .peek(z -> System.arraycopy(nrk, 0, rk, 0, n))
                    .peek(z -> st[2] = st[3] = st[1] + 1).sum() < 0).count() == 0
            && IntStream.range(0, n).filter(i -> rk[i] > 0
                ? (lcp[rk[i]] = (st[4] += IntStream.iterate(st[4], x -> i + x < n && sa[rk[i] - 1] + x < n && s[i + x] == s[sa[rk[i] - 1] + x], x -> x + 1).count())) + 0 * (st[4] = Math.max(st[4] - 1, 0)) < 0
                : (st[4] = 0) < 0).count() == 0
            && new int[n + 1] instanceof int[] bal
            && IntStream.range(0, n).filter(i -> (bal[i + 1] = bal[i] + (s[i] == '(' ? 1 : -1)) < -n - 5).count() == 0
            && new int[2 * n + 3] instanceof int[] last && new int[n + 1] instanceof int[] nl
            && IntStream.range(0, 2 * n + 3).filter(i -> (last[i] = n + 1) < 0).count() == 0
            && IntStream.rangeClosed(0, n).filter(j -> Integer.valueOf(n - j) instanceof Integer i && (nl[i] = last[bal[i] + n]) + (last[bal[i] + n + 1] = i) < 0).count() == 0
            && LongStream.rangeClosed(0, n).map(e -> (bal[(int) e] + n + 1) * (long) (n + 1) + e).sorted().toArray() instanceof long[] ks
            && ((java.util.function.LongToIntFunction) kk -> Integer.valueOf(Arrays.binarySearch(ks, kk)) instanceof Integer pos ? (pos >= 0 ? pos + 1 : -pos - 1) : 0) instanceof java.util.function.LongToIntFunction cle
            ? IntStream.range(0, n).mapToLong(r -> Integer.valueOf(sa[r]) instanceof Integer i && Integer.valueOf(Math.min(nl[i] - 1, n)) instanceof Integer hi && Integer.valueOf(i + lcp[r] + 1) instanceof Integer lo
                ? (lo > hi ? 0L : (long) (cle.applyAsInt((bal[i] + n + 1) * (long) (n + 1) + hi) - cle.applyAsInt((bal[i] + n + 1) * (long) (n + 1) + lo - 1))) : 0L).sum() : "");
    }
}
