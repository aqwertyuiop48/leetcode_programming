import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> sc.next()).toList() instanceof List<String> ts
            && ts.stream().flatMap(t -> IntStream.range(0, t.length()).boxed().flatMap(i -> IntStream.rangeClosed(i + 1, Math.min(t.length(), i + 2)).mapToObj(j -> t.substring(i, j)))).collect(Collectors.toSet()) instanceof Set<String> subs
            ? IntStream.range(0, 26).mapToObj(c -> "" + (char) ('a' + c)).filter(x -> !subs.contains(x)).findFirst()
                .orElseGet(() -> IntStream.range(0, 676).mapToObj(c -> "" + (char) ('a' + c / 26) + (char) ('a' + c % 26)).filter(x -> !subs.contains(x)).findFirst().get()) : "");
    }
}
