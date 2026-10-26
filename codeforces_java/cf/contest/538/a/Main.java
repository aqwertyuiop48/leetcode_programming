import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String s && "CODEFORCES" instanceof String c
            ? s.length() > 10 && IntStream.rangeClosed(0, 10).anyMatch(k -> s.startsWith(c.substring(0, k)) && s.endsWith(c.substring(k))) ? "YES" : "NO" : "");
    }
}
