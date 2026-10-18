import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer a
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> a + i).toArray() instanceof int[] v
            && IntStream.rangeClosed(2, (int) Math.sqrt(a + n)).allMatch(k -> Integer.valueOf(k * k) instanceof Integer kk
                && IntStream.iterate((a + kk - 1) / kk * kk, j -> j < a + n, j -> j + kk).allMatch(j ->
                    (v[j - a] = IntStream.iterate(v[j - a], x -> true, x -> x % kk == 0 ? x / kk : x).filter(x -> x % kk != 0).findFirst().getAsInt()) > 0))
            ? Arrays.stream(v).asLongStream().sum()
            : 0);
    }
}
