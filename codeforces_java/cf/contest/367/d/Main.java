import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m && Integer.valueOf(it.next()) instanceof Integer d
            && new int[n] instanceof int[] own
            && IntStream.range(0, m).allMatch(s -> Integer.valueOf(it.next()) instanceof Integer c && IntStream.range(0, c).allMatch(z -> (own[it.next() - 1] = s) >= 0))
            && Integer.valueOf((1 << m) - 1) instanceof Integer full && new boolean[1 << m] instanceof boolean[] bad
            && new int[m] instanceof int[] cnt && new int[]{0} instanceof int[] mk
            && IntStream.range(0, n).allMatch(i -> (cnt[own[i]]++ != 0 || (mk[0] |= 1 << own[i]) >= 0)
                && (i < d || --cnt[own[i - d]] != 0 || (mk[0] &= ~(1 << own[i - d])) >= 0)
                && (i < d - 1 || (bad[full & ~mk[0]] = true)))
            && IntStream.range(0, m).allMatch(b -> IntStream.range(0, 1 << m).allMatch(x -> (x >> b & 1) == 1 || !bad[x | 1 << b] || (bad[x] = true)))
            ? IntStream.range(0, 1 << m).filter(x -> !bad[x]).map(Integer::bitCount).min().getAsInt() : "");
    }
}
