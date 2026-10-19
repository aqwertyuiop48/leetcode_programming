import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long l && Long.valueOf(s.nextLong()) instanceof Long r
            && ((LongUnaryOperator) n -> n < 10 ? n : n / 10 + 9 - (Long.valueOf(String.valueOf(n).charAt(0)) > n % 10 + '0' ? 1 : 0)) instanceof LongUnaryOperator f
            ? f.applyAsLong(r) - f.applyAsLong(l - 1) : "");
    }
}
