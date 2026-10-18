import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                Integer.valueOf(s.nextInt()) instanceof Integer n
                && Integer.valueOf(s.nextInt()) instanceof Integer m
                && new boolean[n] instanceof boolean[] er
                && new boolean[m] instanceof boolean[] ec
                && IntStream.range(0, s.nextInt()).allMatch(i -> (er[s.nextInt() - 1] = true))
                && IntStream.range(0, s.nextInt()).allMatch(i -> (ec[s.nextInt() - 1] = true))
                ? Stream.of(er, ec)
                    .mapToLong(b -> IntStream.range(0, b.length).filter(i -> !b[i] && (i == 0 || b[i - 1])).count())
                    .reduce(1, (x, y) -> x * y)
                : 0L));
    }
}




