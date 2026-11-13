import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] t
            && IntStream.range(0, m + 1).map(i -> i == 0 ? 0 : s.nextInt()).toArray() instanceof int[] need
            && new int[]{1, n + 1} instanceof int[] bs
            && ((IntPredicate) (D -> new int[m + 1] instanceof int[] last && new int[]{0} instanceof int[] fr
                && IntStream.range(0, D).filter(i -> (last[t[i]] = i + 1) > 0).count() >= 0
                && IntStream.rangeClosed(1, m).allMatch(j -> last[j] > 0)
                && IntStream.range(0, D).allMatch(i -> t[i] == 0 || last[t[i]] != i + 1 ? ++fr[0] > 0 : fr[0] >= need[t[i]] && (fr[0] -= need[t[i]]) >= 0))) instanceof IntPredicate ok
            && IntStream.range(0, 20).filter(z -> bs[0] < bs[1]
                && Integer.valueOf((bs[0] + bs[1]) / 2) instanceof Integer mid
                && (ok.test(mid) ? (bs[1] = mid) > 0 : (bs[0] = mid + 1) > 0)).count() >= 0
            ? (bs[0] == n + 1 ? -1 : bs[0]) : 0);
    }
}
