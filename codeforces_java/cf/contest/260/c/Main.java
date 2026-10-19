import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Long.parseLong((String) t)).iterator() instanceof Iterator<Long> it
            && Integer.valueOf(it.next().intValue()) instanceof Integer n && Integer.valueOf(it.next().intValue() - 1) instanceof Integer x
            && LongStream.generate(it::next).limit(n).toArray() instanceof long[] a
            && Long.valueOf(Arrays.stream(a).min().getAsLong()) instanceof Long mn
            && Integer.valueOf(IntStream.range(0, n).filter(o -> a[(x - o + n) % n] == mn).findFirst().getAsInt()) instanceof Integer back
            && Integer.valueOf((x - back + n) % n) instanceof Integer t && Integer.valueOf(back) instanceof Integer r
            ? IntStream.range(0, n).mapToObj(i -> Integer.valueOf((i - t + n) % n) instanceof Integer off
                ? String.valueOf(i == t ? mn * n + r : a[i] - mn - (off >= 1 && off <= r ? 1 : 0)) : "").collect(Collectors.joining(" ")) : "");
    }
}
