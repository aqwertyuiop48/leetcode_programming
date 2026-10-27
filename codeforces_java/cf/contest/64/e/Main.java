import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in).nextInt()).ifPresent(n ->
            System.out.println(
                ((IntPredicate) x -> x > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(x)).noneMatch(d -> x % d == 0)) instanceof IntPredicate prime
                ? IntStream.iterate(n, i -> i - 1).filter(prime).findFirst().getAsInt() + " " + IntStream.iterate(n, i -> i + 1).filter(prime).findFirst().getAsInt()
                : ""));
    }
}





