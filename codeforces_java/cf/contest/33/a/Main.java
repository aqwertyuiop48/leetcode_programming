import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                new int[]{s.nextInt(), s.nextInt(), s.nextInt()} instanceof int[] h
                ? Math.min(h[2], IntStream.range(0, h[0]).mapToObj(i -> new int[]{s.nextInt(), s.nextInt()})
                    .collect(Collectors.toMap(a -> a[0], a -> a[1], Math::min)).values().stream().mapToInt(Integer::intValue).sum())
                : 0));
    }
}





