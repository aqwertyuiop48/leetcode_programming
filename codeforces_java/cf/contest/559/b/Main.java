import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && s.next() instanceof String a && s.next() instanceof String b && new AtomicReference<UnaryOperator<String>>() instanceof AtomicReference<UnaryOperator<String>> f
            && f.getAndSet(t -> t.length() % 2 == 1 ? t : f.get().apply(t.substring(0, t.length() / 2)) instanceof String x && f.get().apply(t.substring(t.length() / 2)) instanceof String y ? x.compareTo(y) <= 0 ? x + y : y + x : "") == null
            ? f.get().apply(a).equals(f.get().apply(b)) ? "YES" : "NO" : "");
    }
}
