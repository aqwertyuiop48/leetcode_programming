import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Integer.valueOf(new Scanner(System.in).nextInt()) instanceof Integer n
            && new int[2 * n] instanceof int[] a
            && IntStream.range(0, 2 * n).filter(i -> (a[i] = n) < 0).count() >= 0
            && IntStream.range(1, n).filter(i -> i % 2 == 1
                ? (a[(i - 1) / 2] = a[n - 1 - (i - 1) / 2] = i) < 0
                : (a[n + i / 2 - 1] = a[2 * n - 1 - i / 2] = i) < 0).count() >= 0
            ? Arrays.stream(a).collect(StringBuilder::new, (sb, v) -> sb.append(v).append(' '), StringBuilder::append).toString() : "");
    }
}
