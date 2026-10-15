import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(new long[]{sc.nextLong(), sc.nextLong(), sc.nextLong(), sc.nextLong()}).ifPresent(a -> System.out.println((1 + a[0]) + LongStream.rangeClosed(1, a[2]).map(j -> Optional.of(LongStream.rangeClosed(1, a[0]).filter(i -> Math.abs(i - j) < Math.abs(a[1] - a[3]) && Math.abs(a[1] - a[3]) < i + j).count()).map(t -> t > 0 ? 2 * t : 1).get()).sum())));
    }
}


