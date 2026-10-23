import java.util.*;
import java.util.stream.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer k && (Integer) s.nextInt() instanceof Integer x
            && IntStream.range(0, n).mapToObj(i -> String.valueOf((char) ('A' + s.nextInt()))).collect(Collectors.joining()) instanceof String c
            ? IntStream.rangeClosed(0, n).map(p -> (Integer) (Stream.iterate(c.substring(0, p) + (char) ('A' + x) + c.substring(p), t -> t.replaceFirst("(.)\\1{2,}", "")).limit(n + 3).reduce((a, b) -> b).get().length()) instanceof Integer len
                ? len == n + 1 ? 0 : n + 1 - len - 1 : 0).max().getAsInt() : 0);
    }
}
