import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] v
            && new long[v[1] + 1] instanceof long[] c
            && IntStream.range(2, v.length).filter(i -> ++c[v[i]] > 0).count() >= 0
            ? (long) v[0] * (v[0] - 1) / 2 - LongStream.of(c).map(x -> x * (x - 1) / 2).sum() : "");
    }
}
