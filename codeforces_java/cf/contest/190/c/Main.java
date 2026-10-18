import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && sc.nextLine() instanceof String skip
            && new ArrayDeque<String>(Arrays.asList(sc.nextLine().trim().split("\\s+"))) instanceof ArrayDeque<String> w
            && new AtomicReference<Supplier<String>>() instanceof AtomicReference<Supplier<String>> parse
            && parse.compareAndSet(null, () -> w.poll() instanceof String x
                ? x.equals("int") ? "int"
                    : x.equals("pair") ? (parse.get().get() instanceof String l && parse.get().get() instanceof String r ? "pair<" + l + "," + r + ">" : null) : null
                : null)
            && parse.get().get() instanceof String res
            ? w.isEmpty() ? res : "Error occurred"
            : "Error occurred");
    }
}
