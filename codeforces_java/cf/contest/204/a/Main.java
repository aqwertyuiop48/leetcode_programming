import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && (Long) s.nextLong() instanceof Long l && (Long) s.nextLong() instanceof Long r
            && ((LongUnaryOperator) n -> n < 10 ? n : n / 10 + 9 - (String.valueOf(n).charAt(0) - '0' > n % 10 ? 1 : 0)) instanceof LongUnaryOperator f
            ? f.applyAsLong(r) - f.applyAsLong(l - 1) : 0);
    }
}

