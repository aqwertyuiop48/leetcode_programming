import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer d
            && (Integer) IntStream.range(0, n).map(i -> s.nextInt()).sum() instanceof Integer sum
            ? sum + 10 * (n - 1) > d ? -1 : (d - sum) / 5 : 0);
    }
}
