import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc ->
            System.out.println(
                ((Function<String, String>) t -> t.toLowerCase().replaceAll("[-_\\x3B]", "")) instanceof Function<String, String> norm
                && norm.apply(sc.next()) instanceof String a
                && norm.apply(sc.next()) instanceof String b
                && norm.apply(sc.next()) instanceof String c
                && List.of(a + b + c, a + c + b, b + a + c, b + c + a, c + a + b, c + b + a) instanceof List<String> ok
                ? IntStream.range(0, sc.nextInt()).mapToObj(i -> ok.contains(norm.apply(sc.next())) ? "ACC" : "WA").collect(Collectors.joining("\n"))
                : ""));
    }
}
