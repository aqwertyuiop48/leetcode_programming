import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer k
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] d
            && new int[n + 2] instanceof int[] cnt && IntStream.of(d).allMatch(x -> x < n && ++cnt[x] > 0)
            && cnt[0] == 1 && IntStream.rangeClosed(1, n).allMatch(l -> cnt[l] == 0 || (cnt[l - 1] > 0 && (l == 1 ? cnt[l] <= k : (long) cnt[l] <= (long) cnt[l - 1] * (k - 1))))
            && new int[n + 2] instanceof int[] start && IntStream.rangeClosed(1, n + 1).allMatch(l -> (start[l] = start[l - 1] + cnt[l - 1]) >= 0)
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingInt(i -> d[i])).mapToInt(i -> i).toArray() instanceof int[] ord
            ? (n - 1) + IntStream.range(1, n).mapToObj(q -> (Integer) d[ord[q]] instanceof Integer l
                ? "\n" + (ord[start[l - 1] + (q - start[l]) / (l == 1 ? k : k - 1)] + 1) + " " + (ord[q] + 1) : "").collect(Collectors.joining()) : "-1");
    }
}
