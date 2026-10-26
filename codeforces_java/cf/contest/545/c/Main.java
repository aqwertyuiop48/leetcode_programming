import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new long[]{s.nextLong(), s.nextLong()}).toList() instanceof List<long[]> t && new long[]{Long.MIN_VALUE} instanceof long[] last
            ? IntStream.range(0, n).filter(i -> t.get(i)[0] - t.get(i)[1] > last[0] ? (last[0] = t.get(i)[0]) > Long.MIN_VALUE
                : (i == n - 1 || t.get(i)[0] + t.get(i)[1] < t.get(i + 1)[0]) ? (last[0] = t.get(i)[0] + t.get(i)[1]) > Long.MIN_VALUE : (last[0] = t.get(i)[0]) < Long.MIN_VALUE).count() : 0);
    }
}
