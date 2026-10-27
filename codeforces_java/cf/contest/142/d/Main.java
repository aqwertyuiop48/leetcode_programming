import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc ->
            Optional.of(new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()}).ifPresent(v ->
                Optional.of(IntStream.range(0, v[0]).mapToObj(i -> sc.next()).toList()).ifPresent(rows ->
                    System.out.println(
                        Optional.of(rows.stream().anyMatch(r -> r.indexOf('G') >= 0 && r.indexOf('R') < 0 && r.indexOf('-') >= 0)).map(f1 ->
                            Optional.of(rows.stream().anyMatch(r -> r.indexOf('R') >= 0 && r.indexOf('G') < 0 && r.indexOf('-') >= 0)).map(f2 ->
                                f1 && f2
                                    ? "Draw"
                                    : f1
                                        ? "First"
                                        : f2
                                            ? "Second"
                                            : IntStream.range(0, 8).anyMatch(b ->
                                                rows.stream().filter(r -> r.indexOf('G') >= 0 && r.indexOf('R') >= 0)
                                                    .mapToInt(r -> Math.abs(r.indexOf('G') - r.indexOf('R')) - 1)
                                                    .filter(d -> (d >> b & 1) == 1).count() % (v[2] + 1) != 0)
                                                ? "First"
                                                : "Second").get()).get()))));
    }
}

