import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer x
            && (Integer) String.valueOf(x).chars().map(c -> 1 << (c - '0')).reduce(0, (a, b) -> a | b) instanceof Integer mx
            ? IntStream.rangeClosed(1, (int) Math.sqrt(x) + 1).filter(d -> (long) d * d <= x && x % d == 0)
                .map(d -> ((String.valueOf(d).chars().map(c -> 1 << (c - '0')).reduce(0, (a, b) -> a | b) & mx) != 0 ? 1 : 0)
                    + (d * d != x && (String.valueOf(x / d).chars().map(c -> 1 << (c - '0')).reduce(0, (a, b) -> a | b) & mx) != 0 ? 1 : 0)).sum() : 0);
    }


}
