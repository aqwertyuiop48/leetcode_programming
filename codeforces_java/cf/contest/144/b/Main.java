import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            Optional.of(new int[]{s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()}).ifPresent(r ->
                Optional.of(s.nextInt()).ifPresent(n ->
                    Optional.of(IntStream.range(0, n).mapToObj(i -> new int[]{s.nextInt(), s.nextInt(), s.nextInt()}).toList()).ifPresent(rad ->
                        System.out.println(
                            Stream.concat(
                                IntStream.rangeClosed(Math.min(r[0], r[2]), Math.max(r[0], r[2])).boxed().flatMap(x -> Stream.of(new int[]{x, r[1]}, new int[]{x, r[3]})),
                                IntStream.rangeClosed(Math.min(r[1], r[3]), Math.max(r[1], r[3])).boxed().flatMap(y -> Stream.of(new int[]{r[0], y}, new int[]{r[2], y})))
                                .map(p -> (p[0] + 5000) * 100000L + p[1] + 5000)
                                .distinct()
                                .filter(k -> rad.stream().noneMatch(q ->
                                    Math.pow(k / 100000 - 5000 - q[0], 2) + Math.pow(k % 100000 - 5000 - q[1], 2) <= (double) q[2] * q[2]))
                                .count())))));
    }
}

