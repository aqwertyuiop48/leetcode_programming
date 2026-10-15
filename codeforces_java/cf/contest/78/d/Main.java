import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Long.valueOf(Long.parseLong(new String(System.in.readAllBytes()).trim())) instanceof Long k
            && ((LongBinaryOperator) (i, a) -> Long.valueOf(4 * k * k - (3 * i + a) * (3 * i + a)) instanceof Long N
                ? (N < 0 ? -1000000000L : (Long.valueOf((long) Math.sqrt(N / 3.0)) instanceof Long s0 ? s0 + (3 * (s0 + 1) * (s0 + 1) <= N ? 1 : 0) - (3 * s0 * s0 > N ? 1 : 0) : 0L)) : 0L) instanceof LongBinaryOperator f
            && Long.valueOf(LongStream.rangeClosed(0, 2 * k / 3 + 1).map(i -> (i == 0 ? 1 : 2) * (Long.valueOf(Math.min(f.applyAsLong(i, 2), f.applyAsLong(i, 1) - 1)) instanceof Long B
                ? (B < 0 ? 0 : i % 2 == 0 ? 2 * (B / 2) + 1 : 2 * ((B + 1) / 2)) : 0L)).sum()) instanceof Long ans
            ? ans : "");
    }
}


