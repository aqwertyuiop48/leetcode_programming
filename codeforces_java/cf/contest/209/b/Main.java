import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && LongStream.generate(s::nextLong).limit(3).toArray() instanceof long[] a
            ? Stream.of(new int[]{0, 1}, new int[]{0, 2}, new int[]{1, 2}).filter(p -> (a[p[0]] - a[p[1]]) % 3 == 0)
                .mapToLong(p -> Math.max(a[p[0]], a[p[1]])).min().stream().boxed().findFirst().map(Object::toString).orElse("-1") : "");
    }
}
