import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer k && IntStream.range(0, k).map(i -> s.nextInt()).toArray() instanceof int[] c
            && new long[1001][] instanceof long[][] cb
            && Stream.of(0).peek(z -> Arrays.setAll(cb, i -> i == 0 ? new long[]{1} : IntStream.rangeClosed(0, i).mapToLong(j -> j == 0 || j == i ? 1 : (cb[i - 1][j - 1] + cb[i - 1][j]) % 1000000007).toArray())).findFirst().isPresent()
            && new long[]{0, 1} instanceof long[] st
            && IntStream.range(0, k).allMatch(i -> (st[0] += c[i]) > 0 && (st[1] = st[1] * cb[(int) st[0] - 1][c[i] - 1] % 1000000007) >= 0)
            ? st[1] : 0);
    }
}
