import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Long.valueOf(new String(System.in.readAllBytes()).trim()) instanceof Long n
            && (LongPredicate) (x -> x > 1 && LongStream.rangeClosed(2, (long) Math.sqrt(x)).noneMatch(d -> x % d == 0)) instanceof LongPredicate pr
            ? (pr.test(n) ? 1 : n % 2 == 0 ? 2 : pr.test(n - 2) ? 2 : 3) : "");
    }
}
