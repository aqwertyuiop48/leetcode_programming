import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer k
            && IntStream.range(0, k).map(i -> s.nextInt()).toArray() instanceof int[] a
            && Stream.concat(Arrays.stream(a).filter(x -> x == 0 || x == 100).distinct().boxed(),
                Stream.of(Arrays.stream(a).filter(x -> x >= 1 && x <= 9).boxed().findFirst(), Arrays.stream(a).filter(x -> x >= 10 && x <= 90 && x % 10 == 0).boxed().findFirst()).flatMap(Optional::stream)).toList() instanceof List<Integer> base
            && (base.stream().anyMatch(x -> x >= 1 && x <= 90) ? base : Stream.concat(base.stream(), Arrays.stream(a).filter(x -> x > 10 && x < 100 && x % 10 != 0).boxed().limit(1)).toList()) instanceof List<Integer> ans
            ? ans.size() + "\n" + ans.stream().map(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
