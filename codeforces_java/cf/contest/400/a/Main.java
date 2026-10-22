import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer t
            ? IntStream.range(0, t).mapToObj(i -> sc.next() instanceof String s
                && IntStream.of(1, 2, 3, 4, 6, 12).filter(a -> IntStream.range(0, 12 / a).anyMatch(c -> IntStream.range(0, a).allMatch(r -> s.charAt(r * (12 / a) + c) == 'X'))).boxed().collect(Collectors.toList()) instanceof List<Integer> ok
                ? ok.size() + ok.stream().map(a -> " " + a + "x" + 12 / a).collect(Collectors.joining()) : "").collect(Collectors.joining("\n")) : "");
    }
}
