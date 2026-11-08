import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] v
            && IntStream.of(v).skip(1).sorted().toArray() instanceof int[] s
            && Long.valueOf(IntStream.of(s).asLongStream().sum()) instanceof Long tot
            ? IntStream.range(0, v[0]).mapToLong(i -> Math.abs(s[i] - (tot / v[0] + (i >= v[0] - tot % v[0] ? 1 : 0)))).sum() / 2 : "");
    }
}
