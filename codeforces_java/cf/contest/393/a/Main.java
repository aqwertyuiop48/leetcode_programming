import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String s
            && ((LongUnaryOperator) ch -> s.chars().filter(x -> x == ch).count()) instanceof LongUnaryOperator c
            ? Math.min(Math.min(Math.max(c.applyAsLong('n') - 1, 0) / 2, c.applyAsLong('e') / 3), Math.min(c.applyAsLong('i'), c.applyAsLong('t'))) : "");
    }
}
