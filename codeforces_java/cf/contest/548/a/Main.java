import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && sc.next() instanceof String s && (Integer) sc.nextInt() instanceof Integer k
            ? s.length() % k == 0 && IntStream.range(0, k).allMatch(i -> s.substring(i * (s.length() / k), (i + 1) * (s.length() / k)) instanceof String p && new StringBuilder(p).reverse().toString().equals(p)) ? "YES" : "NO" : "");
    }
}
