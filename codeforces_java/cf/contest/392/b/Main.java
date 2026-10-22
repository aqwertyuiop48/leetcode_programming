import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && IntStream.range(0, 3).mapToObj(i -> LongStream.generate(s::nextLong).limit(3).toArray()).toArray(long[][]::new) instanceof long[][] t
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            ? Stream.iterate(new long[3][3], f -> IntStream.range(0, 3).mapToObj(a -> IntStream.range(0, 3).mapToLong(b -> a == b ? 0 : Integer.valueOf(3 - a - b) instanceof Integer c
                ? Math.min(f[a][c] + t[a][b] + f[c][b], 2 * f[a][b] + f[b][a] + t[a][c] + t[c][b]) : 0).toArray()).toArray(long[][]::new))
                .skip(n).findFirst().get()[0][2] : "");
    }
}
