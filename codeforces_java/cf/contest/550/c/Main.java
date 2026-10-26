import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String s
            ? Stream.concat(Stream.concat(
                IntStream.range(0, s.length()).mapToObj(i -> "" + s.charAt(i)),
                IntStream.range(0, s.length()).boxed().flatMap(i -> IntStream.range(i + 1, s.length()).mapToObj(j -> "" + s.charAt(i) + s.charAt(j)))),
                IntStream.range(0, s.length()).boxed().flatMap(i -> IntStream.range(i + 1, s.length()).boxed().flatMap(j -> IntStream.range(j + 1, s.length()).mapToObj(k -> "" + s.charAt(i) + s.charAt(j) + s.charAt(k)))))
                .filter(t -> (t.length() == 1 || t.charAt(0) != '0') && Integer.parseInt(t) % 8 == 0).findFirst().map(t -> "YES\n" + t).orElse("NO") : "");
    }
}
