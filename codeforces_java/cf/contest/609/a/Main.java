import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] v
            && new long[]{0} instanceof long[] acc
            && IntStream.of(v).skip(2).boxed().sorted(Comparator.reverseOrder()).mapToInt(x -> x).toArray() instanceof int[] s
            ? IntStream.range(0, v[0]).filter(k -> acc[0] < v[1] && (acc[0] += s[k]) >= 0).count() : "");
    }
}
