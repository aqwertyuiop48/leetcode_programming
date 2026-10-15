import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(nx ->
            System.out.println(
                IntStream.range(0, nx[0]).mapToObj(i -> new int[]{s.nextInt(), s.nextInt()})
                    .map(ab -> new int[]{Math.min(ab[0], ab[1]), Math.max(ab[0], ab[1])})
                    .reduce(new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE}, (acc, cur) -> new int[]{Math.max(acc[0], cur[0]), Math.min(acc[1], cur[1])}) instanceof int[] range
                ? (range[0] > range[1]
                    ? -1
                    : (nx[1] < range[0] ? range[0] - nx[1] : (nx[1] > range[1] ? nx[1] - range[1] : 0)))
                : -1)));
    }
}



