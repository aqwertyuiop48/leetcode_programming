import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && IntStream.range(0, 8).mapToLong(i -> s.nextLong()).toArray() instanceof long[] v
            && ((BiPredicate<long[], long[]>) (c, o) -> Long.valueOf((c[0] - o[0]) * (c[0] - o[0]) + (c[1] - o[1]) * (c[1] - o[1])) instanceof Long d2
                && (o[2] - c[2] >= 0 && d2 <= (o[2] - c[2]) * (o[2] - c[2])
                    || d2 >= (c[2] + o[3]) * (c[2] + o[3])
                    || c[2] - o[3] >= 0 && d2 <= (c[2] - o[3]) * (c[2] - o[3]))) instanceof BiPredicate<long[], long[]> fits
            ? Stream.of(new long[]{v[0], v[1], v[2]}, new long[]{v[0], v[1], v[3]}).filter(c -> fits.test(c, new long[]{v[4], v[5], v[6], v[7]})).count()
                + Stream.of(new long[]{v[4], v[5], v[6]}, new long[]{v[4], v[5], v[7]}).filter(c -> fits.test(c, new long[]{v[0], v[1], v[2], v[3]})).count()
            : "");
    }
}
