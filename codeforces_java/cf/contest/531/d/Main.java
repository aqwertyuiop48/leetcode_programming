import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && new boolean[1001] instanceof boolean[] cut
            && IntStream.range(0, n).allMatch(i -> (Integer) s.nextInt() instanceof Integer a && (Integer) s.nextInt() instanceof Integer b && IntStream.rangeClosed(a, b).allMatch(x -> (cut[x] = true)))
            && IntStream.rangeClosed(1, 1000).filter(x -> !cut[x]).boxed().toList() instanceof List<Integer> r
            ? r.size() + r.stream().map(x -> " " + x).collect(Collectors.joining()) : "");
    }
}
