import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && tk.nextToken() instanceof String n0
            && Long.valueOf(tk.nextToken()) instanceof Long t
            && tk.nextToken() instanceof String s
            && Integer.valueOf(s.indexOf('.')) instanceof Integer dot
            && Integer.valueOf(dot < 0 ? -1 : IntStream.range(dot + 1, s.length()).filter(j -> s.charAt(j) >= '5').findFirst().orElse(-1)) instanceof Integer i
            ? (i < 0 ? s
                : Integer.valueOf((int) Math.min(t, 1L + IntStream.range(0, i - dot - 1).filter(r -> s.charAt(i - 1 - r) != '4').findFirst().orElse(i - dot - 1))) instanceof Integer k
                && Integer.valueOf(i - k) instanceof Integer p
                ? (p > dot ? s.substring(0, p) + (char) (s.charAt(p) + 1)
                    : IntStream.range(0, dot).filter(q -> s.charAt(q) != '9').boxed().reduce((x, y) -> y).orElse(-1) instanceof Integer q
                    ? (q < 0 ? "1" + "0".repeat(dot) : s.substring(0, q) + (char) (s.charAt(q) + 1) + "0".repeat(dot - q - 1)) : "") : "") : "");
    }
}
