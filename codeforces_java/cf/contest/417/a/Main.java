import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer c && (Integer) s.nextInt() instanceof Integer d && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m && (Integer) s.nextInt() instanceof Integer k
            && (Integer) Math.max(0, n * m - k) instanceof Integer need
            ? IntStream.rangeClosed(0, (need + n - 1) / n).map(i -> i * c + Math.max(0, need - i * n) * d).min().getAsInt() : 0);
    }
}
