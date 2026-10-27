import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new long[]{s.nextInt(), s.nextInt()}).ifPresent(nt ->
            System.out.println(
                IntStream.range(0, (int) nt[0]).mapToObj(i -> new long[]{s.nextLong(), s.nextLong()})
                    .map(xa -> new long[]{2 * xa[0] - xa[1], 2 * xa[0] + xa[1]})
                    .toArray(long[][]::new) instanceof long[][] houses
                && new long[]{Arrays.stream(houses)
                    .flatMap(h -> Stream.of(h[0] - nt[1], h[1] + nt[1]))
                    .distinct()
                    .filter(xd -> Arrays.stream(houses).noneMatch(h -> Math.max(xd - nt[1], h[0]) < Math.min(xd + nt[1], h[1])))
                    .count()} instanceof long[] cnt
                ? cnt[0]
                : 0L)));
    }
}





