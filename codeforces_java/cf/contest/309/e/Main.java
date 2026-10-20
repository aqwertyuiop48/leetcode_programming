import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new long[] {sc.nextLong(), sc.nextLong(), i + 1}).sorted(Comparator.comparingLong(a -> a[1])).toArray(long[][]::new) instanceof long[][] s
            && ((LongFunction<int[]>) K -> new boolean[n] instanceof boolean[] vis && (vis[0] = true)
                ? Stream.iterate(0, cur -> Integer.valueOf(IntStream.range(0, n).filter(j -> !vis[j] && s[j][0] <= s[cur][1] + K && s[cur][0] <= s[j][1] + K).findFirst().orElse(-1)) instanceof Integer x && (x < 0 || (vis[x] = true)) ? x : -1)
                    .takeWhile(x -> x >= 0).limit(n).mapToInt(x -> x).toArray() : null) instanceof LongFunction<int[]> path
            && Stream.iterate(new long[] {0, 1000000000L}, st -> path.apply((st[0] + st[1]) / 2).length == n ? new long[] {st[0], (st[0] + st[1]) / 2} : new long[] {(st[0] + st[1]) / 2 + 1, st[1]})
                .limit(32).reduce((a, b) -> b).get() instanceof long[] fin
            ? Arrays.stream(path.apply(fin[0])).mapToObj(i -> String.valueOf(s[i][2])).collect(Collectors.joining(" ")) : "");
    }
}
