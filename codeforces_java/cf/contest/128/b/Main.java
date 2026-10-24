import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print((Object) (Stream.of(new String(System.in.readAllBytes()).trim().split("\\s+")).toList() instanceof List<String> t && t.get(0) instanceof String s && new long[]{Long.parseLong(t.get(1))} instanceof long[] kk && new int[][]{IntStream.range(0, s.length()).toArray()} instanceof int[][] cand && new StringBuilder() instanceof StringBuilder sb && kk[0] <= s.length() * (s.length() + 1L) / 2 && IntStream.rangeClosed(0, s.length()).anyMatch(L -> new long[26] instanceof long[] cnt && Arrays.stream(cand[0]).allMatch(i -> (cnt[s.charAt(i + L) - 'a'] += s.length() - i - L) > 0) && (Integer) IntStream.range(0, 26).filter(d -> kk[0] <= cnt[d] || (kk[0] -= cnt[d]) < 0).findFirst().getAsInt() instanceof Integer c && sb.append((char) ('a' + c)) != null && (Long) Arrays.stream(cand[0]).filter(i -> s.charAt(i + L) - 'a' == c).count() instanceof Long ends && Arrays.stream(cand[0]).filter(i -> s.charAt(i + L) - 'a' == c && i + L + 1 < s.length()).toArray() instanceof int[] nc && (kk[0] <= ends || (kk[0] -= ends) < 0 || (cand[0] = nc) == null)) ? sb : "No such line."));
    }


}
