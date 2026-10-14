import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new long[]{s.nextLong(), s.nextLong()}).ifPresent(nm ->
            System.out.println(
                IntStream.range(0, (int) nm[1]).mapToObj(i -> new long[]{s.nextLong(), s.nextLong()})
                    .sorted((x, y) -> Long.compare(y[1], x[1]))
                    .toArray(long[][]::new) instanceof long[][] bins
                && new long[]{nm[0], 0} instanceof long[] st
                && Arrays.stream(bins).allMatch(bin ->
                    new long[]{Math.min(st[0], bin[0])} instanceof long[] take
                    && (st[0] -= take[0]) >= 0
                    && (st[1] += take[0] * bin[1]) >= 0)
                ? st[1]
                : 0L)));
    }
}

