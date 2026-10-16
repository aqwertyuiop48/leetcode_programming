import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new String[]{s.next(), s.next(), s.next()}).ifPresent(g ->
            System.out.println(IntStream.range(0, 3)
                .filter(i -> IntStream.range(0, 3).allMatch(j -> j == i || Set.of("rock scissors", "scissors paper", "paper rock").contains(g[i] + " " + g[j])))
                .mapToObj(i -> "FMS".substring(i, i + 1)).findFirst().orElse("?"))));
    }
}




