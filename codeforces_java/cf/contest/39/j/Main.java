import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            s.next() instanceof String a && s.next() instanceof String b && a.length() == b.length() + 1
            && Long.valueOf(IntStream.range(0, b.length()).takeWhile(i -> a.charAt(i) == b.charAt(i)).count()) instanceof Long p
            && Long.valueOf(IntStream.range(0, b.length()).takeWhile(i -> a.charAt(a.length() - 1 - i) == b.charAt(b.length() - 1 - i)).count()) instanceof Long q
            && Long.valueOf(Math.max(0L, a.length() - 1 - q)) instanceof Long lo
            ? Math.max(0L, p - lo + 1) + (p - lo + 1 > 0 ? "\n" + LongStream.rangeClosed(lo + 1, p + 1).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "")
            : "0"));
    }
}



