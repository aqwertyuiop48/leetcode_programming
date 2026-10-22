import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, 2 * n).map(i -> s.nextInt()).toArray() instanceof int[] a
            && new int[100] instanceof int[] cnt && IntStream.range(0, 2 * n).allMatch(i -> ++cnt[a[i]] > 0)
            && new int[100] instanceof int[] seen && new int[]{0} instanceof int[] tog
            && IntStream.range(0, 2 * n).map(i -> cnt[a[i]] >= 2 ? seen[a[i]]++ == 0 ? 1 : seen[a[i]] == 2 ? 2 : 0 : tog[0]++ % 2 == 0 ? 1 : 2).toArray() instanceof int[] r0
            && new int[]{n - (int) Arrays.stream(r0).filter(x -> x == 1).count()} instanceof int[] cap
            && Arrays.stream(r0).map(x -> x != 0 ? x : cap[0]-- > 0 ? 1 : 2).toArray() instanceof int[] r
            ? IntStream.range(0, 2 * n).filter(i -> r[i] == 1).map(i -> a[i]).distinct().count() * IntStream.range(0, 2 * n).filter(i -> r[i] == 2).map(i -> a[i]).distinct().count()
                + "\n" + Arrays.stream(r).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
