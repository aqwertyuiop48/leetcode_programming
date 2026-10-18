import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).filter(sc -> sc.next() instanceof String s && new int[][]{IntStream.range(0, s.length()).toArray()} instanceof int[][] cand && new long[]{sc.nextLong()} instanceof long[] kk && new StringBuilder() instanceof StringBuilder sb && System.out.append(kk[0] > s.length() * (s.length() + 1L) / 2 ? "NO SUCH LINE" : (IntStream.range(0, s.length() + 1).allMatch(L -> new long[26] instanceof long[] cnt && Arrays.stream(cand[0]).filter(i -> i + L < s.length()).allMatch(i -> (cnt[s.charAt(i + L) - 'a'] += s.length() - i - L) >= 0) && IntStream.range(0, 26).filter(c -> kk[0] <= cnt[c] || (kk[0] -= cnt[c]) < 0).boxed().findFirst().map(c -> sb.append((char) ('a' + c)) != null && Arrays.stream(cand[0]).filter(i -> i + L < s.length() && s.charAt(i + L) - 'a' == c).toArray() instanceof int[] nc && (cand[0] = nc) != null && kk[0] > nc.length && (kk[0] -= nc.length) > 0).orElse(false)) ? sb : sb)) != null);
    }
}
