import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            ? n * (n + 1L) / 2 - IntStream.range(0, n - 1).mapToLong(i -> s.nextLong()).sum() : 0);
    }
}
