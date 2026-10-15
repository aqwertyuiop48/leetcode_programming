import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc ->
            System.out.println(
                new long[]{sc.nextLong(), sc.nextLong(), sc.nextLong()} instanceof long[] v
                ? Stream.of(v[0], v[1]).mapToLong(x -> (x % v[2] == 0 ? v[2] : x % v[2]) * ((x + v[2] - 1) / v[2])).reduce(1, (x, y) -> x * y)
                : 0));
    }
}



