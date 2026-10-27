import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            LongStream.generate(s::nextLong).limit(3).toArray() instanceof long[] k
            && LongStream.generate(s::nextLong).limit(3).toArray() instanceof long[] t
            && (Integer) s.nextInt() instanceof Integer n
            && LongStream.generate(s::nextLong).limit(n).toArray() instanceof long[] c
            && new long[][]{c, new long[n], new long[n], new long[n]} instanceof long[][] f
            && IntStream.range(1, 4).allMatch(j -> IntStream.range(0, n).allMatch(i ->
                (f[j][i] = Math.max(f[j - 1][i], i >= k[j - 1] ? f[j][(int) (i - k[j - 1])] : 0) + t[j - 1]) > 0))
            ? IntStream.range(0, n).mapToLong(i -> f[3][i] - f[0][i]).max().getAsLong()
            : 0));
    }
}





