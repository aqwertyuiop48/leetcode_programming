import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && new long[n] instanceof long[] st && new long[n] instanceof long[] en
            ? IntStream.range(0, n).mapToObj(i -> Long.valueOf(s.nextLong()) instanceof Long sv && Long.valueOf(s.nextLong()) instanceof Long dv
                && ((LongPredicate) (x -> IntStream.range(0, i).noneMatch(j -> st[j] <= x + dv - 1 && en[j] >= x))) instanceof LongPredicate free
                && Long.valueOf(free.test(sv) ? sv : LongStream.concat(LongStream.of(1), IntStream.range(0, i).mapToLong(j -> en[j] + 1)).filter(free).min().getAsLong()) instanceof Long x0
                && (st[i] = x0) > 0 && (en[i] = x0 + dv - 1) > 0 ? x0 + " " + en[i] : "").collect(Collectors.joining("\n")) : "");
    }
}
