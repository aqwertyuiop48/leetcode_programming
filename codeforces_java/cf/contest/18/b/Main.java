import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new long[]{s.nextLong(), s.nextLong(), s.nextLong(), s.nextLong()}).ifPresent(v ->
            System.out.println(
                LongStream.rangeClosed(0, v[2]).mapToObj(k -> new long[]{k * v[1], (k * v[1]) / v[2], (k * v[1]) % v[2]})
                    .filter(pk -> pk[1] >= v[0] || pk[2] > v[3])
                    .findFirst()
                    .map(pk -> pk[0])
                    .orElseGet(() -> ((v[0] * v[2] + v[1] - 1) / v[1]) * v[1]))));
    }
}




