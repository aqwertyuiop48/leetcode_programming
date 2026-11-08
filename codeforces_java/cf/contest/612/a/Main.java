import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer p && Integer.valueOf(sc.nextInt()) instanceof Integer q
            && sc.next() instanceof String s
            && IntStream.rangeClosed(0, n / p).filter(x -> (n - x * p) % q == 0).boxed().findFirst() instanceof Optional<Integer> o
            ? (o.isPresent() ? o.get() + (n - o.get() * p) / q + "\n" + IntStream.range(0, o.get() + (n - o.get() * p) / q)
                .mapToObj(i -> i < o.get() ? s.substring(i * p, i * p + p) : s.substring(o.get() * p + (i - o.get()) * q, o.get() * p + (i - o.get()) * q + q))
                .collect(Collectors.joining("\n")) : "-1") : "");
    }
}
