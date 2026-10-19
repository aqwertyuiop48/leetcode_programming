import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Long.valueOf(s.nextLong()) instanceof Long k
            && LongStream.range(0, n).map(i -> s.nextLong()).sorted().toArray() instanceof long[] a && new HashSet<Long>() instanceof HashSet<Long> ch
            ? Arrays.stream(a).filter(x -> !(x % k == 0 && ch.contains(x / k))).map(x -> ch.add(x) ? 1 : 0).sum() : "");
    }
}
