import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && sc.next() instanceof String t
            && t.split("\\.", -1) instanceof String[] p
            ? p.length >= 2 && p[0].length() >= 1 && p[0].length() <= 8 && p[p.length - 1].length() >= 1 && p[p.length - 1].length() <= 3
                && IntStream.range(1, p.length - 1).allMatch(i -> p[i].length() >= 2 && p[i].length() <= 11)
                ? "YES\n" + IntStream.range(0, p.length - 1).mapToObj(i -> (i == 0 ? p[0] : p[i].substring(Math.max(1, p[i].length() - 8))) + "." + (i == p.length - 2 ? p[i + 1] : p[i + 1].substring(0, Math.max(1, p[i + 1].length() - 8)))).collect(Collectors.joining("\n"))
                : "NO"
            : "");
    }
}

