import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer v1 && (Integer) s.nextInt() instanceof Integer v2 && (Integer) s.nextInt() instanceof Integer t && (Integer) s.nextInt() instanceof Integer d
            ? IntStream.rangeClosed(1, t).map(i -> Math.min(v1 + (i - 1) * d, v2 + (t - i) * d)).sum() : 0);
    }
}
