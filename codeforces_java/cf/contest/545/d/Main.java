import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && new long[]{0} instanceof long[] sum
            ? IntStream.range(0, n).mapToLong(i -> s.nextLong()).sorted().filter(x -> x >= sum[0] && (sum[0] += x) > 0 || (x < sum[0] && false)).count() : 0);
    }
}
