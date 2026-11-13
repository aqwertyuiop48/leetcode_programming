import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Long.valueOf(sc.next()) instanceof Long a && Long.valueOf(sc.next()) instanceof Long b
            && Stream.iterate(b, x -> x > 0, x -> x <= a ? -1L : x % 2 == 0 ? x / 2 : x % 10 == 1 ? x / 10 : -1L).toList() instanceof List<Long> l
            ? (l.get(l.size() - 1).equals(a)
                ? "YES\n" + l.size() + "\n" + IntStream.range(0, l.size()).mapToObj(i -> String.valueOf(l.get(l.size() - 1 - i))).collect(Collectors.joining(" "))
                : "NO")
            : "");
    }
}
