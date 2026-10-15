import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                ((Function<long[], String>) q -> (q[0] > q[2] || (q[0] == q[2] && q[1] > q[3]))
                    ? q[2] + "," + q[3] + "," + q[0] + "," + q[1]
                    : q[0] + "," + q[1] + "," + q[2] + "," + q[3]) instanceof Function<long[], String> canon
                && IntStream.range(0, 4).mapToObj(i -> new long[]{s.nextLong(), s.nextLong(), s.nextLong(), s.nextLong()}).toArray(long[][]::new) instanceof long[][] segs
                && Arrays.stream(segs).flatMapToLong(seg -> LongStream.of(seg[0], seg[2])).distinct().sorted().toArray() instanceof long[] xs
                && Arrays.stream(segs).flatMapToLong(seg -> LongStream.of(seg[1], seg[3])).distinct().sorted().toArray() instanceof long[] ys
                && xs.length == 2 && ys.length == 2 && xs[0] < xs[1] && ys[0] < ys[1]
                && Stream.of(
                        new long[]{xs[0], ys[0], xs[1], ys[0]},
                        new long[]{xs[0], ys[1], xs[1], ys[1]},
                        new long[]{xs[0], ys[0], xs[0], ys[1]},
                        new long[]{xs[1], ys[0], xs[1], ys[1]})
                    .map(canon).sorted().collect(Collectors.joining("|")) instanceof String expected
                && Arrays.stream(segs).map(canon).sorted().collect(Collectors.joining("|")).equals(expected)
                ? "YES"
                : "NO"));
    }
}



