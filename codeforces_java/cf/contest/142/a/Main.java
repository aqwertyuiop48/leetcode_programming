import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in).nextLong()).ifPresent(n ->
            Optional.of(LongStream.rangeClosed(1, (long) Math.sqrt(n) + 1).filter(d -> n % d == 0).flatMap(d -> LongStream.of(d, n / d)).distinct().toArray()).ifPresent(D ->
                Optional.of(Arrays.stream(D).flatMap(a ->
                    Arrays.stream(D).filter(b -> (n / a) % b == 0).map(b -> (a + 1) * (b + 2) * (n / a / b + 2) - n)).summaryStatistics()).ifPresent(st ->
                    System.out.println(st.getMin() + " " + st.getMax()))));
    }
}
