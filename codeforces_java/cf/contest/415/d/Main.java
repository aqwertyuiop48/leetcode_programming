
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("[ \r\n]+") instanceof String[] sp && (Integer) Integer.parseInt(sp[0]) instanceof Integer n && (Integer) Integer.parseInt(sp[1]) instanceof Integer k
            && IntStream.rangeClosed(2, n).filter(p -> IntStream.rangeClosed(2, (int) Math.sqrt(p)).noneMatch(q -> p % q == 0)).boxed().flatMapToInt(p -> IntStream.rangeClosed(1, n / p).map(i -> i << 12 | i * p)).toArray() instanceof int[] pr
            && IntStream.range(0, n + 1).mapToLong(j -> j > 0 ? 1 : 0).toArray() instanceof long[] a0
            ? LongStream.of(Stream.iterate(a0, a -> a.clone() instanceof long[] b && IntStream.of(0).peek(z -> IntStream.of(pr).forEach(p -> b[p & 4095] += b[p >> 12])).peek(z -> Arrays.setAll(b, x -> b[x] % 1000000007L)).sum() == 0 ? b : a).limit(k).reduce((x, y) -> y).get()).map(v -> v % 1000000007L).sum() % 1000000007L : 0);
    }
}



