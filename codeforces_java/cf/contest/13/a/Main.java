import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextLong()).ifPresent(a ->
            System.out.println(
                new AtomicReference<LongBinaryOperator>() instanceof AtomicReference<LongBinaryOperator> dsRef
                && dsRef.getAndSet((nn, base) -> nn == 0 ? 0 : (nn % base) + dsRef.get().applyAsLong(nn / base, base)) == null
                && new AtomicReference<LongBinaryOperator>() instanceof AtomicReference<LongBinaryOperator> gcdRef
                && gcdRef.getAndSet((x, y) -> y == 0 ? x : gcdRef.get().applyAsLong(y, x % y)) == null
                && new long[]{LongStream.rangeClosed(2, a - 1).map(base -> dsRef.get().applyAsLong(a, base)).sum(), a - 2} instanceof long[] fr
                && new long[]{gcdRef.get().applyAsLong(fr[0], fr[1])} instanceof long[] g
                ? (fr[0] / g[0]) + "/" + (fr[1] / g[0])
                : "0/1")));
    }
}


