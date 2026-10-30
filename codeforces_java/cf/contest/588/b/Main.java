import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && new long[]{s.nextLong(), 1} instanceof long[] st
            && LongStream.rangeClosed(2, 1000000).filter(p -> st[0] % p == 0 && (st[1] *= p) > 0 && (st[0] = LongStream.iterate(st[0], x -> x % p == 0, x -> x / p).reduce(st[0], (a, b) -> b / p)) > 0).count() >= 0
            ? st[1] * st[0] : 0);
    }
}
