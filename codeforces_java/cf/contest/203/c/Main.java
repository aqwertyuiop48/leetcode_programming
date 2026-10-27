import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n && Long.valueOf(s.nextLong()) instanceof Long d
            && Long.valueOf(s.nextLong()) instanceof Long a && Long.valueOf(s.nextLong()) instanceof Long b
            && IntStream.rangeClosed(1, n).mapToObj(i -> new long[]{i, s.nextLong() * a + s.nextLong() * b}).sorted(Comparator.comparingLong(c -> c[1])).toList() instanceof List<long[]> cs
            && new long[1] instanceof long[] sum
            && cs.stream().takeWhile(c -> (sum[0] += c[1]) <= d).map(c -> String.valueOf(c[0])).toList() instanceof List<String> res
            ? res.size() + "\n" + String.join(" ", res) : "");
    }
}

