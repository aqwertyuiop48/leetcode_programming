import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer a
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> a + i).toArray() instanceof int[] v
            && IntStream.iterate((int) Math.sqrt(a + n) + 1, k -> k >= 2, k -> k - 1).allMatch(k -> Integer.valueOf(k * k) instanceof Integer kk
                && IntStream.iterate((a + kk - 1) / kk * kk, j -> j < a + n, j -> j + kk).allMatch(j -> (v[j - a] = v[j - a] % kk == 0 ? v[j - a] / kk : v[j - a]) > 0))
            ? Arrays.stream(v).asLongStream().sum()
            : 0);
    }
}
