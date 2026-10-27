import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long n
            && ((LongUnaryOperator) x -> LongStream.rangeClosed(2, 4_000_000).filter(p -> p * p <= x && x % p == 0).findFirst().orElse(x)) instanceof LongUnaryOperator spf
            ? LongStream.iterate(n, x -> x > 1, x -> x / spf.applyAsLong(x)).sum() + 1
            : 0);
    }
}

