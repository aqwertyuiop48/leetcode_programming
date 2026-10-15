import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(t ->
            System.out.println(
                IntStream.range(0, t).mapToObj(i ->
                    new long[]{s.nextLong(), s.nextLong(), s.nextLong(), s.nextLong(), s.nextLong(), s.nextLong()} instanceof long[] v
                    && new long[]{Math.abs(v[2] - v[4]), Math.abs(v[3] - v[5])} instanceof long[] d
                    && new long[]{v[0] - d[0], v[1] - d[1]} instanceof long[] side
                    && new long[]{Math.max(0, v[0] - 2 * d[0]), Math.max(0, v[1] - 2 * d[1])} instanceof long[] ov
                    ? String.valueOf(v[0] * v[1] - (2 * side[0] * side[1] - ov[0] * ov[1]))
                    : "").collect(Collectors.joining("\n")))));
    }
}


