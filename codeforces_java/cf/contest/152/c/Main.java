import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer m
            && Stream.generate(s::next).limit(n).toList() instanceof List<String> g
            ? IntStream.range(0, m).mapToLong(j -> g.stream().map(r -> r.charAt(j)).distinct().count()).reduce(1L, (a, b) -> a * b % 1_000_000_007L)
            : 0);
    }
}
