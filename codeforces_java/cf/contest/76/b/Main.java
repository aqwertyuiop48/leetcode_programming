import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                Integer.valueOf(s.nextInt()) instanceof Integer n
                && Integer.valueOf(s.nextInt()) instanceof Integer m
                && s.nextInt() >= Integer.MIN_VALUE
                && s.nextInt() >= Integer.MIN_VALUE
                && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] x
                && IntStream.range(0, m).map(i -> s.nextInt()).toArray() instanceof int[] c
                && new long[m] instanceof long[] md
                && IntStream.range(0, m).allMatch(i -> (md[i] = Long.MAX_VALUE) > 0)
                && new int[m] instanceof int[] cnt
                && (m == 0 || IntStream.of(x).allMatch(px ->
                    Integer.valueOf(Arrays.binarySearch(c, px)) instanceof Integer r
                    && Integer.valueOf(r >= 0 ? r : -r - 1) instanceof Integer j
                    && Long.valueOf(j > 0 ? px - c[j - 1] : Long.MAX_VALUE) instanceof Long dl
                    && Long.valueOf(j < m ? c[j] - px : Long.MAX_VALUE) instanceof Long dr
                    && Integer.valueOf(dl < dr ? j - 1 : dr < dl ? j : (md[j - 1] == Long.MAX_VALUE || md[j - 1] == dl ? j - 1 : j)) instanceof Integer t
                    && Long.valueOf(Math.min(dl, dr)) instanceof Long d
                    && (d < md[t] ? (md[t] = d) > 0 && (cnt[t] = 1) > 0 : d == md[t] ? ++cnt[t] > 0 : true)))
                ? n - IntStream.of(cnt).sum()
                : 0));
    }
}

