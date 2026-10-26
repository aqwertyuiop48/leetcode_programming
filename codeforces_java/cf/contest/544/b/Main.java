import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer k
            ? k > (n * n + 1) / 2 ? "NO" : "YES\n" + IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n).mapToObj(j -> (i + j) % 2 == 0 && (i * n + j) / 2 < k ? "L" : "S").collect(Collectors.joining())).collect(Collectors.joining("\n")) : "");
    }
}
