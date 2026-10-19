import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long n
            ? IntStream.range(0, 10).boxed().flatMap(a -> IntStream.range(a, 10).boxed().flatMap(b -> Stream.iterate(Stream.of(0L).collect(Collectors.toSet()), st -> st.stream().flatMap(v -> Stream.of(v * 10 + a, v * 10 + b)).filter(v -> v <= n).collect(Collectors.toSet())).limit(11).flatMap(Set::stream)))
                .filter(v -> v > 0 && v <= n).distinct().count() : "");
    }
}
