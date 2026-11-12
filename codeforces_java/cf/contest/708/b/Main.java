import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Long.valueOf(sc.nextLong()) instanceof Long a00 && Long.valueOf(sc.nextLong()) instanceof Long a01
            && Long.valueOf(sc.nextLong()) instanceof Long a10 && Long.valueOf(sc.nextLong()) instanceof Long a11
            && LongStream.rangeClosed(0, 100000).filter(x -> x * (x - 1) / 2 == a00).boxed().toList() instanceof List<Long> c0
            && LongStream.rangeClosed(0, 100000).filter(x -> x * (x - 1) / 2 == a11).boxed().toList() instanceof List<Long> c1
            && c0.stream().flatMap(z -> c1.stream().map(o -> new long[] {z, o})).filter(p -> p[0] * p[1] == a01 + a10 && p[0] + p[1] > 0).findFirst() instanceof Optional<long[]> opt
            ? opt.isEmpty() ? "Impossible"
                : new long[] {opt.get()[0], opt.get()[1], a01} instanceof long[] sts
                    ? IntStream.range(0, (int) (sts[0] + sts[1])).mapToObj(i -> String.valueOf(sts[0] > 0 && sts[2] >= sts[1] ? (sts[2] -= sts[1]) * 0 + (sts[0]--) * 0 : (sts[1]--) * 0 + 1)).collect(Collectors.joining())
                    : "" : "");
    }
}
