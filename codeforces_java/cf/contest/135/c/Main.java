import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in).next() instanceof String t
            && Integer.valueOf(t.length()) instanceof Integer n
            && Integer.valueOf((n - 1) / 2) instanceof Integer m1
            && Long.valueOf(t.chars().filter(ch -> ch == '0').count()) instanceof Long a
            && Long.valueOf(t.chars().filter(ch -> ch == '1').count()) instanceof Long b
            && Long.valueOf(t.chars().filter(ch -> ch == '?').count()) instanceof Long q
            && Character.valueOf(t.charAt(n - 1)) instanceof Character last
            && Boolean.valueOf(m1 + 1 >= b && m1 + 1 <= b + q) instanceof Boolean mid
            ? Stream.of(
                    Map.entry("00", b <= m1),
                    Map.entry("01", last == '1' ? mid : last == '?' && b <= m1 && m1 + 1 <= b + q),
                    Map.entry("10", last == '0' ? mid : last == '?' && b <= m1 + 1 && m1 + 1 <= b + q - 1),
                    Map.entry("11", a <= (n - 2) / 2))
                .filter(Map.Entry::getValue).map(Map.Entry::getKey).collect(Collectors.joining("\n"))
            : "");
    }
}

