import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(
                LongStream.range(0, 6).map(i -> s.nextLong()).toArray()).ifPresent(p ->
            System.out.println(
                new long[]{(p[2] - p[0]) * (p[5] - p[1]) - (p[3] - p[1]) * (p[4] - p[0])} instanceof long[] cross0
                && new long[]{(p[2] - p[0]) * (p[4] - p[0]) + (p[3] - p[1]) * (p[5] - p[1]),
                               (p[0] - p[2]) * (p[4] - p[2]) + (p[1] - p[3]) * (p[5] - p[3]),
                               (p[0] - p[4]) * (p[2] - p[4]) + (p[1] - p[5]) * (p[3] - p[5])} instanceof long[] d0
                && cross0[0] != 0 && (d0[0] == 0 || d0[1] == 0 || d0[2] == 0)
                    ? "RIGHT"
                    : IntStream.range(0, 3).boxed()
                        .flatMap(pointIdx -> Stream.of(new long[]{1, 0}, new long[]{-1, 0}, new long[]{0, 1}, new long[]{0, -1})
                            .map(delta -> new long[]{pointIdx, delta[0], delta[1]}))
                        .anyMatch(move ->
                            p.clone() instanceof long[] np
                            && new int[]{(int) move[0]} instanceof int[] idx
                            && (np[idx[0] * 2] += move[1]) >= Long.MIN_VALUE
                            && (np[idx[0] * 2 + 1] += move[2]) >= Long.MIN_VALUE
                            && new long[]{(np[2] - np[0]) * (np[5] - np[1]) - (np[3] - np[1]) * (np[4] - np[0])} instanceof long[] cross1
                            && new long[]{(np[2] - np[0]) * (np[4] - np[0]) + (np[3] - np[1]) * (np[5] - np[1]),
                                           (np[0] - np[2]) * (np[4] - np[2]) + (np[1] - np[3]) * (np[5] - np[3]),
                                           (np[0] - np[4]) * (np[2] - np[4]) + (np[1] - np[5]) * (np[3] - np[5])} instanceof long[] d1
                            && cross1[0] != 0 && (d1[0] == 0 || d1[1] == 0 || d1[2] == 0))
                        ? "ALMOST"
                        : "NEITHER")));
    }
}
