import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String s
            && Integer.valueOf(s.indexOf('+')) instanceof Integer a && Integer.valueOf(s.indexOf('=') - a - 1) instanceof Integer b && Integer.valueOf(s.length() - s.indexOf('=') - 1) instanceof Integer c
            && ((java.util.function.IntFunction<String>) (x) -> "|".repeat(x)) instanceof java.util.function.IntFunction<String> r
            ? a + b == c ? s
                : a + b == c + 2 ? a > 1 ? r.apply(a - 1) + "+" + r.apply(b) + "=" + r.apply(c + 1) : b > 1 ? r.apply(a) + "+" + r.apply(b - 1) + "=" + r.apply(c + 1) : "Impossible"
                : a + b + 2 == c && c > 1 ? r.apply(a + 1) + "+" + r.apply(b) + "=" + r.apply(c - 1) : "Impossible" : "");
    }
}
