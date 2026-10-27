import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer t
            && new AtomicReference<LongBinaryOperator>() instanceof AtomicReference<LongBinaryOperator> win
            && win.compareAndSet(null, (a, b) -> a == 0 ? 0 : win.get().applyAsLong(b % a, a) == 0 ? 1 : (b / a) % (a + 1) % 2 == 0 ? 1 : 0)
            ? Stream.generate(() -> Long.valueOf(s.nextLong()) instanceof Long a && Long.valueOf(s.nextLong()) instanceof Long b
                    && win.get().applyAsLong(Math.min(a, b), Math.max(a, b)) == 1 ? "First" : "Second").limit(t).collect(Collectors.joining("\n"))
            : "");
    }
}



