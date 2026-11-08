import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] a
            ? IntStream.range(0, a[0] * a[0] * a[1] * a[1]).filter(q -> q / (a[0] * a[1] * a[1]) <= q / (a[1] * a[1]) % a[0] && q / a[1] % a[1] <= q % a[1]
                && IntStream.range(0, a[2]).filter(i -> a[4 + 2 * i] - 1 >= q / (a[0] * a[1] * a[1]) && a[4 + 2 * i] - 1 <= q / (a[1] * a[1]) % a[0]
                    && a[5 + 2 * i] - 1 >= q / a[1] % a[1] && a[5 + 2 * i] - 1 <= q % a[1]).count() >= a[3]).count()
            : 0);
    }
}
