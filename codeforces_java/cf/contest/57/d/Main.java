import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n -> Optional.of(s.nextInt()).ifPresent(m ->
            System.out.println(
                IntStream.range(0, n).mapToObj(i -> s.next()).toList() instanceof List<String> g
                && g.stream().mapToInt(r -> r.indexOf('X')).toArray() instanceof int[] rx
                && IntStream.range(0, m).map(c -> IntStream.range(0, n).filter(r -> g.get(r).charAt(c) == 'X').findFirst().orElse(-1)).toArray() instanceof int[] cx
                && ((ToLongBiFunction<int[], Integer>) (pos, len) -> new long[pos.length] instanceof long[] wi
                    && new long[pos.length] instanceof long[] wd
                    ? IntStream.range(0, pos.length).filter(r -> pos[r] >= 0).mapToLong(r ->
                        (wi[r] = pos[r] + (r > 0 && pos[r - 1] >= 0 && pos[r - 1] < pos[r] ? wi[r - 1] : 0)) * 0
                        + (wd[r] = (len - 1 - pos[r]) + (r > 0 && pos[r - 1] >= 0 && pos[r - 1] > pos[r] ? wd[r - 1] : 0)) * 0
                        + wi[r] * (len - 1 - pos[r]) + (wd[r] - (len - 1 - pos[r])) * pos[r]).sum()
                    : 0L) instanceof ToLongBiFunction<int[], Integer> chains
                ? String.format(Locale.US, "%.12f",
                    (IntStream.range(0, n).mapToLong(r -> IntStream.range(0, n).mapToLong(q -> (long) (m - (rx[r] >= 0 ? 1 : 0)) * (m - (rx[q] >= 0 ? 1 : 0)) * Math.abs(r - q)).sum()).sum()
                    + IntStream.range(0, m).mapToLong(c -> IntStream.range(0, m).mapToLong(q -> (long) (n - (cx[c] >= 0 ? 1 : 0)) * (n - (cx[q] >= 0 ? 1 : 0)) * Math.abs(c - q)).sum()).sum()
                    + 4 * (chains.applyAsLong(rx, m) + chains.applyAsLong(cx, n)))
                    / Math.pow(IntStream.range(0, n).mapToLong(r -> m - (rx[r] >= 0 ? 1 : 0)).sum(), 2))
                : ""))));
    }
}


