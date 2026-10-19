import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && IntStream.range(0, s.nextInt()).map(i -> s.nextInt()).toArray() instanceof int[] a
            && IntStream.range(0, s.nextInt()).map(i -> s.nextInt()).toArray() instanceof int[] b
            && Arrays.stream(a).boxed().flatMap(x -> Arrays.stream(b).filter(y -> y % x == 0).map(y -> y / x).boxed()).toList() instanceof List<Integer> rs
            ? rs.stream().filter(r -> r.equals(Collections.max(rs))).count() : "");
    }
}
