import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                s.next() instanceof String t
                && new StringBuilder(t.replace("-", "")).reverse().toString().replaceAll("^0+|0+$", "") instanceof String r
                ? (r.isEmpty() ? "0" : (t.startsWith("-") ? "-" : "") + r)
                : ""));
    }
}
