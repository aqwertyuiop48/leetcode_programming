import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new long[]{s.nextLong(), s.nextLong()}).toList() instanceof List<long[]> p
            && (Long) p.stream().mapToLong(x -> x[0]).sum() instanceof Long sw
            && p.stream().mapToLong(x -> x[1]).sorted().toArray() instanceof long[] hs
            ? p.stream().map(x -> String.valueOf((sw - x[0]) * (x[1] == hs[n - 1] ? (n > 1 ? hs[n - 2] : 0) : hs[n - 1]))).collect(Collectors.joining(" ")) : "");
    }
}
