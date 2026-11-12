import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer q && new HashMap<Long, Long>() instanceof HashMap<Long, Long> mp && new long[]{0, 0, 0} instanceof long[] a
            ? IntStream.range(0, q).mapToObj(qi -> Integer.valueOf(sc.nextInt()) instanceof Integer ty && (a[0] = sc.nextLong()) >= 0 && (a[1] = sc.nextLong()) >= 0 && Long.valueOf(ty == 1 ? sc.nextLong() : 0L) instanceof Long w && (a[2] = 0) == 0
                && IntStream.range(0, 200).anyMatch(k -> a[0] == a[1] || (a[0] > a[1] ? (a[2] += mp.merge(a[0], w, Long::sum)) * 0 + (a[0] /= 2) < 0 : (a[2] += mp.merge(a[1], w, Long::sum)) * 0 + (a[1] /= 2) < 0))
                ? (ty == 2 ? String.valueOf(a[2]) : "") : "").filter(s -> !s.isEmpty()).collect(Collectors.joining("\n")) : "");
    }
}
